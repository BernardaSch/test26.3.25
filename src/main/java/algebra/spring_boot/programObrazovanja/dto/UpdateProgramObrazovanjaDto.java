package algebra.spring_boot.programObrazovanja.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

//ok

@Data
@AllArgsConstructor
public class UpdateProgramObrazovanjaDto {

    @NotBlank
    private String naziv;

    @NotBlank
    private Integer csvet;
}
