public class AssignmentOperator {
    public static void main(String[] args) {
        int p = 10;
        int q;
          
        // =
        q = p;
        System.out.println(q);//10

        // +=
        p += q;//p = p + q, p = 10 + 10 = 20
        System.out.println(p);

        // -=
        p -= q;//p = p - q, p = 20 - 10 = 10
        System.out.println(p);

        // /=
        p /= q;//p = p / q, p = 10 / 10 = 1
        System.out.println(p);

        // %=
        p %= q;//p = p % q, p = 1 % 10 = 1
        System.out.println(p);

    }
    
}
