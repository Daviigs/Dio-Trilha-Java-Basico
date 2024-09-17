import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        //Receber informações
        System.out.println("Por favor informe o número da agência: ");
        int num = sc.nextInt();
        System.out.println("Informe agora a agência: ");
        String agencia = sc.next();
        System.out.println("Informe agora o seu nome: ");
        String nome = sc.next();
        System.out.println("Informe o seu saldo: ");
        double saldo = sc.nextDouble();

        //Mostrando as informações
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f, já esta disponveil para saque.",nome, agencia, num, saldo);
    
        sc.close();
    }
}
