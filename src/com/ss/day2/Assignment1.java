package com.ss.day2;

public class Assignment1 {

    public static void main(String[] args) {
        int sum = 0;
        try{
            for (int i = 0; i <args.length; i++){
                sum += Integer.parseInt(args[i]);
            }
        }
        catch(Exception e) {
            System.out.println("One of the inputs was invalid");
        }
        System.out.println("The sum is " + sum);
    }
}
