package wk3.activity1.sessions_tokens_hashing.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionModel {
    private String email;
    private String sessionID;

    @JsonCreator
    public SessionModel(
            @JsonProperty(value = "email", required = true) String email,
            @JsonProperty(value = "sessionID", required = true) String sessionID ) {
        this.email = email;
        this.sessionID = sessionID;
    }

    @Override
    public String toString() {
        return "Email: " + email + ", SessionID: " + sessionID;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("sessionID")
    public String getSessionID() {
        return sessionID;
    }
}
