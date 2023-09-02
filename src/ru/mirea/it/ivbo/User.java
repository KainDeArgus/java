package ru.mirea.it.ivbo;

public class User {
    private String username = "def";
    private String password = "def";
    public User(String user, String pass){
        username = user;
        password = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
