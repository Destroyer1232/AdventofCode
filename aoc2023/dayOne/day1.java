package aoc2023.dayOne;

import java.io.BufferedReader;
import java.io.FileReader;

public class day1{
    public static void main(String args[]){
        System.out.println("Hello World");
        try{
            FileReader input = new FileReader(day1.class.getResource("input.txt").getFile());
            BufferedReader reader = new BufferedReader(input);
            part1(reader);
        }catch(Exception e){
            System.out.println("Error: " + e);

        }

    
    }

    public static void part1(BufferedReader reader){
        
        try{
            
            int sum = 0;
            String line = reader.readLine();
            while(line != null){
            System.out.println(line);
            int first = -1;
            int last = -1;
                for (Character c : line.toCharArray()){
                    
                    if (Character.isDigit(c)){
                        if (first == -1){
                                                        
                            first = Integer.parseInt(c.toString());
                            last = Integer.parseInt(c.toString());
                            System.out.printf("First: %s, Last: %s\n", first, last);

                        }else{
                            last = Integer.parseInt(c.toString());
                            System.out.printf("First: %s, Last: %s\n", first, last);

                        }
                    }

                }
                sum = sum + first*10 + last;

                line = reader.readLine();
            }
            System.out.println("Sum: " + sum);
            reader.close();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }


    public static void part2(BufferedReader br){
        try{
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
                    
                }
                line = br.readLine();
            }
            br.close();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

    static int stringToInt(String s){
        int result = 0;
        
        if(s.equals("one")){
            result = 1;
        }else if(s.equals("two")){
            result = 2;
        }else if(s.equals("three")){
            result = 3;
        }else if(s.equals("four")){
            result = 4;
        }else if(s.equals("five")){
            result = 5;
        }else if(s.equals("six")){
            result = 6;
        }else if(s.equals("seven")){
            result = 7;
        }else if(s.equals("eight")){
            result = 8;
        }else if(s.equals("nine")){
            result = 9;
        }

    

        return result;
    }
}
