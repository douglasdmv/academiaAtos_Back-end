package PolimorfismoEX1;

public class Calculadora {
	double resultado1, resultado2, resultado3, resultado4;
	public void calcular(double valor1, double valor2) {
		resultado1 = valor1+valor2;
		resultado2 = valor1-valor2;
		resultado3 = valor1*valor2;
		resultado4 = valor1/valor2;
	}
	public void exibirResultado() {
		System.out.println("Soma: " + resultado1 + "\nSubtração: " + resultado2 + "\nMultiplicação: " 
				+ resultado3 + "\nDivisão: " + resultado4);
	}
}
