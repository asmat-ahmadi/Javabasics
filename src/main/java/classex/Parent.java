package classex;

public class Parent {

        Parent(String city){

        }
        Parent(){
            System.out.println("Parent constructor");
        }
    }
    class Child extends Parent{
        Child(String city){
            super(city);

        }
    }
     class main{
        public static void main(String[]args){
            Child dobject =new Child("Vienna");

        }
    }

