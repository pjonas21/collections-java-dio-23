package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int result = 0;
        if(!listaNumeros.isEmpty()) {
            for(int i : listaNumeros) {
                result += i;
            }
        }
        return result;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaNumeros.isEmpty()) {
            for(int i : listaNumeros) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()) {
            for(Integer n : listaNumeros) {
                if(n < menorNumero) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros numerosLista = new SomaNumeros();

        numerosLista.adicionarNumero(1);
        numerosLista.adicionarNumero(2);
        numerosLista.adicionarNumero(4);
        numerosLista.adicionarNumero(3);
        numerosLista.adicionarNumero(6);
        numerosLista.adicionarNumero(5);
        numerosLista.adicionarNumero(8);
        numerosLista.adicionarNumero(7);

        numerosLista.exibirNumeros();

        System.out.println("Maior numero: " + numerosLista.encontrarMaiorNumero());
        System.out.println("Menor numero: " + numerosLista.encontrarMenorNumero());
        System.out.println("Soma de todos os numeros: " + numerosLista.calcularSoma());
    }
}
