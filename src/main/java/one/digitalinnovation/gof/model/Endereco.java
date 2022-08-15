package one.digitalinnovation.gof.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Usando um JSON de retorno da API do VIACEP.
 *
 * @author AlcidesThiago2016
 */
@Getter
@Setter
@Entity
public class Endereco {

    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

}
