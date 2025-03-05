/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.oooo.b_0;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class E
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<String, JSpinner> String = new HashMap<String, JSpinner>();
    private Map<JSpinner, String> \u00d300000 = new HashMap<JSpinner, String>();
    private String o00000;
    private ChangeListener \u00d200000;

    public E(ChangeListener changeListener) {
        this.\u00d200000 = changeListener;
    }

    public JSpinner new(String string) {
        JSpinner jSpinner = this.String.get(string);
        if (jSpinner == null) {
            jSpinner = new JSpinner();
            jSpinner.setName(string.toString());
            jSpinner.addChangeListener(this.\u00d200000);
            this.String.put(string, jSpinner);
            this.\u00d300000.put(jSpinner, string);
        }
        return jSpinner;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    public Component o00000(String string) {
        boolean bl = false;
        if (string.endsWith("-medi") && !string.startsWith(b_0.\u00d4\u00f5\u00d2000.toString()) && !string.startsWith(b_0.\u00f4\u00f5\u00d2000.toString())) {
            bl = true;
        }
        if (string.equals("")) {
            bl = true;
        }
        if (bl) {
            return new JLabel("");
        }
        return this.String.get(string);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = (String)object;
        return this.o00000(this.o00000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        return this.o00000((String)object);
    }

    public String o00000(JSpinner jSpinner) {
        return this.\u00d300000.get(jSpinner);
    }
}

