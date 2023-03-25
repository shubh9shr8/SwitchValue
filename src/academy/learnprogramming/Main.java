package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int switchvalue =4;

        switch (switchvalue) {
            case 1:
                System.out.println("the value was 1");
            break;
                case 2:
                    System.out.println("the value was 2");
                    break;
            case 3: case 4: case 5:
                System.out.println("it was 3,4 or 5");
                System.out.println("actually it was a " + switchvalue);
                break;
            default:
                System.out.println("was not 1,2,3,4 or 5");
        }

        String month = "APRIL";
        System.out.println (month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month){
        switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVERMBER":
            case "DECEMBER":
                return "4th";
        }
        return "bad";

        }

    }
