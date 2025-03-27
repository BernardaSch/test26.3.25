package algebra.spring_boot.programObrazovanja;

import algebra.spring_boot.programObrazovanja.dto.CreateProgramObrazovanjaDto;
import algebra.spring_boot.programObrazovanja.dto.UpdateProgramObrazovanjaDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/programiObrazovanja")

public class ProgramObrazovanjaController {

    private final ProgramObrazovanjaService programObrazovanjaService;

    public ProgramObrazovanjaController(ProgramObrazovanjaService programObrazovanjaService) {
        this.programObrazovanjaService = programObrazovanjaService;
    }

    @GetMapping
    public ResponseEntity<List<ProgramObrazovanja>> fetchAll(){

        List<ProgramObrazovanja> programiObrazovanja = programObrazovanjaService.fetchAll();


        List<String> programObrazovanjaNamesFromForLoop = new ArrayList<>();

        for (ProgramObrazovanja programObrazovanja : programiObrazovanja) {
            programObrazovanjaNamesFromForLoop.add(programObrazovanja.getNaziv());
        }

        // TODO: Proučiti svakako jer ce vam trebati u svakodnevnom programiranju kasnije:

        List<String> programObrazovanjaNames = programiObrazovanja.stream()
                .map(ProgramObrazovanja::getNaziv)
                .toList();

        return ResponseEntity.status(200).body(programiObrazovanja);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProgramObrazovanja> findById(@PathVariable Integer id){
        Optional<ProgramObrazovanja> programObrazovanja = programObrazovanjaService.findById(id);

        if (programObrazovanja.isEmpty()){
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(programObrazovanja.get());
    }

    @PostMapping()
    public ResponseEntity<ProgramObrazovanja> create (@Valid @RequestBody CreateProgramObrazovanjaDto dto){
        ProgramObrazovanja programObrazovanja = programObrazovanjaService.create(dto);
        return ResponseEntity.status(201).body(programObrazovanja);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProgramObrazovanja> update (@Valid @RequestBody UpdateProgramObrazovanjaDto dto, @PathVariable Integer id){
        ProgramObrazovanja programObrazovanja = programObrazovanjaService.update(id, dto);
        return ResponseEntity.status(200).body(programObrazovanja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable Integer id){
        programObrazovanjaService.delete(id);
        return ResponseEntity.status(204).build();
    }

}
