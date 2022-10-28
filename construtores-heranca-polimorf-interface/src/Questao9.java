
public class Questao9 {

	public static void main(String[] args) {
		float values[] = {2, 8, 5, 9, 6};
		int i = values.length; //valor do tamanho do vetor
		float media = 0;
		do {
			media += values[i-1]; //percorre o vetor e soma
			i--;
		}while(i>0);
		
		media = media / values.length; // calcula a média
		System.out.println("Media do vetor: "+ media);
	}

}
