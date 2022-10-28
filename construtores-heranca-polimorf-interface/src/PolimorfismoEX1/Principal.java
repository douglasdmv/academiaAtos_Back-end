package PolimorfismoEX1;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double valor1, valor2;
		var leitura = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		valor1 = leitura.nextDouble();
		leitura.nextLine();
		System.out.println("Digite o segundo valor: ");
		valor2 = leitura.nextDouble();
		leitura.nextLine();
		Calculadora calculadora = new Calculadora();
		calculadora.calcular(valor1, valor2);
		calculadora.exibirResultado();
		leitura.close();
	}

}
