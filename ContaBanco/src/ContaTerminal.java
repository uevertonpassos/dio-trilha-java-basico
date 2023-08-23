import java.util.Scanner;
import entities.Cliente; // importando a classe cliente dentro do pacote entities (vc cria uma classe java, e o nome do pacote, coloca como entities)

public class ContaTerminal {

    public static void main(String[] args){
        //Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
       
        

        System.out.print("Por favor digite  seu nome: ");
        String NomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        int Agencia = scanner.nextInt();

        System.out.print("Digite o Número da conta: ");
        int Numero = scanner.nextInt();

        System.out.print("Digite o seu saldo: ");
        double Saldo = scanner.nextDouble();

        Cliente cliente = new Cliente(NomeCliente, Agencia, Numero, Saldo);

        scanner.close();

        System.out.println("\n\nOla " + cliente.getName() + ", obrigado por criar uma conta em nosso banco.\nSua agencia e: " + cliente.getAgencia() + "\nconta Numero: " + cliente.getNumeroConta() + "\nE seu saldo R$: "+ cliente.getSaldo() +" que ja esta disponível para saque!");

        
    }
}