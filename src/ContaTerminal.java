import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agenciaConta = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();

        scanner.nextLine(); // Limpa o buffer de entrada

        System.out.println("Por favor, digite o saldo da conta!");
        double saldoConta = 0.00;
        saldoConta = scanner.nextDouble();

        // Exibe a mensagem personalizada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque";

        System.out.println(mensagem);
    }
}
