package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import model.cliente;

public class clienteRepository implements IRepository<cliente> {

    private Set<cliente> banco = new HashSet<>();

    @Override
    public boolean cadastrar(cliente entidade) {
        // TODO Auto-generated method stub
        return banco.add(entidade);
    }

    @Override
    public cliente buscar(int id) {
        // TODO Auto-generated method stub
        return banco.stream().filter(
            obj -> obj.getId() == id
        ).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean editar(cliente entidade) {
        // TODO Auto-generated method stub
        for (cliente Cliente : banco) {
            if (Cliente.getId() == entidade.getId()) {
                Cliente = entidade;
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
