package algebra.spring_boot.upis.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUpisDto {

    @NotNull
    private Integer programObrazovanjaId;
}
