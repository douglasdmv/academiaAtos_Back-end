package HerancaEX3;
import java.util.Scanner;

public class Principal extends Funcionario{
	public static void main(String[] args) {
		var leitura = new Scanner(System.in);
		System.out.println("Insira o nome: ");
		nome = leitura.nextLine();
		System.out.println("Insira a idade: ");
		idade = leitura.nextInt();
		leitura.nextLine();
		System.out.println("Insira o telefone: ");
		telefone = leitura.nextInt();
		leitura.nextLine();
		System.out.println("Insira o setor: ");
		setor = leitura.nextLine();
		System.out.println("Insira o cargo: ");
		cargo = leitura.nextLine();
		System.out.println("Insira a função: ");
		funcao = leitura.nextLine();
		leitura.close();
		exibirDados();
		
		
	}
}
