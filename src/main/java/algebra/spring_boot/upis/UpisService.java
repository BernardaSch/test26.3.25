package algebra.spring_boot.upis;

import algebra.spring_boot.upis.dto.CreateUpisDto;
import algebra.spring_boot.upis.dto.UpdateUpisDto;

import java.util.List;
import java.util.Optional;

public interface UpisService {

    List<Upis> fetchAll();

    Optional<Upis> findById(Integer id);

    Upis create(CreateUpisDto dto);

    Upis update(Integer id, UpdateUpisDto dto);

    void delete(Integer id);
}
