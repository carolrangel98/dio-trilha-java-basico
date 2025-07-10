
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Teste!");
        System.out.println("Por favor, informe o número da agência:");
        var agencia = scanner.nextLine();
        System.out.println("Por favor, informe o número da conta:");
        var numeroConta = scanner.nextInt();
        System.out.println("Por favor, informe o seu nome:");
        var nomeCliente = scanner.next();
        System.out.println("Por favor, informe o saldo inicial:");
        var saldoInicial = scanner.nextDouble();
        System.out.println("Conta criada com sucesso!");
        System.out.printf("Olá, %s! Sua conta na agência %s, numero %s, foi criada com sucesso. Você possui um saldo de R$ %s, já disponível para saque.\n", nomeCliente, agencia, numeroConta, saldoInicial);
        /*
         * TODOs:
         * 1. Conhecer e importar a classe Scanner;
         * 2. Exibir as mensagens para o nosso usuário;
         * 3. Obter pela classe Scanner os valores digitados no terminal;
         * 4. Exibir a mensagem final da conta criada.
         */
    }
}
