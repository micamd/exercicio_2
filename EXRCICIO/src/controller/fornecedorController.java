package controller;

import model.fornecedor;
import repository.fornecedorRepository;

public class fornecedorController implements Icontroller<fornecedor> {

    private fornecedorRepository FornecedorRepository = new fornecedorRepository();

    @Override
    public boolean cadastrar(fornecedor entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return FornecedorRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public fornecedor buscar(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return null;
        return FornecedorRepository.buscar(id);
    }

    @Override
    public boolean editar(fornecedor entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return FornecedorRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return false;
        return FornecedorRepository.remover(id);
    }
    
}
