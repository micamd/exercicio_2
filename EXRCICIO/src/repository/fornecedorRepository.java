package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import model.fornecedor;

public class fornecedorRepository implements IRepository<fornecedor>{

    private Set<fornecedor> banco = new HashSet<>();

    @Override
    public boolean cadastrar(fornecedor entidade) {
        // TODO Auto-generated method stub
        return banco.add(entidade);
    }

    @Override
    public fornecedor buscar(int id) {
        // TODO Auto-generated method stub
        return banco.stream().filter(
            obj -> obj.getId() == id
        ).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean editar(fornecedor entidade) {
        // TODO Auto-generated method stub
        for (fornecedor Fornecedor : banco) {
            if (Fornecedor.getId() == entidade.getId()) {
                Fornecedor = entidade;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int id) {
        // TODO Auto-generated method stub
        return banco.removeIf(obj -> obj.getId() == id);
    }
    
}
