//Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String FirstName=sc.next();
      String LastName=sc.next();
      for(int i=0;i<n;i++){
        System.out.println(FirstName+LastName);
      }

    }
}
