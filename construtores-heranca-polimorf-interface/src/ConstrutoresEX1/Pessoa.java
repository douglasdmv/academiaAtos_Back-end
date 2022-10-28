package ConstrutoresEX1;

public class Pessoa {
	private String nomepessoa;
	private int idadepessoa;
	
	public Pessoa(int idade, String nome) {
		nomepessoa = nome;
		idadepessoa = idade;
	}

	public Pessoa(int idade) {
		idadepessoa = idade;
	}
	
	public void exibirDados() {
		System.out.println("O nome é: " + nomepessoa);
		System.out.println("A idade é: " + idadepessoa);
	}
}
