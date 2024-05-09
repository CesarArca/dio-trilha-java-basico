import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo a criação de contas no Banco. Por favor, informe seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Bem-vindo(a): "+ nomeCliente + ", por favor digite o codigo da agencia: ");
        int codigoAgencia = scanner.nextInt();

        System.out.println("Qual o numero da sua conta em nossa agencia? ");
        String numeroConta = scanner.next();

        System.out.println("Por fim, digite o saldo na sua conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + codigoAgencia + ", conta " + numeroConta + " e seu saldo" + saldoConta + " já está disponível para saque");
    }
}
