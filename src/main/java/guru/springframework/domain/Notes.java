package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

/**
 * Created by htanyeri on 8/18/2019.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Slf4j
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
