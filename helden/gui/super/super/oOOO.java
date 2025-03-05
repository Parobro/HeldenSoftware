/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.super;

import helden.framework.C.D;
import helden.framework.C.public;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class oOOO
extends AbstractTableModel {
    private ArrayList<public> o00000 = new ArrayList();

    public oOOO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        for (public public_ : oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d500000().o00000().getListe()) {
            this.o00000.add(public_);
        }
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 1) {
            return public.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Name";
            }
            case 1: {
                return "Info";
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
        public public_ = this.o00000.get(n);
        switch (n2) {
            case 0: {
                if (public_ instanceof D) {
                    return ((D)public_).dosuper();
                }
                return public_.oO0000();
            }
            case 1: {
                return public_;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return n2 == 1;
    }
}

