package Exercicio3;

public class Moto {
	public String marca;
	public String modelo;
	public String cilindradas;
	
	public void configuraDados(String marcamoto, String modelomoto, String cilindradasmoto) {
		marca = marcamoto;
		modelo = modelomoto;
		cilindradas = cilindradasmoto;
	}
	public void exibirDados() {
		System.out.println("Dados da Moto: " + marca + " " + modelo + " " + cilindradas);
	}
}