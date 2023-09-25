package Class16;

public class BookHW {
    private String bookname;
    private String authorname;
    private int editionYear;

    public BookHW(String bookname,String authorname,int editionYear){
        this.bookname=bookname;
        this.authorname=authorname;
        this.editionYear=editionYear;
    }
    public BookHW(String bookname,String authorname){

        this.bookname=bookname;
        this.authorname=authorname;

    }
    public void printInfo(){
        System.out.println(bookname+" "+authorname+" "+editionYear);

    }
    public void printInfo1(){
        System.out.println(bookname+" "+authorname);
    }
}




