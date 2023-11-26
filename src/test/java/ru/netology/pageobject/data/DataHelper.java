package ru.netology.pageobject.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {

    private DataHelper() {
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    @Value
    public static class CardInfo {
         String cardNumber;
         String testId;
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }
    /////********************************************


    public static CardInfo getFirstCardInfo() {
        return new CardInfo("5559000000000001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559000000000002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

public  static int generateValidAmount(int balance){
        return new Random().nextInt(Math.abs(balance)) +1;
}

    public  static int generateInvalidAmount(int balance){
        return Math.abs(balance) + new Random().nextInt(10000);
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
///??????
//    public static int getBalanceOfFirstCardAfterTransfer(int balance, int amount) {
//        int newBalance = balance - amount;
//        return newBalance;
//
//    }
//
//    public static int getBalanceOfSecondCardAfterTransfer(int balance, int amount) {
//        int newBalance = balance + amount;
//        return newBalance;
//    }


}