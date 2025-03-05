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
public class DSAMetalTheme3
extends DefaultMetalTheme {
    private static final int[] if = new int[]{1, 0, 0, 1, 1, 0};
    private static final int[] \u00f400000 = new int[]{14, 14, 14, 14, 14, 12};
    private static FontUIResource[] \u00f500000 = new FontUIResource[6];
    private static final ColorUIResource \u00d800000 = new ColorUIResource(147, 0, 0);
    private static final ColorUIResource return = new ColorUIResource(252, 132, 129);
    private static final ColorUIResource \u00d500000 = new ColorUIResource(249, 170, 166);
    private static final ColorUIResource \u00d400000 = new ColorUIResource(192, 156, 56);
    private static final ColorUIResource new = new ColorUIResource(213, 181, 96);
    private static final ColorUIResource o00000 = new ColorUIResource(233, 216, 171);
    private static Font \u00d300000;

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
        return \u00d800000;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return return;
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
        return new;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        return o00000;
    }

    private FontUIResource o00000(int n) {
        if (\u00f500000[n] == null) {
            if (\u00d300000 == null) {
                try {
                    \u00d300000 = Font.createFont(0, Thread.currentThread().getContextClassLoader().getResourceAsStream("fonts/Envision_Roman.ttf"));
                }
                catch (FontFormatException fontFormatException) {
                    fontFormatException.printStackTrace();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
            Font font = \u00d300000.deriveFont(if[n], \u00f400000[n]);
            DSAMetalTheme3.\u00f500000[n] = new FontUIResource(font);
        }
        return \u00f500000[n];
    }
}

