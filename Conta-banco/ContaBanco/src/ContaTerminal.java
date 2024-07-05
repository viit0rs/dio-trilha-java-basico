import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        double saldo = 237.48;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Por favor digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor digite o número da sua conta: ");
        int conta = sc.nextInt();

        System.out.println("Olá, " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
         ", conta " + conta + " e o seu saldo " + saldo +
          " já está disponível para saque.");

    }
}
