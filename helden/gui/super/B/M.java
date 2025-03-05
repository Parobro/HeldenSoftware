/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.gui.oooo_1;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class M
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<F, JButton> \u00d400000 = new HashMap<F, JButton>();
    private Map<JButton, F> Object = new HashMap<JButton, F>();
    private F \u00d200000;
    private ActionListener o00000;
    private helden.framework.held.object.oooo_1 \u00d500000;

    public M(ActionListener actionListener) {
        this.o00000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.\u00d200000;
    }

    public F super(JButton jButton) {
        return this.Object.get(jButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.\u00d200000 = object == null ? (F)jTable.getValueAt(n, n2) : (F)object;
        JButton jButton = this.super(this.\u00d200000);
        if (this.\u00d500000.\u00d800000().o00000(0).\u00d200000(this.\u00d200000) || this.\u00d500000.\u00d800000().o00000(1).\u00d200000(this.\u00d200000) || this.\u00d500000.\u00d800000().o00000(2).\u00d200000(this.\u00d200000)) {
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
        if (this.\u00d500000.\u00d800000().o00000(0).\u00d200000(f2) || this.\u00d500000.\u00d800000().o00000(1).\u00d200000(f2) || this.\u00d500000.\u00d800000().o00000(2).\u00d200000(f2)) {
            jButton.setEnabled(false);
        } else {
            jButton.setEnabled(true);
        }
        return jButton;
    }

    public void super(helden.framework.held.object.oooo_1 oooo_12) {
        this.\u00d500000 = oooo_12;
    }

    private JButton super(F f2) {
        JButton jButton = this.\u00d400000.get(f2);
        if (jButton == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/miniDelete.gif")));
            jButton = new JButton(imageIcon);
            jButton.setName(f2.toString());
            jButton.addActionListener(this.o00000);
            this.\u00d400000.put(f2, jButton);
            this.Object.put(jButton, f2);
        }
        return jButton;
    }
}

