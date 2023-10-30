package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, preco, quantidade);
        estoqueProdutosMap.put(cod, produto);
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap.values());
    }

    public Double calcularValorTotalEstoque() {
        Double valorTotalEstoque = 0.0;
        if(!estoqueProdutosMap.isEmpty()) {

            for (Produto p : estoqueProdutosMap.values()) {

                valorTotalEstoque += p.getPreco() * p.getQuantidade();

            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorValor) {
                    maiorValor = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() < menorValor) {
                    menorValor = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQtde = null;
        double valorTotal = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                double valorProduto = p.getPreco() * p.getQuantidade();
                if (valorProduto > valorTotal) {
                    valorTotal = valorProduto;
                    produtoMaiorQtde = p;
                }
            }
        }
        return produtoMaiorQtde;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "arroz", 120, 3.89);
        estoqueProdutos.adicionarProduto(2L, "feijao", 50, 2.89);
        estoqueProdutos.adicionarProduto(3L, "macarrao", 60, 5.89);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro().getNome());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato().getNome());
        System.out.println("Produto em maior quantidade no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque().getNome());
    }



}
