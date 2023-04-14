import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cadastro de Pessoa:");
            System.out.print("Digite o nome: ");
            String nomePessoa = scanner.nextLine();
            System.out.print("Digite a idade: ");
            int idadePessoa = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o e-mail: ");
            String email = scanner.nextLine();

            System.out.println("\nCadastro de Pet:");
            System.out.print("Digite o nome: ");
            String nomePet = scanner.nextLine();
            System.out.print("Digite a espécie: ");
            String especiePet = scanner.nextLine();
            System.out.print("Digite a idade: ");
            int idadePet = scanner.nextInt();

            System.out.println("\nCadastro de Veículo:");
            System.out.print("Digite a marca: ");
            String marca = scanner.next();
            System.out.print("Digite o modelo: ");
            String modelo = scanner.next();
            System.out.print("Digite o ano: ");
            int ano = scanner.nextInt();

            System.out.println("\nCadastro realizado com sucesso!\n");

            System.out.println("Cadastro de Pessoa:\nNome: " + nomePessoa + "\nIdade: " + idadePessoa + "\nE-mail: " + email);
            System.out.println("\nCadastro de Pet:\nNome: " + nomePet + "\nEspécie: " + especiePet + "\nIdade: " + idadePet);
            System.out.println("\nCadastro de Veículo:\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
        }
    }
}
