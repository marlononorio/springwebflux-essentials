package academy.devdojo.webflux.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@With
@Getter
@Table("anime")
public class Anime {

    @Id
    private Long id;

    @NotNull
    @NotEmpty(message = "O nome não pode está vazio")
    private String name;
}
