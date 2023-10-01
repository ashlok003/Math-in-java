
import java.util.*;
public class CalculateHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        int n1 = sc.nextInt();
        System.out.print("Enter the first number :- ");
        int n2 = sc.nextInt();
        int hcf = calculateHCF(n1,n2);
        System.out.println("HCF of two number is :-"+hcf);
    }
    static int calculateHCF(int a,int b){
        if(b==0){
            return a;
        }else {
            return calculateHCF(b , a % b);
        }
    }
}
