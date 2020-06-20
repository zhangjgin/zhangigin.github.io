package jihe;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
    private Integer stuNo;
    private  String name;
    private int age;
    //学生类中有一个集合属性
    private Collection books = new ArrayList();

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqu = false;
        if (obj instanceof Student){
            Student s = (Student) obj;
            if (this.name != null && s.name != null && this.age == s.age && this.name.equals(s.name) && this.stuNo == s.stuNo){
                isEqu = true;
            }

        }
        return isEqu;
    }

    public Collection getBooks() {
        return books;
    }

    public void setBooks(Collection books) {
        this.books = books;
    }

    public Student(Integer stuNo, String name, int age) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
