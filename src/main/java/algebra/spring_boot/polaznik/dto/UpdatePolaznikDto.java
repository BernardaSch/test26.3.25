package algebra.spring_boot.polaznik.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class UpdatePolaznikDto {

    @NotBlank
    private String ime;

    private String prezime;
}
