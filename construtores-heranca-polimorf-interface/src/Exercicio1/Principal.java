package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.idade = 19;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.idade = 20;
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.idade = 21;
		
		System.out.println("Idade Pessoa 1: " + pessoa1.idade);
		System.out.println("Idade Pessoa 2: " + pessoa2.idade);
		System.out.println("Idade Pessoa 3: " + pessoa3.idade);
	}	
}
