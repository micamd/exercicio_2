package controller;

import model.cliente;
import repository.clienteRepository;

public class clienteController implements Icontroller<cliente> {

    private clienteRepository ClienteRepository = new clienteRepository();

    @Override
    public boolean cadastrar(cliente entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return ClienteRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public cliente buscar(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return null;
        return ClienteRepository.buscar(id);
    }

    @Override
    public boolean editar(cliente entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return ClienteRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return false;
        return ClienteRepository.remover(id);
    }
    
}