public class B1_1_TestAuthor {
    public static void main(String[] args) {
        B1_1_Author ahTech = new B1_1_Author("Tan Ah Tech", "tech@gmail.com", 'm');


        System.out.println(ahTech.toString());
        System.out.println("Name: " + ahTech.getName());
        System.out.println("Email: " + ahTech.getEmail());
        System.out.println("Gender: " + ahTech.getGender());
        ahTech.setEmail("tech@outlook.com");
        System.out.println("After setEmail: " + ahTech.getEmail());
    }
}