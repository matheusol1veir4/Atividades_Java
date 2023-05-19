package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random randon = new Random();
		
		int opcao = randon.nextInt (8) + 1;
		System.out.println(opcao);
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break; 
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Não corresponde a um dia da semana");
			break;
		}
		
		/*if (opcao == "Sexta-feira") { 
			System.out.println("Sextou, Obrigado Deus !!!");
		}
		
		else if  ( opcao != "Sexta-feira" ){
			System.out.println("Espere mais um pouco");}
			
		else { 
			
			System.out.println("Você não nasceu de 7 meses"); }*/
			
		}
		

	}
