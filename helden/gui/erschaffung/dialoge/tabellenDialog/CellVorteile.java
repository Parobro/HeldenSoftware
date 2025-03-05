/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.framework.C.D;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.held.Object.private;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJSpinner;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.super.F.A.B;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CellVorteile
extends B
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, ExtJComboBox> oO0000 = new HashMap<Object, ExtJComboBox>();
    private Map<Object, ExtJSpinner> \u00d2O0000 = new HashMap<Object, ExtJSpinner>();
    private Object float;
    private SpaltenDefinition OO0000;

    public CellVorteile(SpaltenDefinition spaltenDefinition) {
        this.OO0000 = spaltenDefinition;
    }

    public void check() {
        for (Map.Entry<Object, ExtJComboBox> object : this.oO0000.entrySet()) {
            object.getValue().invalidate();
        }
        this.oO0000.clear();
        for (Map.Entry<Object, ExtJSpinner> entry : this.\u00d2O0000.entrySet()) {
            ExtJSpinner extJSpinner = entry.getValue();
            extJSpinner.invalidate();
            entry.getValue().invalidate();
        }
        this.\u00d2O0000.clear();
    }

    public Component get(Object object) {
        if (object instanceof M || object instanceof D) {
            return this.oO0000.get(object);
        }
        if (object instanceof J) {
            return this.\u00d2O0000.get(object);
        }
        return new JLabel();
    }

    public Component getButton(Object object) {
        if (object == null) {
            JLabel jLabel = new JLabel("");
            jLabel.setOpaque(false);
            return jLabel;
        }
        if (object instanceof M || object instanceof D) {
            ExtJComboBox extJComboBox = this.oO0000.get(object);
            if (extJComboBox == null) {
                extJComboBox = new ExtJComboBox(this.OO0000, object);
                extJComboBox.setName(object.toString());
                int n = 0;
                int n2 = 0;
                for (Object object2 : this.OO0000.getItems(object)) {
                    if (object2 == null) continue;
                    if (object2.equals(this.OO0000.selectedItem(object))) {
                        n = n2;
                    }
                    extJComboBox.addItem(object2);
                    ++n2;
                }
                extJComboBox.addActionListener(this.OO0000);
                if (extJComboBox.getItemCount() > 0) {
                    extJComboBox.setSelectedIndex(n);
                    this.OO0000.click(object, extJComboBox.getItemAt(n));
                }
                extJComboBox.setEnabled(this.OO0000.isEnabled(object));
                this.oO0000.put(object, extJComboBox);
            }
            return extJComboBox;
        }
        if (object instanceof J) {
            ExtJSpinner extJSpinner = this.\u00d2O0000.get(object);
            if (extJSpinner == null) {
                extJSpinner = new ExtJSpinner();
                extJSpinner.setValue(this.OO0000.getValue(object));
                boolean bl = this.OO0000.isEnabled(object);
                if (this.OO0000.getMin(object) > this.OO0000.getValue(object) || this.OO0000.getValue(object) > this.OO0000.getMax(object)) {
                    private.\u00d200000(object + " " + this.OO0000.getValue(object) + " " + this.OO0000.getMin(object) + " " + this.OO0000.getMax(object), "alle");
                    bl = false;
                }
                extJSpinner.setModel(new SpinnerNumberModel(this.OO0000.getValue(object), Math.min(this.OO0000.getMin(object), this.OO0000.getValue(object)), Math.max(this.OO0000.getMax(object), this.OO0000.getValue(object)), this.OO0000.getSchrittweite(object)));
                extJSpinner.setName(object.toString());
                extJSpinner.setPayLoad(object);
                extJSpinner.addChangeListener(this.OO0000);
                extJSpinner.setToolTipText(object.toString());
                this.\u00d2O0000.put(object, extJSpinner);
                extJSpinner.setEnabled(bl);
            }
            return extJSpinner;
        }
        JLabel jLabel = new JLabel("");
        jLabel.setOpaque(false);
        return jLabel;
    }

    @Override
    public Object getCellEditorValue() {
        return this.float;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.float = object;
        return this.get(this.float);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Object object2 = object;
        return this.getButton(object2);
    }

    public void setController(SpaltenDefinition spaltenDefinition) {
        this.OO0000 = spaltenDefinition;
    }
}

