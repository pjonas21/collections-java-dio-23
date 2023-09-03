package main.java.list.ordenacao.numeros;

public class Numero implements Comparable<Numero> {

    private int numero;

    public Numero(Integer numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numero o) {
        return Integer.compare(numero, o.getNumero());
    }

    @Override
    public String toString() {
        return ""+numero;
    }
}
