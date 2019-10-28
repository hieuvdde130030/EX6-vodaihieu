/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ex6 {
    
    static String myFunction(String s){
        String[] words = s.split("\\s");
        ArrayList<String> tu2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            tu2.add(w);
        }
        ArrayList<Integer> chuoi = new ArrayList<>();
        for (int i = 0; i < tu2.size(); i++) {
            for (int j = i + 1; j < tu2.size(); j++) {
                if (tu2.get(i).equals(tu2.get(j))) { 
                    chuoi.add(j);
                    tu2.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
        for (Integer integer : chuoi) {
            tu2.set(integer, "");
        }
        for (String string : tu2) {
            if(!string.equals("")){
                result += string+" ";
            }
        }
        result=result.replace("\\s+","");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("I want to to go to the the the zoo");
        System.out.println("Example : I want REPEAT go to REPEAT zoo ");
        System.out.print("Real: ");
        System.out.println(myFunction("I want to to go to the the the zoo"));
        System.out.println("toi an keo keo moi toi toi");
        System.out.println("Example : toi an REPEAT moi REPEAT ");
        System.out.print("Real: ");
        System.out.println(myFunction("toi an keo keo moi toi toi"));
        System.out.println("toi an 1 1 1 cay keo");
        System.out.println("Example : toi an REPEAT cay keo ");
        System.out.print("Real: ");
        System.out.println(myFunction("toi an 1 1 1 cay keo"));
        System.out.println("toi noi a a a a a");
        System.out.println("Example : toi noi REPEAT");
        System.out.print("Real: ");
        System.out.println(myFunction("toi noi a a a a a"));
        System.out.println("toi cuoi cuoi a a a a a");
        System.out.println("Example : toi REPEAT REPEAT");
        System.out.print("Real: ");
        System.out.println(myFunction("toi cuoi cuoi a a a a a"));
    }
}
