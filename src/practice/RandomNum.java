package practice;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomNum {

	public static void main(String[] args) {
	
		
		
		Set<Integer> randomNum = new TreeSet<Integer>();
			Random rNum = new Random();
			while(randomNum.size() != 500 ) { 		
			randomNum.add(rNum.nextInt(500));
			}
		
		
		System.out.println(randomNum);
		Object[] randomNumArray = randomNum.toArray();
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Give me the __ smallest number. (FYI: We are dealing with indexes)");
				int userNum = scan.nextInt();
				System.out.println(randomNumArray[userNum]);
			} 
         
	}

}
