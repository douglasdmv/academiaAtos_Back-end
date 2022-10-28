package ExConstrutores;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lucas", 123456);
		Aluno aluno2 = new Aluno("27/03/1990");
		Aluno aluno3 = new Aluno("Lucas", "27/03/1990", "01/05/2020");
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);

	}

}
