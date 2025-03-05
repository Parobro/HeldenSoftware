/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.super;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class super
implements ListCellRenderer {
    private DefaultListCellRenderer o00000 = new DefaultListCellRenderer();
    private int \u00d200000 = 50;

    public super() {
    }

    public super(int n) {
        this.\u00d200000 = n;
    }

    public Component getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
        JLabel jLabel = (JLabel)this.o00000.getListCellRendererComponent((JList<?>)jList, object, n, bl, bl2);
        if (object != null && object.toString().length() > this.\u00d200000) {
            jLabel.setText(object.toString().substring(0, this.\u00d200000 - 2) + "...");
        }
        if (object != null && -1 < n) {
            jList.setToolTipText(object.toString());
        }
        return jLabel;
    }
}

