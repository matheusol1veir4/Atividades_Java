package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		for(int i = 0; i< 10; i++ ) {
			System.out.println(i);
		// For � usado quando sabemos a quantidade de vezes que ir� repetir!	
		}
		System.out.println("/****************/");
		int i = 0;
		
		while (i < 10)
		// while � usado quando n�o sabemos a quantidade de vezes que iremos repetir!
		{
			System.out.println(i);
		i++;
		}
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Deseja continuar? ");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while (opcao == 's') {
			j++;
			System.out.print("Deseja continuar? ");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Entrou no While: " + j); 
		sc.close();
		
	}

}
