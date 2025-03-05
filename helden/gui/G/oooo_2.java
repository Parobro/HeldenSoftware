/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.framework.OoOO.U;
import helden.framework.held.Object.O0OO;
import helden.framework.oooo.b_0;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.oOoO
 */
public class oooo_2
extends AbstractTableModel {
    private ArrayList<b_0> o00000;

    public oooo_2(O0OO o0OO2, ArrayList<b_0> arrayList) {
        this.o00000 = arrayList;
    }

    public void super() {
        this.fireTableRowsUpdated(0, this.getRowCount());
    }

    @Override
    public Class<?> getColumnClass(int n) {
        return String.class;
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Name";
            }
            case 1: {
                return "Start-\nWert";
            }
            case 2: {
                return "";
            }
            case 3: {
                return "Basis-\nWert";
            }
            case 4: {
                return "allgemeine\nModi.";
            }
            case 5: {
                return "Permanente\nModi.";
            }
            case 6: {
                return "Gekauft /\nGesteigert";
            }
            case 7: {
                return "gro\u00dfe Medi./\nKarmalquest";
            }
            case 8: {
                return "Aktueller\nWert";
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
        U u2 = this.o00000.get(n);
        switch (n2) {
            case 0: {
                return u2.toString();
            }
            case 1: {
                return u2.toString() + "-start";
            }
            case 2: {
                return "";
            }
            case 3: {
                b_0 b_02;
                String string = u2.toString() + "-basis";
                if (u2 instanceof b_0 && (b_02 = (b_0)u2).publicString()) {
                    string = "";
                }
                return string;
            }
            case 4: {
                return u2.toString() + "-modi";
            }
            case 5: {
                return u2.toString() + "-perm";
            }
            case 6: {
                return u2.toString() + "-gekauft";
            }
            case 7: {
                return u2.toString() + "-medi";
            }
            case 8: {
                return u2.toString() + "-akt";
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return n2 > 0;
    }
}

