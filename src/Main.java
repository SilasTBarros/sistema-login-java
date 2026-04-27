import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuarioCorreto = "Usuario67";
        String senhaCorreta = "admim12367";

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome de usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("LOGIN REALIZADO COM SUCESSO!");
        }else{
            System.out.println("LOGIN INVÁLIDO!" +
                                "\nTENTE NOVAMENTE");
        }

        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o usuario: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login sucessd");
            break;    
        }else{
            System.out.println("Login inválido!");
            tentativas++;
        }
        }
    }
}
