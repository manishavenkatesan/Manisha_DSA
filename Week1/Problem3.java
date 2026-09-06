import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s1=sc.nextInt();
      if(s1>=90)
      {
        System.out.println("Grade A");
      }      
      else if(s1>=80){
        System.out.println("Grade B");
      }
      else if(s1>=60){
        System.out.println("Grade C");
      }
      else if(s1>=60){
        System.out.println("Grade D");
      }
      else{
        System.out.println("Fail");
      }
    }
}
