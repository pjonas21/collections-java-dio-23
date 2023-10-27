package main.java.set.opbasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<PalavraUnica> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new PalavraUnica(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavraUnica palavraParaRemover = null;
        for (PalavraUnica p : palavrasSet) {
            if (Objects.equals(p.getPalavra(), palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        for (PalavraUnica p : palavrasSet) {
            if (Objects.equals(p.getPalavra(), palavra)) return true;
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("pedra");
        conjuntoPalavrasUnicas.adicionarPalavra("papel");
        conjuntoPalavrasUnicas.adicionarPalavra("tesoura");
        conjuntoPalavrasUnicas.adicionarPalavra("papel");

        String palavraExiste = conjuntoPalavrasUnicas.verificarPalavra("pedra") ? "Palavra existe." : "Palavra nao existe.";
        System.out.println(palavraExiste);

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("papel");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
