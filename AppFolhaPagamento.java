import java.util.Scanner;
    public class AppFolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Salário bruto: ");
        double salario = sc.nextDouble();

        System.out.println("\nTipo do contribuinte:");
        System.out.println("1. Funcionário CLT");
        System.out.println("2. Estagiário");
        System.out.println("3. Prestador de Serviço (PJ)");
        System.out.print("Escolha uma opção: ");
        int tipo = sc.nextInt();

        Contribuinte trabalhador;

        switch (tipo) {
            case 1:
                trabalhador = new FuncionarioCLT(nome, cpf, salario);
                break;
            case 2:
                trabalhador = new Estagiario(nome, cpf, salario);
                break;
            case 3:
                trabalhador = new PrestadorServico(nome, cpf, salario);
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }
        trabalhador.exibirResumo();

        sc.close();
    }
}