package atividade9_11;
import java.util.Scanner;
public class Lista2_Ex5 {

	public static void main(String[] args) {
		
int op, quantidade, total;






Scanner leia = new Scanner(System.in);

System.out.println("\tTutu Lanches\n\tSeja bem vindo!");
System.out.println("\n1- Cachorro Quente - R$10,00");
System.out.println("\n2- X-Salada - R$15,00");
System.out.println("\n3- X-Bacon - R$18,00");
System.out.println("\n4- Bauru - R$12,00");
System.out.println("\n5- Refrigerante - R$8,00");
System.out.println("\n6- Suco de laranja - R$13,00");
System.out.println("\nQual número gostaria?");
op=leia.nextInt();



switch(op) {
case 1:
	System.out.println("\nInsira a quantidade:");
	quantidade = leia.nextInt();
	total = quantidade*10;
	System.out.println("\nO valor é de R$" +total);
	break;
	
case 2:
	System.out.println("\nInsira a quantidade:");
	quantidade = leia.nextInt();
	total = quantidade*15;
	System.out.println("\nO valor é de R$"+total);
	break;

case 3:
	System.out.println("\nInsira a quantidade:");
	quantidade = leia.nextInt();
	total = quantidade*18;
	System.out.println("\nO valor é de R$"+total);
	break;
	
case 4:
	System.out.println("\nInsira a quantidade:");
	quantidade = leia.nextInt();
	total = quantidade*12;
	System.out.println("\nO valor é de R$"+total);
	break;
	
case 5:
	System.out.println("\nInsira a quantidade:");
	quantidade = leia.nextInt();
	total = quantidade*8;
	System.out.println("\nO valor é de R$"+total);
	break;
	
case 6:
	System.out.println("\nInsira a quantidade:");
	quantidade = leia.nextInt();
	total = quantidade*13;
	System.out.println("\nO valor é de R$"+total);
	break;
}



	}

}
