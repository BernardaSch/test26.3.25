package algebra.spring_boot.polaznik;

import algebra.spring_boot.polaznik.dto.CreatePolaznikDto;
import algebra.spring_boot.polaznik.dto.UpdatePolaznikDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/polaznici")

public class PolaznikController {

    private final PolaznikService polaznikService;

    public PolaznikController(PolaznikService polaznikService) {
        this.polaznikService = polaznikService;
    }

    @GetMapping
    public ResponseEntity<List<Polaznik>> fetchAll(){

        List<Polaznik> polaznici = polaznikService.fetchAll();


        List<String> polaznikNamesFromForLoop = new ArrayList<>();
        for (Polaznik polaznik : polaznici) {
            polaznikNamesFromForLoop.add(polaznik.getIme());
        }

        List<String> polaznikNames = polaznici.stream().map(Polaznik::getIme).toList();
        // TODO: Proučiti svakako jer ce vam trebati u svakodnevnom programiranju kasnije

        return ResponseEntity.status(200).body(polaznici);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Polaznik> findById(@PathVariable Integer id){
        Optional<Polaznik> polaznik = polaznikService.findById(id);

        if (polaznik.isEmpty()){
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(polaznik.get());
    }

    @PostMapping()
    public ResponseEntity<Polaznik> create (@Valid @RequestBody CreatePolaznikDto dto){
        Polaznik polaznik = polaznikService.create(dto);
        return ResponseEntity.status(201).body(polaznik);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Polaznik> update (@Valid @RequestBody UpdatePolaznikDto dto, @PathVariable Integer id){
        Polaznik polaznik = polaznikService.update(id, dto);
        return ResponseEntity.status(200).body(polaznik);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Integer id){
        polaznikService.delete(id);
        return ResponseEntity.status(204).build();
    }

}
