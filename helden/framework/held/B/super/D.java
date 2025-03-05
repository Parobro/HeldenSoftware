/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class D {
    private static final String[][] \u00d200000 = new String[][]{{"&", "&amp;"}, {"<", "&lt;"}, {">", "&gt;"}, {"\u00e4", "&auml;"}, {"\u00c4", "&Auml;"}, {"\u00f6", "&ouml;"}, {"\u00d6", "&Ouml;"}, {"\u00fc", "&uuml;"}, {"\u00dc", "&Uuml;"}, {"\u00df", "&szlig;"}};
    private static final List<Pattern> o00000 = new ArrayList<Pattern>(\u00d200000.length);

    public static String o00000(String string) {
        for (int i2 = 0; i2 < o00000.size(); ++i2) {
            Pattern pattern = o00000.get(i2);
            String string2 = \u00d200000[i2][1];
            string = pattern.matcher(string).replaceAll(string2);
        }
        return string;
    }

    private D() {
    }

    static {
        for (String[] stringArray : \u00d200000) {
            String string = stringArray[0];
            o00000.add(Pattern.compile(string));
        }
    }
}

