/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.F;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class H
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<F, JButton> Object = new HashMap<F, JButton>();
    private F \u00d200000;
    private ActionListener o00000;

    public H(ActionListener actionListener) {
        this.o00000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.\u00d200000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        F f2 = null;
        f2 = object == null ? (F)jTable.getValueAt(n, n2) : (F)object;
        this.\u00d200000 = f2;
        return this.Object.get(this.\u00d200000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        F f2 = null;
        f2 = object == null ? (F)jTable.getValueAt(n, n2) : (F)object;
        return this.o00000(f2);
    }

    private JButton o00000(F f2) {
        JButton jButton = this.Object.get(f2);
        if (jButton == null) {
            jButton = new JButton("I");
            jButton.setName(f2.toString());
            jButton.setText("I");
            jButton.addActionListener(this.o00000);
            jButton.setEnabled(false);
            this.Object.put(f2, jButton);
        }
        return jButton;
    }
}

