import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
    //TODO: Conhecer e importar a classe scanner

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo disponível: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                + "Sua agência é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}