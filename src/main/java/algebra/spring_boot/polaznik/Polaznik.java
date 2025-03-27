package algebra.spring_boot.polaznik;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Polaznik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ime;

    private String prezime;


    private Polaznik polaznik;

    public Polaznik(Integer id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Polaznik(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }
}
