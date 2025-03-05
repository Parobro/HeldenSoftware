/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import java.awt.Font;
import java.util.Set;
import javax.swing.UIManager;

/*
 * Renamed from helden.gui.oooO
 */
public class oooo_1 {
    private static float o00000 = 1.0f;

    public static String o00000(String string) {
        if (o00000 == 1.0f) {
            return string;
        }
        String string2 = string.substring(0, string.lastIndexOf(".")) + "2X" + string.substring(string.lastIndexOf("."), string.length());
        if (Thread.currentThread().getContextClassLoader().getResource(string2) != null) {
            return string2;
        }
        return string;
    }

    public static int o00000(int n) {
        return (int)((float)n * o00000);
    }

    public static void o00000() {
        if (o00000 != 1.0f) {
            Object[] objectArray;
            Set set = UIManager.getLookAndFeelDefaults().keySet();
            for (Object object : objectArray = set.toArray(new Object[set.size()])) {
                if (object == null || !object.toString().toLowerCase().contains("font") || !object.toString().endsWith(".font")) continue;
                Font font = UIManager.getFont(object);
                Font font2 = font.deriveFont(o00000 * font.getSize2D());
                UIManager.put(object, font2);
            }
        }
    }

    public static void o00000(boolean bl) {
        o00000 = bl ? 2.0f : 1.0f;
    }
}

