package br.com.dio.desafio.dominio;

public class Mentoria extends Conteudo{

    private String data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }


    public Mentoria() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {

        return String.format("Mentoria: %s\nDescrição: %s\nData: %s\n", getTitulo(), getDescricao(), data);
    }
}
