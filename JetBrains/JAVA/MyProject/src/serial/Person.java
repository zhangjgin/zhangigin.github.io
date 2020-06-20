package serial;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private static final long serialVersionUID = -6845381814167118369L;
    private String name;
    private int age;
    private Date birth;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", addr='" + addr + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Person(String name, int age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }
}
