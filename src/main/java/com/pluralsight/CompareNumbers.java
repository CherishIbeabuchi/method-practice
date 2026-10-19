package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println("5 is even:" + isEven(5));

        System.out.println("2 is even:" + isEven(2));

        System.out.println("1 is positive " + isPositive( 1));


    }

    public static boolean isEven(int num) {

        return num % 2 == 0;

        //Long way
        // if(num % 2 ==0){
        //       return true;
        //  }else{
        //    return false;

    }

    public static boolean isPositive(int num) {
        return num > 0;

    }

}






