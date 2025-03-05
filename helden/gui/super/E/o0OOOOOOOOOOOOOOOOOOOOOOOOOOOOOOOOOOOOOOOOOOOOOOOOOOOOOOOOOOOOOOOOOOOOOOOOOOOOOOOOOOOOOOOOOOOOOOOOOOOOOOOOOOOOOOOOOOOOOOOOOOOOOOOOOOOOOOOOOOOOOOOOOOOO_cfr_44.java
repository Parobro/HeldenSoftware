/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.E;

import helden.framework.OoOO.voidsuper;
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
public class o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<voidsuper, JButton> \u00d400000 = new HashMap<voidsuper, JButton>();
    private Map<JButton, voidsuper> Object = new HashMap<JButton, voidsuper>();
    private voidsuper o00000;
    private ActionListener \u00d200000;

    public o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(ActionListener actionListener) {
        this.\u00d200000 = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = (voidsuper)object;
        return this.\u00d400000.get(this.o00000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        voidsuper voidsuper2 = null;
        voidsuper2 = object == null ? (voidsuper)jTable.getValueAt(n, n2) : (voidsuper)object;
        return this.super(voidsuper2);
    }

    public voidsuper super(JButton jButton) {
        return this.Object.get(jButton);
    }

    private JButton super(voidsuper voidsuper2) {
        JButton jButton = this.\u00d400000.get(voidsuper2);
        if (jButton == null) {
            jButton = new JButton("+");
            jButton.setName(voidsuper2.toString());
            jButton.addActionListener(this.\u00d200000);
            this.\u00d400000.put(voidsuper2, jButton);
            this.Object.put(jButton, voidsuper2);
        }
        return jButton;
    }
}

