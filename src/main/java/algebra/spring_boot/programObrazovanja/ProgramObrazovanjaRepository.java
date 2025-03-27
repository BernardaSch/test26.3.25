package algebra.spring_boot.programObrazovanja;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgramObrazovanjaRepository extends JpaRepository<ProgramObrazovanja, Integer> {

    @Query("SELECT p FROM ProgramObrazovanja p WHERE p.naziv = :naziv")
    Optional<ProgramObrazovanja> findByTest(String naziv);

    Optional<ProgramObrazovanja> findTop1ByNazivLike(String naziv);
}

