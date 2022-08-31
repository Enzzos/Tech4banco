import java.util.Scanner;

import model.Conta;

public class App{
    /*O objetivo do projeto é desenvolver uma aplicação relacionada a bancos, vamos aplicar os conceitos de POO 
    e as regras de negócio para a estruturação do código. Cadastre os clientes em seu banco, faça depósitos, 
    faça saques e transferências para outras contas de clientes. Logo abaixo, existe um diagrama de classe 
    para que você possa dar o pontapé inicial.
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Conta conta;
        int opcao;
        String nometransferencia;

        limpa();
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scan.nextLine();

        System.out.print("\nDigite o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.print("\nDigite o valor inicial: ");
        Double saldo = scan.nextDouble();
        scan.nextLine();

        conta = new Conta(titular, numeroConta, saldo);
        
        do {
            limpa();
            System.out.println("*** Banco da tech4me ***");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Transferir");
            System.out.println("4- Consultar saldo");
            System.out.println("0- Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                System.out.println("Quanto deseja depositar?");
                    Double valor = scan.nextDouble();
                    scan.nextLine();
                    conta.depositar(valor);
                    System.out.println("Valor de R$ " + valor + " depositado com sucesso");
                    System.out.println("Digite ENTER para voltar ao menu.");
                    scan.nextLine();
                    break;
                    case 2:
                    System.out.println("Quanto deseja sacar?");
                    Double saque = scan.nextDouble();
                    scan.nextLine();
                    conta.sacar(saque);
                    System.out.println("O valor de R$" + saque + " foi retirado da conta");
                    System.out.println("Digite ENTER para voltar ao menu.");
                    scan.nextLine();
                    break;
                    case 3: 
                    System.out.println("Para quem deseja fazer a transferencia?");
                    nometransferencia=scan.nextLine();
                    if(nometransferencia.isEmpty()){
                        System.out.println("Nome incorreto para transferência!");
                    }
                    else{
                        System.out.println("Quanto deseja transferir? ");
                        Double transferir = scan.nextDouble();
                        scan.nextLine();
                        conta.transferir(nometransferencia, transferir);
                    }
                    System.out.println("Digite ENTER para voltar ao menu.");
                    scan.nextLine();
                    break;
                    case 4:
                    limpa();
                        System.out.println("Saldo atual da conta de R$ " + conta.getSaldo());
                        System.out.println("Digite ENTER para voltar ao menu.");
                        scan.nextLine();
                    break;

                default:
                    limpa();
                    System.out.println("Opção inválida.");
                    System.out.println("Digite ENTER para voltar ao menu.");
                    scan.nextLine();
                    break;
            }
            
        } while (opcao != 0);


    }

    public static void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
 
}