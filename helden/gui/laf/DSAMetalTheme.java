/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.laf;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

public class DSAMetalTheme
extends DefaultMetalTheme {
    private static final ColorUIResource \u00d500000 = new ColorUIResource(147, 0, 0);
    private static final ColorUIResource Object = new ColorUIResource(252, 132, 129);
    private static final ColorUIResource o00000 = new ColorUIResource(249, 170, 166);
    private static final ColorUIResource \u00d600000 = new ColorUIResource(192, 156, 56);
    private static final ColorUIResource \u00d400000 = new ColorUIResource(213, 181, 96);
    private static final ColorUIResource \u00d200000 = new ColorUIResource(233, 216, 171);

    @Override
    protected ColorUIResource getPrimary1() {
        return \u00d500000;
    }

    @Override
    protected ColorUIResource getPrimary2() {
        return Object;
    }

    @Override
    protected ColorUIResource getPrimary3() {
        return o00000;
    }

    @Override
    protected ColorUIResource getSecondary1() {
        return \u00d600000;
    }

    @Override
    protected ColorUIResource getSecondary2() {
        return \u00d400000;
    }

    @Override
    protected ColorUIResource getSecondary3() {
        return \u00d200000;
    }
}

