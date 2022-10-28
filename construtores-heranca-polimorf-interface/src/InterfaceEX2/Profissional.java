package InterfaceEX2;

public class Profissional extends Compromisso implements InterfaceProfissional {
	
	
	public Profissional(String nome, String data, String hora) {
		super(nome, data, hora);
	}

	@Override 
	public void exibeCompromissoProfissional() {
		System.out.println(this.nome+": "+this.data+": "+this.hora);
	}
}
