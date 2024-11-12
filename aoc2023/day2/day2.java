package aoc2023.day2;

import java.io.BufferedReader;
import java.io.FileReader;

public class day2 {
        public static void main(String[] args) {
            try {
                FileReader file = new FileReader(day2.class.getResource("input.txt").getFile());
                BufferedReader br = new BufferedReader(file);
                br.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
}
