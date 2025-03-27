package algebra.spring_boot.programObrazovanja;

import algebra.spring_boot.programObrazovanja.dto.CreateProgramObrazovanjaDto;
import algebra.spring_boot.programObrazovanja.dto.UpdateProgramObrazovanjaDto;

import java.util.List;
import java.util.Optional;

public interface ProgramObrazovanjaService {

    List<ProgramObrazovanja> fetchAll();

    Optional<ProgramObrazovanja> findById(Integer id);

    ProgramObrazovanja create(CreateProgramObrazovanjaDto dto);

    ProgramObrazovanja update (Integer id, UpdateProgramObrazovanjaDto dto);

    void delete (Integer id);
}
