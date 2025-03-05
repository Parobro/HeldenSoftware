/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

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
public class D
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<F, JButton> String = new HashMap<F, JButton>();
    private Map<JButton, F> \u00d300000 = new HashMap<JButton, F>();
    private F \u00d200000;
    private ActionListener o00000;

    public D(ActionListener actionListener) {
        this.o00000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.\u00d200000;
    }

    public F super(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.\u00d200000 = object == null ? (F)jTable.getValueAt(n, n2) : (F)object;
        JButton jButton = this.super(this.\u00d200000);
        if (this.\u00d200000.\u00f500000() <= 1) {
            jButton.setEnabled(false);
        } else {
            jButton.setEnabled(true);
        }
        return jButton;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        F f2 = null;
        f2 = object == null ? (F)jTable.getValueAt(n, n2) : (F)object;
        JButton jButton = this.super(f2);
        if (f2.\u00f500000() <= 1) {
            jButton.setEnabled(false);
        } else {
            jButton.setEnabled(true);
        }
        return jButton;
    }

    private JButton super(F f2) {
        JButton jButton = this.String.get(f2);
        if (jButton == null) {
            jButton = new JButton("-");
            jButton.setName(f2.toString());
            jButton.addActionListener(this.o00000);
            this.String.put(f2, jButton);
            this.\u00d300000.put(jButton, f2);
        }
        return jButton;
    }
}

