package com.sopra.pox3.base;

public class FirstApplication {

    public static void main(String[] args) {
        System.out.println("Hello ");

        int a = 2;
        String string ="some text";
        
        String otherString = new String("some text");
        String compareString = new String("some text");
        String lastString = otherString;
        
        System.out.println(otherString==compareString);;
        System.out.println(otherString.equals(compareString));   //il faut utiliser le equals pour comparer les chaines de caract�res
        System.out.println(lastString==string);
        
        String x = string+2;
        x = x.concat("Other");
        x = x.concat(String.valueOf(2));
        
        int b = a +2;
        
    }

}