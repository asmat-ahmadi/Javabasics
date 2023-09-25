package Class15;

public class dog1 {
    String name;
    String breed;
    int age;
    void bark(){
        System.out.println("my dog bark louely");

    }
    void bite(){
        System.out.println("my dog bite stranger");
    }
    public dog1(String name1,String breed1,int age1){
        name=name1;
        breed=breed1;
        age=age1;

    }
    public void printinfo(){
        if(age==10){
            System.out.println("The dog is too young");
            System.out.println("the name of the dog is "+name+" and the breed of the dog is " +breed+" and the age is "+age);


        }
    }
}
