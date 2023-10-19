package variabletopics;

public class VariableTypes   //Pascal case
{
    static float f = 2.5f; //static GV
    String s = "Hello Are you there";  //instance or non-static
    double d;       //GV's can't be declared and initialised in two lines only in one line
    static char c;   //GV's can be declared globally and initialised locally
    static boolean y;
    static String z;
   static short w;
    static long l;


    public static void main(String[] args)
    {
        int a = 3;   //LV
        int b = 7;
        System.out.println(b);
        System.out.println(f);
        VariableTypes v1 = new VariableTypes(); //Object creation ,v1 ref var = object
        System.out.println(v1.s);
        System.out.println(v1.d);      //Updated value = v1.d = new value
        v1.d=8.98;
        System.out.println(v1.d);     //double d is non-static so use Ref var then update the value, since main method is static
        System.out.println(c);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);    //c printed twice
        c='E';
        System.out.println(c);
        System.out.println(w);
        System.out.println(l);

    }
    void add()
    {

    }



}
