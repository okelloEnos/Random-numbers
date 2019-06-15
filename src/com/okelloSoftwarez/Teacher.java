package com.okelloSoftwarez;

/**
 * created by okello on 13/6/19
 * to keep track of teachers records
 */
public class Teacher {

    private int Id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * creates a new teacher
     * @param Id teacher's id number
     * @param name teacher's name
     * @param salary teacher's salary
     */
    public Teacher(int Id, String name, int salary){
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     *
     * @return the details for the teacher
     */

    public int getId(){
        return Id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Gives salry to teacher and
     * subtracts total money earned by
     * the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's Name : "+name+
                " ID Number :"+Id+" Salary :"+salary;
    }
}
