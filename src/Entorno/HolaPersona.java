package Entorno;

import java.util.Scanner;

public class HolaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre;
		
		System.out.println("Introduce tu nombre: ");
		nombre = sc.next();
		
		System.out.println("Buenos días " +nombre);
		sc.close();
	}

}
