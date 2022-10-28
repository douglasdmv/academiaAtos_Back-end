package Exercicio3;

public class Carro {
	public String marca;
	public String modelo;
	public String cilindradas;
	
	public void configuraDados(String marcacarro, String modelocarro, String cilindradascarro) {
		marca = marcacarro;
		modelo = modelocarro;
		cilindradas = cilindradascarro;
	}
	public void exibirDados() {
		System.out.println("Dados do Carro: " + marca + " " + modelo + " " + cilindradas);
	}
}
