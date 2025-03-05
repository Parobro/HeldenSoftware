/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.gui.oooo_1;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class JScrollPaneFast
extends JScrollPane {
    public JScrollPaneFast() {
        this.o00000();
    }

    public JScrollPaneFast(Component component) {
        super(component);
        this.o00000();
    }

    private void o00000() {
        this.getHorizontalScrollBar().setUnitIncrement(10);
        this.getVerticalScrollBar().setUnitIncrement(10);
        this.getVerticalScrollBar().setPreferredSize(new Dimension(oooo_1.o00000(15), 0));
        this.getHorizontalScrollBar().setPreferredSize(new Dimension(0, oooo_1.o00000(15)));
    }
}

