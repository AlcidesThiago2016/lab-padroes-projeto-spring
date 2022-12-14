package one.digitalinnovation.gof.model;

import lombok.*;

import javax.persistence.*;
@Setter
@Getter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String endereco;

}
