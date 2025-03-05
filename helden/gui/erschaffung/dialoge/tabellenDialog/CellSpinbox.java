/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.framework.held.Object.private;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJSpinner;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpinnerNumberMobelWithLimitedEvents;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CellSpinbox
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, ExtJSpinner> \u00d400000 = new HashMap<Object, ExtJSpinner>();
    private Map<ExtJSpinner, Object> \u00d300000 = new HashMap<ExtJSpinner, Object>();
    private Object o00000;
    private SpaltenDefinition new;

    public CellSpinbox(SpaltenDefinition spaltenDefinition) {
        this.new = spaltenDefinition;
    }

    public void check() {
        for (Map.Entry<ExtJSpinner, Object> entry : this.\u00d300000.entrySet()) {
            ExtJSpinner extJSpinner = entry.getKey();
            Object object = entry.getValue();
            SpinnerNumberMobelWithLimitedEvents spinnerNumberMobelWithLimitedEvents = (SpinnerNumberMobelWithLimitedEvents)extJSpinner.getModel();
            spinnerNumberMobelWithLimitedEvents.enableChanged(false);
            spinnerNumberMobelWithLimitedEvents.setMinimum(Integer.valueOf(this.new.getMin(object)));
            spinnerNumberMobelWithLimitedEvents.setMaximum(Integer.valueOf(this.new.getMax(object)));
            spinnerNumberMobelWithLimitedEvents.setStepSize(this.new.getSchrittweite(object));
            extJSpinner.setEnabled(this.new.isEnabled(object));
            spinnerNumberMobelWithLimitedEvents.enableChanged(true);
            if (this.new.getValue(object) == ((Integer)extJSpinner.getValue()).intValue()) continue;
            extJSpinner.setValue(this.new.getValue(object));
        }
    }

    public ExtJSpinner getButton(Object object) {
        if (object == null) {
            return null;
        }
        ExtJSpinner extJSpinner = this.\u00d400000.get(object);
        if (extJSpinner == null) {
            extJSpinner = new ExtJSpinner();
            extJSpinner.setValue(this.new.getValue(object));
            int n = this.new.getValue(object);
            if (n < this.new.getMin(object) || n > this.new.getMax(object)) {
                private.\u00d200000("Warning: " + object.toString() + " " + this.new.getMin(object) + " - " + n + " - " + this.new.getMax(object), "alle");
            }
            extJSpinner.setToolTipText(object.toString());
            int n2 = Math.min(this.new.getMin(object), n);
            int n3 = Math.max(this.new.getMax(object), n);
            extJSpinner.setModel(new SpinnerNumberMobelWithLimitedEvents(n, n2, n3, 1));
            extJSpinner.setName(object.toString());
            extJSpinner.setPayLoad(object);
            extJSpinner.addChangeListener(this.new);
            this.\u00d400000.put(object, extJSpinner);
            this.\u00d300000.put(extJSpinner, object);
            extJSpinner.setEnabled(this.new.isEnabled(object));
        }
        return extJSpinner;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = object;
        ExtJSpinner extJSpinner = this.\u00d400000.get(this.o00000);
        return extJSpinner;
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Object object2 = object;
        ExtJSpinner extJSpinner = this.getButton(object2);
        if (extJSpinner != null) {
            SpinnerNumberMobelWithLimitedEvents spinnerNumberMobelWithLimitedEvents = (SpinnerNumberMobelWithLimitedEvents)extJSpinner.getModel();
            if ((Integer)spinnerNumberMobelWithLimitedEvents.getValue() > (Integer)spinnerNumberMobelWithLimitedEvents.getMinimum()) {
                ((JSpinner.DefaultEditor)extJSpinner.getEditor()).getTextField().setForeground(new Color(255, 102, 0));
            } else {
                ((JSpinner.DefaultEditor)extJSpinner.getEditor()).getTextField().setForeground(Color.black);
            }
        }
        return extJSpinner;
    }

    public Object getTalent(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    public void setController(SpaltenDefinition spaltenDefinition) {
        this.new = spaltenDefinition;
    }
}

