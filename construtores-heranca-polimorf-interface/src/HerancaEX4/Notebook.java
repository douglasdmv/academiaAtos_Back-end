package HerancaEX4;

import java.util.Scanner;

public class Notebook extends Computador{
	
	public static void main(String args[]) {
		var leitura = new Scanner(System.in);

		System.out.println("Insira a Marca:");
		Marca = leitura.nextLine();
		leitura.close();

		System.out.println("Marca: " + Marca + "\nModelo: " + Modelo);
	}
}
