package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> listaItens;

    public CarrinhoCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        for(Item i : listaItens) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(i);
            }
        }
        listaItens.removeAll(itensRemover);
    }

    public double calcularValorTotal() {
        double valorCarrinho = 0.0;
        for(Item i : listaItens) {
            double result = i.getQuantidade() * i.getPreco();
            valorCarrinho += result;
        }
        return valorCarrinho;
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }

    public void alterarItem(int indice, String nome, int quantidade, double preco) {
        var item = new Item(nome, preco, quantidade);
        listaItens.remove(indice);
        listaItens.add(indice, item);
    }



    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Caneta", 1.49, 5);
        carrinho.adicionarItem("Caderno", 10.49, 2);
        carrinho.adicionarItem("Mochila", 149.49, 1);

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras: R$ " + carrinho.calcularValorTotal());

        carrinho.removerItem("Caneta");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras: R$ " + carrinho.calcularValorTotal());

        carrinho.alterarItem(1, "Caneta", 1, 1.59);
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras alterado: R$ " + carrinho.calcularValorTotal());

    }


}


