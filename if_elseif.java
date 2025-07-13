import java.util.Scanner;

public class if_elseif{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        if(no1==no2){
            System.out.println("a=b");
        }
        else if(no1>no2){
            System.out.println("a is greater");
        }
        else {
                System.out.println("b is greater");
            }
        }

    }
