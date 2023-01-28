import java.util.*;
public class BASICS {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int sum=0;
            while(number>0){
                int rem = number%10;
                sum += rem;
                sum *=10;

            }
            System.out.println(sum);
        }
        

        
    }
}
