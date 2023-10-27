package main.java.set.ordenacao;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtde) {

        produtoSet.add(new Produto(cod, nome, preco, qtde));

    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "arroz", 3.89, 50);
        cadastroProdutos.adicionarProduto(2L, "feijao", 5.89, 50);
        cadastroProdutos.adicionarProduto(3L, "macarrao", 2.89, 50);
        cadastroProdutos.adicionarProduto(4L, "carne", 28.89, 50);

        System.out.println("Lista de produtos: " + cadastroProdutos.produtoSet);
        System.out.println("Lista de produtos por nome: " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Lista de produtos por preco: " + cadastroProdutos.exibirPorPreco());
    }
}
