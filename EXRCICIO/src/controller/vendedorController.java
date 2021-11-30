package controller;

import model.vendedor;
import repository.vendedorRepository;

public class vendedorController implements Icontroller<vendedor> {

    private vendedorRepository VendedorRepository = new vendedorRepository();

    @Override
    public boolean cadastrar(vendedor entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return VendedorRepository.cadastrar(entidade);
        return false;
    }

    @Override
    public vendedor buscar(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return null;
        return VendedorRepository.buscar(id);
    }

    @Override
    public boolean editar(vendedor entidade) {
        // TODO Auto-generated method stub
        if (entidade != null)
            return VendedorRepository.editar(entidade);
        return false;
    }

    @Override
    public boolean remover(int id) {
        // TODO Auto-generated method stub
        if (id < 0)
            return false;
        return VendedorRepository.remover(id);
    }
}
