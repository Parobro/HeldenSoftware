/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.b;

import helden.framework.E.B;
import helden.framework.E.F;
import helden.framework.held.object.oooo_1;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from helden.gui.super.B.Oo0O
 */
public class oo0o_0
extends AbstractTableModel {
    private ArrayList<F> o00000;
    private int \u00d200000;
    private oooo_1 Object;

    public oo0o_0(oooo_1 oooo_12) {
        this.o00000 = oooo_12.\u00d800000().\u00d8o0000().\u00d400000();
        this.Object = oooo_12;
    }

    public void o00000() {
        this.fireTableRowsUpdated(this.\u00d200000, this.\u00d200000);
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 0) {
            return Integer.class;
        }
        if (n == 3) {
            return Float.class;
        }
        if (n > 3 && n < 7) {
            return F.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Anzahl";
            }
            case 1: {
                return "Name";
            }
            case 2: {
                return "Art";
            }
            case 3: {
                return "Gewicht";
            }
            case 4: {
                return "+";
            }
            case 5: {
                return "-";
            }
            case 6: {
                return "X";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    @Override
    public int getRowCount() {
        return this.o00000.size();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        F f2 = this.o00000.get(n);
        switch (n2) {
            case 0: {
                return new Integer(f2.\u00f500000());
            }
            case 1: {
                return f2.void();
            }
            case 2: {
                return B.super(f2.float());
            }
            case 3: {
                return new Float(f2.Object() * (float)f2.\u00f500000());
            }
            case 4: {
                return f2;
            }
            case 5: {
                return f2;
            }
            case 6: {
                return f2;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    public F o00000(int n) {
        return this.o00000.get(n);
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        this.\u00d200000 = n;
        if (n2 > 3 && n2 < 7) {
            F f2;
            if (n2 == 4 && (f2 = (F)this.getValueAt(n, n2)).\u00d200000()) {
                return false;
            }
            if (n2 == 6) {
                f2 = (F)this.getValueAt(n, n2);
                if (this.Object.\u00d800000().o00000(0).\u00d200000(f2) || this.Object.\u00d800000().o00000(1).\u00d200000(f2) || this.Object.\u00d800000().o00000(2).\u00d200000(f2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
    }
}

