package algebra.spring_boot.upis.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUpisDto {

    @NotNull
    private Integer polaznikId;

    @NotNull
    private Integer programObrazovanjaId;
}
