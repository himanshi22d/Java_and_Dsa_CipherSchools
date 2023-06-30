package accessModifiers2;
import accessModifiers1.A;
 
public class C extends A
{
     public static void main(String[] args)
     {
         A obj = new A();
 //      System.out.println(obj.x);
 //      System.out.println(obj.y);
         System.out.println(obj.z);
         System.out.println(obj.w);
     }
}
