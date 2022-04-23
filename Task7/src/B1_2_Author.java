public class B1_2_Author {
    private String name;
    private String email;
    private char gender;

    public B1_2_Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + gender + ") at " + email;
    }
}
