import java.util.Scanner;

public class CadastroEnvelope {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do envelope: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o valor separado em centavos: ");
        int separado = leitor.nextInt();

        System.out.println("Digite o valor gasto em centavos");
        int gasto = leitor.nextInt();
        
        int disponivel = separado - gasto;

        System.out.println("Envelope: " + nome);
        System.out.println("Valor separado em centavos: " + separado);
        System.out.println("Valor gasto em centavos: " + gasto);
        System.out.println("Valor disponível em centavos: " + disponivel);

        leitor.close();
    }
}