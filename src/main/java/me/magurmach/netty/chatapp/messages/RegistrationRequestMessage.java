package me.magurmach.netty.chatapp.messages;

import java.io.Serializable;
import java.net.SocketAddress;

/**
 * Created by Shakib Ahmed on 12/27/17.
 */
public class RegistrationRequestMessage implements Serializable {
    private int id = 3;

    private String userHandle;

    public int getId() {
        return id;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }
}
