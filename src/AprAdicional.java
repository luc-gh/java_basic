import java.util.Random;
import java.util.Scanner;

//Aqui teremos alguns conhecimentos adicionais não tão relevantes, como algumas classes, métodos ou funções para alguns testes ou códigos específicos.
public class AprAdicional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //NÚMEROS ALEATÓRIOS
        //Uma forma de gerar números aleatórios em Java é utilizando a classe Random. Ela possiu métodos para seleção de números aleatórios.
        //Pode usá-la da mesma forma que a classe Scanner, por exemplo, e pode-se também selecionar um numero aleatórios dentro de um intervalo.
        Random random = new Random();
        System.out.println(random.nextBoolean()); //Gerando um booleano aleatorio
        System.out.println(random.nextDouble()*50); //Double aleatório entre 0 e 50 (é preciso multiplicar pois há a auto-seleção de Double entre 0 e 1
        System.out.println(random.nextInt(9)+1); //Gerando inteiro aleatório entre 1 e 9 (soma-se pois a contagem começa em 0)

        //CONDIÇÃO OU OPEERAÇÃO TERNÁRIA
        //Essa condição funciona como uma simplificação da estrutura if/else, para casos onde hajam 2 opções, que dependem de uma condição booleana.
        //Porém tais opções, se referem ao valor que será armazenado numa variável, diante de que uma condição seja verdadeira ou falsa.
        //Sua estrutura é: <variável> = (condição) ? <valor1> : <valor2>
        //Ou seja, se a conddição for verdaeira, a variável recebe um valor, se for falsa, recebe outro valor.
        //Veja o exemplo a seguir:
        Double a, b;
        System.out.println("Valor de a: ");
        a = scanner.nextDouble();
        System.out.println("Valor de b: ");
        b = scanner.nextDouble();
        String str = (a > b) ? "a é maior que b" : "a não é maior que b";
        System.out.println(str);
        //Podem também haver várias condições como no exemplo a seguir:
        System.out.println("Qual seu dia predileto da semana?");
        System.out.println("Digite as primeiras 3 letras dos nomes dos dias (seg/ter)");
        System.out.print("Resp: ");
        String c = scanner.next();
        String dia = (c == "seg") ? "segunda" :
                     (c == "ter") ? "terça" :
                     (c == "qua") ? "quarta" :
                     (c == "qui") ? "quinta" :
                     (c == "sex") ? "sexta" :
                     (c == "sab") ? "sábado" :
                     (c == "dom") ? "domingo" :
                     "Dia inválido";
        System.out.println("Seu dia predileto é " + dia);

        //LABEL BLOCKS E BREAK
        /*Um Label Block é um bloco de instrução delimitado por chaves, como todos os outros. Porém, ele não faz parte ou delimita nenhuma estrutura
        presente no código, mas sim, apenas caracteriza a delimitação de alguns comandos quaisquer. Mas, estes bloco de instruções podem possuir algo
        diferente, um rótulo. Este, será utilizado para indetificar tal bloco de código, apenas. Este bloco, como não possui condições e também não
        necessita ser chamado, simplesmente é executado, sem alterar o fluxo do código (dependendo dos comandos presentes no bloco).*/
        /*Porém, o comando break, usado em maioria nas estruturas de repetição ou laços condicionais, pode também ser usado para encerrar a execução
        de um bloco de código, se este possuir um rótulo. Para isso, basta digita; break <rótulo>, que a execução do bloco será encerrada.*/
        //Perceba no exemplo, que com o break finalizando o segundo bloco, o compilador pulará para a linha 67, que não faz parte do bloco 2.
        label1:{
            System.out.println("Bloco 1 - Inicio");
            label2:{
                System.out.println("Bloco 2 - Inicio");
                label3:{
                    System.out.println("Bloco 3 - Inicio");
                    if(true){
                        break label2;
                    }
                    System.out.println("Bloco 3 - Fim");
                }
                System.out.println("Bloco 2 - Fim");
            }
            System.out.println("Bloco 1 - Fim");
        }

        //INSTRUÇÃO CONTINUE
        /*Semelhante a instrução break, porém, ela apenas encerra UM ciclo de um bloco de instrução. Por exemplo, se o bloco de instrução for um
        loop, podemos estabelecer alguma condição para que esse loop não execute suas própris instruções em alguns casoso, e para recomeçar o loop
        nesses casos, utilizamos a instrução continue. */
        //No exemplo abaixo, reiniciamos o loop todas as vezes que a variavel é par, fazendo com que o loop só ocorra normalmente quando ela for impar.
        //Depois, imprimimos tambem o somatorio dos numeros impares até os que correspondem a variavel.
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){ //Vemos se i é par
                continue; //Caso seja par, finalizamos o loop e voltamos ao inicio
            }
            System.out.println(i); //imprimimos i

            int soma = 0;
            soma += i;
            System.out.println("A soma ate agora é: " + soma);
        }



    }
}
