package one.digitalinnovation.gof.model;

import lombok.*;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Long id;
    private String nome;
    @ManyToOne
    private String endereco;
}
