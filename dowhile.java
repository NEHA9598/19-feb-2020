
import java.util.Scanner;

public class dowhile{

     public static void main(String []args){
         
       int number,sum=0;
         Scanner input=new Scanner(System.in);
         do{
             
        System.out.println("enter a no");
        number=input.nextInt();
        sum+=number;
     }while(number!=0);
     System.out.println("sum="+sum);
}
}