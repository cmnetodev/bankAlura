import java.util.Scanner;

public class banking {
    public static void main(String[] args) {

        String name = ("Celso Moreira");
        String account = ("Corrente");
        double balance = 2500.00;
        int opcao = 0;

        System.out.println("\n***************************");
        System.out.println("Nome do cliente:" + name);
        System.out.println("Tipo de conta:" + account);
        System.out.println("saldo atual:" + balance);
        System.out.println("\n***************************");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);


        }
    }
}
