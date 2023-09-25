package Class15;

public class Cat {
    private String name;
    private String breed;
    private  int age;

   public Cat(String name1,String breed1,int age1){
       name=name1;
       breed=breed1;
       age=age1;
       System.out.println(" with parameter");
   }
    public Cat(){
        System.out.println(" without prameter");
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+age);
    }



}
