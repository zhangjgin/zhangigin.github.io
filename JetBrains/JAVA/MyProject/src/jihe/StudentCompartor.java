package jihe;

import java.util.Comparator;

public class StudentCompartor implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        int flag = o1.getAge() - o2.getAge();
        if (flag == 0){
            flag = o1.getName().compareTo(o2.getName());
        }
        return flag;
    }
}
