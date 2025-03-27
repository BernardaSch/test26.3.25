package algebra.spring_boot.polaznik.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdatePolaznikDto {

    @NotBlank
    private String ime;

    @NotBlank
    private String prezime;
}
