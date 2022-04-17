/*
*   Type      Bit     Tamanho:
    Double    64      2^63
    Float     32      2^31
    Long      64      2^63
    Int       32      2^31
    Short     16      2^15
    Byte       8       2^7
    Char      16       2^15
    String    ?.
    Boolean   ?
*/
public class TiposDados {
    public static void main(String[] args) {

        /* VALORES NUMÉRICOS:
        *  Utilize o tipo mais viável ao valor que quer,
        *  para não utilizar muita memória de modo desnecessário.
        */
        //Double e float: armazenam números quebrados
        Double d = 10.0; //Tem-se que adicionar o ponto, para o compliador entender que é um double
        Float f = 10.25f; //O complador entende que é um float se houver a letra f no final
        //Long, int, short e bit: armazenam apenas inteiro
        Long l = 10005000l; //Necessário adicionar l ao final
        Integer i = 669995;
        Short s = 6584;
        Byte b = 127;
        //Character e string: armazenam caracteres
        String str = " "; //Não há como definir a memória total, e utiliza-se aspas duplas
        Character c = 'c'; //Só pode armazenar um caractere, entre aspas simples, sempre
        //Boolean: tem tamanho definido pela JVM
        Boolean bool, falso = false, vdd = true; //Pode armazenar Verdadeiro ou Falso (True or False)

        System.out.println("Double - Max: " + Double.MAX_VALUE + " - Min: " + Double.MIN_VALUE);
        System.out.println("Float - Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE);
        System.out.println("Long - Max: " + Long.MAX_VALUE + " - Min: " + Long.MIN_VALUE);
        System.out.println("Integer - Max: " + Integer.MAX_VALUE + " - Min: " + Integer.MIN_VALUE);
        System.out.println("Short - Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE);
        System.out.println("Byte - Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE);

        /*Aqui ainda podemos ressaltar que todos os tipos de dados em Java, possuem tipos primitivos. Tais tipos, se
        diferenciam de tipos não primitivos (que são aqueles tradicionais), porque não são orientados à objetos, isto é,
        não podemos utilizar métodos, que são as funções auxiliares a classe de cada tipo de dado.
        Todos os tipos de dado tem um tipo primitivo assciado em Java, à excessão das Strings. Na nomenclatura,
        diferenciamos tais tipos na declaração, pois tipos primitivos são escritos com letra inicial minuscula. Do mais,
        apenas o tipo Integer tem um correspondente escrito de forma diferente: int.
        Exemplo: */
        int k = 6;
        Integer j = 60;
        //O modo de declaração e o espaço necessário na memória é o mesmo para ambos.
    }
}