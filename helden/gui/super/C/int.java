/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.B;
import helden.framework.E.F;
import helden.framework.held.object.oooo_1;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class int
extends AbstractTableModel {
    public static final String \u00d300000 = "Getragene R\u00fcstung";
    public static final String \u00d800000 = "Ruestung";
    public static final String \u00d500000 = "Nahkampfwaffe";
    public static final String \u00d200000 = "Fernkampfwaffe";
    public static final String String = "Schild";
    private ArrayList<F> o00000;
    private int \u00d600000;

    public int(ArrayList<F> arrayList) {
        this.o00000 = arrayList;
    }

    public int(oooo_1 oooo_12, String string, int n) {
        if (string == \u00d500000) {
            this.o00000 = oooo_12.\u00d800000().\u00d8o0000().o00000(B.\u00d400000);
            this.o00000.addAll(oooo_12.\u00d800000().\u00d8o0000().o00000(B.\u00f600000));
        }
        if (string == \u00d800000) {
            this.o00000 = oooo_12.\u00d800000().\u00d8o0000().o00000(B.OO0000);
            this.o00000.addAll(oooo_12.\u00d800000().\u00d8o0000().o00000(B.\u00d600000));
        }
        if (string == \u00d200000) {
            this.o00000 = oooo_12.\u00d800000().\u00d8o0000().o00000(B.class);
        }
        if (string == String) {
            this.o00000 = oooo_12.\u00d800000().\u00d8o0000().o00000(B.\u00d300000);
            this.o00000.addAll(oooo_12.\u00d800000().\u00d8o0000().o00000(B.\u00f600000));
        }
        if (string == \u00d300000) {
            this.o00000 = oooo_12.\u00d800000().o00000(n).oO0000();
        }
    }

    public void o00000() {
        this.fireTableRowsUpdated(this.\u00d600000, this.\u00d600000);
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 0) {
            return Integer.class;
        }
        if (n == 2) {
            return F.class;
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
                return "Anzahl";
            }
            case 1: {
                return "Name";
            }
            case 2: {
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
        F f2 = this.o00000.get(n);
        switch (n2) {
            case 0: {
                return new Integer(f2.\u00f500000());
            }
            case 1: {
                return f2.OO0000();
            }
            case 2: {
                return f2;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        this.\u00d600000 = n;
        return n2 == 2;
    }
}

