import java.util.*;
public class n_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=0; i<=num; i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
