import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 Escreva um programa que exiba os números de 1 a 100, indicando se cada um é par ou ímpar.
//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " is even");
//            } else {
//                System.out.println(i + " is odd");
//            }
//        }
        // 2 Solicite 10 números inteiros ao usuário e diga quantos deles são maiores que 100.

//        int contador = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Digite o numero " + i + ": ");
//            int num = sc.nextInt();
//            if (num > 100) {
//                contador++;
//            }
//        System.out.println(contador);
//
//        }

        // 3 Leia 5 números inteiros e exiba apenas os números negativos.

//        ArrayList<Integer> listNegativos = new ArrayList<Integer>();
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Digite o numero " + i + ": ");
//            int num = sc.nextInt();
//            if (num < 0) {
//                listNegativos.add(num);
//            }
//        }
//
//        for (int i = 0; i < listNegativos.size(); i++) {
//            System.out.println(listNegativos.get(i));
//        }

        // 4 Solicite ao usuário um número positivo n. Em seguida, leia n números inteiros e conte quantos são múltiplos de 3.
//
//        System.out.println("Enter number: ");
//        int number = sc.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i <= number; i++) {
//            System.out.println("Enter number "+i+" : ");
//            int num = sc.nextInt();
//
//            if (num % 3 == 0) {
//                list.add(num);
//            }
//        }
//
//        System.out.println(list.size());


        // 5 Peça ao usuário um número inteiro e exiba todos os divisores ímpares desse número.

//        System.out.println("Enter number: ");
//        int number = sc.nextInt();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//
//        for (int i = 0; i < number; i++) {

//                if (num % 2 != 0) {
//                    list.add(num);
//                }
//
//            if (i % 2 != 0) {
//                if (number % i == 0) {
//                    list.add(i);
//                }
//            }
//        }
//
//        for (int i = 1; i <= list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        // 6 Leia 10 números reais e conte quantos estão no intervalo [10, 20].

//        ArrayList<Double> list = new ArrayList<>();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter number "+i+" : ");
//            double num = sc.nextDouble();
//            if (num > 10 && num < 20) {
//                list.add(num);
//            }
//        }
//
//        System.out.println(list.size());

        // 7 Solicite ao usuário números inteiros até que ele digite um número negativo. Ao final, exiba quantos números pares foram digitados.
//
//        ArrayList<Integer> List = new ArrayList<>();
//
//        while (true) {
//            System.out.println("Enter a number: ");
//            int number = sc.nextInt();
//
//            if (number < 0) {
//                break;
//            } else {
//                List.add(number);
//            }
//        }
//
//        System.out.println(List.size());


        // 8 Escreva um programa que peça a idade de 10 pessoas e conte quantas têm 18 anos ou mais.

//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter years " + i + ": ");
//            int year = sc.nextInt();
//
//            if (year >= 18) {
//                list.add(i);
//            }
//        }
//
//        System.out.println(list.size());


        // 9 Leia 10 números inteiros e diga qual foi o menor número par lido.

//        int numero, menorNumero = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Enter number " + i + ": ");
//            numero = sc.nextInt();
//
//            if (i == 1 || numero < menorNumero) {
//                menorNumero = numero;
//            }
//        }
//
//        System.out.println("O menor número é: " + menorNumero);

        // 10 Peça ao usuário um número inteiro positivo n e exiba os n primeiros números da sequência de Fibonacci.

//        int n0 = 0;
//        int n1 = 1;
//        int n3;
//
//        System.out.print("Digite um número inteiro positivo: ");
//        int number = sc.nextInt();
//
//        if (number >= 1) {
//            System.out.println(n0);
//        }
//        if (number >= 2) {
//            System.out.println(n1);
//        }
//
//        for (int i = 3; i <= number; i++) {
//            n3 = n0 + n1;
//            System.out.println(n3);
//            n0 = n1;
//            n1 = n3;
//        }

        // 11 Peça ao usuário para digitar 10 números e exiba apenas os que forem primos.


//        System.out.println("Digite 10 números:");
//
//        for (int i = 0; i < 10; i++) {
//            int n = sc.nextInt();
//            int contador = 0;
//
//            if (n > 1) {
//                for (int j = 1; j <= n; j++) {
//                    if (n % j == 0) {
//                        contador++;
//                    }
//                }
//                if (contador == 2) {
//                    System.out.println(n + " é primo.");
//                }
//            }
//        }


        // 12 Solicite ao usuário um número inteiro n. Em seguida, peça n números e mostre qual foi o maior número par e o menor número ímpar digitado.

//        int n = sc.nextInt();
//
//        int maiorNumero = 0;
//        int menorNumero = 0;
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Enter number: " + i);
//            int number = sc.nextInt();
//            list.add(number);
//
//            if  (n == 1) {
//                maiorNumero = number;
//                menorNumero = number;
//            }
//
//            if (number > maiorNumero) {
//                maiorNumero = number;
//                System.out.println("Maior numero: " + maiorNumero);
//            } else if (number < menorNumero) {
//                menorNumero = number;
//                System.out.println("Menor numero: " + menorNumero);
//            }
//
//        }
//
//        System.out.println(maiorNumero);
//        System.out.println(menorNumero);
        // 13 Solicite ao usuário a quantidade de alunos em uma sala. Para cada aluno, leia a nota (0 a 10). Informe quantos alunos estão aprovados (nota >= 7), em recuperação (nota >= 5 e < 7) e reprovados (nota < 5).

