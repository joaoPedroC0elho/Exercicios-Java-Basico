import java.util.Scanner;

public class caloriarefeicao {
    public static void main(String[] args) {
        // Tabela de calorias por opção
        int[][] tabelaCalorias = {
            {180, 230, 250, 350},   // prato
            {75, 110, 170, 200},    // sobremesa
            {20, 70, 100, 65}         // bebida
        };
        
        // Solicita as escolhas do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do prato escolhido (1-4): ");
        int prato = sc.nextInt() - 1; // subtrai 1 para acessar o índice correto da tabela
        System.out.print("Digite o número da sobremesa escolhida (1-4): ");
        int sobremesa = sc.nextInt() - 1;
        System.out.print("Digite o número da bebida escolhida (1-4): ");
        int bebida = sc.nextInt() - 1;
        
        // Calcula a quantidade total de calorias da refeição
        int totalCalorias = tabelaCalorias[0][prato] + tabelaCalorias[1][sobremesa] + tabelaCalorias[2][bebida];
        
        // Exibe o resultado para o usuário
        System.out.println("A quantidade total de calorias da refeição é " + totalCalorias + ".");
    }
}
