/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.object;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.held.Object.ooOo
 */
public final class oooo_3 {
    private static final byte[] o00000 = new byte[]{121, -125, -39, -71, 1, -56, -45, -68};

    public static byte[] super(byte[] byArray) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        SecretKeySpec secretKeySpec = new SecretKeySpec(o00000, "DES");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(byArray);
    }

    public static byte[] \u00d200000(byte[] byArray) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        SecretKeySpec secretKeySpec = new SecretKeySpec(o00000, "DES");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(byArray);
    }

    private oooo_3() {
    }
}

