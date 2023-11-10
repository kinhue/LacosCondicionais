package atividade9_11;
import java.util.Scanner;

public class Lista_1Ex2 {

	public static void main(String[] args) {
		
		int a;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite um número inteiro, negativo ou positivo: ");
		a= leia.nextInt();
		
		if (a % 2 == 0 && a>0) {
			System.out.println("Seu número é par e positivo");
		}
		else if (a % 2 == 1 && a>0 ) {
			System.out.print("Seu número é ímpar e positivo");
		}
		else if (a % 2 == 0 && a<0) {
			System.out.print("Seu número é par e negativo");
		}
		else if (a % 2 == -1 && a<0) {
			System.out.println("Seu número é impar e negativo");
		}
		
		
		
		
		

	}

}