/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.super;

import helden.framework.C.public;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<public, JButton> Object;
    private public \u00d200000;
    private ActionListener o00000;
    private Map<JButton, public> \u00d400000 = new HashMap<JButton, public>();

    public ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(ActionListener actionListener) {
        this.Object = new HashMap<public, JButton>();
        this.o00000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.\u00d200000;
    }

    public public o00000(JButton jButton) {
        return this.\u00d400000.get(jButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.\u00d200000 = (public)object;
        return this.Object.get(this.\u00d200000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        public public_ = null;
        public_ = object == null ? (public)jTable.getValueAt(n, n2) : (public)object;
        JButton jButton = this.o00000(public_);
        return jButton;
    }

    private JButton o00000(public public_) {
        JButton jButton = this.Object.get(public_);
        if (jButton == null) {
            jButton = new JButton("i");
            jButton.setName(public_.toString());
            jButton.setText("i");
            jButton.addActionListener(this.o00000);
            this.Object.put(public_, jButton);
            this.\u00d400000.put(jButton, public_);
        }
        return jButton;
    }
}

