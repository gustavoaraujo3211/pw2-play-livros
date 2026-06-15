package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.AudioBook;
import br.com.etechoracio.playlivros.model.LivroImpresso;
import br.com.etechoracio.playlivros.model.SacolaDeCompras;

import java.time.LocalDate;
import java.time.LocalTime;


public class TestaLivros {
    static void main() {
        AudioBook primeiroLivro = new AudioBook();
        primeiroLivro.setTitulo("O Poder do Hábito");
        primeiroLivro.setAutor("Charles Duhigg");
        primeiroLivro.setNarrador("Carlos Seidl");
        primeiroLivro.setEditora("Objetiva");
        primeiroLivro.setDuracao(LocalTime.of(10, 45));
        primeiroLivro.setVersao(VersaoEnum.INTEGRAL);
        primeiroLivro.setPreco(29.90);
        primeiroLivro.setResumo("Explora como os hábitos funcionam e como podem ser transformados.");
        primeiroLivro.setDataLancamento(LocalDate.of(2026,05,25));
        primeiroLivro.exibir();

        AudioBook segundoLivro = new AudioBook();
        segundoLivro.setTitulo("Mindset");
        segundoLivro.setAutor("Carol S. Dweck");
        segundoLivro.setNarrador("Ana Paula Cadamuro");
        segundoLivro.setEditora("Objetiva");
        segundoLivro.setDuracao(LocalTime.of(8, 30));
        segundoLivro.setVersao(VersaoEnum.RESUMIDA);
        segundoLivro.setPreco(24.90);
        segundoLivro.setResumo("Mostra como a mentalidade de crescimento pode impactar o sucesso.");
        segundoLivro.setDataLancamento(LocalDate.of(2026,01,04));
        segundoLivro.exibir();

        // Terceiro livro
        AudioBook terceiroLivro = new AudioBook();
        terceiroLivro.setTitulo("Pai Rico, Pai Pobre");
        terceiroLivro.setAutor("Robert Kiyosaki");
        terceiroLivro.setNarrador("Marcelo Sanches");
        terceiroLivro.setEditora("Alta Books");
        terceiroLivro.setDuracao(LocalTime.of(6, 15));
        terceiroLivro.setVersao(VersaoEnum.INTEGRAL);
        terceiroLivro.setPreco(19.90);
        terceiroLivro.setResumo("Ensina conceitos fundamentais sobre educação financeira.");
        terceiroLivro.setDataLancamento(LocalDate.of(2026,04,05));
        terceiroLivro.exibir();

        LivroImpresso quartoLivro = new LivroImpresso();
        quartoLivro.setTitulo("O Poder do Hábito");
        quartoLivro.setAutor("Charles Duhigg");
        quartoLivro.setEditora("Objetiva");
        quartoLivro.setPreco(29.90);
        quartoLivro.setResumo("Explora como os hábitos funcionam e como podem ser transformados.");
        quartoLivro.setDataLancamento(LocalDate.of(2026,05,25));
        quartoLivro.exibir();

        SacolaDeCompras sacolinha = new SacolaDeCompras();
        sacolinha.adicionar(primeiroLivro);
        sacolinha.adicionar(segundoLivro);
        sacolinha.adicionar(terceiroLivro);
        sacolinha.adicionar(quartoLivro);
        sacolinha.exibirTotal();
    }
}
