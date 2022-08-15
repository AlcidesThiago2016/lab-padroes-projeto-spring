package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.stereotype.Service;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser injetada pelo Spring
 * (via {@link org.springframework.beans.factory.annotation.Autowired}). Com isso essa classe e um {@link Service}, ela
 * será tratada como um <b>Singleton</b>
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos(){
        // FIXME Buscar todos os Clientes.
        return null;
    }
    @Override
    public Cliente buscarPorId(Long id){
        // FIXME Buscar Cliente por ID.
        return null;
    }
    @Override
    public void inserir(Cliente cliente){
        // FIXME Verificar se o Endereço do Cliente já existe(pelo CEP).
        // FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        // FIXME Inserir Cliente, vinculando o Endereço (novo ou existente).
    }
    @Override
    public void atualizar(Long id, Cliente cliente){
        // FIXME Buscar Cliente por ID, caso exista:
        // FIXME Verificar se o Endereço do Cliente já existe (Pelo CEP).
        // FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        // FIXME Alterar Cliente, vinculando o Endereço (novo ou existente).
    }
    @Override
    public void deletar(Long id){
        // FIXME Deletar Cliente por ID.
    }

}
