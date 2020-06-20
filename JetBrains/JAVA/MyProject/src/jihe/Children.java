package jihe;

public class Children extends Student {
    private String gender;

    @Override
    public String toString() {
        return "Children{" +
                "gender='" + gender + '\'' +
                "} " + super.toString();
    }

    public Children(Integer stuNo, String name, int age, String gender) {
        super(stuNo, name, age);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
