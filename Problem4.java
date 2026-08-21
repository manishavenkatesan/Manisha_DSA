import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int s1=sc.nextInt();
      switch(s1){
      case 29: 
      System.out.println("small");
      break;
      case 30:
      System.out.println("Medium");
      break;
      case 38:
      System.out.println("Large");
      break;
      case 42:
      System.out.println("XLarge");
      break;
      default:
      System.out.println("Invalid");
      }
    }
}
