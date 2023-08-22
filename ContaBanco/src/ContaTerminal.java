import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite  seu nome: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o Número da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        double Saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+ NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +", conta " + Numero + " e seu saldo "+ Saldo +" já está disponível para saque");



        
    }
}
