package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Token {
    public LocalDateTime IssueTime= LocalDateTime.now();

    @JsonProperty("access_token")
    private String AccessToken;

    @JsonProperty("token_type")
    private String TokenType;

    @JsonProperty("expires_in")
    private String ExpiresIn;

    @JsonProperty("refresh_token")
    private String RefreshToken;

    @JsonProperty("refresh_toke_expires_in")
    private String RefreshTokenExpiresIn;

    public Token(String accessToken,String tokenType,String expiresIn, String refreshToken, String refreshTokenExpiresIn) {
        AccessToken=accessToken;
        TokenType=tokenType;
        ExpiresIn=expiresIn;
        RefreshToken=refreshToken;
        RefreshTokenExpiresIn = refreshTokenExpiresIn;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public String getTokenType() {
        return TokenType;
    }

    public void setTokenType(String tokenType) {
        TokenType = tokenType;
    }

    public String getExpiresIn() {
        return ExpiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        ExpiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return RefreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        RefreshToken = refreshToken;
    }

    public String getRefreshTokenExpiresIn() {
        return RefreshTokenExpiresIn;
    }

    public void setRefreshTokenExpiresIn(String refreshTokenExpiresIn) {
        RefreshTokenExpiresIn = refreshTokenExpiresIn;
    }
}
