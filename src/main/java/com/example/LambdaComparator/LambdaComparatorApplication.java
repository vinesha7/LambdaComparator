package com.example.LambdaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LambdaComparatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaComparatorApplication.class, args);
		LambdaComparatorApplication lambdaComparatorApplication = new LambdaComparatorApplication();
		lambdaComparatorApplication.myMethod();  
	}

	private void myMethod() {
int[] numbers = {12,23,56,4,-9};

		
		ArrayList<Players> players = new  ArrayList<Players>();
		players.forEach(x->System.out.println(x.firstName +" "+ x.lastName));
		players.add(new Players("Justin","William",14));
		
		players.add(new Players("Sysdney","Cosby",87));
		players.add(new Players("Evegenhy","Malkin",71));
		
		players.forEach(x->System.out.println(x.firstName +" "+ x.lastName));
		
		Comparator<Players> c1 = new Comparator<Players>() {

			@Override
			public int compare(Players p1, Players p2) {

				return p1.lastName.compareTo(p2.lastName);
			}
			
			
		};
		System.out.println(" ---------------------------------------- ");
		Collections.sort(players, c1);
		players.forEach(x->System.out.println(x.firstName +" "+ x.lastName));
		
		System.out.println(" ---------------------------------------- ");
		
		
		Comparator<Players> c2 = (Players p1, Players p2)->{
			return p1.lastName.compareTo(p2.lastName);};
			
		Collections.sort(players, c2);
		players.forEach(x->System.out.println(x.firstName +" "+ x.lastName));
		

	}
}
