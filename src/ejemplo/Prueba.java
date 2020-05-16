/*Programa que lea un número entero N de 5 cifras y muestre sus cifras
desde el final.*/

package ejemplo;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Introduce un número de 5 cifras");
		String numero=sc.nextLine();
		
		System.out.println(numero.length()!=5? "Valor introducido no válido": 
			numero.substring (4,5)+ numero.substring(3,4)+ numero.substring(2,3)+
			numero.substring(1,2)+numero.substring(0,1));
		
		sc.close();
	}
}
