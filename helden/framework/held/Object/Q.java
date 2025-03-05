/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Q {
    public static String o00000(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte by : byArray) {
            String string = Integer.toHexString(0xFF & by);
            while (string.length() < 2) {
                string = "0" + string;
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String o00000(File file) {
        String string = "";
        InputStream inputStream = null;
        try {
            if (!file.exists() || file.isDirectory()) {
                String string2 = "File not found";
                return string2;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            inputStream = new FileInputStream(file);
            byte[] byArray = new byte[8192];
            int n = 0;
            while ((n = inputStream.read(byArray)) > 0) {
                messageDigest.update(byArray, 0, n);
            }
            byte[] byArray2 = messageDigest.digest();
            BigInteger bigInteger = new BigInteger(1, byArray2);
            string = bigInteger.toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return string;
    }

    public static String o00000(String string, Charset charset) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes(charset));
            byte[] byArray = messageDigest.digest();
            return Q.o00000(byArray);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return "????????????????";
        }
    }

    public static String o00000(String string) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        messageDigest.update(string.getBytes("UTF-8"));
        byte[] byArray = messageDigest.digest();
        return Q.o00000(byArray);
    }

    private Q() {
    }
}

