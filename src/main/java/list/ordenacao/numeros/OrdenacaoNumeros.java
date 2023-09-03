package main.java.list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Numero> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Numero numero) {
        listaNumeros.add(numero);
    }

    public void mostrarNumeros() {
        System.out.println("Lista de numeros: " + listaNumeros);
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> numerosAscendente = new ArrayList<>(listaNumeros);
        if(!numerosAscendente.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista esta vazia.");
        }
    }

    public List<Numero> ordenarDecrescente() {
        List<Numero> numerosDecrescente = new ArrayList<>(listaNumeros);
        if(!numerosDecrescente.isEmpty()) {
            numerosDecrescente.sort(Collections.reverseOrder());
            return numerosDecrescente;
        } else {
            throw new RuntimeException("A lista esta vazia.");
        }
    }



}
