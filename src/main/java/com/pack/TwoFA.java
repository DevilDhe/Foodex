package com.pack;

import org.apache.commons.codec.binary.Base32;

import java.security.SecureRandom;

public class TwoFA {
    public static String generateSecretKey() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[20];
        random.nextBytes(bytes);
        Base32 base32 = new Base32();
        return base32.encodeToString(bytes);
    }

//    public static String getTOTPCode(String secretKey) {
//        Base32 base32 = new Base32();
//        byte[] bytes = base32.decode(secretKey);
//        String hexKey = Hex.encodeHexString(bytes);
//        return TOTP.getOTP(hexKey);
//    }

//    String secretKey = "";
//    String lastCode = null;
//
//    while(true) {
//        String code = getTOTPCode(secretKey);
//        if (!code.equals(lastCode)) {
//            System.out.println(code);
//        }
//        lastCode = code;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {};
//    }
}
