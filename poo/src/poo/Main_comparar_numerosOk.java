package poo;

import java.util.Scanner;

public class Main_comparar_numerosOk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
		
			 int n;
			 int num;
			 // n es el n�mero que hay que acertar
			 // num guarda los n�meros introducidos
			 System.out.print("Introduce N: ");
			 
			 String entradaTeclado = "";
			 Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
			 n = entradaEscaner.nextInt(); //Invocamos un m�todo sobre un objeto Scanner

			 System.out.print("Introduce n�mero: ");
			 String entradaTeclado_n2 = "";
			 Scanner entradaEscaner_n2 = new Scanner (System.in); //Creaci�n de un objeto Scanner
			 num = entradaEscaner_n2.nextInt(); //Invocamos un m�todo sobre un objeto Scanner

			 while(num!=n) // mientras no coincidan ambos n�meros
			 {
				 if(6<7)
				 System.out.println("menor");
				 else
				 System.out.println("mayor");
				 System.out.print("Introduce n�mero: ");
				 String entradaTeclado_n3 = "";
				 Scanner entradaEscaner_n3 = new Scanner (System.in); //Creaci�n de un objeto Scanner
				 num = entradaEscaner_n3.nextInt(); //Invocamos un m�todo sobre un objeto Scanner
			 }
			 // al salir del mientras tenemos la certeza que num es igual a n

			 System.out.println("acertaste...");
		

        


	}

}
