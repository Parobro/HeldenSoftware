/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

public class interfacesuper
extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        JTextArea jTextArea = new JTextArea((String)object, 2, 1);
        jTextArea.setFont(jTable.getFont());
        jTextArea.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
        jTextArea.setOpaque(false);
        return jTextArea;
    }
}

