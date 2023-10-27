package main.java.set.ordenacao;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private long codigo;
    private String nome;
    private double preco;
    private int qtde;

    public Produto() {
    }

    public Produto(long codigo, String nome, double preco, int qtde) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtde=" + qtde +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
