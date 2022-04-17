public class StrinGs {
    public static void main(String[] args) {
        //Uma string é uma cadeia de caracteres, isto é, a junção de vários caracteres.
        //Coleção é um conjunto de elementos de mesmo tipo que formam algo maior.
        //No exemplo a seguir, temos a coleção de 4 caracteres formando uma string, que tem 4 posições.
        //Em Java, a contagens da posição de cada caractere começa em 0, e estes caracteres são chaamdos index.
        String nome = "Java";
        /*Para por exemplo, imprimirmos apenas um caractere específico da string, podemos utilizar
        o método charAt, e especificar a posição do index que queremos.*/
        System.out.println("A inicial da string é: " + nome.charAt(0)); //Aqui imprimimos o index de posição 0.
        /*Perceba que há o sinal de + no comando anterior. Mas nesse caso, ele foi utilizado para concatenar informações,
        isto é, juntar informações de tipos diferentes. Ao fazer isso, os tipos que não são strings, agora passam a ser.*/
        //A concatenação funciona também com variáveis.
        //Exemplos:
        String sobrenome = "Rules";
        System.out.println(nome + " " + sobrenome);

        Integer idade = 10;
        System.out.println("Idade: " + idade);

        //É possível também, mudar o tipo de uma variável para String, usando um método de String:
        Double d = 102.96;
        String strDouble = String.valueOf(d);
        System.out.println("Double para String: " + strDouble);
        //No caso acima, atribuimos a converção a uma variavel. Mas isso não é totalmente necessario:
        String.valueOf(12f); //Converção de um Float para String, de modo direto.
    }
}
