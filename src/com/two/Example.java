package com.two;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
       /* for (int i = 0; i <= 10; i++)
            System.out.println("value of i" + i);
    */
      /*  int i=0;
        for(;;){
            if(i>10){
                break;
            }
            System.out.println("i value"+i);
            i++;
        }*/
     /*   String name[]={"Chiku","Annu","Mannnu","Chintu","Pappu"};
        String message="Hello World";
        int []numbers={10,20,30,40,50};
        for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
        for(String str:name)
            System.out.println(str);

        for(char ch:message.toCharArray())
            System.out.println(ch);
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        String message = input.nextLine();
        String reversedString="";
        int i=message.length()-1;
        do{
            reversedString=reversedString+message.charAt(i);
            i--;
        }while (i>=0);
        if(reversedString.equals(message))
            System.out.println("it is palindrome");
        else
            System.out.println("not a palindrome");

    }
}
