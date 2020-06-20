public class ThisDemo {
    static class A {
        int num = 0;

        public void Num(int num) {
            this.num = num;
            System.out.println(num);
            System.out.println(this.num);
        }

        public void normalNum(int num) {
            num = num;
            System.out.println(num);
            System.out.println(this.num);
        }

        public void thisNum(int num) {
            System.out.println(this.num);
            this.Num(num);
        }

    }
    
    public static void main(String[] args) {
        int num = 10;
        A a = new A();
        a.thisNum(num);

    }
}