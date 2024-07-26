import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo à melhor conta que você vai ver hoje!");

        System.out.println("Insira seu nome:");
        String nome_cliente = scanner.nextLine(); 

        System.out.println("Insira sua agência:");
        String agencia_conta = scanner.nextLine();
        
        System.out.println("Insira o número da agência:");
        int numero_conta = scanner.nextInt();

        System.out.println("Quantos reais quer depositar?");
        double saldo_conta = scanner.nextDouble();

        System.out.println("------------------------------------------");
        System.out.println("Olá, " + nome_cliente + "! Sua agência " + agencia_conta + " de número " + numero_conta + " foi criada com êxito e possui um saldo de R$" + saldo_conta);
        
        scanner.close();
    }
}
