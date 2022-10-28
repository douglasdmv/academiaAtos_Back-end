package HerancaEX3;

public class Funcionario extends Pessoa{
	protected static String setor;
	protected static String cargo;
	protected static String funcao;
	
	public static void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Telefone: " + telefone);
		System.out.println("Setor: " + setor);
		System.out.println("Cargo: " + cargo);
		System.out.println("Função: " + funcao);
	}
}
