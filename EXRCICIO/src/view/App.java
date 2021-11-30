package view;

import java.time.LocalDate;

import controller.clienteController;
import controller.fornecedorController;
import controller.produtoController;
import controller.vendedorController;
import model.cliente;
import model.fornecedor;
import model.produto;

public class App {
    public static void main(String[] args) {
        clienteController ClienteController = new clienteController();
        fornecedorController FornecedorController = new fornecedorController();
        produtoController ProdutoController = new produtoController();
        vendedorController VendedorController = new vendedorController();


        var produto = new produto("Coca Cola", 5.00, "#6574", 0.4, "Coca Cola 2L");
        ProdutoController.cadastrar(produto);
        ProdutoController.remover(1);        
    }
}
