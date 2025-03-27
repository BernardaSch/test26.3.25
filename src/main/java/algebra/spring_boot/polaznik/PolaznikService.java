package algebra.spring_boot.polaznik;

import algebra.spring_boot.polaznik.dto.CreatePolaznikDto;
import algebra.spring_boot.polaznik.dto.UpdatePolaznikDto;

import java.util.List;
import java.util.Optional;

public interface PolaznikService {

    List<Polaznik> fetchAll();

    Optional<Polaznik> findById(Integer id);

    Polaznik create(CreatePolaznikDto dto);

    Polaznik update (Integer id, UpdatePolaznikDto dto);

    void delete (Integer id);
}
