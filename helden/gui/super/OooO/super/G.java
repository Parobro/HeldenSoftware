/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.super;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.OooO.new.D;
import helden.gui.super.OooO.super.B;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class G
extends DefaultTableModel {
    private static final long Object = 1L;
    private ArrayList<helden.gui.super.OooO.O0OO.B> \u00d200000;
    private B o00000;

    public G(B b) {
        this.o00000 = b;
        this.\u00d200000 = new ArrayList();
        this.o00000();
    }

    public void new() {
        this.o00000();
        this.fireTableDataChanged();
        if (this.o00000.String().\u00d8O0000().getRowCount() > 0) {
            this.o00000.String().\u00d8O0000().getSelectionModel().setSelectionInterval(0, 0);
        }
    }

    public void o00000() {
        this.\u00d200000.clear();
        for (helden.gui.super.OooO.O0OO.B b : this.o00000.\u00f500000()) {
            this.\u00d200000.add(b);
        }
        if (this.o00000.String() != null) {
            String string;
            String string2;
            String string3;
            String string4 = ((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.o00000.String().\u00f5O0000().getSelectedValue()).\u00f4o0000();
            if (!string4.equals("-1")) {
                for (int i2 = 0; i2 < this.\u00d200000.size(); ++i2) {
                    if (string4.equals(this.\u00d200000.get(i2).\u00f800000().\u00f4o0000())) continue;
                    this.\u00d200000.remove(i2);
                    --i2;
                }
            }
            if (!(string3 = this.o00000.String().\u00f500000().getSelectedItem().toString()).equals("Alle")) {
                for (int i3 = 0; i3 < this.\u00d200000.size(); ++i3) {
                    if (string3.equals("Zauber") && !this.\u00d200000.get(i3).\u00f600000()) {
                        this.\u00d200000.remove(i3);
                        --i3;
                    }
                    if (string3.equals("Sonderfertigkeiten") && !this.\u00d200000.get(i3).String()) {
                        this.\u00d200000.remove(i3);
                        --i3;
                    }
                    if (!string3.equals("Vorteile/Nachteile") || this.\u00d200000.get(i3).\u00d800000()) continue;
                    this.\u00d200000.remove(i3);
                    --i3;
                }
            }
            if (!(string2 = this.o00000.String().o00000().getSelectedItem().toString()).equals("Alle vorhandenen")) {
                for (int i4 = 0; i4 < this.\u00d200000.size(); ++i4) {
                    if (string2.equals(this.\u00d200000.get(i4).toString())) continue;
                    this.\u00d200000.remove(i4);
                    --i4;
                }
            }
            if (!(string = this.o00000.String().null().getText().toLowerCase()).trim().equals("")) {
                for (int i5 = 0; i5 < this.\u00d200000.size(); ++i5) {
                    boolean bl = false;
                    if (this.\u00d200000.get(i5).\u00f800000().\u00f5o0000().toLowerCase().contains(string)) {
                        bl = true;
                    } else if (this.\u00d200000.get(i5).toString().toLowerCase().trim().contains(string)) {
                        bl = true;
                    } else if (this.\u00d200000.get(i5).null().toLowerCase().contains(string)) {
                        bl = true;
                    }
                    if (bl) continue;
                    this.\u00d200000.remove(i5);
                    --i5;
                }
            }
        }
    }

    public Class getColumnClass(int n) {
        switch (n) {
            case 0: {
                return String.class;
            }
            case 1: {
                return D.class;
            }
            case 2: {
                return String.class;
            }
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Heldenname";
            }
            case 1: {
                return "Zauber/SF/VT/NT";
            }
            case 2: {
                return "Repr\u00e4sentation";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    @Override
    public int getRowCount() {
        if (this.\u00d200000 == null) {
            return 0;
        }
        return this.\u00d200000.size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Object getValueAt(int n, int n2) {
        helden.gui.super.OooO.O0OO.B b;
        ArrayList<helden.gui.super.OooO.O0OO.B> arrayList = this.\u00d200000;
        synchronized (arrayList) {
            b = this.\u00d200000.get(n);
        }
        if (b != null) {
            switch (n2) {
                case 0: {
                    return b.\u00f800000().\u00f5o0000();
                }
                case 1: {
                    return b;
                }
                case 2: {
                    return b.null();
                }
            }
            throw new IllegalArgumentException("Zu viele Zeilen");
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return false;
    }
}

