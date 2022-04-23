public class B1_2_TestBook {
    public static void main(String[] args) {
        // create an author instance
        B1_2_Author authorA = new B1_2_Author("Nguyen Author A", "authorA@gmail.com", 'm');
        System.out.println(authorA.toString());

        //Test's book
        B1_2_Book book1 = new B1_2_Book("Lap Trinh C", authorA, 9.999, 10);
        System.out.println(book1.toString());

        System.out.println("-----------------------------------");
        // Test setters and getters
        System.out.println("Book's name is: " + book1.getName());
        System.out.println("Book's price is: " + book1.getPrice());
        System.out.println("Book's quantity is: " + book1.getQty());

        System.out.println("------------------------------------");
        System.out.println("Author's name is: " + book1.getAuthor().getName());
        System.out.println("Author's email is: " + book1.getAuthor().getEmail());
        System.out.println("Author's gender is: " + book1.getAuthor().getGender());

        System.out.println("--------------------------------------");
        book1.setPrice(10000);
        System.out.println("After setPrice: " + book1.getPrice());

    }
}