//        int n = sc.nextInt();
//
//        ArrayList<Integer> aprovados = new ArrayList<>();
//        ArrayList<Integer> recuperacao = new ArrayList<>();
//        ArrayList<Integer> reprovados = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println("Digite a nota :" + i);
//            int nota = sc.nextInt();
//
//            while (nota < 0 || nota > 10) {
//                System.out.println(nota + " invalido, Digite novamente");
//                nota = sc.nextInt();
//            }
//
//            if (nota >= 7) {
//                System.out.println(nota + " aprovado");
//                aprovados.add(nota);
//            } else if (nota >= 5 && nota < 7) {
//                System.out.println(nota + " recuperação");
//                recuperacao.add(nota);
//            } else {
//                System.out.println(nota + " reprovado");
//                reprovados.add(nota);
//            }
//
//        }
//            System.out.println(aprovados.size() + " aprovados");
//            System.out.println(recuperacao.size() + " recuperados");
//            System.out.println(reprovados.size() + " reprovados");
        // 14 Leia uma quantidade indefinida de números inteiros. O programa só deve parar quando o usuário digitar 0. No final, informe a média dos números positivos e a média dos números negativos separadamente.
// ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//        ArrayList<Integer> listP = new ArrayList<>();
//        ArrayList<Integer> listN = new ArrayList<>();
//        int totalP = 0;
//        int totalN = 0;
//
//        while (true) {
//            System.out.print("Enter number: ");
//            int number = sc.nextInt();
//
//            if (number > 0) {
//                listP.add(number);
//                System.out.println("ADD +1" + " ListP:" + listP.size());
//            } else if (number < 0) {
//                listN.add(number);
//                System.out.println("ADD +1" + " ListN:" + listN.size());
//            } else {
//                sc.close();
//                break;
//            }
//        }
//
//        for (int i = 0; i <= listP.size(); i++) {
//            totalP +=  listP.get(i);
//        }
//            System.out.println("Averege is positive: " + (totalP/listP.size()));
//
//        for (int i = 0; i <= listN.size(); i++) {
//            totalN += listN.get(i);
//        }
//            System.out.println("Averege is negative: " + (totalN/listN.size()));
//

        // 15 Faça um programa que simule uma urna eletrônica. O usuário poderá digitar votos para os candidatos 1, 2, 3 ou 4. O voto é encerrado ao digitar -1. Exiba o total de votos de cada candidato.
//        int contador1 = 0;
//        int contador2 = 0;
//        int contador3 = 0;
//        int contador4 = 0;
//
//        System.out.println("""
//                                                ESCOLHA UM CANDITADO
//
//                                                 1 PARA CANDITADO 1
//                                                 2 PARA CANDITADO 2
//                                                 3 PARA CANDITADO 3
//                                                 4 PARA CANDITADO 4
//
//                """);
//
//        while (true) {
//            System.out.println("Enter a number :");
//            int num = sc.nextInt();
//
//            if (num == -1) {
//                break;
//            }
//
//            if (num == 1) {
//                contador1++;
//            } else if (num == 2) {
//                contador2++;
//            } else if (num == 3) {
//                contador3++;
//            } else if (num == 4) {
//                contador4++;
//            } else {
//                System.out.println("Voto Invalido");
//            }
//        }
//
//        System.out.println(contador1);
//        System.out.println(contador2);
//        System.out.println(contador3);
//        System.out.println(contador4);

//  16      Solicite um número inteiro positivo n e exiba os n primeiros termos da sequência abaixo:
//        2, 4, 8, 16, 32, ... (cada número é o dobro do anterior)
//        int n = sc.nextInt();
//        int number = 1;
//        for (int i = 1; i <= n; i++) {
//            number = number * 2;
//            System.out.println(number);
//        }
//  17      Leia um número inteiro n e, usando repetição, exiba a soma apenas dos números ímpares entre 1 e n.

//        int n = sc.nextInt();
//        int total = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                total += i;
//            }
//        }
//
//        System.out.println(total);

//  18      Peça ao usuário que digite uma senha numérica. Permita até 3 tentativas, exibindo mensagens diferentes se a senha estiver incorreta ou correta.

//        System.out.println("Digite a senha: ");
//        String senha = sc.nextLine();
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Confirme a senha: ");
//            String senha2 = sc.nextLine();
//
//            if (senha.equals(senha2)) {
//                System.out.println("Senha correta!");
//                break;
//            } else {
//                System.out.println("Senha incorreta!");
//            }
//        }
//  19      Leia 10 nomes e suas respectivas idades. Exiba o nome da pessoa mais velha e da mais nova.
//        String pessoaMaisVelha = "",nome = "";
//        int idadeDaPessoaMaisVelha = 0,idade = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Digite o seu nome: ");
//            nome = sc.nextLine();
//
//            System.out.println("Digite o seu idade: ");
//            idade = sc.nextInt();
//
//            if (idade > idadeDaPessoaMaisVelha) {
//                pessoaMaisVelha = nome;
//                idadeDaPessoaMaisVelha = idade;
//            }
//        }
//
//        System.out.println("Essa é a pessoa mais velha: "+ pessoaMaisVelha + "com a idade: "+ idade);

//  20     Solicite ao usuário um número inteiro n. Para cada número de 1 até n, exiba:
//
//"Fizz" se for múltiplo de 3
//"Buzz" se for múltiplo de 5
//"FizzBuzz" se for múltiplo de 3 e 5
//O próprio número caso contrário

//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0 && i % 3 != 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }

    }
}
