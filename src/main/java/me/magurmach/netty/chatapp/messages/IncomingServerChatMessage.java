package me.magurmach.netty.chatapp.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shakib Ahmed on 12/27/17.
 */
public class IncomingServerChatMessage implements Serializable {
    private int id = 1;

    private List<String> destinationHandles;
    private String message;

    public int getId() {
        return id;
    }

    public IncomingServerChatMessage() {
        destinationHandles = new ArrayList<>();
    }

    public void addDestinationHandle(String handle) {
        destinationHandles.add(handle);
    }

    public List<String> getDestinationHandles() {
        return destinationHandles;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
