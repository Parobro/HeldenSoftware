/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CellJPanel
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, JPanel> \u00d400000 = new HashMap<Object, JPanel>();
    private Map<JPanel, Object> \u00d300000 = new HashMap<JPanel, Object>();
    private Object o00000;
    private SpaltenDefinition new;

    public CellJPanel(SpaltenDefinition spaltenDefinition) {
        this.new = spaltenDefinition;
    }

    public void check() {
        this.\u00d400000 = new HashMap<Object, JPanel>();
        this.\u00d300000 = new HashMap<JPanel, Object>();
    }

    public JPanel getButton(Object object) {
        if (object == null) {
            return null;
        }
        JPanel jPanel = this.\u00d400000.get(object);
        if (jPanel == null) {
            jPanel = this.new.getPanel(object);
            this.\u00d400000.put(object, jPanel);
            this.\u00d300000.put(jPanel, object);
        }
        return jPanel;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = object;
        return this.\u00d400000.get(this.o00000);
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
        this.new = spaltenDefinition;
    }
}

