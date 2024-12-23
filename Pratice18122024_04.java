

public class Pratice18122024_04 {
    public static void main(String[] args) {
        int num = 5;
        if(num % 7 == 0 || num % 3 == 0){
            System.out.println("Divisible by 7 or 3");
        }else if(num % 7 == 0){
            System.out.println("Divisible by 7");
        }else if(num % 3 == 0){
            System.out.println("Divisible by 3");
        }else {
            System.out.println("Not divisible by 7 or 3");
        }
    }
    
}
