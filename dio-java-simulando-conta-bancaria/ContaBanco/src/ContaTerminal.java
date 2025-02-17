import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    /*
        TODO:Conhecer e importar a classe Scanner.
        * Exibir as mensagens para o nosso usuário.
        * Obter pela scanner os valores digitados no terminal.
        * Exibir a mensagem conta criada.
    */
      // Try with resources utilizando para fechar o scanner automaticamente.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem vindo ao Banco do Terminal!\n");
            
            //Lendo o nome completo do usuário.
            System.out.println("\nPor favor, insira o seu nome:");
            String nomeCliente = scanner.nextLine();

            //Lendo o número da conta.
            System.out.println("\nPor favor, digite o número da conta:");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumindo o \n que ficou no buffer.

            //Lendo a agência da conta.
            System.out.println("\nPor favor, digite a agência da conta:");
            String agenciaConta = scanner.nextLine();
            

            //Lendo o saldo da conta.
            System.out.println("\nPor favor, digite o saldo da conta:");
            double saldo = scanner.nextDouble();

            //Formatando o saldo para duas casa decimais.
            DecimalFormat formatoSaldo = new DecimalFormat("0.00");

            //Exibindo a mensagem final.
            System.out.println("\nOlá "+nomeCliente+", obrigado por criar uma conta em nosso banco!\n Sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo R$"+formatoSaldo.format(saldo)+" já está disponível para saque.");
        }





        


    }
}
