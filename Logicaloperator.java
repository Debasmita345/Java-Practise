public class Logicaloperator {
    public static void main(String[] args) {
        int p =15, q = 10, r = 5;

        //&& operator
        System.out.println((p > q) && (p > r));//true
        System.out.println((p < q) && (p > r));//false
        
        //|| operator
        System.out.println((r < q) || (r < q));//true
        System.out.println((p > q) || (q > r));//true
        System.out.println((p < q) || (q < r));//false

        // ! operator
        System.out.println(!(p == q));//true
        System.out.println(!(p > q));//false
    }
    
}
