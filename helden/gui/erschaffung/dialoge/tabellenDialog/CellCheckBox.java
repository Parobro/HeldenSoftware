/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJCheckBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CellCheckBox
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, ExtJCheckBox> \u00d400000 = new HashMap<Object, ExtJCheckBox>();
    private Map<ExtJCheckBox, Object> \u00d300000 = new HashMap<ExtJCheckBox, Object>();
    private Object super;
    private SpaltenDefinition \u00d200000;

    public CellCheckBox(SpaltenDefinition spaltenDefinition) {
        this.\u00d200000 = spaltenDefinition;
    }

    public void check() {
        this.\u00d400000 = new HashMap<Object, ExtJCheckBox>();
        this.\u00d300000 = new HashMap<ExtJCheckBox, Object>();
    }

    public JCheckBox getButton(Object object) {
        if (object == null) {
            return null;
        }
        ExtJCheckBox extJCheckBox = this.\u00d400000.get(object);
        if (extJCheckBox == null) {
            extJCheckBox = new ExtJCheckBox();
            extJCheckBox.setName(object.toString());
            extJCheckBox.addActionListener(this.\u00d200000);
            extJCheckBox.setPayLoad(object);
            this.\u00d400000.put(object, extJCheckBox);
            this.\u00d300000.put(extJCheckBox, object);
            extJCheckBox.setSelected(this.\u00d200000.getSelected(object));
            extJCheckBox.setEnabled(this.\u00d200000.isEnabled(object));
        }
        return extJCheckBox;
    }

    @Override
    public Object getCellEditorValue() {
        return this.super;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.super = object;
        return this.\u00d400000.get(this.super);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Object object2 = object;
        return this.getButton(object2);
    }

    public Object getTalent(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    public void setController(SpaltenDefinition spaltenDefinition) {
        this.\u00d200000 = spaltenDefinition;
    }
}

