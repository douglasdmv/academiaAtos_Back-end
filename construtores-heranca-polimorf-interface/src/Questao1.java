import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		float n1=0, n2=0;
		
		Scanner s = new Scanner(System.in);
		while (n1 == 0 && n2 == 0) {
			System.out.println("Digite um numero n1");
			n1 = s.nextFloat();
			System.out.println("Digite um numero n2");
			n2 = s.nextFloat();
			if(n1 == 0 && n2 == 0) {
				System.out.println("Digite números diferentes de 0");
			} else {
				System.out.println((n1+n2)/2);
				s.close();
				break;
			}
		}
		
	}
}
