/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

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
public class F<T>
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private String \u00d200000;
    private Map<T, JButton> \u00d500000 = new HashMap<T, JButton>();
    private Map<JButton, T> \u00d400000 = new HashMap<JButton, T>();
    private T o00000;
    private ActionListener Object;

    public F(ActionListener actionListener, String string) {
        this.Object = actionListener;
        this.\u00d200000 = string;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = object;
        return this.\u00d500000.get(this.o00000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Object object2 = null;
        object2 = object == null ? jTable.getValueAt(n, n2) : object;
        return this.super(object2);
    }

    public T super(JButton jButton) {
        return this.\u00d400000.get(jButton);
    }

    private JButton super(T t) {
        JButton jButton = this.\u00d500000.get(t);
        if (jButton == null) {
            jButton = new JButton(this.\u00d200000);
            jButton.setName(t.toString());
            jButton.addActionListener(this.Object);
            this.\u00d500000.put(t, jButton);
            this.\u00d400000.put(jButton, t);
        }
        return jButton;
    }
}

