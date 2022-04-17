import java.util.Scanner; //Esta classe tem as funções de escaneanmento (observe o funcionamento do comando import)
public class InputData {
    public static void main(String[] args) {
        //Com o comando Scanner, criamos uma especie de variavel que vai servir para recebermos as informações
        Scanner scanner = new Scanner(System.in); //Damos um nome(scanner) e a configuração de entrada de dados(System.in)
        System.out.print("Informe um numero inteiro: "); //Pedimos ao usuario uma informação
        Integer valor = scanner.nextInt(); //Atribuímos a resposta do usuario a uma variavel(de acordo com o tipo)
        System.out.println("O dobro do numero digitado é " + valor*2); //E podemos utilizar esse valor
        //Para cada tipo de dado, temos um comando para escaneamento ou recepção de informações.
        Double doubleValor = scanner.nextDouble();
        System.out.println("Double = " + doubleValor);
        Long longValor = scanner.nextLong();
        System.out.println("Long = " + longValor);
        Float floatValor = scanner.nextFloat();
        System.out.println("Float = " + floatValor);
        Short shortValor = scanner.nextShort();
        System.out.println("Short = " + shortValor);
        Byte byteValor = scanner.nextByte();
        System.out.println("Byte = " + byteValor);
        Boolean booleanValor = scanner.nextBoolean();
        System.out.println("Bool = " + booleanValor);
        String stringValor = scanner.next();
        System.out.println("Str = " + stringValor);
    }
}