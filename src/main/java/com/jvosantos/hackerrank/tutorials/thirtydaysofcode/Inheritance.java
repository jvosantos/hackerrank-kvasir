package com.jvosantos.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;
import java.util.stream.IntStream;

class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate() {
        double average = IntStream.range(0, testScores.length).map(i -> testScores[i]).average().getAsDouble();
        char c = '\0';

        if(90 <= average && average <= 100) {
            c = 'O';
        } else if(80 <= average && average < 90) {
            c = 'E';
        } else if(70 <= average && average < 80) {
            c = 'A';
        } else if(55 <= average && average < 70) {
            c = 'P';
        } else if(40 <= average && average < 55) {
            c = 'D';
        } else if(average < 40) {
            c = 'T';
        }

        return c;
    }

}
