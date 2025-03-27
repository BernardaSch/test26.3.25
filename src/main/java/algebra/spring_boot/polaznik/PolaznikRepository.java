package algebra.spring_boot.polaznik;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PolaznikRepository extends JpaRepository<Polaznik, Integer> {

    @Query("SELECT p FROM Polaznik p WHERE p.ime = :ime")
    Optional<Polaznik> findByTest(String ime);

    Optional<Polaznik> findTop1ByNameLike(String ime);
}

