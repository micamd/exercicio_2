package repository;

public interface IRepository<E> {
    public boolean cadastrar(E entidade);
    
    public E buscar(int id);

    public boolean editar(E entidade);

    public boolean remover(int id);

}
