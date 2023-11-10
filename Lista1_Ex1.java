package atividade9_11;

import java.util.Scanner;

public class Lista1_Ex1 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A1: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if (a+b>c) {
			
			System.out.println("A soma dos valores é maior que C");
		}
		
		else if (a+b<c) {
			System.out.println("A soma dos valores é menor que C");
		}
		
		else if (a+b==c) {
			System.out.println("A soma dos valores é igual a C");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
