package wk3.activity1.sessions_tokens_hashing.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionRequestModel {
    private String email;

    @JsonCreator
    public SessionRequestModel(@JsonProperty(value = "email", required = true) String email) {
        this.email = email;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }
}
