// Java file for Advent of Code
package aoc2015.day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class day1 {
	public static void main(String[] args){
		System.out.println("Hello World!");
		try {
			FileReader file = new FileReader(day1.class.getResource("input.txt").getFile());
			BufferedReader br = new BufferedReader(file);
			String line = br.readLine();
			part1(line);
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}


	static void part1(String line){
		int floor = 0;
		// line = ")";
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '('){
				floor++;
			}
			else{floor--;}

			if(floor < 0){
				System.out.println("basement is " + (i+1));
				break;
			}
		}

		System.out.println(floor);
		

	}
}