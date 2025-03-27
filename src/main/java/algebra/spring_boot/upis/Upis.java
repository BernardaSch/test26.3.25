package algebra.spring_boot.upis;

import algebra.spring_boot.polaznik.Polaznik;
import algebra.spring_boot.programObrazovanja.ProgramObrazovanja;
import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Upis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "polaznik_id", nullable = false)
    private Polaznik polaznik;

    @ManyToOne
    @JoinColumn(name = "program_obrazovanja_id", nullable = false)
    private ProgramObrazovanja programObrazovanja;
}
