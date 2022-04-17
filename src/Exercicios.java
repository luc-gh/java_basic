import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
1. Escreva uma função privada chamada helloWorld que não possui retorno algum e não recebe nenhum parâmetro.
2. Modifique a função helloWorld para que receba uma String e retorne a quantidade de caracteres como um número inteiro.
3. Modifique o retorno da função helloWorld para que retorne uma String com o seguinte formato:
   "A palavra possui X caracteres."
   X - Deve ser a quantidade de caracteres da palavra passada por parâmetro.
4. Crie uma nova função capaz de receber dois números e retornar a soma dos mesmos.
5. Crie uma função que receba 3 números com casas decimais e execute o seguinte cálculo:
    ((x + y) * x) / z
   Faça o retorno com casas decimais
6. Crie uma calculadora que faz soma, subtração, multiplicação e divisão.
7. Peça ao usuario para digitar 7 numeros e armazene-os em um Array.
   a) imprima os elementos do Array
   b) some todos os numeros e exiba na tela.
   c) Multiplique o indice pelo seu valor e exiba-os.
   d) Calcule a media aritmetica de todos os elementos e exiba-a.
8. Dado um vetor de números inteiros, encontre todos os pares que somem um valor k.
   Ex.: [2, 7, 11, 15], k = 9 | R : (2,7).

*/

public class Exercicios {

    private void hello(){
        System.out.println("Hello World");
    }

    private String palavra(String s){
        String retorno;
        retorno = "A palavra possui " + s.length() + " caracteres.";
        return retorno;
    }

    private int soma(int x, int y){
        return x+y;
    }

    private Double decimais(Double x, Double y, Double z){
        return ((x+y)*x)/z;
    }

    private String findNumbers(int k, int[] vetor, int elementos){
        StringBuilder x = new StringBuilder();
        for(int i = 0; i < elementos; i++){
            for(int j = i+1; j < elementos; j++){
                if((vetor[i] + vetor[j] == k)){
                    x.append("(").append(vetor[i]).append(",").append(vetor[j]).append(")");
                }
            }
        }
        return x.toString();
    }

    public static void main(String[] args) {
        Exercicios funcao = new Exercicios();
        Scanner scanner = new Scanner(System.in);

        //Exercicio 1
        funcao.hello();
        //Exercicios 2 e 3
        System.out.print("Escreva uma palavra: ");
        String word = scanner.next();
        System.out.println(funcao.palavra(word));
        //Exercicio 4
        try {
            System.out.print("Digite um valor inteiro: ");
            int v1 = scanner.nextInt();
            System.out.print("Digite outro valor inteiro: ");
            int v2 = scanner.nextInt();
            System.out.println("A soma dos numeros é: " + funcao.soma(v1, v2));
        } catch (Exception e) {
            System.out.println("Erro. Valor inválido.");
        }
        //Exercio 5
        try {
            System.out.print("Valor 1: ");
            Double a = scanner.nextDouble();
            System.out.print("Valor 2: ");
            Double b = scanner.nextDouble();
            System.out.print("Valor 3: ");
            Double c = scanner.nextDouble();
            System.out.println("O resultado da expressao é: " + funcao.decimais(a, b, c));
        } catch (Exception e) {
            System.out.println("Erro. Valor inválido.");
        }
        //Exercicio 6
        Double x, y;
        int ite = 1;
        do {
            System.out.print("Numero 1: ");
            x = scanner.nextDouble();
            System.out.print("Numero 2: ");
            y = scanner.nextDouble();
            System.out.print("Digite 0 para sair ou escolha a operação (+ - * /) --> ");
            String str = scanner.next();
            switch (str) {
                case "+":
                    System.out.println(x + y);
                    break;
                case "-":
                    System.out.println(x - y);
                    break;
                case "*":
                    System.out.println(x * y);
                    break;
                case "/":
                    System.out.println(x / y);
                    break;
                case "0":
                    ite = 0;
                    System.out.println("Fim");
                    break;
                default:
                    throw new IllegalStateException("Erro - Valor inexperado: " + str);
            }
        } while (ite != 0);
        /* Aqui é importante ressaltar o objetivo do comando break. Ele é usado para interromper uma ciclo (loop) ou até encerra-lo, ou identificar a
        leitura de um comando que faz parte de uma condição e encerrar a leitura de uma estrutura condicional (como no exemplo do switch acima).*/

        //Exercicio 7
        System.out.println("Digite 7 numeros inteiros a seguir: "); //pedimos os 7 numeros ao usuario
        int[] numeros = new int[7]; //criamos um Array para receber os numeros
        int[] multi = new int[7]; //criamos outro Arrray para receber o produto dos numeros
        int soma = 0; //criamos uma variavel que vai receber a soma dos numeros
        for(int j = 0; j < 7; j++){ //criamos um loop para receber os numeros, e eme seguida armazena-los, e realizar soma e mulltiplicação.
            System.out.printf("%s%d%s", "Numero ", j+1, ": ");
            numeros[j] = scanner.nextInt();
            soma += numeros[j];
            multi[j] = j * numeros[j];
        }
        System.out.println("----------------------");
        int media = soma / 7; //Para a média, apenas usamos a soma já recebida e a dividimos
        //Usaremos uma função da classe Array para facilitar a impressão. A função enumera os elementos numa String, se passar-mos o Array como parâmetro
        System.out.println("Os elementos do vetor são: " + Arrays.toString(numeros)); //letra a
        System.out.println("a soma de todos os numeros é " + soma); //letra b
        for(int loop = 0; loop < 7; loop++) {
            System.out.printf("%s%d%s%d%s%d\n", "multiplicações: ", numeros[loop], " x ", loop, " = ", multi[loop]); //letra c
        }
        System.out.println("A media aritmetica é " + media); //letra d

        //Exercício 8
        int k, elementos = 0;
        String frase;
        try {
            System.out.print("Determine a constante k: ");
            k = scanner.nextInt();
            System.out.print("Insira o numero de elementos do vetor: ");
            elementos = scanner.nextInt();
            int[] vetor = new int[elementos];
            if (elementos == 1) {
                System.out.println("O vetor possui apenas um elemento!");
            } else if (elementos != 0) {
                for (int i = 0; i < elementos; i++) {
                    System.out.printf("Valor do %dº elemento: ", i + 1);
                    vetor[i] = scanner.nextInt();
                }
                frase = funcao.findNumbers(k, vetor, elementos);
                System.out.println("Vetor completo: " + Arrays.toString(vetor));
                if (frase.isEmpty()) {
                    System.out.println("Nenhum par de valores somados resultam na constante k.");
                } else {
                    System.out.println("Os pares somados que resultam na constante k são:");
                    System.out.print(frase);
                }
            } else {
                System.out.println("O vetor não possui elementos!");
            }
        } catch (Exception e){
            System.out.println("Erro!");
            System.out.println("O termo digitado não pôde ser interpretado.");
        }

    }
}
