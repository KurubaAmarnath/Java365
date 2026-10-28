final class UserProfile {
    private final String name;
    private final String email;

    public UserProfile(String name, String email) {
        this. name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class Oct28 {
    public static void main(String[] args) {
        UserProfile user = new UserProfile(
            "Amar",
            "amar@example.com"
        );

        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}
