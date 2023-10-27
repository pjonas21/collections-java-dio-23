package main.java.set.opbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

        conjuntoConvidados.addConvidado("Jonas", 1234);
        conjuntoConvidados.addConvidado("Vanessa", 1235);
        conjuntoConvidados.addConvidado("Janio", 1236);
        conjuntoConvidados.addConvidado("Juliana", 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);

        conjuntoConvidados.exibirConvidados();
    }
}
