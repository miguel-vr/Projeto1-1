package ProjetoMaster;

import java.util.Scanner;

public class Instituicao {

	void instituicao() {
		LuizaMel lui = new LuizaMel();
		Medicos med = new Medicos();
		Acnur acn = new Acnur();
		
		int num1;
		
		
		
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Para qual institui��o voc� quer doar:");
		System.out.println();
		System.out.println("[1] Luiza Mell - instituto de ajuda aos animais");
		System.out.println();
		System.out.println("[2] M�dicos sem Fronteiras - cuidados de sa�de no mundo inteiro");
		System.out.println();
		System.out.println("[3] ACNUR - assist�ncia aos refugiados");
		System.out.println();
		System.out.println("[4] SAIR");
		System.out.println();
		System.out.print("---> ");
		
	
		num1 = input.nextInt();
		
		switch (num1) {
			case 1:
				lui.luizaMel();
			break;
			
			case 2:
				med.medicos();
			break;
			
			case 3:
				acn.acnur();
			break;
			
			case 4:
				System.out.println("Encerrando o programa...");
			break;	
			
			default: 
				System.out.println();
				System.out.println("N�mero n�o identificado, tente novamente...");
				break;
		}
		
		input.close();
	}

}
