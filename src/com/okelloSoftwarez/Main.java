package com.okelloSoftwarez;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String []args){
        Teacher wilfridah = new Teacher(290,"wilfridah",10000);
        Teacher Bijuma = new Teacher(185,"Bijuma",15000);
        Teacher Okello = new Teacher(4889,"Okello",70000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(wilfridah);
        teacherList.add(Bijuma);
        teacherList.add(Okello);

        Student Aloice = new Student("13","Aloice",4);
        Student Venessah = new Student("05","Venessah",7);
        Student Blessing = new Student("81","Blessing",2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Aloice);
        studentList.add(Venessah);
        studentList.add(Blessing);

        School lwangaSS = new School(teacherList,studentList);


        Aloice.updateFeesPaid(5000);
        Venessah.updateFeesPaid(7000);
        System.out.println("Lwanga has Ksh: "+lwangaSS.getTotalMoneyEarned());

        System.out.println("-------Salary payments to Teachers--------");
        wilfridah.receiveSalary(wilfridah.getSalary());
        System.out.println("School has spent salary on "+wilfridah.getName()+"  Amounting to ksh: "+wilfridah.getSalary()+" and has total money as Ksh: "+lwangaSS.getTotalMoneyEarned());

        Bijuma.receiveSalary(Bijuma.getSalary());
        System.out.println("School has spent salary on "+Bijuma.getName()+"  Amounting to ksh: "+Bijuma.getSalary()+" and has total money as Ksh: "+lwangaSS.getTotalMoneyEarned());

        System.out.println(Okello);
    }
    }

