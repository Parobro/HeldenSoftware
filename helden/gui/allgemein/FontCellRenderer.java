/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FontCellRenderer
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Component component = super.getTableCellRendererComponent(jTable, "\u00c4\u00d6\u00dc \u00f6\u00e4\u00fc\u00df abcdefghijklmnopqrstuvwxyz", bl, bl2, n, n2);
        if (object != null) {
            component.setFont(((Font)object).deriveFont(15.0f));
        }
        return component;
    }
}

