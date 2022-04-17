public class OperIncDec {
    public static void main(String[] args) {
        Integer num = 10, x = 1;
        //As operações são: +, -, *, / e % (resto da divisão)
        System.out.println(num + 60);
        System.out.println(num - 7);
        System.out.println(num * 4);
        System.out.println(num / 2);
        System.out.println(num % 3);
        num *= 6; //Esses é um modo de facilitar uma operação
        //É o mesmo que fazer: num = num * 6.
        System.out.println(num);
        //Além disso, há o pré ou pós incremento ou decremento
        x++; //Soma 1 à x após utilizar seu antigo valor
        --x; //Subtrai 1 à x e depois utiliza seu novo valor
        System.out.println(x++); //Aqui, será impresso 1, depois x valerá 2
        System.out.println(++x); //Aqui, será impresso 3, pois a soma será feita antes
        //Além destes, há também os operadores desigualdade, muito utilizados em laços de condição, com a comparação de valores.
        //Nos exemplos a seguir, vemos que os operadores são utilizados em comparações.
        System.out.println(7 > 5); //maior que - true
        System.out.println(6 < 8); //menor que - true
        System.out.println(9 >= 8.9); //maior ou igual a - true
        System.out.println(10 <= 8); //menor ou igual a - false
        System.out.println(9%3 == 1); //igual a - false
        System.out.println(100%3 != 1); //diferente de - false
    }
}
