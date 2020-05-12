package com.company;
import java.util.Scanner;
 class EvenOdd {

    public static void evenOdd() {
        System.out.println("PLEASE ENTER S NUMBER");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i/2==0){
            System.out.println("Number is Even ");
        }
	else{
	    System.out.println("Number is Odd");
        }
    }
}
