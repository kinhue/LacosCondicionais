package atividade9_11;
import java.util.Scanner;
public class Lista1_Ex4 {

	public static void main(String[] args) {
		
		String A="Vertebrados", Aa="Ave", Ab="Mamífero", X="Invertebrados";
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Seu animal é uma Vertebrado ou Invertebrado?");
		A = leia.nextLine();
				
		if (A.equalsIgnoreCase("Vertebrado")) {
			System.out.println("O animal é Carnivoro ou Herbivoro?");				
		}
		
		else {
			System.out.println("O animal é invertebrado");
		}
		

	}

}
