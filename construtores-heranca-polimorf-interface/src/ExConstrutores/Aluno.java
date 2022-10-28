package ExConstrutores;

public class Aluno {
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", dataNascimento=" + dataNascimento
				+ ", dataIngresso=" + dataIngresso + "]";
	}

	String nome;
	int matricula;
	String dataNascimento;
	String dataIngresso;

	public Aluno(String nomeAluno, int matriculaAluno) {
		nome = nomeAluno;
		matricula = matriculaAluno;
	}

	public Aluno(String dataNasicmentoAluno) {
		dataNascimento = dataNasicmentoAluno;
	}

	public Aluno(String nomeAluno, String dataNascimentoAluno, String dataIngressoAluno) {
		nome = nomeAluno;
		dataNascimento = dataNascimentoAluno;
		dataIngresso = dataIngressoAluno;
	}
}
