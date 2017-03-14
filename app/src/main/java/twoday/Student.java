package twoday;

import java.util.Comparator;

/**
 * Created by Administrator on 2016/11/22.
 */
public class Student implements Comparable<Student>{
    private String name;
    private String cla;
    private String grade;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String cla, int age, String grade) {
        this.name = name;
        this.cla = cla;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return age == student.age;

    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age>o.age){
            return -1;
        }else if(this.age<o.age){
            return 1;
        }
        return 0;
    }
}
