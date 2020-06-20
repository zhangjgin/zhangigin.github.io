package file;

public class RecursionDemo {
    public static void main(String[] args) {
        int reulut = fn(5);
        System.out.println(reulut);
    }
    /*
    * 5!=5*4*3*2*1
    * 4!=4*3*2*1
    * 3!=3*2*1
    * 2!=2*1
    * 1!=1
    * */
    public static int fn(int num){
        int result = 1;
        if (num > 1){
            //方法的自身调用自身就是递归
            result = num * fn(num-1);
        }

        return result;
    }


}
