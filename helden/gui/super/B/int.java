/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.A;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class int
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<F, JButton> \u00d400000 = new HashMap<F, JButton>();
    private Map<JButton, F> \u00d300000 = new HashMap<JButton, F>();
    private F new;
    private ActionListener o00000;

    public int(ActionListener actionListener) {
        this.o00000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.new;
    }

    public F o00000(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.new = (F)object;
        JButton jButton = this.o00000(this.new);
        if (this.new.\u00f500000() < 10000) {
            jButton.setEnabled(true);
        } else {
            jButton.setEnabled(false);
        }
        return jButton;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        F f2 = null;
        f2 = object == null ? (F)jTable.getValueAt(n, n2) : (F)object;
        JButton jButton = this.o00000(f2);
        if (f2.\u00f500000() < 1000 && f2.\u00d400000(A.\u00d400000).size() == 0) {
            jButton.setEnabled(true);
        } else {
            jButton.setEnabled(false);
        }
        return jButton;
    }

    private JButton o00000(F f2) {
        JButton jButton = this.\u00d400000.get(f2);
        if (jButton == null) {
            jButton = new JButton("+");
            jButton.setName(f2.toString());
            jButton.addActionListener(this.o00000);
            this.\u00d400000.put(f2, jButton);
            this.\u00d300000.put(jButton, f2);
        }
        return jButton;
    }
}

