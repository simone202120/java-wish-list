package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args)  {
		
		List <String> regali = new ArrayList<>();
		boolean continuare = true;
		String continua=null;

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il primo regalo: ");
		String Regalo = sc.nextLine();
		regali.add(Regalo);
		System.out.println(regali);
		System.out.print("Vuoi Continuare? si/no ");
		continua=sc.nextLine();
		if (continua =="si") {
			continuare=true;
		}else if (continua ==" ") {
			continuare=false;
		}
		
		while(continuare==true) {
			 System.out.println("Inserisci regalo: ");
			 Regalo = sc.nextLine();
			 regali.add(Regalo);
			 System.out.print("Vuoi Continuare? si/no ");
			 continua=sc.nextLine();
			 if (continua =="si") {
				 continuare=true;
			}else if (continua =="no") {
				continuare=false;
			
			}
		}
	}
}
