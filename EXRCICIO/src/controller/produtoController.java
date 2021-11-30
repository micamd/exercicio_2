package controller;

import model.produto;
import repository.produtoRepository;

public class produtoController implements Icontroller<produto> {
    
    private produtoRepository ProdutoRepository = new produtoRepository();

    @Override
    public boolean cadastrar(produto entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return ProdutoRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public produto buscar(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return null;
        return ProdutoRepository.buscar(id);
    }

    @Override
    public boolean editar(produto entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return ProdutoRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return false;
        return ProdutoRepository.remover(id);
    }
}
