/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

import helden.framework.D.P;
import helden.framework.OOoO.K;
import helden.framework.held.Object.O0OO;
import helden.framework.zauber.Zauber;
import helden.gui.G.B.Object;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<Zauber, JComboBox> \u00d600000 = new HashMap<Zauber, JComboBox>();
    private HashMap<JComboBox, Zauber> \u00d300000 = new HashMap();
    private Zauber super;
    private Object \u00d200000;
    private K[] class;
    private K \u00d400000;

    public oOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(Object object, O0OO o0OO2) {
        ArrayList<K> arrayList = new ArrayList<K>();
        for (P object2 : o0OO2.\u00d800000().\u00f5O0000()) {
            this.\u00d400000 = K.super(object2);
            if (this.\u00d400000 == null) continue;
            break;
        }
        for (K k2 : K.\u00d400000()) {
            if (!o0OO2.\u00d800000().oO0000().contains(k2)) continue;
            arrayList.add(k2);
        }
        this.class = arrayList.toArray(new K[0]);
        this.\u00d200000 = object;
    }

    @Override
    public java.lang.Object getCellEditorValue() {
        return this.super;
    }

    public K o00000(Zauber zauber) {
        return (K)this.\u00d200000(zauber).getSelectedItem();
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, java.lang.Object object, boolean bl, int n, int n2) {
        this.super = (Zauber)object;
        return this.\u00d600000.get(this.super);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, java.lang.Object object, boolean bl, boolean bl2, int n, int n2) {
        Zauber zauber = null;
        zauber = object == null ? (Zauber)jTable.getValueAt(n, n2) : (Zauber)object;
        return this.\u00d200000(zauber);
    }

    public Zauber o00000(JSpinner jSpinner) {
        return this.\u00d300000.get(jSpinner);
    }

    private JComboBox \u00d200000(Zauber zauber) {
        JComboBox<K> jComboBox = this.\u00d600000.get(zauber);
        if (jComboBox == null) {
            jComboBox = new JComboBox<K>(this.class);
            if (this.\u00d400000 != null) {
                jComboBox.setSelectedItem(this.\u00d400000);
            }
            jComboBox.setName(zauber.toString());
            jComboBox.addActionListener(this.\u00d200000);
            this.\u00d600000.put(zauber, jComboBox);
            this.\u00d300000.put(jComboBox, zauber);
        }
        return jComboBox;
    }
}

