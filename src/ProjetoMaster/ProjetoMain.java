package ProjetoMaster;

import java.util.Scanner;

public class ProjetoMain {

	public static void main(String[] args) {
		
		Instituicao ins = new Instituicao();
		
		Scanner input = new Scanner(System.in);
		
		int cep1; 
		int idade;
		String nome;
		String sobreNome;
		String cpf;
		String email;
		String telefone;
		
		System.out.println("------------------------------");
		System.out.println("=     C       A       T      =");
		System.out.println("=                            =");
		System.out.println("=     Catalisador do Bem     =");
		System.out.println("------------------------------");
		System.out.println();
		System.out.print("Nome: ");
		nome = input.next();
		System.out.println("-----------------------------");
		System.out.print("Último Nome: ");
		sobreNome = input.next();
		System.out.println("-----------------------------");
		System.out.print("Idade: ");
		idade = input.nextInt();
		System.out.println("-----------------------------");
		System.out.print("CPF ou RG: ");
		cpf = input.next();
		System.out.println("-----------------------------");
		System.out.print("Email: ");
		email = input.next();
		System.out.println("-----------------------------");
		System.out.print("Telefone: ");
		telefone = input.next();
		System.out.println("-----------------------------");
		System.out.print("CEP: ");
		cep1 = input.nextInt();
		System.out.println("-----------------------------");
		System.out.println();
		
		if (idade >= 18) { 
			ins.instituicao();
		}
		else {
			System.out.println("Menores de 18 anos não podem doar");
		}
		
		input.close();
		
	}

}
