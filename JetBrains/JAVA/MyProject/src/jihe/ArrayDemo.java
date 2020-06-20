package jihe;

public class ArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for(int i = 0; i < 10;i++){
            Student s = new Student(i,"小亮"+i,22);
            students[i] = s;
        }
        printArr(students);
    }
    public static void printArr(Student[] students){
        for (int i = 0;i < students.length;i++){
            System.out.println(students[i]);
        }
    }

}
