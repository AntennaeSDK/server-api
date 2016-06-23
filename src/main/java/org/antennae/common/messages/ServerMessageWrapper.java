package org.antennae.common.messages;

import com.google.gson.Gson;

/**
 * Created by snambi on 6/22/16.
 */
public class ServerMessageWrapper {

    private ServerMessage serverMessage;

    private String sessionId;
    private String nodeId;

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
    public String getNodeId() {
        return nodeId;
    }
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }


    public String toJson(){
        Gson gson = new Gson();
        String result = gson.toJson(this);
        return result;
    }

    public static ServerMessageWrapper fromJson(String value ){
        Gson gson = new Gson();
        ServerMessageWrapper message = gson.fromJson( value, ServerMessageWrapper.class);
        return message;
    }
}
