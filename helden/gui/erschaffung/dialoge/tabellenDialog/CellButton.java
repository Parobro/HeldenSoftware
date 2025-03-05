/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJButton;
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
public class CellButton
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    public String \u00d400000;
    private Map<Object, ExtJButton> \u00d500000;
    private Map<ExtJButton, Object> \u00d300000;
    private Object o00000;
    private ActionListener new;

    public CellButton(ActionListener actionListener, String string) {
        this.\u00d400000 = string;
        this.\u00d500000 = new HashMap<Object, ExtJButton>();
        this.\u00d300000 = new HashMap<ExtJButton, Object>();
        this.new = actionListener;
    }

    public ExtJButton getButton(Object object) {
        if (object == null) {
            return null;
        }
        ExtJButton extJButton = this.\u00d500000.get(object);
        if (extJButton == null) {
            extJButton = new ExtJButton(this.\u00d400000);
            extJButton.setName(object.toString());
            extJButton.setPayLoad(object);
            extJButton.addActionListener(this.new);
            this.\u00d500000.put(object, extJButton);
            this.\u00d300000.put(extJButton, object);
        }
        return extJButton;
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
        Object object2 = object;
        return this.getButton(object2);
    }

    public Object getTalent(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    public void setController(ActionListener actionListener) {
        this.new = actionListener;
    }
}

