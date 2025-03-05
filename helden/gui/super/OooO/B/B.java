/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.oOoO.B;

import helden.framework.D.P;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class B
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<P, JButton> \u00d400000;
    private P Object;
    private ActionListener o00000;
    private Map<JButton, P> \u00d200000 = new HashMap<JButton, P>();

    public B(ActionListener actionListener) {
        this.\u00d400000 = new HashMap<P, JButton>();
        this.o00000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.Object;
    }

    public P o00000(JButton jButton) {
        return this.\u00d200000.get(jButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.Object = (P)object;
        return this.\u00d400000.get(this.Object);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        P p2 = null;
        p2 = object == null ? (P)jTable.getValueAt(n, n2) : (P)object;
        JButton jButton = this.o00000(p2);
        return jButton;
    }

    private JButton o00000(P p2) {
        JButton jButton = this.\u00d400000.get(p2);
        if (jButton == null) {
            jButton = new JButton("i");
            jButton.setName(p2.toString());
            jButton.setText("i");
            jButton.addActionListener(this.o00000);
            this.\u00d400000.put(p2, jButton);
            this.\u00d200000.put(jButton, p2);
        }
        return jButton;
    }
}

