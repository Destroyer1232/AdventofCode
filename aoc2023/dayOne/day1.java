package aoc2023.dayOne;

import java.io.BufferedReader;
import java.io.FileReader;

public class day1{
    public static void main(String args[]){
        try{
            FileReader input = new FileReader(day1.class.getResource("input.txt").getFile());
            BufferedReader reader = new BufferedReader(input);
            part1(reader);
            input = new FileReader(day1.class.getResource("input.txt").getFile());
            reader = new BufferedReader(input);
            part2(reader);
            
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    
    }

    public static void part1(BufferedReader reader){
        
        try{
            
            int sum = 0;
            String line = reader.readLine();
            while(line != null){
            int first = -1;
            int last = -1;
                for (Character c : line.toCharArray()){
                    
                    if (Character.isDigit(c)){
                        if (first == -1){
                                                        
                            first = Integer.parseInt(c.toString());
                            last = Integer.parseInt(c.toString());

                        }else{
                            last = Integer.parseInt(c.toString());

                        }
                    }

                }
                sum = sum + first*10 + last;

                line = reader.readLine();
            }
            System.out.println("Part 1 Sum: " + sum);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }


    public static void part2(BufferedReader br){
        int sum = 0;
        try{
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                
                int first = -1;
                int last = -1;
                for (int i = 0; i < line.length(); i++) {
                    
                    Character currChar = line.charAt(i);
                    if(Character.isDigit(currChar)){
                        if (first == -1){
                                                        
                            first = Integer.parseInt(currChar.toString());
                            last = Integer.parseInt(currChar.toString());

                        }else{
                            last = Integer.parseInt(currChar.toString());

                        }
                    }else{
                        if(i+5 <= (line.length()-1)){
                            if(first == -1){
                                first = stringToInt(line.substring(i, i+5));
                                last = stringToInt(line.substring(i,i+5));
                            }
                            else{
                                last = stringToInt(line.substring(i,i+5));
                            }
                        }if(i+4 <= (line.length()-1)){
                            if(first == -1){
                                first = stringToInt(line.substring(i, i+4));
                                last = stringToInt(line.substring(i,i+4));
                            }
                            else{
                            last = stringToInt(line.substring(i,i+4));
                            }
                        }if(i+3 <= (line.length()-1)){
                            if(first == -1){
                                first = stringToInt(line.substring(i, i+3));
                                last = stringToInt(line.substring(i, i+3));
                            }
                            else{
                                last = stringToInt(line.substring(i, i+3));
                            }
                        }
                        
                        else{
                            continue;
                        }
                    }

                }
                System.out.printf("%d%d\n",first,last);
                
                sum += first *10 +last;
                line = br.readLine();
            }
            System.out.printf("part2 sum = %d", sum);
            
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

    static int stringToInt(String s){
        int result=0;
        
        switch (s.length()) {
            case 3:
                if(s.substring(0,3).equals("one")) result = 1;
                else if(s.substring(0,3).equals("two")) result = 2;
                else if(s.substring(0,3).equals("six")) result = 6;   
                break;
            case 4:
                if(s.substring(0,4).equals("four")) result = 4;
                else if(s.substring(0,4).equals("five")) result = 5;
                else if(s.substring(0,4).equals("nine")) result = 9;
                break;
            case 5:
                if(s.substring(0,5).equals("three")) result = 3;
                else if(s.substring(0,5).equals("seven")) result = 7;
                else if(s.substring(0,5).equals("eight")) result = 8;
                break;
            default:
                result = -1;
                break;
        }
        System.out.printf("%s %d\n", s, result);
        
        return result;
    }
}
