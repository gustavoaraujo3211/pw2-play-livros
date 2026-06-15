package br.com.etechoracio.playlivros.model;

public class LivroImpresso extends Livro{

    private int paginas;

    public double getTaxaEnvio() {
        return preco * 0.07;
    }

    public double getPreco() {
        return preco + getTaxaEnvio();
    }

    @Override
    protected void exibirDetalhes() {
        System.out.println("Páginas: " + paginas);
    }
}
