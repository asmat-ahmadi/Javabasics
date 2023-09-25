package class2;

public class E8AritmeticsOperator {
    public static void main(String[] args) {
        int noOfslice=5;
        int noOffriends=2;
        System.out.println(noOfslice/noOffriends);
        System.out.println(noOfslice%noOffriends);
// the fowlling way is showing the decimals of the above whole number

        double noslice=5;
        double nofriends=2;
        System.out.println(noslice/noOffriends);
        System.out.println(noslice%noOffriends);

        // this division doesnt show the remaing balance just the whole number

        int book=19;
        int students=10;
        int total=book/students;
        System.out.println(total);
        System.out.println(book % students); // this % shows the remaining of the 9 which is not possbile to divide on 10

        // this way shows complete division including decimals
        double book1=19;
        double student11=10;
        double total1=book1/student11;
        System.out.println(total1);


    }
}
