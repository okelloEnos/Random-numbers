package com.okelloSoftwarez;

/**
 * created by okello on 13/6/19
 * This class is responsible for
 *   keeping track of student name,id
 *   fees paid and grade.
 */
public class Student {

    private String StdReg;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing
     * every student has to pay 40,000 per year
     * when initializing a student fees paid is 0
     * @param StdReg registration number of the student,unique
     * @param name student's name
     * @param grade student's grade
     */
    public Student(String StdReg, String name, int grade ){

        this.feesPaid = 0;
        this.feesTotal = 40000;
        this.StdReg = StdReg;
        this.name = name;
        this.grade = grade;
    }

    /**
     * To update student's record
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * update the fees paid by the student as time pass untill all is settled
     * @param fees
     */
    public void updateFeesPaid(int fees){

        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * Get methods
     * @return the details of the student
     */
    public String getStdReg() {
        return StdReg;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return The fee balance for the student
     */
    public  int getFeeRemaining(){
        return (feesTotal-feesPaid);
    }
}
