import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;
/*
* Função é uma pequena parte do programa que possui uma responsabilidade específica e pode ser reusada quando necessário.
* A estrtura de uma função é, de acordo com o exemplo a seguir:
*
* --> private void helloWorld (int valor) {
        System.out.print("Olá, mundo");
      }
* Nessa função, private representa o modificador de visibilidade da função, e no caso, significa que somente a classe onde
  essa função está definida, tem acesso a ela. Com public, todas as classe teriam acesso a função.
* void, corresponde ao tipo de retorno da função, e no caso, representa que ela não tem retorno.
* helloWorld é o nome da função.
* int valor representa o parametro da função. Podem haver vários.
* A primeira chave é o inicio da função, a ultima é o fim, e tudo entre elas é o corpo da função.
*
* O retorno de uma função pode ser vazio (void), pode ser qualquer tipo de dado (primitivo ou não), ou pde também ser
  uma instância de classe, ou seja, um tipo de dados criado pelo programador.
* Para chamar uma função, basta digitar seu nome, e passar a este o parametro da função entre parenteses.
 */
import java.util.Scanner;
public class Functions {
    private void helloWorld() {
        System.out.println("Olá, mundo!");
    }

    private Float soma(Float x, Float y) {
        Float z;
        z = x + y;
        return z;
    }

    private void excecoes(){
        //EXCEÇÔES
        // -Suponha que criassemos uma String palalvra, como no exemplo a seguir, com o valor 'nome' e usassemos a função charAt(200)
        String palavra = "nome";
        System.out.println(palavra.charAt(200));
        System.out.println("Teste!");
        //Perceba que ocorreu o erro: StringIndexOutOfBoundsException: String index out of range: 200
        //Esse erro é uma Exceção. Ele aconteceu porque o compilador buscou uma posição que está fora do limite do tamanho do valor da String.
        //Perceba também que, com esse erro, o programa simplesmente para a execução. Não executando o proximo comando sout.
        //E isso não é interessante para um grande sistema.
        //Para evitar problema assim, utilizamos o comando try/catch.
        /* No corpo do try, colocamos os comandos que podem se tornar exceções. Ao fim dele, colocamos o catch e definimos uma Exception,
        damos a ela um nome. No corpo do catch podemos definir comados que substituem o erro (como apenas uma mensagem de aviso) ou apenas
        deixamos sem comandos, e se o erro acontecer, será ignorado e não executado, porém o resto do programa será executado normalmente.*/
        try {
            String str = "nome";
            System.out.println(str.charAt(200));

            String x = null;
            System.out.println(x.length()); //Aqui teríamos outro erro comum em Java, o NullPointerException.
        } catch (Exception e){
            System.out.println("Erro na localização da posição.");
        } finally {
            System.out.println("De qualquer forma estou aqui");
        }
        //Podemos usar quantos catchs quisermos e específicar (com seus nomes) ou não os erros no corpo do try.
        //Além disso, se for preciso concluir a execução com algo, com ou sem erros, temos o finally, que faz exatamente isso.

        /*--> É importante ressaltar que exceções são muito comuns em Java por representarem erros comuns como uso incorreto de tipos de
         dados, uso de função que excede o formato de uma variável ou até alguns erros de sintaxe no código.*/
    }
    public static void main(String[] args) {
        /*Ao criarmos nosso método de função aqui, podemos utiliza-lo para chamar as funções que criamos nessa classe
        ou em outras classes, caso sejam publicas.*/
        Functions funcao = new Functions(); //Aqui criamos nosso método para chamar as funções.

        //A função a seguir é de exceções, só utilize quando for testa-las. Se não for, comente-a.
        //funcao.excecoes();

        funcao.helloWorld(); //Nessa caso, chamamos uma função sem retorno, que é privada.
        Scanner scanner = new Scanner(System.in); //Aqui criamos um scanner.
        System.out.print("Valor 1: ");
        Float a = scanner.nextFloat();
        System.out.print("Valor 2: ");
        Float b = scanner.nextFloat();
        System.out.println("A soma é: " + funcao.soma(a, b)); //Aqui, chamamos uma função que nos retorna um valor de acordo com os parametros.

        /* Além das funções que podemos criar, a classe String possui várias funções úteis já implementadas nela há muito tempo,
         * e algumas podem nos auxiliar de modo bem eficiente no código. Para ver todas as funções, digite 'String' e com o cursor do
         * teclado em cima do nome 'String' clique em Ctrl + B. Aqui veremos algumas das mais úteis:
         * */
        String str = "Curso de Java!";
        //charAt --> retorna um caractere pertencente a variavel dependendo da sua posição
        System.out.println(str.charAt(2)); //r

        //equals --> compara se as Strings ou variaveis tem valores iguais, retornando um booleano (V/F).
        System.out.println(str.equals("alahfs")); //false

        //startsWith --> verifica se o valor da String começa com um valor especificado, retornando um booleano.
        System.out.println(str.startsWith("Curs")); //true

        //endsWith --> verifica se o valor da String termina com um valor especificado, retornando um booleano.
        System.out.println(str.endsWith("abc")); //false

        //substring --> impreime uma parte do valor da String, dependendo da forma usada.
        System.out.println(str.substring(3)); //Primeira forma: 'so de Java!'. Conta até o final.
        System.out.println(str.substring(2, 8)); //Segunda forma: 'rso de'. O ultimo não é incluido na contagem.

        //replace --> substitui uma parte da String original por outra, que é definida como um parametro de retorno.
        System.out.println(str.replace("Java", "Javaaaa")); //Curso de Javaaaa!
        System.out.println(str.replace("Javaaaa", "Java")); //Curso de Java!

        //toUpperCase e toLowerCase --> modificam toda a String (ou apenas uma parte especificada) para maiusculas ou minusculas, respectivamente.
        System.out.println(str.toUpperCase()); //CURSO DE JAVA!
        System.out.println(str.toLowerCase()); //curso de java!

        //trim --> remove espeços em branco na String
        System.out.println(str.trim()); //cursodejava!

        //length --> retorna o numero de posições da String (seu tamanho).
        System.out.println(str.length());

    }
}