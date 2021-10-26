package com.example.demo.Services;

import com.example.demo.Models.App;

import java.nio.charset.Charset;
import java.util.Random;

public class AuthService {
    //create the login page url

    public String GetAuthenticationRequest(App app){
        var authUrl =app.getAuthorizationEndpoint();
        var state =GetRandomString(12);

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
}
