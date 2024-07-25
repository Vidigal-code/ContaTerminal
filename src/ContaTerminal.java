import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        // Set the scanner to use the US locale
        // Defina o scanner para usar a localidade dos EUA
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Prompt the user to enter the account number
        // Solicite ao usuário que insira o número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        
        // Prompt the user to enter the branch number
        // Solicite ao usuário que insira o número da agência
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();
        
        // Solicite ao usuário que insira o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine(); // Consume newline left-over
        String nomeCliente = scanner.nextLine();
        
        // Prompt the user to enter the balance
        // Solicite ao usuário que insira o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Print a confirmation message with the entered details
        // Imprima uma mensagem de confirmação com os detalhes inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // En: Close the scanner
        // Pt: Feche o scanner
        scanner.close();
    }
}
