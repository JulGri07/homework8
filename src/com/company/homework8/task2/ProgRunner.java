package com.company.homework8.task2;

import com.company.homework8.task2.Aspirant;
import com.company.homework8.task2.Student;

public class ProgRunner {

    static public void main(String[] args) {

        Student studentAspirant = new Aspirant("Anna", "Grom","RES-09",4.99, "AQW");

        Student[] myStudents = new Student[3];
        myStudents[0] = new Student("Jul","Som","RES-09",5.0);
        myStudents[1] = new Aspirant("Kris","Li","AUS-14",4.0,"AZAZ");
        myStudents[2] = new Student("Tom","Chin","AUS-12",3.0);

        for (Student oneStudent : myStudents){
            System.out.println("FIO: " + oneStudent.getFIO() + " scolarship: " + oneStudent.getScholarship());
        }
    }


}
