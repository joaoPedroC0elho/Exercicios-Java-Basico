import java.util.Scanner;

public class pesquisa {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numMulheres = 0;
            int numMulheresComCaracteristicas = 0;
            
            while (true) {
                // Coleta os dados do habitante
                System.out.println("Digite o sexo do habitante (m/f): ");
                String sexo = sc.nextLine();
                if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                    System.out.println("Sexo inválido! Digite 'm' ou 'f'.");
                    continue;
                }
                
                System.out.println("Digite a cor dos olhos do habitante (a/v/c/p): ");
                String corOlhos = sc.nextLine();
                if (!corOlhos.equalsIgnoreCase("a") && !corOlhos.equalsIgnoreCase("v") && 
                    !corOlhos.equalsIgnoreCase("c") && !corOlhos.equalsIgnoreCase("p")) {
                    System.out.println("Cor dos olhos inválida! Digite 'a', 'v', 'c' ou 'p'.");
                    continue;
                }
                
                System.out.println("Digite a cor dos cabelos do habitante (l/c/p/r): ");
                String corCabelos = sc.nextLine();
                if (!corCabelos.equalsIgnoreCase("l") && !corCabelos.equalsIgnoreCase("c") && 
                    !corCabelos.equalsIgnoreCase("p") && !corCabelos.equalsIgnoreCase("r")) {
                    System.out.println("Cor dos cabelos inválida! Digite 'l', 'c', 'p' ou 'r'.");
                    continue;
                }
                
                System.out.println("Digite a idade do habitante: ");
                int idade = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha pendente
                
                if (idade == -1) {
                    break; // Habitante fictício para indicar o fim da pesquisa
                } else if (idade < 10 || idade > 100) {
                    System.out.println("Idade inválida! Digite um valor entre 10 e 100.");
                    continue;
                }
                
                System.out.println("Digite o salário do habitante: ");
                double salario = sc.nextDouble();
                sc.nextLine(); // Consumir a quebra de linha pendente
                
                if (salario < 0) {
                    System.out.println("Salário inválido! Digite um valor positivo.");
                    continue;
                }
                
                if (sexo.equalsIgnoreCase("f")) {
                    numMulheres++;
                    if (idade >= 18 && idade <= 35 && corOlhos.equalsIgnoreCase("c") && corCabelos.equalsIgnoreCase("c")) {
                        numMulheresComCaracteristicas++;
                    }
                }
            }
            
            // Calcula e exibe a porcentagem de mulheres com as características especificadas
            double porcentagemMulheresComCaracteristicas = (double) numMulheresComCaracteristicas / numMulheres * 100;
            System.out.printf("A porcentagem de mulheres com idade entre 18 e 35 anos, com olhos e cabelos castanhos, é de %.2f%%\n", porcentagemMulheresComCaracteristicas);
        }
        
        // Exibe o número
    }
}
