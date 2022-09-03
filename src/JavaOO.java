import java.lang.Math;  //Usada para usar o valor da constante matemática Pi.

public class JavaOO {
    public static class Celular {  //Classe
        //Atributos/propriedades comuns da classe:
        public String nome;
        public String versao;
        Integer numSerie;
        Float resolucao;

        //Método:
        public void ligar(boolean c){
            if (c) {
                System.out.println("ON");
            }
            else{
                System.out.println("OFF");
            }
        }

        //Métodos Construtores:
        public Float x;  //variável usada no Construtor

        public Celular(){}  //Construtor vazio (necessário caso não seja passado o parâmetro pedido no método seguinte)

        public Celular(Float bateria){  //Construtor que pede um argumento
            x = bateria;
        }
        public String retornoMetodo(){
            if(x > 100f){
                return "Bateria inválida";
            }
            else{
                return "Beria restante: " + x + "%.";
            }
        }
    }

    public interface figuraGeometrica {  //Interface: classe com métodos/propriedades que podem ser adicionados a várias classes [implements]
        String getNome();
        Double getArea();
        Double getPerimetro();
    }

    public static class Quadrado implements figuraGeometrica {  //Classe que implementa interface
        //Com a implementação, todos os métodos da interface têm que ser implementados aqui.
        private Double lado;  //variável interna da classe
        public Double getLado(){  //Permite a utilização do valor da variável setada
            return lado;
        }
        public void setLado(Double lado){  //A função setLado faz com que a variável privada 'lado' seja atrelada à uma nova variável, permitindo sua modificação
            this.lado = lado;
        }

        //Métodos superescritos (implementados):
        @Override
        public Double getArea(){
            double area;
            area = lado * lado;
            return area;
        }

        @Override
        public Double getPerimetro(){
            double perimetro;
            perimetro = lado * 4.0;
            return perimetro;
        }

        @Override
        public String getNome(){
            return "Quadrado";
        }
    }

    public static class Circulo implements figuraGeometrica {
        //Variáveis internas
        private Double raio;

        public Double getRaio(){  //Get da variável interna
            return raio;
        }

        public void setRaio(Double raio){  //Set da variável interna
            this.raio = raio;
        }

        //Métodos superescritos (implementados):
        @Override
        public String getNome(){
            return "Círculo";
        }
        @Override
        public Double getArea(){
            return Math.PI * raio * raio;
        }
        @Override
        public Double getPerimetro(){
            return 2 * Math.PI * raio;
        }
    }

    public static void main(String[] args) {
        //Uso da classe básica Celular
        Celular c1 = new Celular();  //Construtor de uma instância de Celular, com o método vazio
        Celular c2 = new Celular();  //Construtor de outra instãncia de Celular, com o método vazio
        //Acessando atributos dessas instâncias:
        c1.nome = "Galaxy";
        c2.nome = "iPhone";
        c1.versao = "A7";
        c2.versao = "D3+";
        c1.numSerie = 33658741;
        c2.numSerie = 963548412;
        c1.resolucao = 8.6f;
        c2.resolucao = 9.1f;
        System.out.println(c1.nome);
        System.out.println(c2.nome);

        //Usando o método simples:
        c1.ligar(true);

        //Usando os construtores:
        Celular c3 = new Celular(25.6f);  //Outro construtor de instãncia de Celular, com o método preenchido
        System.out.println(c3.retornoMetodo());  //Mensagem passada pelo método deste construtor parametrizado
        Celular c4 = new Celular(101.9f);  //Outro Construtor com método preenchido
        System.out.println(c4.retornoMetodo());  //Mensagem deste outro método

        //Usando novamente o método simples, para mostrar que podem ser usados por várias instâncias
        c3.ligar(false);

        //Uso das classes que usam a implementação de interfaces
        //Instâncias das classes:
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        //Uso dos métodos implementados na classe Quadrado:
        quadrado.lado = 4.0;
        System.out.println("Nome: " + quadrado.getNome());
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());
        quadrado.setLado(5.0);
        System.out.println("Novo lado: " + quadrado.getLado());
        System.out.println("Nova área: " + quadrado.getArea());
        System.out.println("Novo perímetro: " + quadrado.getPerimetro());

        System.out.println();

        //Uso dos métodos implementados na classe Triangulo:
        circulo.raio = 4.0;
        System.out.println("Nome: " + circulo.getNome());
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + String.format("%.2f", circulo.getArea()));
        System.out.println("Perímetro: " + String.format("%.2f", circulo.getPerimetro()));
        circulo.setRaio(6.0);
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + String.format("%.2f", circulo.getArea()));
        System.out.println("Perímetro: " + String.format("%.2f", circulo.getPerimetro()));
        //Para formatar com duas casas decimais, foi preciso utilizar o método String.format
    }
}
