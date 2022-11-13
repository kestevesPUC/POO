import java.util.Random;

public class AppAleatorio {
    static Random aleat = new Random(42);

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
        
    }
}
