package com.example.demo.Models;

public class App {
    private String AppName;
    private String AppKey;
    private String AppSecret;
    private String AuthorizationEndpoint;
    private String TokenEndpoint;
    private String GrantType;
    private String OpenApiBaseUrl;
    private String[] RedirectUrls;


    public App(String appName,String appKey,String appSecret,String authorizationEndpoint,String tokenEndpoint, String grantType, String openApiBaseUrl, String[] redirectUrls) {
        AppName=appName;
        AppKey=appKey;
        AppSecret =appSecret;
        AuthorizationEndpoint=authorizationEndpoint;
        TokenEndpoint = tokenEndpoint;
        GrantType = grantType;
        OpenApiBaseUrl = openApiBaseUrl;
        RedirectUrls = redirectUrls;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public String getAppKey() {
        return AppKey;
    }

    public void setAppKey(String appKey) {
        AppKey = appKey;
    }

    public String getAppSecret() {
        return AppSecret;
    }

    public void setAppSecret(String appSecret) {
        AppSecret = appSecret;
    }

    public String getAuthorizationEndpoint() {
        return AuthorizationEndpoint;
    }

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        AuthorizationEndpoint = authorizationEndpoint;
    }

    public String getTokenEndpoint() {
        return TokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        TokenEndpoint = tokenEndpoint;
    }

    public String getGrantType() {
        return GrantType;
    }

    public void setGrantType(String grantType) {
        GrantType = grantType;
    }

    public String getOpenApiBaseUrl() {
        return OpenApiBaseUrl;
    }

    public void setOpenApiBaseUrl(String openApiBaseUrl) {
        OpenApiBaseUrl = openApiBaseUrl;
    }

    public String[] getRedirectUrls() {
        return RedirectUrls;
    }

    public void setRedirectUrls(String[] redirectUrls) {
        RedirectUrls = redirectUrls;
    }
}
