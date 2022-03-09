package ProjetoMaster;

import java.util.Scanner;

public class Acnur {
	
	void acnur () {
		FormaDePagamento form = new FormaDePagamento();
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		System.out.println("----------------------------------");
		System.out.println("ACNUR - assistência aos refugiados");
		System.out.println("----------------------------------");
		System.out.println("Qual valor você quer doar: ");
		System.out.println();
		System.out.println("[1] R$ 10,00");
		System.out.println();
		System.out.println("[2] R$ 50,00");
		System.out.println();
		System.out.println("[3] R$ 100,00");
		System.out.println();
		System.out.print("---> ");
		numero = leia.nextInt();
		
		switch (numero) {
		 
			case 1:
				System.out.println();
				System.out.println("Contribuirá com alimentos");
				System.out.println();
				form.formaDePagamento();
			break;
			
			case 2:
				System.out.println();
				System.out.println("Contribuirá com alimentos + medicamentos");
				System.out.println();
				form.formaDePagamento();
			break;
			
			case 3:
				System.out.println();
				System.out.println("Contribuirá com alimentos + medicamentos + mantimentos");
				System.out.println();
				form.formaDePagamento();
			break;
		
		}
		
		leia.close();
	}

}
