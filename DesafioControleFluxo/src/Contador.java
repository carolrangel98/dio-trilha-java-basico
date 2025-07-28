import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o número do primeiro parâmetro:");
            int primeiroParametro = terminal.nextInt();
            System.out.println("Digite o número do segundo parâmetro:");
            int segundoParametro = terminal.nextInt();
            
            try {
                contar(primeiroParametro, segundoParametro);
            } catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (segundoParametro <= primeiroParametro) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 0; i <= contagem; i++) {
            System.out.println (primeiroParametro + i);
        }
    }
}
