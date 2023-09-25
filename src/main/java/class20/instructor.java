package class20;

public class instructor {
    private String name;
    private String InsID;
public instructor(String name,String InsID){
    this.name=name;
    this.InsID=InsID;


}
public void printinfo(){
    System.out.println(" the instructor name is "+name+" and his ID is "+InsID);
}
}
