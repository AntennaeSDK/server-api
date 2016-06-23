package org.antennae.common.messages;

import com.google.gson.Gson;

/**
 * Created by snambi on 6/22/16.
 */
public class ServerTrackedMessage {

    private ServerMessage serverMessage;
    private String sessionId;
    private String ipAddress;

    public ServerMessage getServerMessage() {
        return serverMessage;
    }
    public void setServerMessage(ServerMessage serverMessage) {
        this.serverMessage = serverMessage;
    }
    public String getSessionId() {
        return sessionId;
    }
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public String toJson(){
        Gson gson = new Gson();
        String result = gson.toJson(this);
        return result;
    }

    public static ServerTrackedMessage fromJson( String value ){
        Gson gson = new Gson();
        ServerTrackedMessage message = gson.fromJson( value, ServerTrackedMessage.class);
        return message;
    }
}
