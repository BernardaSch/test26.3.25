package algebra.spring_boot.programObrazovanja;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//ok

@Data
@NoArgsConstructor
@Entity
public class ProgramObrazovanja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naziv;

    private Integer csvet;


    public ProgramObrazovanja(Integer id, String naziv, Integer csvet) {
        this.id = id;
        this.naziv = naziv;
        this.csvet = csvet;
    }
}
