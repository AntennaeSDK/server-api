package org.antennae.common.messages;

import com.google.gson.Gson;

/**
 * Created by snambi on 6/23/16.
 */
public class ClientMessageWrapper {

    private ClientMessage clientMessage;

    // these identify the nodeId + sessionid that has the persistent connection to the client
    // if these are null, then a discovery needs to be made
    private String sessionId;
    private String nodeId;

    public ClientMessage getClientMessage() {
        return clientMessage;
    }
    public void setClientMessage(ClientMessage clientMessage) {
        this.clientMessage = clientMessage;
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

    public static ClientMessageWrapper fromJson(String value ){
        Gson gson = new Gson();
        ClientMessageWrapper message = gson.fromJson( value, ClientMessageWrapper.class);
        return message;
    }
}
