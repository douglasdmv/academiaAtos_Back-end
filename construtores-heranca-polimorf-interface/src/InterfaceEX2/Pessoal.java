package InterfaceEX2;

public class Pessoal extends Compromisso implements InterfacePessoal {

	public Pessoal(String nome, String data, String hora) {
		super(nome, data, hora);
	}

	@Override
	public void exibeCompromissoPessoal() {
		System.out.println(this.nome + ": " + this.data + ": " + this.hora);
	}

}