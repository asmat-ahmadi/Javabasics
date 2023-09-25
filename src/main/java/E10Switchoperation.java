public class E10Switchoperation {
    public static void main(String[] args) {
        int day=3;

        switch (day) {
            case 1:
                System.out.println("monday");
                break; // if we dont put break then all the option will be excuted since there is no break
// limitation with switch is not able to accept all data type just char,string ,and int and no reational and logical operator
                case 2:
                    System.out.println("tuesday");
                    break;

                    case 3:
                        System.out.println("wednesdy");
                        break;

                        case 4:
                            System.out.println("wrongday");
                            break;
                        default:
                    }
                }
            }
