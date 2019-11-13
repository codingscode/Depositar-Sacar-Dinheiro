package principal;

import java.util.Locale;
import java.util.Scanner;

import entidade.Info;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Info conta;
		
		System.out.print("Número da conta: ");
		int numconta = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nometitular = sc.nextLine();
		System.out.print("Há saldo inicial? ");
		char resposta = sc.next().charAt(0);
		  if (resposta == 's') {
		    System.out.print("Saldo inicial? ");
		    double saldo1 = sc.nextDouble();  
		    conta = new Info(numconta, nometitular, saldo1); 
		  } else {
			conta = new Info(numconta, nometitular);  
		  }

		  System.out.println();
		  System.out.println("Informação da conta:");		 
		  System.out.println(conta);
		  		  
		  System.out.println();		  
		  System.out.print("Entre com um depósito: ");
		  double botar = sc.nextDouble();
		  conta.deposito(botar);
		  System.out.println("Informação da conta atualizada:");
		  System.out.println(conta);		  

		  System.out.println();		  
		  System.out.print("Entre com um saque: ");
		  double tirar = sc.nextDouble();
		  conta.saque(tirar);
		  System.out.println("Informação da conta atualizada:");
		  System.out.println(conta);		  

		sc.close();
		
	}

}
