import java.util.ArrayList;
import java.util.List;

class P7_User {
    private String name;
    private int age;

    public P7_User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // ArrayListUserDefinedObjectExample
    public static void main(String[] args) {
        List<P7_User> users = new ArrayList<>();
        users.add(new P7_User("Rajeev", 25));
        users.add(new P7_User("John", 34));
        users.add(new P7_User("Steve", 29));

        users.forEach(p7_user -> {
            System.out.println("Name: " + p7_user.getName() + ", Age: " + p7_user.getAge());
        });
    }
}
