public class CodeSnippet8 {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
            System.out.println("Second day of the Week");
            break;
            case "Tuesday":
                System.out.println("Third day of the Week");
                break;
            case "Thursday":
                System.out.println("Thursday day of the Week");
                break;
            case "Friday":
                System.out.println("Friday day of the Week");
                break;
            case "Saturday":
                System.out.println("Saturday day of the Week");
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}
