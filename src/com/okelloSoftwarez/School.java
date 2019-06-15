package com.okelloSoftwarez;

import java.util.List;

/**
 * created by okello on 13/6/19
 * use arraylist to account for many teachers and students within the school
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * To initialize a new school object
     *
     * @param teachers list of all the teachers in the school
     * @param students list of all students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneySpent = 0;
        totalMoneyEarned = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher to be added
     */

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of all students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add the student to the school
     * @param student student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }


    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned ;
    }

    /**
     * adds the total maoney earned by the school
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the total money spent by the school
     * basing on salary given to teachers
     * @param moneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}