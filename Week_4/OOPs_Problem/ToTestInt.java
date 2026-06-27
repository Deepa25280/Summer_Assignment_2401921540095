interface test {
    void square(int x);
}

class arithmetic implements test {
    public void square(int x) {
        System.out.println("Square = " + (x * x));
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.square(7);
    }
}