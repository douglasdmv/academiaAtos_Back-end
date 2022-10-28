package ConstrutoresEX1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade1;
		String nome1;
		var leitura = new Scanner(System.in);
		System.out.println("Utilizar construtor 1 ou 2: ");
		int opcao = leitura.nextInt();
		leitura.nextLine();
		if(opcao == 1) {
			System.out.println("Insira idade da pessoa: ");
			idade1 = leitura.nextInt();
			leitura.nextLine();
			System.out.println("Insira o nome da pessoa: ");
			nome1 = leitura.nextLine();
			Pessoa pessoa1 = new Pessoa(idade1, nome1);
			pessoa1.exibirDados();
		}
		else if(opcao == 2){
			System.out.println("Insira idade da pessoa: ");
			idade1 = leitura.nextInt();
			leitura.nextLine();
			Pessoa pessoa1 = new Pessoa(idade1);
			pessoa1.exibirDados();
		}
		leitura.close();
	
	}

}
