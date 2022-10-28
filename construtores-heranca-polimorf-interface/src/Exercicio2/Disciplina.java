package Exercicio2;
public class Disciplina {

	public static void main(String[] args) {
		Professor prof1 = new Professor();
		prof1.nome = "João";
		
		Laboratorio lab1 = new Laboratorio();
		lab1.local = "Sala 5";
		
		System.out.println("Nome do professor é: " + prof1.nome);
		System.out.println("Local da aula é: " + lab1.local);

	}

}
