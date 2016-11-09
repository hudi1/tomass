package org.tahom.processor.util;

import java.security.MessageDigest;

public class TournamentUtil {

    public static final String ALGORITHM_SHA = "SHA-512";

    public static String encryptUserPassword(String password) {
        try {
            final MessageDigest md = MessageDigest.getInstance(ALGORITHM_SHA);
            md.update(password.getBytes("UTF-8"));
            byte[] securePassword = md.digest();
            return bytes2hex(securePassword);
        } catch (Exception e) {
            // logger.error("!! ERROR encrypt password", e);
            throw new RuntimeException(e);
        }
    }

    public static String bytes2hex(byte[] value) {
        if (value == null)
            return null;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            if ((value[i] <= 0x0F) && (value[i] >= 0))
                result.append('0');
            result.append(Integer.toHexString(value[i] & 0xFF));
        }
        return result.toString();
    }

}
