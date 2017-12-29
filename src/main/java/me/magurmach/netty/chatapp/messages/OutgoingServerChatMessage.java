package me.magurmach.netty.chatapp.messages;

import java.io.Serializable;

/**
 * Created by Shakib Ahmed on 12/27/17.
 */
public class OutgoingServerChatMessage implements Serializable {
    private int id = 2;

    private String sourceHandle;
    private String message;

    public int getId() {
        return id;
    }

    public String getSourceHandle() {
        return sourceHandle;
    }

    public void setSourceHandle(String sourceHandle) {
        this.sourceHandle = sourceHandle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
