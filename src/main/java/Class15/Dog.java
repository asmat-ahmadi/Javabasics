package Class15;

public class Dog {  // if we change to private it will not be accessible
    String name;
    String breed;
    String color;
    int age;
    Dog(String dName,String dBreed ,String dColor,int dAge){
        //if we put public ifront of Dog or void it canbe accessible to reach any file in diddrernt location
        // it calls construct becasue it has the smae name(Dog) without void or dtadatype
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;
    }
    void bark(){
        System.out.println("wuff wuff");
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+color);
    }
}
