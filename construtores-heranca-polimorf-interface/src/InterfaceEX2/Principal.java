package InterfaceEX2;

public class Principal {

	public static void main(String[] args) {
		Pessoal compromissoPessoal = new Pessoal("Dentista","05-10-22","15:00");
		Profissional compromissoProfissional = new Profissional("Academia Java","05-10-22","19:00");
		
		compromissoPessoal.exibeCompromissoPessoal();
		compromissoProfissional.exibeCompromissoProfissional();
	}

}
