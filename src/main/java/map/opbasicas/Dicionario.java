package main.java.map.opbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Palavra " + palavra + " nao encontrada");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPalavra = null;
        if(!dicionarioMap.isEmpty()) {
             definicaoPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("tribulação", "Evento ou situação aborrecida, desagradável; aflição, tormento, adversidade; atribulação: passou por numerosas tribulações.");
        dicionario.adicionarPalavra("emergir", "Fazer surgir, aparecer; surgir; manifestar: o sol emerge no horizonte.");
        dicionario.adicionarPalavra("assim", "Desse modo; dessa forma: a televisão funciona assim, como está no manual.");

        dicionario.exibirPalavras();

        System.out.println("Definicao encontrada: " + dicionario.pesquisarPorPalavra("emergir"));

        dicionario.removerPalavra("tribulação");
        dicionario.exibirPalavras();
    }
}
