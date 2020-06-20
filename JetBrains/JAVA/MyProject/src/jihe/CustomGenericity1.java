package jihe;

public class CustomGenericity1<T,E> {
    //定义一个泛型
    private T t;

    private E e;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public CustomGenericity1(T t, E e) {
        this.t = t;
        this.e = e;
    }
}
