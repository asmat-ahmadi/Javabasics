package Review1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println(" enter your grade");
        int grade= input.nextInt();
        if ( grade>=90){
            System.out.println("A");

        }else if(grade>=70 && grade<90){
            System.out.println("B");

        }else if (grade>=50 && grade <70){
            System.out.println("C");

    }else{
            System.out.println("f");
        }
    /*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/
}}
