/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

import helden.framework.C.I;
import helden.framework.held.Object.O0OO;
import helden.framework.zauber.KonkreterZauber;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D
extends AbstractTableModel {
    private O0OO new;
    private int o00000;

    public D(O0OO o0OO2) {
        this.new = o0OO2;
        this.\u00d200000();
    }

    public void \u00d300000() {
        this.fireTableRowsUpdated(this.o00000, this.o00000);
    }

    public void String() {
        this.fireTableRowsUpdated(0, this.getRowCount());
        this.fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 1) {
            return Boolean.class;
        }
        if (n == 2) {
            return KonkreterZauber.class;
        }
        if (n == 3) {
            return KonkreterZauber.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Zauberfertigkeit";
            }
            case 1: {
                return "Haus";
            }
            case 2: {
                return "ZfW";
            }
            case 3: {
                return "Entfernen";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    public KonkreterZauber o00000() {
        return (KonkreterZauber)this.getValueAt(this.o00000, 3);
    }

    @Override
    public int getRowCount() {
        return this.new.\u00d800000().\u00d5o0000().\u00d200000().size();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        KonkreterZauber konkreterZauber = this.new.\u00d800000().\u00d5o0000().\u00d200000().get(n);
        switch (n2) {
            case 0: {
                return konkreterZauber.toString();
            }
            case 1: {
                return this.new.\u00d800000().\u00d5o0000().\u00d200000(konkreterZauber);
            }
            case 2: {
                return konkreterZauber;
            }
            case 3: {
                return konkreterZauber;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        this.o00000 = n;
        if (n2 == 1 && this.new.\u00d800000().o00000(I.\u00d5\u00d3O000)) {
            return false;
        }
        return n2 == 1 || n2 == 2 || n2 == 3;
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        if (object instanceof Boolean) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)this.getValueAt(n, 3);
            Boolean bl = (Boolean)object;
            if (bl.booleanValue()) {
                this.new.\u00d800000().\u00d5o0000().\u00d300000(konkreterZauber);
            } else {
                this.new.\u00d800000().\u00d5o0000().class(konkreterZauber);
            }
            this.\u00d300000();
        }
    }

    private void \u00d200000() {
        this.String();
    }
}

