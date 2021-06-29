import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		int media;
		int nota, notaboa=0;

		System.out.println("Qual a média?"); //Parte 1 - fazer o prof digitar a média
		media = leitor.nextInt();
		
		while (i < 50) {
			System.out.println("Digite a idade do " + (i+1) + "º aluno");
			nota = leitor.nextInt();
			if (nota>media) {
				notaboa = notaboa+1;
			}
			i = i + 1;
		}
		
		System.out.println(notaboa + " alunos tiveram nota superior à média");
		System.out.println((50-notaboa) + " alunos tiveram nota inferior à média");
		leitor.close();

	}

}
