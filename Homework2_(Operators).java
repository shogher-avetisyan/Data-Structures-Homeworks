public class Operators {
  // 1.
    public static void printActions(int a ,int b){
        System.out.println("a+b= " + (a+b));
        System.out.println("a*b= " + (a*b));
        System.out.println("a/b= " + (a/b));
        System.out.println("a-b= " + (a-b));
        System.out.println("a%b= " + (a%b));
    }
    //2.
    public static void printActions(double c ,double d){
        System.out.println("c+d= " + (c+d));
        System.out.println("c*d= " + (c*d));
        System.out.println("c/d= " + (c/d));
        System.out.println("c-d= " + (c-d));
        System.out.println("c%d= " + (c%d));
    }
    //3.
    public static void print1(){
        int x= 2*((5+3)*4-8);
        int y=2*5+3*4-8;
        System.out.println("x= " +x);
        System.out.println("y= " +y);


    }
    //4.
    public static void print2( int e,int f,boolean n1){
        System.out.println("-e= " +-e);
        System.out.println("-f= " +-f);
        System.out.println("+e= " +e);
        System.out.println("-e+92= " +(-e+92));
        System.out.println("!n1= " +!n1);
        System.out.println("!(!n1= " +n1);
        System.out.println("e++= " +(e++));
        System.out.println("--f= " +(--f));
        int x=3;
        int y= (++x)*5/(x--)+(--x);
        System.out.println("x is  " +x);
        System.out.println("y is  " +y);

    }
    //6
    public static void print3(int x, int y){
        System.out.println("x<y= "+(x<y));
        System.out.println("x=y= "+(x=y));
        System.out.println("x>=y= "+(x>=y));
        System.out.println("x>y= "+(x>y));
    }
    // bitwise and logical operators
    //1
    public static void print4(int a, int b){
        System.out.println("a&b=  " +(a&b));
        System.out.println("a^b=  " +(a^b));
        System.out.println("a|b=  " +(a|b));

        System.out.println("~a= " +(~a));
        System.out.println("true ||(a<4)=  " +(true ||(a<4)));
        System.out.println("(b>=6)||(++a<=7)= " +((b>=6)||(++a<=7)));
        System.out.println("(a<b)?a:b=" +((a<b)?a:b));
        System.out.println("b^b=  " +(b^b));


    }
    public static void print5(int x){
        System.out.println("x*8*16=  " +((x<<3)<<4));
    }

}
public static void main(String[] args){
    Operators.printActions(8,6);
    Operators.printActions(6.4,0.33);
    Operators.print1();
    Operators.print2(10,-88,true);
    //5
    int x=(int)1.0;
    System.out.println("x= "+x);

    short y=(short)1921222;
    System.out.println("y= "+y);
    System.out.println(2147483647+1);
    long yy=(x=3);
    System.out.println("yy= "+yy);
    boolean a=false;
    boolean v;
    boolean b=(v=true);
    System.out.println(x);
    //6
    Operators.print3(10,20);
//    //7
//   1. float y=2.1f;
//    or
//    float y=(float)2.1;
//  2.byte x=5;
//    byte y =10;
//    byte z=(byte)x+y;
//    or
//    int z= x+y;
    // 3.short x=10;
//    short y=3;
//    short z= (short)x*y;
//    or
//    int z=x*y;
   //4. long x=10;
   // int y=5;
   //  y=(int) y*x;

    //8
    int q =10;
    int r=5;
    int temp=q;
    q=r;
    r=temp;
    System.out.println("q= "+q);
    System.out.println("r= "+r);
    //9
    int s=10;
    int t=5;
    s=s+t;
    t=s-t;
    s=s-t;
    System.out.println("s= "+s);
    System.out.println("t= "+s);

    //10
    int n=100;
    int sum= n*(n+1)/2;
    System.out.println("sum ="+sum);
     //bitwise and logical operators
    Operators.print4(8,3);
   // shift operator
    //1
    System.out.println("10<<2=  " +(10<<2));
    System.out.println("-10<<3=  " +(-10<<3));
    System.out.println("20>>2= " +(20>>2));
    System.out.println("15>>3= " +(15>>3));
    //2
    Operators.print5(10);





}
