package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                if (votes.containsKey(fields[0])) {
                    int votesSoFar = votes.get(fields[0]); 
                    votesSoFar += Integer.parseInt(fields[1]);
                    votes.put(fields[0], votesSoFar);                   
                } else {
                    votes.put(fields[0], Integer.parseInt(fields[1]));
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ", " + votes.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}