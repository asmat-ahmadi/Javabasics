package class10;

public class replit0810 {
    public static void main(String[] args)
    {
        int [] num={5,4,8,};
        int highestnumber=num[0];
        for(int i=1;i<num.length;i++){
          if(num[i]>highestnumber){
              highestnumber=num[i];
          }
        }
        System.out.println("The highest number is "+highestnumber);

}}
