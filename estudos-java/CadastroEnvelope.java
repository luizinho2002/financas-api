import java.util.Scanner;

public class CadastroEnvelope {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do envelope: ");
        String nome = leitor.nextLine(); 

        while (nome.isBlank()) {
            System.out.println("Nome inválido.");
            System.out.println("O envelope precisa ter um nome.");
            System.out.print("Digite novemante o nome do envelope: ");
            nome = leitor.nextLine();
        }

        System.out.print("Digite o valor separado em centavos: ");
        int separado = leitor.nextInt();

        while (separado < 0) {
            System.out.println("Valor inválido.");
            System.out.println("O valor separado não pode ser negativo.");
            System.out.print("Digite novamente o valor separado: ");
            separado = leitor.nextInt();
        }

        System.out.print("Digite o valor gasto em centavos: ");
        int gasto = leitor.nextInt();

        while (gasto < 0 || gasto > separado) {
            if (gasto < 0) {
                System.out.println("Valor inválido.");
                System.out.println("O valor gasto não pode ser negativo.");
            } else {
                System.out.println("Gasto não permitido");
                System.out.println("O valor gasto é maior que o valor separado.");
            }

            System.out.println("Digite o valor gasto: ");
            gasto = leitor.nextInt();
        }

        int disponivel = separado - gasto;

        System.out.println();
        System.out.println("Envelope: " + nome);
        System.out.println("Valor separado em centavos: " + separado);
        System.out.println("Valor gasto em centavos: " + gasto);
        System.out.println("Valor disponível em centavos: " + disponivel);

        leitor.close();
    }
}