package dev.solitario.com.br;

import java.util.Scanner;

public class DesafioMultiplicacaoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = ( A * B  );


        System.out.print("PROD = " + PROD);
        System.out.println();
    }
}

// Dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores.

//Atribua esta operação à variável PROD, mostrando esta conforme a mensagem de saída esperada.
//Entrada
//A entrada contém 2 valores inteiros.

//Saída
//Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.

// Exemplos de Entrada	Exemplos de Saída
//3
//9
//PROD = 27

// - 30
//10
//PROD = -300

//0
//9
//PROD = 0