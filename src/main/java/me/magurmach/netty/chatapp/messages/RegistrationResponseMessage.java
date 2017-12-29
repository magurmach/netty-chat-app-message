package me.magurmach.netty.chatapp.messages;

/**
 * Created by Shakib Ahmed on 12/27/17.
 */
public class RegistrationResponseMessage {
    private int id = 4;

    private String token;
    private String message;

    public int getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}