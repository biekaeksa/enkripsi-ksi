package bisnismenguntungkanviktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            LinkedList listTotal = new LinkedList();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("N : ");
            String n = reader.readLine();

            for (int i = 0; i < Integer.parseInt(n); i++) {
                String t = reader.readLine();
                int total = 0;
                for (int j = 0; j < Integer.parseInt(t); j++) {
                    System.out.println("untung ke " + (j + 1) + ":");
                    String u = reader.readLine();
                    total = total + Integer.parseInt(u);
                }
                listTotal.add(total);
            }
            System.out.println(listTotal);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
