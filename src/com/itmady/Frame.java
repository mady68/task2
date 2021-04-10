package com.itmady;

import java.io.*;
import java.util.*;
public class Frame {

    public static void main(String[] args) {
	// inputs:
        Scanner in1 = new Scanner(System.in);
        int n = in1.nextInt();
        int m = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        String word = in2.nextLine();

        int Jst = (m - word.length())/2;

        //System.out.println(word);
        if(word.length()>= m-1){
            System.out.println("Error");
        }
        else{

            String s1 = "";       // construct Frame's first and last line;
            for(int i = 1; i<=m; i++){
                s1 = s1 + "*";
            }
            //System.out.println(s1);

            String s2 = "";       // construct empty line;
            for(int i = 2; i<m;i++){
                s2 = s2 + " ";
            }
            s2 = "*" + s2 + "*";

            //System.out.println(s2);

            String sm1 = "*";         // construct middle line with word;
            for(int i = 1; i<Jst; i++){
                  sm1 = sm1+ " ";
            }
            String sm2 = "";
            for(int i = 1; i <((m-word.length())-Jst); i++){
                sm2 = sm2 + " ";
            }
            sm2 = sm2 + "*";
            //System.out.println(sm2);

            String smid = sm1 + word + sm2;

            //System.out.println(smid);


            System.out.println(s1);      // Print the Frame;
            for(int i = 2; i <= n - 1; i++){
                if( i!=n/2){
                    System.out.println(s2);
                }
                else{
                    System.out.println(smid);
                }
            }
            System.out.println(s1);

        }

    }
}
