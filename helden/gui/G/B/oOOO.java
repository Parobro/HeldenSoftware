/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

import helden.framework.held.Object.O0OO;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.G.B.Object;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oOOO
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<KonkreterZauber, JSpinner> \u00d500000;
    private Map<JSpinner, KonkreterZauber> \u00d300000;
    private KonkreterZauber o00000;
    private O0OO \u00d400000;
    private Object new;

    public oOOO(Object object, O0OO o0OO2) {
        this.\u00d400000 = o0OO2;
        this.\u00d500000 = new HashMap<KonkreterZauber, JSpinner>();
        this.\u00d300000 = new HashMap<JSpinner, KonkreterZauber>();
        this.new = object;
    }

    @Override
    public java.lang.Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, java.lang.Object object, boolean bl, int n, int n2) {
        this.o00000 = (KonkreterZauber)object;
        return this.\u00d500000.get(this.o00000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, java.lang.Object object, boolean bl, boolean bl2, int n, int n2) {
        KonkreterZauber konkreterZauber = null;
        konkreterZauber = object == null ? (KonkreterZauber)jTable.getValueAt(n, n2) : (KonkreterZauber)object;
        JSpinner jSpinner = this.o00000(konkreterZauber);
        int n3 = 0;
        try {
            n3 = this.\u00d400000.\u00d800000().\u00d5o0000().\u00d400000(konkreterZauber);
        }
        catch (Exception exception) {
            // empty catch block
        }
        jSpinner.setValue(n3);
        return jSpinner;
    }

    public KonkreterZauber o00000(JSpinner jSpinner) {
        return this.\u00d300000.get(jSpinner);
    }

    private JSpinner o00000(KonkreterZauber konkreterZauber) {
        JSpinner jSpinner = this.\u00d500000.get(konkreterZauber);
        if (jSpinner == null) {
            jSpinner = new JSpinner();
            jSpinner.setName(konkreterZauber.toString());
            jSpinner.addChangeListener(this.new);
            this.\u00d500000.put(konkreterZauber, jSpinner);
            this.\u00d300000.put(jSpinner, konkreterZauber);
        }
        return jSpinner;
    }
}

