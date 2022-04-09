public class CodeSnippet10 {
    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";
        // Outer switch statement
        switch (day) {
            case "Sunday":
                System.out.println("Sunday is a Holiday ... ");
                // Inner switch statement
            switch (hour) {
                case "am":
                    System.out.println("Good Morning");
                    break;
                case "pm":
                    System.out.println("Good Evening");
                    break;
            }
            break;

            case "Monday":
                System.out.println("Monday is a Working Day ...");
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
            break;

        }
    }
}
