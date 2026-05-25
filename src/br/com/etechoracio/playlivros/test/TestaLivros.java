package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.AudioBook;
import br.com.etechoracio.playlivros.model.LivroImpresso;

import java.time.LocalTime;

public class TestaLivros {
    static void main(){

        LivroImpresso quartoLivro = new LivroImpresso();
        AudioBook primeiroLivro = new AudioBook();
        quartoLivro.setTitulo("Pai Rico, Pai Pobre");
        quartoLivro.setAutor("Robert Kiyosaki");
        quartoLivro.setPreco(19.90);
        quartoLivro.setPaginas(197);
        quartoLivro.setResumo("Ensina conceitos fundamentais sobre educação financeira.");
    }
}
