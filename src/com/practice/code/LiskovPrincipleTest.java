package com.practice.code;

public class LiskovPrincipleTest {

    public static void main(String args[]) {
        Facebook s = new Facebook();
        WhatsApp s1 = new WhatsApp();

        SocialMediaGroupVideoCallManager s2 = s1;


    }



}
