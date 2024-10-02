import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        int escolha = 0;
        double saldo = 2500.00;
        double transf = 0;
        Scanner leitura = new Scanner(System.in);


        while (escolha != 4){
            System.out.println("""
                    Escolha uma opçao:
                    1 - Saldo
                    2 - Transferir
                    3 - Receber
                    4 - Sair
                    """);
            escolha = leitura.nextInt();
            if (escolha == 1){
                System.out.println("\nSeu saldo é " + saldo + "\n");
            } else if (escolha == 2) {
                System.out.println("Qual valor deseja transferir?");
                transf = leitura.nextDouble();
                if (transf > saldo){
                    System.out.println("\nSaldo insuficiente\n");
                } else if (transf < 0) {
                    System.out.println("\nValor invalido\n");
                } else {
                    saldo -= transf;
                    System.out.println("\nvalor transferido\n");
                }
            } else if (escolha == 3) {
                System.out.println("Qual valor deseja receber ");
                transf = leitura.nextDouble();
                if (transf < 0) {
                    System.out.println("\nValor invalido\n");
                }else{
                    saldo += transf;
                System.out.println("\n valor transferido \n");
                }
            }else if (escolha == 4){
                System.out.println("saindo");
            }else {
                System.out.println("Opçao invalida");
            }
        }
    }
}
