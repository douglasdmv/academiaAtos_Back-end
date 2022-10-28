package ConstrutoresEX2;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João","04/03/2001",2013);
		aluno1.exibirDados();
		
		System.out.println("\n");
		
		System.out.println(aluno1.Aluno("04/03/1998"));
		
		System.out.println("\n");
		
		Aluno aluno2 = new Aluno("Maria", "145897");
		aluno2.exibirDados2();
	}

}
