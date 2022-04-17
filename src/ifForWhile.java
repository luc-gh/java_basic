import java.util.Scanner;
public class ifForWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Antes de iniciar, precisa ter o conceito de bloco de código ou de instrução.
        /*Um bloco de código é uma parte do código definida entre chaves, e que corresponde a inicio e fim das instruções de uma classe,
        de uma função, de estruturas de condição ou repetição, entre outros. Além disso, é importante ressaltar que blocos de instrução
        sempre e apenas podem ser delimitados por chaves. Se algum comando (como if) for concluído com um ponto e virgula (;), o compilador
        o considerará como instrução nula ou vazia, e assim, executará o bloco de instrução segunite independente da condição estabelecida. */

        //IF/ELSE
        //O comando if verifica se uma informação é verdadeira ou não, e dependendo da resposta, executa um bloco de código (seu corpo).
        //Caso a condição estabelecida no comando if não for satisfeita, pode-se utilizar o comando else, para uma segunda opção.
        //Caso sejam necessárias mais de duas condições, entre o if (inicio) e o else (final), usamos else if para outras condições
        //O programa a seguir verifica a media das notas de um aluno e diz se ele foi aprovado, reprovado ou vai pra recuperação:
        Double n1, n2, n3;
        System.out.print("Nota 1: ");
        n1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        n2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        n3 = scanner.nextDouble();
        if((n1+n2+n3)/3 < 3.5){
            System.out.println("Aluno reprovado");
        }
        else if((n1+n2+n3)/3 >= 3.5 && (n1+n2+n3)/3 < 7){
            System.out.println("Aluno em recuperação");
        }
        else{
            System.out.println("Aluno aprovado");
        }

        //FOR
        //O comando for é utilizado quando há a necessidade de repetir um trecho de código de acordo com uma condição.
        //Ele é um comando de muita eficiencia pois evita que haja repetição de código, além de ter uma estrutura completa.
        //Sua sintaxe é: for (inicialização; condição; incremento) { corpo }.
        //Sua inicialização pode ser feita com uma variavel ou um valor, contanto que o incremento estabeleça um final para a repetição.
        //No exemplo a seguir imprimimos de 0 a 10 utilizando laço de repetição for.
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        //É importante ressaltar que nenhuma das partes da sintaxe do for é obrigatória. Usa-se de acordo com a necessidade.
        //Porém, para encerrar a inicialização e a condição, é necessário o ;, independentemente de tais partes estarem vazias ou não.

        //WHILE
        //O comando while é semelhante ao comando for, porém é mais simples, pois repete um trecho de código de acordo apenas com uma condição.
        //É possível fazer isso com o comando for, porém sempre é necessário incrementar a variável, para não entrar num loop infinito.
        //Com o while, a condição pode ser estabelecida da mesma forma que o for, porém também pode ser definida pelo usuário.
        //Isso significa que podemos fazer com que o usuário forneça a condição de encerramento da repetição do código.
        //Isso também é possiível com o for, porém com mais complexidade.
        /*
        * No código abaixo, utilizamos try, while, for e if. Criamos um loop para que o usuario digite um numero e a tabuada deste seja impressa.
        * Para isso, criamos um loop com o while, inicializando uma variavel w com 1, e estabelecendo a repetição até que w seja igual a 0.
        * Pedimos um valor ao usuario e criamos com if/else as condições de execução ou não do programa.
        * Se o usuario digitar 1, pede-se um numero inteiro para fazer as operações. Se ele for digitado, as operações são feitas e o loop repete.
        * Se um inteiro não for digitado, evitamos um erro com o try/catch e encerramos o programa fazendo com que w = 0.
        * Se o usuario digitar 0, encerra-se o programa fazendo com que w = 0.
        * Se não for digitado nem 1 nem 0, nenhuma das condições é satisfeita, e no corpo do else, encerramos o programa fazendo com que w = 0.
        */
        int w = 1;
        while(w != 0){
            System.out.println("Para continuar, digite 1. Para encerrar, digite 0.");
            System.out.print("Resp: ");
            byte s = scanner.nextByte();
            if(s == 1){
                try {
                    System.out.print("Digite um numero inteiro: ");
                    int dou = scanner.nextInt();
                    for(int cont = 0; cont <= 10; cont++){
                        System.out.println(dou + " * " + cont + " = " + cont*dou);
                    }
                } catch (Exception e){
                    System.out.println("Erro!");
                    w = 0;
                    System.out.println("Fim de execução.");
                }
            }
            else if(s == 0){
                System.out.println("Fim de execução.");
                w = 0;
            }
            else{
                System.out.println("Erro!");
                System.out.println("Fim de execução.");
                w = 0;
            }
        }
        /*
        É importante ressaltar que no código acima, a condição do while só será satisfeita de acordo com o usuário. Porém, é possível definir
        um numero de repetições fixo com a incrementação (como é feito na maioria dos laços for), mudando o valor da variavel usada na
        condição a cada execução, e assim, depois que a condição foi satisfeita, o loop se encerrará.
        */

        //DO/WHILE
        //A associação dos comando Do e while criam uma estrutura de repetição condicional muito semelhante a anterior.
        //Com o While apenas, o bloco de código em seu corpo só era executado se a condição fosse estabelecida.
        /*
        Com o Do/while, o bloco de código vai ser executado pelo menos uma vez, independentemente da condição, pois ela é estabelcida
        posteriormente ao bloco de código. No exemplo abaixo, imprimimos uma contagem regressiva com Do/while:
        */
        int iter = 10;
        do{
            System.out.println(iter);
            iter--;
        } while (iter != -1);

        //FOR ANINHADO
        //Utilizar o laço for aninhado quer dizer utilizar o laço for dentro (no escopo ou no corpo) de outro.
        //As caracteristicas deste tipo de estrutura não se modificam com as da estrutura for original.
        //É apenas um uso específico do comando for, que serve para varias aplicações.
        //No exemplo abaixo imprimimos alguns numeros num laço, e para cada numero impresso, haverá outra lista de numeros, impressa por outro laço:
        for(int j = 0; j < 3; j++){
            System.out.print(j);
            for(int h = 3; h < 6; h++){
                System.out.printf("%s%d%s%d%s%d%s", " - {", h, ",", h+1, ",", h+2, "}");
            }
            System.out.println();
        }

        //FOREACH
        //É uma derivação do laço de repeticção for, caracterizando-se como uma estrutura de repetição especializada.
        //Funciona como uma forma rapida para percorrer (receber a referência) todos os itens de uma lista.
        //Isto é, com essa estrutura, definiremos uma variavel que receber a referencia de todos os itens de um Array, a cada ciclo.
        //A sua estrutura é: for(<varaivel> : <Array>), onde a variavel é que vai receber os valores de cada item do Array citado, a cada ciclo do laço.
        //No exemplo, o Array unidimensional tem dois itens definidos na declaração. Com o foreach, imprimimos todos de modo mais simples:
        int[] arrayForeach = {140, 200};
        for (int itensForeach:arrayForeach) {
            System.out.println(itensForeach);
        }
        //Haverão mais exemplos de ForEach no código sobre Matrizes.

        //No proximo exemplo, criamos um vetor, atribuimos um valor para cada posição e imprimimos a média aritmética, o maior e o menor valor:
        int[] valoresV = {25, 33, 686, 100, 9456};
        int somaV = 0, maiorV = 0, menorV = 0;
        for(int cadaPosicao : valoresV){
            somaV += cadaPosicao;
            if(cadaPosicao < menorV || menorV == 0){
                menorV = cadaPosicao;
            }
            if(cadaPosicao > maiorV){
                maiorV = cadaPosicao;
            }
        }
        float media = (float)somaV / valoresV.length;
        System.out.println("A media é: " + media + "; O maior valor é: " + maiorV + "; e o menor valor é: " + menorV + ".");
        //Observe que para acharmos o menor valor temos que definir a condição menor que e tambem uma para o valor ser diferente de 0, para inicializar.
        //Tal coisa não é necessária no caso da condição maior que, pois ela não precisa de inicialização lógica.

        //FUNÇÃO MATRICIAL
        //No proximo exemplo, vamos atribuir valores a cada posição de uma matriz 10x10 (x,y) de a cordo com a função:
        // f(x,y) = (3 * (x + 1) + (y*y)) onde 0 <= x < 9, e 0 <= y < 9.
        int[][] funcaoMatricial = new int [10][10];
        for(int x = 0; x < 10; x++){
            String organizacao = ""; //Para organizar a impressao, a cda ciclo de y, vamos armazenar todos os valores organizadamente numa String.
            for(int y = 0; y <10; y++){
                funcaoMatricial[x][y] = (3 * (x + 1) + (y*y));
                if(y < 9){
                    organizacao += funcaoMatricial[x][y] + ", "; //Se a repetição for continuar, a String recebe o valor, uma virgula e um espaço.
                }
                else{
                    organizacao += funcaoMatricial[x][y]; //Caso seja o ultimo loop, a String recebe o valor da posição.
                }
            }
            System.out.println(organizacao);
        }
    }
}