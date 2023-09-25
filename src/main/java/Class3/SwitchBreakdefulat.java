package Class3;

public class SwitchBreakdefulat {
    public static void main(String[] args) {

        /* This option allowes us a variable to test equality against a list of value and the formula is case with lower case
        case in quatation and  ccolon after each Sout break with semicolon and default at the end of list to give us a note
        for invalid entry . The Forula String .....case .....sout....break.....

         */
        String Day="john;";
        switch (Day) {
            case "Sunday":
                System.out.println("It is Sunday");
            break;
            case "Monday":
                System.out.println("It is Modnay");
                break;

            case "Tuesday":
                System.out.println("It is Tuesday");
                break;

            case "Wednesday":
                System.out.println("It is Wednesday");
                break;

            case "Thursday":
                System.out.println("It is Thursday");
                break;

            case "Friday":
                System.out.println("It is Friday");
                break;
            default:
                System.out.println("It is not a day");

        }
    }
}
