package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		List <String> regali = new ArrayList<>();
		
		while(true) {
			System.out.println("Vuoi Inserire un regalo? si/no");
			String continua=sc.nextLine();
			
			if (continua.equals("si")){
				System.out.println("inserire regalo:");
				String regalo=sc.nextLine();
				regali.add(regalo);
				System.out.println("Lunghezza Lista: " + regali.size());
				
				continue;
			}
			break;
		}
		Collections.sort(regali);
		System.out.println(regali);
	}
}
