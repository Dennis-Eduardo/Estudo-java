package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			String[] vetor = input.nextLine().split(" ");
		    int posicao = input.nextInt();
		    System.out.println(vetor[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Posição Invalida");
			
		}
		
		catch(InputMismatchException e) {
			System.out.println("Erro de input");
		}
		
		System.out.println("Fim do programa");
		
		
		
		

	}

}
