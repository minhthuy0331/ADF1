public class B1_1_Author {
    private String name;
    private String email;
    private char gender;

    public B1_1_Author(String name, String email, char gender) {
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
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + gender + ") at " + email;
    }
}
