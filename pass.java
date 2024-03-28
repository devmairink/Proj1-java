import java.security.SecureRandom;

public class GeradorSenha {

    public static void main(String[] args) {
        int comprimentoSenha = 10; // Defina o comprimento da senha desejada

        String senha = gerarSenha(comprimentoSenha);
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}
