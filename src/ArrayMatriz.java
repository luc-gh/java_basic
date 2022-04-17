import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //- ARRAYS -----------------------------------------------------------------------------------------------------------------------------------
        //Um Array é um arranjo ou um conjunto de dados que permite a manipulação de um número finito de elementos do mesmo tipo.
        /*Cada item de um Array é chamado elemento, e em todos os elementos são enumerados, e os numeros que identificam cada elemento
        são chamados índeces dos Arrays. O índice inicial do Array sempre é zero (0). */
        //Em java, um Array é um coleção de dados, e há bibliotecas que permitem a manipulação desses dados de modo mais amplo na linguagem.
        //Mas é importante saber o conceito e funcionamento geral de um Array: um conjunto de variaveis indexadas indentificadas por um numero inteiro.
        //O modo de escrever um Array é este (o tipo inteiro é apenas um exemplo): int[] arrayInt = new int[5]
        //A estrutura criada no exemplo anterior cria '5 variaveis' de mesmo nome, que podem ser acessdas atravéz de seu índice.
        //No caso, o primeiro elemento é arrayInt[0] e o último elemento, tem um indice que corresponde ao total -1, isto é: arrayInt[4].
        //É importante ressaltar que todos os elementos de um Array possuem o tipo que foi especificado na declaração do próprio Array.

        //Array vem do inglês Arranjo. Normalmente, Arrays de uma dimensão, ou seja, uma simples lista, é chamado de vetor.
        //Quando ele possui 2 dimensões, chamamos tambem de tabela, pois ele posui os eixos x e y, um Array de outro Array.
        //Porém, o termo mais usado é Matriz, que representa um Array genérico de n dimensões, como na matemática.
        //Diferencia-se com mais frequência, para facilitar, Arrays unidimencionais (Vetores) e de mais de uma dimensão (Matrizes).

        //Arrays são altamente utilizados na computação gráfica, pois é a melhor forma de armazenas as informações geradas em tal área.
        //Imagem vetorial é uma imagem que pode ser armazenadas em disco utilizando somente Arrays. É algo também muito usado na computação gráfica.
        //A maioria dessa utilizações se deve ao fato dos Arrays serei a melhor representação de coordenadas, sempre utilizadas na localização de dados.

        //Na declaração de um Array podemos colocar qualquer tipo, primitivo ou de referência, um Classe criada ou até mesmo um outro Array.
        //Além disso, a declaração básica é: <tipo>[] <nome>;, sem a necessidade de especificação do numero de elementos.
        //Se não declarar-mos o numero de elementos do Array, não será reservado espaço na memória para dados, poderemos só referencia-lo com seu nome.
        /*Se declarar-mos o numero de eleementos e criar-mos o Array, é criado na memória um objeto de  tipo array, e uma referência para cada elemento
        pertencente a este Array, sendo que estes objetos no têm relação de tipo. */
        //Veja o exemplo de declaração e em seguida criação de um Array de 5 elementos de tipo inteiro (enumerados de 0 a 4).
        int[] arrayint; //declaração de Array
        arrayint = new int[5];  //criação de Array
        //Agora, vamos imprimir cada elemento do Array, como tambem, cada valor armazenado neste.
        /*Para isso, vamos colocar nossa impressão em um laço for, e imprimir trabalhando com Strings formatadas, ou seja,
        especificando a quantidade de casas de cada variavel. Para isso, usamos printf, para imprimir de forma formatada (funções herdadas de C/C++). */
        for(int i = 0; i <= 4; i++){
            arrayint[i] = i - 2*i;
            System.out.printf("%5d%7d\n", i, arrayint[i]);
        }

        //Agora, faremos um exeplo semelhante, imprimindo uma matriz com os mesmos valores, porém de modo mais intuitivo, como uma tabela melhor.
        //Para isso, usamos Strings para organizar a tabela, usando-as de modo formatado, tendo assim, masi controle sobre a tabela.
        int[] tabela;
        tabela = new int[5];
        System.out.printf("%9s%10s\n", "_________", "_________");
        System.out.printf("%7s%10s\n", "Valor", "Oposto");
        System.out.printf("%9s%10s\n", "---------", "---------");
        for(int j = 0; j <= 4; j++){
            tabela[j] = j - 2*j;
            System.out.printf("%5d%10d\n", j, tabela[j]);
        }
        System.out.printf("%9s%10s\n", "---------", "---------");

        //Nós podemos também declara um Array e ao invés de apenas definir-mos seu tamanho, podemos já atribuir um conjunto de elementos ao Array.
        //Isso faz com que o compilador crie uma nova intância de Array no momento de declração, crie o numero de elementos e valor de cada um.
        //Para isso, ao declarar-mos o Array, já atrubuimos um conjunto da variaveis ou valores de mesmo tipo, entre couchetes, ao Array.
        //Porém, haverão casos onde não saberemos a quantidade de elementos de um Array. Se isso ocorrer, podemos usar a função length.
        //No exemplo a seguir, imprimos o indice e os valores do Array criado, como se não soubessemos seu tamanho:
        int[] vetor = {12, -9, 33, 84, 64};
        System.out.printf("%7s%9s\n", "indice", "Valores");
        for(int h = 0; h < vetor.length; h++){
            System.out.printf("%4d%9d\n", h, vetor[h]);
        }

        // Para aumentar o estudo, vejamos as características dos Arrays:
        // 1- Dimensão: t0do Array possui pelo menos uma lista de elementos, e esta pode ser denominada dimensão.
        // 2- Índices: t0do Array possui um ou mais numeros inteiros, dependendo do nº de dimensões, que representa cada um de seus eleementos.
        // 3- Elementos: t0do Array possui elementos, que são os itens que estão contidos na instância Array. Elementos não especificados tem valor 0.
        // 4- Tipo: t0do Array tem elementos de apenas um tipo, especificado na sua declração. Não há elementos de tipos diferentes no mesmo Array.
        // 5- Índice 0: t0do índice inicial de um Array tem valor 0. Com isso, o último elemento tem índice igual ao total de elementos menos 1.
        // Para atribuir-mos valores as posições de um Array, basta atribuir o valor escolhido ao nome do Array, especificando seu índice
        // Vejamos um exemplo com um Array que conterá as vogais:
        String[] vogais = new String[5]; //declaramos e criamos o Array
        vogais[0] = "a";
        vogais[1] = "e";
        vogais[2] = "i";
        vogais[3] = "o";
        vogais[4] = "u";
        System.out.println(vogais[1] + vogais[2]);

        //Outro conhecimento importante é saber fazer o calculo de uma media dos elementos de um Array (se forem numéricos) de tamanho indefinido.
        //Utilizaremos a função Array.length para nos auxiliar pois não sabemos o tamanho do Array.
        //Um tamanho de Array definido pelo usuario pode ser feito assim:
        System.out.println("Qual será o tamanho do Array (numero inteiro positivo): ");
        int tamanho = scanner.nextInt();
        int[] arrayIndef = new int[tamanho];
        int mediaIndef = 0;
        for(int indef = 0; indef < arrayIndef.length; indef++){
            System.out.printf("%s%d%s", "Elemento ", indef+1, ": ");
            arrayIndef[indef] = scanner.nextInt();
            mediaIndef += arrayIndef[indef];
        }
        System.out.printf("%s%d", "A media dos elementos é ", mediaIndef/arrayIndef.length);

        //MATRIZES - ARRAYS MULTIDIMENCIONAIS
        //O funcionamento de uma matriz é muito semelhante ao de um Array unidimensional.
        //Normalmente, quando o Array é unidimensional, é chamado Vetor. Se tiver mais dimensões, o chamamos de matriz, que pode ter inumeras dimensões.
        //Eles diferem um pouco apenas na declaração, e obviamente, no numero de dados a serem declarados, armazenados e/ou utilizados.
        //Uma matriz, é semelhante a um plano carteziano ou a uma tabela. O numero de eixos ou dimensões é definido na declaração.
        //Por exemplo: int[][] matriz = new int[4][2]; é um Array (matriz) bidimensional, de 4 linhas (0,1,2,3) e 2 colunas (0,1).
        //Os elementos podem ser manipulados como num sistema de coordenadas: colocamos o nome e os indeces do valor que queremos para podermos usá-lo.
        //Isto é, para manipular os valores de um Array, é preciso localiza-lo de modo correto.
        //Para isso, indica-se todos os indices da posição desejada, dependendo do numero de dimensões, eixos ou coordenadas.
        //No exemplo a seguir, atribuimos valores a algumas posições de uma matriz 2x4, e depois imprimimos com dois loopings for (for aninhado).
        //Além disso, vemos tambem o tamanho de uma das dimensões do Array (de uma linha), para exemplificar seu funcionamento:
        int[][] exemplo = new int[2][4];
        exemplo[0][0] = 9;
        exemplo[1][3] = 6;
        exemplo[0][2] = 5;
        exemplo[1][1] = 1;
        System.out.println("O tamanho da primeira linha é " + exemplo[0].length + "pois cada linha tem " + exemplo[0].length + " colunas.");
        for(int l = 0; l < 2; l++){
            System.out.println(" ");
            for(int c = 0; c < 4; c++){
                System.out.print(exemplo[l][c] + " ");
            }
        }
        //Perceba que a função length serve apenas para sabermos o tamanho da primeira (ou das primeiras) dimensões da matriz.

        //Já no exemplo a seguir, imprimimos uma matriz 4x4(4 linhas e 4 colunas) com o numero 1 nas posições de indices iguais e 0 nas outras posições:
        //Para isso, utilizaremos o laço for aninhado. É importante ressaltar que esse tipo de matriz é chamada matriz diagonal (conceito matematico).
        int[][] matrizDiagonal = new int[4][4]; //declaramos e criamos uma matriz 4x4
        for(int dimensao1 = 0; dimensao1 < matrizDiagonal.length; dimensao1++){ //criamos o laço de repetição para linhas
            for(int dimensao2 = 0; dimensao2 < matrizDiagonal.length; dimensao2++){ //criamos o laço de repetição para colunas
                if (dimensao1 == dimensao2){ //As variaveis 'dimensao' tem valores iguais aos indices da matriz
                    matrizDiagonal[dimensao1][dimensao2] = 1; //logo, se os indices forem iguais, a posição recebe 1
                }
                else{
                    matrizDiagonal[dimensao1][dimensao2] = 0; //se os indices forem diferentes, a posição recebe 0
                }
            }
        }
        //Como a matriz é bidimensional, criamos um for aninhado (tambem bidimensional) para imprimir a matriz
        for(int impressao1 = 0; impressao1 < matrizDiagonal.length; impressao1++){ //linhas
            System.out.printf("\n"); //quebramos a linha a cada linha a fins de organização
            for(int impressao2 = 0; impressao2 < matrizDiagonal.length; impressao2++){ //colunas
                System.out.print(matrizDiagonal[impressao1][impressao2] + " "); //damos um espaço para organização
            }
        }

        //NOTA
        //Alguns exemplos de matrizes trambem foram citados no codigo ifForWhile.java e Exercicios.java

        //PLANILHAS
        //Uma matriz bidimensional tambem pode ser considerada uma planilha ou tabela.
        /*No exemplo a seguir, vamos criar uma planilha 5x6, somar o valor contido nas 5 primeiras colunas de cada linhas e por esses valores na sexta
        coluna (a sexta coluna tem valores iniciais nulos) e depois somaremos os valores da sexta colunas tendo assim o somat´rio de todos os valores.*/
        double[][] planilha =
               {{66.3,  55.7, 98,    1.8,  954.0, 0},
                {20.2,  2.1,  65,    644,  48.6,  0},
                {999,   55.8, 17,    13.4, 545.4, 0},
                {987.5, 6.7,  90.5,  47.6, 51,    0},
                {23.89, 561,  710.6, 31.7, 69.2,  0}};
        double somaTotal = 0;
        for(int x = 0; x < 5; x++){ //Para passar-mos por cada linha.
            for(int y = 0; y < 5; y++){ //Isto porque queremos somar apenas os primeiros 5 elementos contidos em cada linha.
                planilha[x][5] += planilha[x][y]; //Somamos os valores de cada coluna e colocamos este na ultima a cada ciclo.
            }
            somaTotal += planilha[x][5];
        }
        for(int x1 = 0; x1 < 5; x1++){
            String textoFinal = "";
            for(int y = 0; y < 6; y++){
                if(y < 5){
                    textoFinal += planilha[x1][y] + ", ";
                }
                else{
                    textoFinal += planilha[x1][y];
                }
            }
            System.out.println(textoFinal);
        }
        System.out.println("A soma total foi: " + somaTotal);
    }
}
