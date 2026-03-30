package br.com.etechoracio.playlivros.test;

import br.com.etechoracio.playlivros.enums.VersaoEnum;
import br.com.etechoracio.playlivros.model.Livro;

import java.time.LocalTime;

public class CarrinhoCompras {
    static void main() {
        //Primeiro LIvro
        Livro primeirolivro = new Livro();
        primeirolivro.titulo = "A História do melhor jogador do mundo";
        primeirolivro.autor = "Cristiano Ronaldo";
        primeirolivro.editora = "Decisiva";
        primeirolivro.resumo = "Essa historia fala sobre como um menino sonhador, chegou ao topo do mundo";
        primeirolivro.versao = VersaoEnum.INTEGRAL;
        primeirolivro.preco = 100.00;
        primeirolivro.duracao = LocalTime.of(5, 45);


    }
}
