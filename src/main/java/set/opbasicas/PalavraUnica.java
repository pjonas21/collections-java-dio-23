package main.java.set.opbasicas;

import java.util.Objects;

public class PalavraUnica {

    private String palavra;

    public PalavraUnica() {};

    public PalavraUnica(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PalavraUnica that)) return false;
        return Objects.equals(getPalavra(), that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }

    @Override
    public String toString() {
        return "PalavraUnica{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
