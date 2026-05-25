package br.com.etechoracio.playlivros.model;

public class LivroImpresso extends Livro{
    private int Paginas;

    public void setPaginas(int paginas) {
        Paginas = paginas;

    }

    public double getTaxaEnvio(){
        return preco * 0.07;
    }

    @Override
    public double getTotal() {
        return preco + getTaxaEnvio();
    }
}
