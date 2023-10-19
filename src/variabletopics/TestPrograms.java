package variabletopics;

public class TestPrograms
{
   static int g ;         //static GV
   static char x ;
   static boolean m;
   long z=80000;         //Non-static GV
   final double pi  = 3.14;  //GV's are purple in colour
   String n;
   public static void main(String[] args)
   {
      byte b =1;                //Keywords are blue in colour
      short s =2;
      int i = 50;              //Local variable values can't be updated
      long l = 1000;
      float f = 3.87f;
      double d = 78.4565;
      char c ='K';
      boolean e = true;
      String t = "My name is Anamica";
      System.out.println(b);
      System.out.println(f);
      System.out.println(c);
      System.out.println(t);
      System.out.println(g);
      TestPrograms v1 = new TestPrograms();
      System.out.println( v1.z);
      v1.z= 90000;         //Updating new value for GV instance
      System.out.println( v1.z);
      g=60;               //Updating new value for GV static
      System.out.println(g);
      System.out.println(v1.pi);
      double pi  = 9.876;
      System.out.println(v1.pi);  //Even if you update the final value ,the value whichever was in final will be still the same
      System.out.println(x);
      System.out.println(m);
      System.out.println(v1.n);
   }

}
