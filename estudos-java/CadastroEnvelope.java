import java.util.Scanner;

public class CadastroEnvelope {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do envelope: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o valor separado em centavos: ");
        int separado = leitor.nextInt();

        System.out.println("Digite o valor gasto em centavos: ");
        int gasto = leitor.nextInt();

        if (separado < 0 || gasto < 0) {
            System.out.println("Valor inválido");
            System.out.println("Os valores não podem ser negativos.");
        } else if (gasto > separado) {
            System.out.println("Gasto não permitido.");
            System.out.println("O valor gasto é maior que o valor separado.");
        } else {
            int disponivel = separado - gasto;

            System.out.println("Envelop: " + nome);
            System.out.println("Valor separado em centavos: " + gasto);
            System.out.println("Valor gasto em centavos: " + gasto);
            System.out.println("Valor disponível em centavos: " + disponivel);
        }

        leitor.close();
    }
}