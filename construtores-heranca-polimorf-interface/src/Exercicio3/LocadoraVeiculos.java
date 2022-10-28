package Exercicio3;
import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();
		Carro carro1 = new Carro();
		var leitura = new Scanner(System.in);
		System.out.println("Insira marca da moto 1: ");
		String marca = leitura.nextLine();
		System.out.println("Insira modelo da moto 1: ");
		String modelo = leitura.nextLine();
		System.out.println("Insira cilindradas da moto 1: ");
		String cilindradas = leitura.nextLine();
		moto1.configuraDados(marca,modelo,cilindradas);
		
		System.out.println("Insira marca da moto 2: ");
		marca = leitura.nextLine();
		System.out.println("Insira modelo da moto 2: ");
		modelo = leitura.nextLine();
		System.out.println("Insira cilindradas da moto 2: ");
		cilindradas = leitura.nextLine();
		moto2.configuraDados(marca,modelo,cilindradas);
		
		System.out.println("Insira marca do carro 1: ");
		marca = leitura.nextLine();
		System.out.println("Insira modelo do carro 1: ");
		modelo = leitura.nextLine();
		System.out.println("Insira cilindradas do carro 1: ");
		cilindradas = leitura.nextLine();
		carro1.configuraDados(marca,modelo,cilindradas);
		
		
		leitura.close();
		moto1.exibirDados();
		moto2.exibirDados();
		carro1.exibirDados();
	}

}
