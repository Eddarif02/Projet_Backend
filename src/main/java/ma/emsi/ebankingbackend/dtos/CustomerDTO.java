package ma.emsi.ebankingbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}