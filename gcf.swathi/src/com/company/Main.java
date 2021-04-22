package com.company;

public class Main {

    public static void main(String[] args) {
	// gcd of two numbers
        int num1 = 55 , num2 = 121;

        while (num1 != num2) {


            if (num1 > num2)
                num1 = num1  _ num2 ;

            else

                num2 = num2  _ num1 ;
        }
        System.out.println("GCD of given numbers is %d ",num2);
    }
}
