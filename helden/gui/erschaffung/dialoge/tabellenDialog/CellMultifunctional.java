/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.CellComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJCheckBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJSpinner;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJTextField;
import helden.gui.erschaffung.dialoge.tabellenDialog.ListCellRendererWithToolTip;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.super.F.A.B;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CellMultifunctional
extends B
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, ExtJComboBox> \u00f400000 = new HashMap<Object, ExtJComboBox>();
    private Map<Object, ExtJSpinner> \u00f600000 = new HashMap<Object, ExtJSpinner>();
    private Map<Object, ExtJTextField> void;
    private Map<Object, ExtJCheckBox> \u00f500000 = new HashMap<Object, ExtJCheckBox>();
    private Object \u00d400000;
    private SpaltenDefinition \u00d600000;
    private JTable \u00d500000;

    public CellMultifunctional(JTable jTable, SpaltenDefinition spaltenDefinition) {
        this.void = new HashMap<Object, ExtJTextField>();
        this.\u00d600000 = spaltenDefinition;
        this.\u00d500000 = jTable;
    }

    public void check() {
        for (Map.Entry<Object, ExtJComboBox> object : this.\u00f400000.entrySet()) {
            CellComboBox.fillCombobox(this.\u00d600000, object.getKey(), object.getValue());
        }
        for (Map.Entry<Object, ExtJSpinner> entry : this.\u00f600000.entrySet()) {
            ExtJSpinner extJSpinner = entry.getValue();
            extJSpinner.invalidate();
            entry.getValue().invalidate();
        }
    }

    public Component get(Object object, int n) {
        SpaltenDefinition.ART aRT = this.\u00d600000.getMultifunctionalArt(n);
        if (aRT == null) {
            return new JLabel();
        }
        switch (aRT) {
            case \u00f800000: {
                return this.\u00f600000.get(object);
            }
            case \u00d300000: {
                return this.\u00f400000.get(object);
            }
            case \u00f500000: {
                return this.void.get(object);
            }
            case \u00f600000: {
                return this.\u00f500000.get(object);
            }
        }
        return new JLabel();
    }

    public Component getButton(Object object, int n, Object object2) {
        SpaltenDefinition.ART aRT = this.\u00d600000.getMultifunctionalArt(n);
        switch (aRT) {
            case \u00f800000: {
                ExtJSpinner extJSpinner = this.\u00f600000.get(object);
                if (extJSpinner == null) {
                    extJSpinner = new ExtJSpinner();
                    extJSpinner.setValue(this.\u00d600000.getValue(object));
                    boolean bl = this.\u00d600000.isEnabled(object);
                    if (this.\u00d600000.getMin(object) > this.\u00d600000.getValue(object) || this.\u00d600000.getValue(object) > this.\u00d600000.getMax(object)) {
                        System.out.println(object + " " + this.\u00d600000.getValue(object) + " " + this.\u00d600000.getMin(object) + " " + this.\u00d600000.getMax(object));
                        bl = false;
                    }
                    extJSpinner.setModel(new SpinnerNumberModel(this.\u00d600000.getValue(object), Math.min(this.\u00d600000.getMin(object), this.\u00d600000.getValue(object)), Math.max(this.\u00d600000.getMax(object), this.\u00d600000.getValue(object)), this.\u00d600000.getSchrittweite(object)));
                    extJSpinner.setName(object.toString());
                    extJSpinner.setPayLoad(object);
                    extJSpinner.addChangeListener(this.\u00d600000);
                    extJSpinner.setToolTipText(object.toString());
                    this.\u00f600000.put(object, extJSpinner);
                    extJSpinner.setEnabled(bl);
                }
                return extJSpinner;
            }
            case \u00d300000: {
                ExtJComboBox extJComboBox = this.\u00f400000.get(object);
                if (extJComboBox == null) {
                    extJComboBox = new ExtJComboBox(this.\u00d600000, object);
                    CellComboBox.fillCombobox(this.\u00d600000, object, extJComboBox);
                    extJComboBox.setName(object.toString());
                    extJComboBox.addActionListener(this.\u00d600000);
                    extJComboBox.setEnabled(this.\u00d600000.isEnabled(object));
                    extJComboBox.setRenderer(new ListCellRendererWithToolTip(extJComboBox.getRenderer()));
                    this.\u00f400000.put(object, extJComboBox);
                }
                return extJComboBox;
            }
            case \u00f500000: {
                ExtJTextField extJTextField = this.void.get(object);
                if (extJTextField == null) {
                    extJTextField = new ExtJTextField(this.\u00d600000.getText(n));
                    extJTextField.setPayLoad(object);
                    extJTextField.setEditable(true);
                    extJTextField.getDocument().addDocumentListener(new _o(extJTextField, this.\u00d600000));
                    extJTextField.setEnabled(true);
                    this.void.put(object, extJTextField);
                }
                return extJTextField;
            }
            case \u00f600000: {
                ExtJCheckBox extJCheckBox = this.\u00f500000.get(object);
                if (extJCheckBox == null) {
                    extJCheckBox = new ExtJCheckBox();
                    extJCheckBox.setName(object.toString());
                    extJCheckBox.addActionListener(this.\u00d600000);
                    extJCheckBox.setPayLoad(object);
                    this.\u00f500000.put(object, extJCheckBox);
                    extJCheckBox.setSelected(this.\u00d600000.getSelected(object));
                    extJCheckBox.setEnabled(this.\u00d600000.isEnabled(object));
                }
                return extJCheckBox;
            }
        }
        JLabel jLabel = new JLabel("");
        jLabel.setOpaque(true);
        return jLabel;
    }

    @Override
    public Object getCellEditorValue() {
        return this.\u00d400000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.\u00d400000 = object;
        return this.get(this.\u00d400000, n);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        int n3;
        Object object2 = object;
        if (object2 instanceof JPanel && (n3 = Math.max(40, (int)((JPanel)object2).getPreferredSize().getHeight())) != jTable.getRowHeight(n)) {
            this.\u00d500000.setRowHeight(n, n3);
        }
        return this.getButton(object2, n, object);
    }

    public void setController(SpaltenDefinition spaltenDefinition) {
        this.\u00d600000 = spaltenDefinition;
    }

    private class _o
    implements DocumentListener {
        private ExtJTextField \u00d300000;
        private SpaltenDefinition \u00d200000;

        public _o(ExtJTextField extJTextField, SpaltenDefinition spaltenDefinition) {
            this.\u00d300000 = extJTextField;
            this.\u00d200000 = spaltenDefinition;
        }

        @Override
        public void changedUpdate(DocumentEvent documentEvent) {
            this.o00000();
        }

        @Override
        public void insertUpdate(DocumentEvent documentEvent) {
            this.o00000();
        }

        @Override
        public void removeUpdate(DocumentEvent documentEvent) {
            this.o00000();
        }

        public void o00000() {
            this.\u00d200000.setText(this.\u00d300000.getPayLoad(), this.\u00d300000.getText());
        }
    }
}

