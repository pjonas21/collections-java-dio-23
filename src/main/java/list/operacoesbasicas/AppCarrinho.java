package main.java.list.operacoesbasicas;

public class AppCarrinho {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Caneta", 1.49, 5);
        carrinho.adicionarItem("Caderno", 10.49, 2);
        carrinho.adicionarItem("Mochila", 149.49, 1);

        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras: R$ "
                + carrinho.calcularValorTotal());

        carrinho.removerItem("Caneta");
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras: R$ "
                + carrinho.calcularValorTotal());

        carrinho.alterarItem(1, "Caneta", 1, 1.59);
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho de compras alterado: R$ "
                + carrinho.calcularValorTotal());

    }
}
