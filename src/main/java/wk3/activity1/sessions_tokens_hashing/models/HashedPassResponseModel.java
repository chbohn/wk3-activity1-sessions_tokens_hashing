package wk3.activity1.sessions_tokens_hashing.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HashedPassResponseModel {
    private String password;
    private String hashedPassword;

    @JsonCreator
    public HashedPassResponseModel(
            @JsonProperty(value = "password", required = true) String password,
            @JsonProperty(value = "hashedPassword", required = true) String hashedPassword) {
        this.password = password;
        this.hashedPassword = hashedPassword;
    }

    @JsonProperty
    public String getPassword() {
        return password;
    }

    @JsonProperty
    public String getHashedPassword() {
        return hashedPassword;
    }
}
