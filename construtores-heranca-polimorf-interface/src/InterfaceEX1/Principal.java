package InterfaceEX1;
import java.util.Scanner;

public class Principal extends Mensagem{
	static String mensagem;
	public static void main(String[] args) {
		var leitura = new Scanner(System.in);
		System.out.println("Digite uma mensagem para preservação do planeta: ");
		mensagem = leitura.nextLine();
		Principal p = new Principal();
		p.exibeMensagemA();
		p.exibeMensagemB();
		leitura.close();
	}
	@Override
	void exibeMensagemA() {
		System.out.println("Cuide bem dos animais.");
	}
	@Override
	void exibeMensagemB() {
		System.out.println(mensagem);
	}
}
