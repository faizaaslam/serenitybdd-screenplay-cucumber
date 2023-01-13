package screenplay.model;

public enum Users {
    STANDARD_USER("standard_user","secret_sauce");

    public final String username;
    public final String password;

    public String username() {
        return username;
    }
    public String password() {
        return password;
    }


    Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
