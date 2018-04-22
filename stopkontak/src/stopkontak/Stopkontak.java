/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopkontak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author ig4ever
 */
public class Stopkontak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here       
        LinkedList listTotal = new LinkedList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("T : ");
        String t = reader.readLine();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            System.out.print("L : ");
            String l = reader.readLine();
            System.out.print("B : ");
            String b = reader.readLine();

            int total = 0;
            int lTemp = Integer.parseInt(l);
            int bTemp = Integer.parseInt(b);
            boolean finish = false;

            while (finish == false) {
                if (bTemp >= 2 && lTemp >= 1) {
                    bTemp = bTemp - 2;
                    lTemp = lTemp - 1;
                } else if (lTemp == 0) {
                    if (bTemp >= 3) {
                        bTemp = bTemp - 3;
                    } else {
                        finish = true;
                    }
                } else {
                    if (bTemp == 0) {
                        if(lTemp == 4){
                            finish = true;
                        }else if (lTemp <= 3) {
                            finish = true;
                        } else if (lTemp >= 3) {  
                            lTemp = lTemp - 3;
                        }
                    } else {
                        bTemp = bTemp - 1;
                        lTemp = lTemp - 2;
                    }
                }
                total = total + 1;
            }
            listTotal.add(total);
            System.out.println(listTotal);
        }
    }
}
