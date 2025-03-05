/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.B;

import helden.framework.C.A.void;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class o0OO
extends AbstractTableModel {
    private ArrayList<public> new;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;

    public o0OO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.new = new ArrayList();
        this.o00000();
    }

    public void o00000() {
        this.new.clear();
        Oo0O oo0O = this.o00000.\u00d500000();
        Iterator<public> iterator = oo0O.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.\u00d500000() || public_.equals(I.\u00d4OO000) || public_.equals(I.\u00f400000)) continue;
            if (public_ instanceof M) {
                M m = (M)public_;
                this.new.addAll(m.\u00d200000(true));
                continue;
            }
            this.new.add(public_);
        }
        this.fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 1) {
            return P.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Nachteil";
            }
            case 1: {
                return "Kosten";
            }
            case 2: {
                return "";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    @Override
    public int getRowCount() {
        return this.new.size();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        public public_ = this.new.get(n);
        switch (n2) {
            case 0: {
                String string = public_.oO0000();
                return string;
            }
            case 1: {
                if (public_.equals(I.whilenewsuper)) {
                    return "variabel";
                }
                if (public_ instanceof void) {
                    return "300 - 500";
                }
                return public_.\u00d600000();
            }
            case 2: {
                return public_;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return n2 == 2;
    }
}

