import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Considere uma classe abstrata Figura (geométrica), a qual contêm dois métodos abstratos:  double area()  e double perimetro().
 * 
 * A partir de uma coleção aleatória de figuras (veja código anexo) Download coleção aleatória de figuras (veja código anexo), escreva métodos baseados em streams para:
 * 
 * Retornar a soma da área de todas as figuras;
 * Imprimir descrição e dimensões das figuras cuja área seja maior que 5000;
 * Mostrar a descrição da figura com o menor perímetro acima de 200;
 * Mostrar o raio do maior círculo com área menor que 1500 (SEM usar instanceOf(), getClass() ou similares)
 * Você deve entregar um arquivo java, com cada item respondido em um método.
 * 
 * Prazo: 17/11, 23h59
 */

public class AppAleatorio {
    static ArrayList<Figura> figuras = new ArrayList<>();
    static Random aleat = new Random(42);

    public static int compareTo(Figura f, Figura f2) {
        if(f.area() > f2.area())
            return 1;
        else if(f.area() < f2.area())
            return -1;
        
            return 0;
    }

    public static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menu() {
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println("|                     SELECIONE UMA OPÇÃO:                    |");
        System.out.println(" ============================================================= ");
        System.out.println("|1º - Mostrar Soma de todas Áreas                             |");
        System.out.println("|2º - Imprimir descrição e dimensões - Onde area > 5000       |");
        System.out.println("|3º - Descrição da figura com o menor perímetro acima de 200  |");
        System.out.println("|4º - Raio do maior círculo com área menor que 1500           |");
        System.out.println("|                                                             |");
        System.out.println("|5º - Sair                                                    |");
        System.out.println(" ------------------------------------------------------------- ");

        System.out.print("\nOpção: ");
    }
    /**
     * Gerador de figuras aleatórias.
     * 
     * @return Uma figura (herança em Figura)
     */
    public static Figura criarFigura() {
        Figura novaForma = null;
        int tipo = aleat.nextInt(4);
        double n1 = aleat.nextDouble() * 100;
        double n2 = aleat.nextDouble() * 100;
        switch (tipo) {
            case 0:
                novaForma = new Circulo(n1);
                break;
            case 1:
                novaForma = new Retangulo(n1, n2);
                break;
            case 2:
                novaForma = new Quadrado(n1);
                break;
            case 3:
                novaForma = new TrianguloRetangulo(n1, n2);
                break;
        }
        return novaForma;
    }

    public static void main(String[] args) throws Exception {
        Scanner key = new Scanner(System.in);
        String aux;
        clear();
        int opcao = 0;

        //Cria 10 Figuras
        Stream<Figura> dezFiguras = Stream.generate(() -> criarFigura()).limit(1000);
        //Coloca dentro do ArrayList
        dezFiguras.forEach(f -> figuras.add(f));
        //Soma as áreas das figuras

        do {
            menu();
            opcao = Integer.parseInt(key.nextLine());
            switch (opcao) {
                case 1://Mostrar Soma das Áreas
                    System.out.println("\n\nA soma da área de todas as figuras é: " + 
                        figuras.stream()
                            .mapToDouble(Figura::area)
                            .sum()
                    );

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\nPressione enter para continuar: ");
                    aux = key.nextLine(); // <- utilizada para parar o cursor

                    clear();
                    opcao = 0;
                break;

                case 2://Imprimir descrição e dimensões - Onde area > 5000
                    System.out.println("\n\nFiguras cujo a área é maior que 5.000\n");
                    figuras.stream()
                        .filter(c -> c.area() > 5000)
                        .forEach(c -> System.out.println(c));

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\nPressione enter para continuar: ");
                    aux = key.nextLine();// <- utilizada para parar o cursor

                    clear();
                    opcao = 0;
                break;

                case 3:// Descrição da figura com o menor perímetro acima de 200    
                    System.out.print("\n\n" +
                        figuras.stream()
                            .filter(c -> c.perimetro() > 200)
                            .min((a,b) -> (a.compareTo(b)))
                            .get()
                    );

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\nPressione enter para continuar: ");
                    aux = key.nextLine();// <- utilizada para parar o cursor
                    clear();
                    opcao = 0;
                break;

                case 4: //Raio do maior círculo com área menor que 1500
                    Circulo c = (Circulo)figuras.stream().filter(a -> a.area() < 1500)                        
                                .filter(d -> d.descricao.contains("Circulo"))
                                .max((f1,f2) -> AppAleatorio.compareTo(f1, f2))
                                .get();
                        
                    System.out.println("\n\nO raio é: " + c.getRaio()); 

                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("\n\nPressione enter para continuar: ");
                    aux = key.nextLine();// <- utilizada para parar o cursor
                    clear();
                    opcao = 0;
                break;

                case 5: //SAIR
                    clear();
                    System.out.println("\n\nObrigado e volte sempre!");
                    opcao = -1;
                    TimeUnit.SECONDS.sleep(2);
                    clear();
                break;

                default:

                    clear();
                    System.out.println("O valor informado é invalido!\nEscolha um valor entre 1 e 5.");
                    System.out.println("\n\n\n");
                    opcao = 0;
                break;
            }
        } while (opcao >= 0);
    }

}   