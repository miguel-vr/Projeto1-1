package ProjetoMaster;

import java.util.Scanner;

public class FormaDePagamento {

	void formaDePagamento() {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual ser? a forma de pagamento: ");
		System.out.println();
		System.out.println("[1] Cart?o de credito");
		System.out.println("[2] Boleto			 ");
		System.out.println("[3] Pix				 ");
		System.out.println();
		System.out.print("---> ");
		
		numero = leia.nextInt();
		
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("     Efetuando Pagamento com sucesso...     ");
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("        Doa??o feita com sucesso    ");
		
		
		leia.close();
		
	}
	
		
	
}
