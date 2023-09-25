package Review1;

public class Mathematicfunction {
    public static void main(String[] args) {
// simpel addition problem
        int apple = 10;
        int orange = 15;
        int mango = 12;
        int totalcost = apple + orange + mango;
        // concatenet with addition problem ( note the result of my calculation is ....
        System.out.println("the result of my calculation is " + totalcost);

        System.out.println(totalcost); //  this additon Or this way
        System.out.println(apple + orange + mango); // this way addiotn both are the same

        // multiplication

        int pounds = 10;
        int rice = 5;
        int totalnum = pounds * rice;
        System.out.println(totalnum);

        // In Division problem this % signs shows the remaining of the balance like 21 /5 reaming is 1.if it data type is int

        int student = 21;
        int teacher = 5;
        int totalstudent = student / teacher;
        System.out.println(totalstudent);
        System.out.println(student / teacher);
        System.out.println(student % teacher);


        double student1 = 21;
        double teacher1 = 5;
        double totalstudent1 = student1 / teacher1;
        System.out.println(totalstudent1);
        System.out.println(student1 / teacher1);

        // Squre problem solution .
        double square = 3.9;
        double result = square * square;
        double result1 = square * 2;
        System.out.println(result);
        System.out.println(result);
        // concatition of the this problem ( The suare of the 3.9 is equal to ---------.
        System.out.println("the square of the 3.9 is equal to " + result);
        System.out.println(2 + 2 * 2); // it is equal to 6 it operates mathematical orders
        System.out.println((2 + 2) * 4); // the total is 16 since the paranthesis is first and multiply
        System.out.println("50" + 50); // it is not addtion but concantination

        String name = "chen";
        System.out.println(name);      // these rules are read from left to right if there is not math process in there
        System.out.println("50" + 50);
        System.out.println("10" + 10 + 10); // the result is 101010 it is consider concatination

        System.out.println("10" + (10 + 10)); // the result is 1020 , the pranatheses has the first priority to be done
        System.out.println("10" + 10 * 10); //  10100 / multiplication has the first priority to be done

        // Shortcut ways for mathematic problem
        int number = 20;
        number = number + 20;
        System.out.println(number);
        int number1 = 20;
        number1 = number1 * 2;
        System.out.println(number1); // The result is 40

        int number0 = 12;
        number0 *= 2;
        System.out.println(number0);

        number1 = number1 * 2 / 2;  // The result of two operation is 20

        number1 = number1 * 2 / 20 + 2;  // the result is 6
        System.out.println(number1);

        int stepone = 10;
        stepone = stepone + stepone + 10;
        System.out.println(stepone);
        int steptwo = 20;
        steptwo = steptwo + stepone;
        System.out.println(steptwo);
        System.out.println("my total amount of my todays purchase is " + steptwo);
        int stepthree = 10;
        stepthree = stepthree * steptwo;
        System.out.println(stepthree);


            int num1 = 10;
            int num2 = 3;
            System.out.println(num1 / num2);
            System.out.println(num1 % num2); // this way is ued to show the remainig of the result on divison


            int student2 = 100;
            int instructor = 10;
            int studentperinst = student2 / instructor;
            //These both ways have the same reslut
            System.out.println(studentperinst);
            System.out.println(student2 / instructor);


        }
    }
