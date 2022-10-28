package ConstrutoresEX2;

public class Aluno {
	private String nomealuno;
	private String matriculaaluno;
	private String dataaluno;
	private int anoaluno;
	
	public Aluno(String nome, String matricula) {
		nomealuno = nome;
		matriculaaluno = matricula;
	}
	
	public String Aluno(String data) {
		dataaluno = data;
		return "A data de nascimento é: " + data;
	}
	
	public Aluno(String nome, String data, int ano) {
		nomealuno = nome;
		dataaluno = data;
		anoaluno = ano;
	}
	
	public void exibirDados() {
		System.out.println("O nome é: " + nomealuno);
		System.out.println("A data de nascimento é: " + dataaluno);
		System.out.println("A ano que o aluno ingressou foi: " + anoaluno);
	}
	
	public void exibirDados2() {
		System.out.println("O nome é: " + nomealuno);
		System.out.println("A matrícula do aluno é: " + matriculaaluno);
	}
}
