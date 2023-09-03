package main.java.list.ordenacao.pessoa;

public class AppOrdenacao {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();

        ordenacao.adicionarPessoa("Paulo", 33, 1.75);
        ordenacao.adicionarPessoa("Janio", 28, 1.74);
        ordenacao.adicionarPessoa("Vanessa", 33, 1.68);
        ordenacao.adicionarPessoa("Juliana", 27, 1.73);

        System.out.println("Lista ordenada por idade: ");
        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println("Lista ordenada por altura: ");
        System.out.println(ordenacao.ordenarPorAltura());
    }
}
