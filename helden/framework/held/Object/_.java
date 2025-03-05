/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.held.Object.private;
import helden.framework.oooo.oooo_2;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public final class _ {
    public static HashMap<oooo_2, Integer> o00000() {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("helden/framework/p.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        }
        catch (IOException iOException) {
            private.\u00d200000("helden/framework/p.properties nicht gefunden", "maik");
        }
        HashMap<oooo_2, Integer> hashMap = new HashMap<oooo_2, Integer>();
        for (Object k2 : properties.keySet()) {
            String[] stringArray;
            Integer n = Integer.valueOf(k2.toString());
            for (String string : stringArray = properties.getProperty(k2.toString()).split(";")) {
                if (string.length() <= 5) continue;
                hashMap.put(oooo_2.o00000(string), n);
            }
        }
        return hashMap;
    }

    private _() {
    }
}

