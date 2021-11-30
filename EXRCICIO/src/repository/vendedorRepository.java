package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import model.vendedor;

public class vendedorRepository implements IRepository<vendedor> {

    private Set<vendedor> banco = new HashSet<>();

    @Override
    public boolean cadastrar(vendedor entidade) {
        // TODO Auto-generated method stub
        return banco.add(entidade);
    }

    @Override
    public vendedor buscar(int id) {
        // TODO Auto-generated method stub
        return banco.stream().filter(
            obj -> obj.getId() == id
        ).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean editar(vendedor entidade) {
        // TODO Auto-generated method stub
        for (vendedor Vendedor : banco) {
            if (Vendedor.getId() == entidade.getId()) {
                Vendedor = entidade;
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
