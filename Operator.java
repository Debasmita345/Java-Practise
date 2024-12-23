public class Operator {
    public static void main(String[] args) {
        int d , a = 1, b =2;
        d = - a++ + ++b - ++a - b++ + ++a * b++;
        System.out.println(d + " " + a + " " + b);
    }
    
}
