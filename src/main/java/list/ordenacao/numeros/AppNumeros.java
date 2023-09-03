package main.java.list.ordenacao.numeros;

public class AppNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        ordenacao.adicionarNumero(new Numero(2));
        ordenacao.adicionarNumero(new Numero(5));
        ordenacao.adicionarNumero(new Numero(3));
        ordenacao.adicionarNumero(new Numero(1));
        ordenacao.adicionarNumero(new Numero(4));
        ordenacao.adicionarNumero(new Numero(6));


        ordenacao.mostrarNumeros();

        System.out.println("Lista crescente: " + ordenacao.ordenarAscendente());
        System.out.println("Lista decrescente: " + ordenacao.ordenarDecrescente());
    }
}
