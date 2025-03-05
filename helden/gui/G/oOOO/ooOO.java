/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.oOOO;

import helden.gui.G.k;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ooOO
implements ListCellRenderer {
    private ListCellRenderer o00000 = new DefaultListCellRenderer();

    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        StringBuffer stringBuffer = new StringBuffer(k.super(object));
        return this.o00000.getListCellRendererComponent(jList, stringBuffer, n, bl, bl2);
    }
}

