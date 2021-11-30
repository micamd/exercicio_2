package repository;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import model.produto;

public class produtoRepository implements IRepository<produto> {

    private Set<produto> banco = new HashSet<>();

    @Override
    public boolean cadastrar(produto entidade) {
        // TODO Auto-generated method stub
        return banco.add(entidade);
    }

    @Override
    public produto buscar(int id) {
        // TODO Auto-generated method stub
        return banco.stream().filter(
            obj -> obj.getId() == id
        ).collect(Collectors.toList()).get(0);
    }

    @Override
    public boolean editar(produto entidade) {
        // TODO Auto-generated method stub
        for (produto Produto : banco) {
            if (Produto.getId() == entidade.getId()) {
                Produto = entidade;
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