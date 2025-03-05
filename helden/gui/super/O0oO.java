/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.oooo.oo0o_0;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class O0oO
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<oo0o_0, JButton> String = new HashMap<oo0o_0, JButton>();
    private Map<JButton, oo0o_0> \u00d300000 = new HashMap<JButton, oo0o_0>();
    private oo0o_0 o00000;
    private ActionListener \u00d200000;

    public O0oO(ActionListener actionListener) {
        this.\u00d200000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = (oo0o_0)object;
        return this.String.get(this.o00000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        oo0o_0 oo0o_02 = null;
        oo0o_02 = object == null ? (oo0o_0)jTable.getValueAt(n, n2) : (oo0o_0)object;
        return this.o00000(oo0o_02);
    }

    public oo0o_0 o00000(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    private JButton o00000(oo0o_0 oo0o_02) {
        JButton jButton = this.String.get(oo0o_02);
        if (jButton == null) {
            jButton = new JButton("+1");
            jButton.setName(oo0o_02.toString());
            jButton.addActionListener(this.\u00d200000);
            this.String.put(oo0o_02, jButton);
            this.\u00d300000.put(jButton, oo0o_02);
            jButton.setEnabled(!oo0o_02.isMetatalent());
        }
        return jButton;
    }
}

