import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int i = 0;
		int media;
		int nota, notaboa=0;

		System.out.println("Qual a m�dia?"); //Parte 1 - fazer o prof digitar a m�dia
		media = leitor.nextInt();
		
		while (i < 50) {
			System.out.println("Digite a idade do " + (i+1) + "� aluno");
			nota = leitor.nextInt();
			if (nota>media) {
				notaboa = notaboa+1;
			}
			i = i + 1;
		}
		
		System.out.println(notaboa + " alunos tiveram nota superior � m�dia");
		System.out.println((50-notaboa) + " alunos tiveram nota inferior � m�dia");
		leitor.close();

	}

}
