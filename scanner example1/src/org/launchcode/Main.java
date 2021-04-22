package org.launchcode;

import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
	System.err.println("This is error message");
	System.out.println("This is standard output");
	// int a;
        String str1,str2,str3 =" ";
        Scanner sc = new Scanner("HelloWorld/How is the team");
        sc.useDelimiter("/");
        System.out.println("Take input from user");
        str1= sc.next();
        str2 = sc.next();
       // System.out.println(sc.hasNext());
        System.out.println(sc.delimiter());
        System.out.println("My input value= "+str1+ " 2= "+str2+" 3="+str3);

    }
}
