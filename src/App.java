import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        DadosClientes cliente1 = new DadosClientes();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Prezado cliente, informe seu nome:");
        cliente1.setCliente(scanner.next());

        System.out.println("Informe sua agência (000-0)");
        cliente1.setAgencia(scanner.next());

        System.out.println("Informe o número da conta (0000)");
        cliente1.setNumero(scanner.nextInt());

        System.out.println("Prezado cliente " + cliente1.getCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente1.getAgencia() + ", conta " + cliente1.getNumero() + " e seu saldo " + cliente1.getSaldo() + " já está disponível para saque.");


    }
}
