/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListCellRendererWithToolTip
implements ListCellRenderer {
    private ListCellRenderer o00000;

    public ListCellRendererWithToolTip(ListCellRenderer listCellRenderer) {
        this.o00000 = listCellRenderer;
    }

    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        Component component = this.o00000.getListCellRendererComponent(jList, object, n, bl, bl2);
        String string = object.toString();
        component.setForeground(Color.BLACK);
        ((JComponent)component).setToolTipText(string);
        return component;
    }
}

