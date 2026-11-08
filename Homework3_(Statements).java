public class StatementsUtil {
    //1
    public static void Checking1(int x){
        if(x%2==0){
            System.out.println(x+ " -zuyg ");
        }
        else{
            System.out.println(x+ " -kent ");
        }

    }
    //2
    public static void Checking2(int x){
        if(x>0){
            System.out.println(x+" -դրական է");
        }
        if(x==0){
            System.out.println(x+" -0 է ") ;
        }
        else{
            System.out.println(x+" -բացասական է ");
        }
    }
    //3
    public static void Checking3(int x){
        if( x<8 && x>5){
            System.out.println( "5<" +x+ "<8");

        }
        else if(x>15 && x<20){
            System.out.println( "15<" +x+ "<20");
        }
        else {
            System.out.println( x+ " -false");
        }
    }
    //4
    public static void Checking4(int x){
        if(x%5==0 && x%7==0){
            System.out.println(x+" -true");
        }
        else{
            System.out.println(x+" -false");
        }
    }
    //5
    public static void Checking5(int x){
        int temp1=x%100;
        int temp=temp1/10;

        if(temp==7){
            System.out.println(x+" -true");
        }
        else {
            System.out.println(x + " -false");
        }


    }
    //7
    public static void Checking7(int x, int y, int z){
        int max=x;
        if(max <y ){
            max =y;
        }
        if(max<z){
            max =z;
        }
        System.out.println("max= "+max);
    }
//8
    public static void Checking8(int x){
        if(x%4==0){
            System.out.println(x+" -նահանջ է");
        }
        if(x%4==0 && x%100==0){
            System.out.println(x+" -նահանջ է");
        }
        else{
            System.out.println(x+" -նահանջ չէ");
        }
    }
//12
    public static void f12(int x){
        int temp=x;
        while(temp>=10){
            temp=temp/10;
        }
        System.out.println(+temp);

    }
//14
    public static void f14(int x){
        int temp=x*x;
        System.out.println(x+"^2= "+temp);
    }
    //15
    public static void f15(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%5==0){
                sum=sum+i;
            }

        }
        System.out.println("գումար= "+sum);
    }
    //16
    public static void f16(int n){
        long temp=0;
        for(int i=n;i>1;i--){
            if(i>=10 && i<100){
                if(i%2==0){
                    temp=temp*i;
                }
            }

        }
        System.out.println(" արտադրյալ= "+temp);
    }
    //18
    public static void f18(int n){
        int tiv=n;
        int sum=0;
        for(int i=0;i<5;i++ ){
            sum=sum+(n%10);
            n=n/10;

        }
        System.out.println(tiv+"-ի թվանշանների գումարը=  "+sum);

    }



}
public static void main(String[] args){
    //1
    System.out.println("1. \n");
    StatementsUtil.Checking1(5);
    StatementsUtil.Checking1(8);
    //2
    System.out.println("2. \n");
    StatementsUtil.Checking2(-5);
    StatementsUtil.Checking2(456);
    //3
    System.out.println("3. \n");
    StatementsUtil.Checking3(-12);
    //4
    System.out.println("4. \n");
    StatementsUtil.Checking4(45);
    StatementsUtil.Checking4(35);
    //5
    System.out.println("5. \n");
    StatementsUtil.Checking5(479);
    //7
    System.out.println("7. \n");
    StatementsUtil.Checking7(-3,15,49);
    //8
    System.out.println("8. \n");
    StatementsUtil.Checking8(2026);
    //11
    System.out.println("11. \n");
    for(int i=1;i<=200;i++){
        System.out.println(+i);
    }
    //12
    System.out.println("12. \n");
    StatementsUtil.f12(4569);
    //13
    System.out.println("13. \n");
    int x=1;
    int y=0;

    while(x<5){
        System.out.println(+(x*y));
        x++;
        y++;
    }
    //14
    System.out.println("14. \n");
    StatementsUtil.f14(11);
    //15
    System.out.println("15. \n");
    StatementsUtil.f15(100);
    //16
    System.out.println("16. \n");
    StatementsUtil.f15(50);
    //18
    System.out.println("18. \n");
    StatementsUtil.f18(12345);

}
