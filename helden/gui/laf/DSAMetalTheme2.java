/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.laf;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DSAMetalTheme2
extends DefaultMetalTheme {
    private static final int[] \u00f600000 = new int[]{1, 0, 0, 1, 1, 0};
    private static final int[] \u00f400000 = new int[]{14, 14, 14, 14, 14, 12};
    private static FontUIResource[] \u00f500000 = new FontUIResource[6];
    private static final ColorUIResource void = new ColorUIResource(147, 0, 0);
    private static final ColorUIResource \u00d600000 = new ColorUIResource(252, 132, 129);
    private static final ColorUIResource \u00d500000 = new ColorUIResource(249, 170, 166);
    private static final ColorUIResource \u00d400000 = new ColorUIResource(192, 156, 56);
    private static final ColorUIResource \u00d200000 = new ColorUIResource(213, 181, 96);
    private static final ColorUIResource o00000 = new ColorUIResource(233, 216, 171);
    private static Font Object;

    @Override
    public FontUIResource getControlTextFont() {
        return this.o00000(0);
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return this.o00000(3);
    }

    @Override
    public FontUIResource getSubTextFont() {
        return this.o00000(5);
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return this.o00000(1);
    }

    @Override
    public FontUIResource getUserTextFont() {
        return this.o00000(2);
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return this.o00000(4);
    }

    @Override
    protected ColorUIResource getPrimary1() {
        return void;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return \u00d600000;
    }

    @Override
    protected ColorUIResource getPrimary3() {
        return \u00d500000;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return \u00d400000;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        return \u00d200000;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        return o00000;
    }

    private FontUIResource o00000(int n) {
        if (\u00f500000[n] == null) {
            if (Object == null) {
                try {
                    Object = Font.createFont(0, Thread.currentThread().getContextClassLoader().getResourceAsStream("fonts/blackchancery.ttf"));
                }
                catch (FontFormatException fontFormatException) {
                    fontFormatException.printStackTrace();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            Font font = Object.deriveFont(\u00f600000[n], \u00f400000[n]);
            DSAMetalTheme2.\u00f500000[n] = new FontUIResource(font);
        }
        return \u00f500000[n];
    }
}

