package com.java.projects;

import java.util.Scanner;

public class EmailValidation {

    static int sizeArray = 0;
    static String [] arr;
    static StringBuffer sb = new StringBuffer();
    static String find=null;


    public static String validateEmailId(String input){

        for(int i=0;i<arr.length;i++){

            if(arr[i].contains(input)){

                sb.append(" "+arr[i]);
            }

        }

       if(sb.length()>0){
           return sb.toString();
       }


        return "Not found";
    }


    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many emailId you want to insert : ");

        sizeArray = sc.nextInt();

        arr = new String[sizeArray];

        Scanner sc1 = new Scanner(System.in);

        for(int i=0;i<sizeArray;i++){

            System.out.println("Enter "+ (i+1) +" email ID of employee : ");

            arr[i]=sc1.nextLine();

        }

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter email id you want to find :");

        find = sc2.next();

        System.out.println("Employee email id : "+validateEmailId(find));


    }
}
