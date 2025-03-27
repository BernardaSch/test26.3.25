package algebra.spring_boot.upis;

import algebra.spring_boot.upis.dto.CreateUpisDto;
import algebra.spring_boot.upis.dto.UpdateUpisDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/upisi")
public class UpisController {

    private final UpisService upisService;

    public UpisController(UpisService upisService) {
        this.upisService = upisService;
    }

    @GetMapping
    public ResponseEntity<List<Upis>> fetchAll() {
        return ResponseEntity.ok(upisService.fetchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Upis> findById(@PathVariable Integer id) {
        Optional<Upis> upis = upisService.findById(id);
        return upis.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Upis> create(@Valid @RequestBody CreateUpisDto dto) {
        Upis upis = upisService.create(dto);
        return ResponseEntity.status(201).body(upis);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Upis> update(@PathVariable Integer id, @Valid @RequestBody UpdateUpisDto dto) {
        Upis upis = upisService.update(id, dto);
        return ResponseEntity.ok(upis);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        upisService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
