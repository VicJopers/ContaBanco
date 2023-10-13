package aplication;

import java.util.Locale;
import java.util.Scanner;

import exceptions.BusinessException;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.println("Nome: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Valor inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		
		System.out.print("Informe a quatia que deseja sacar: ");
		double amount = sc.nextDouble();
		try {
		acc.withdarw(amount);
		System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		}
		catch(BusinessException e){
			System.out.println(e.getMessage());
		}

		System.out.println("Apenas uma frase aleatória para um teste");
		
		sc.close();
	}

}
