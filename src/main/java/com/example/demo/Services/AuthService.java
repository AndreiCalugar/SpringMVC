package com.example.demo.Services;

import com.example.demo.Models.App;
import org.apache.tomcat.util.http.HeaderUtil;
import org.springframework.http.RequestEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;

public class AuthService {
    //create the login page url

    public String GetAuthenticationRequest(App app){
        var authUrl =app.getAuthorizationEndpoint();
        var state =GetRandomString(12);
        var redirectUri = new URL(app.setRedirectUrls(););
    }


    private HeaderUtil getBasicAuthHeader(){

    }

    static String GetRandomString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"
                +"~!@#$%^&*";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    private void GetBasicAuthHeader(String clientId,String secret) throws IOException {
        // add url name
        URL url = new URL("http://ip:port/login");
        String encoding = Base64.getEncoder().encodeToString(("test1:test1").getBytes(StandardCharsets.UTF_8));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization", "Basic " + encoding);
        InputStream content = (InputStream) connection.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(content));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
    }
}
