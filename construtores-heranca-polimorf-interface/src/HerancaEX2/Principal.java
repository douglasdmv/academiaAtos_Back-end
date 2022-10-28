package HerancaEX2;
import java.util.Scanner;

public class Principal extends Pessoa{

	public static void main(String[] args) {

		var leitura = new Scanner(System.in);
		System.out.println("Insira o nome: ");
		nome = leitura.nextLine();
		System.out.println("Insira o tipo: ");
		tipo = leitura.nextLine();
		System.out.println("Insira a idade: ");
		idade = leitura.nextInt();
		leitura.nextLine();		
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nTipo: " + tipo + "\nFala: " + fala + "\nAndar: " + andar);
		
		leitura.close();
		
	}

}
