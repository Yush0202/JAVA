package com.pluralsight.example;
public class Main {
    /*
     This is first comment line
     This is second comment line
    */
    public static void main(String[] args){
        System.out.println("First line from app"); // Line Comment
        System.out.println("Second line from app"); /*  Block Commnent
        can be used in multi line too */
        System.out.println(/* "Third line from app"*/"This is different text"); /** Javadoc Comment
         this is also treated as a block comment */
    }
}