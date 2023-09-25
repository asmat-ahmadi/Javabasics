public class Casting {
    /* Casting is way where data type is being converted from small nomeric data into bigger and may lose decimals
    and it is narrowing like byte-short-int-long-float-double
     */
    public static void main(String[] args) {
                                                     // here is example One//
        float num1=15688.6f;
        int num2;
        num2=(int)num1;
        System.out.println(num2);
                                                    // here is example Two//
       byte age=10;
       int age1;
       age1=(int)age;

        System.out.println(age1);
        //  OR  //                                    // here is example three//
        byte age2=10;
        int age3=age2;
        System.out.println(age3);
                                                       // here is example four//
        double price=500.4444;
        long price1;
        price1=(long)price;
        System.out.println(price1);
                                                      // here is example five//
        double numb=100.50;
        int numb1;
        numb1=(int)numb;
        System.out.println(numb1);

        byte num5=7;  // byte is smaller and can be stored in big box integer
        int num6=num5;
        System.out.println(num6);

        //int numb7=7;
        //byte numb8=numb7;   // this time it gives error sine big can not be stored in small.


        float num3=14.7f;
        int num4;
        num4=(int)num3;
        System.out.println(num4); //the result is a whole number 14

        int num7=14;
        float num8;
        num8=(int)num7;
        System.out.println(num8); // the result is decimal number 14.0




    }
}
