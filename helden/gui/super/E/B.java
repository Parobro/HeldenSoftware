/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.E;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.Stringsuper;
import helden.framework.held.object.oooo_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
extends AbstractTableModel {
    private oooo_1 \u00d600000;
    private ArrayList<voidsuper> \u00d200000;
    private ArrayList<voidsuper> super;
    private HashMap<voidsuper, Boolean> \u00d300000;
    private int class;
    private String \u00d400000;

    public B(oooo_1 oooo_12) {
        this.\u00d600000 = oooo_12;
        this.\u00d200000 = new ArrayList();
        this.super = new ArrayList();
        this.\u00d300000 = new HashMap();
        this.\u00d400000 = "Alle";
        this.\u00d300000();
    }

    public void \u00d300000(voidsuper voidsuper2) {
        this.\u00d200000.add(voidsuper2);
        this.o00000();
        this.\u00d400000();
    }

    public void \u00d400000() {
        this.fireTableRowsUpdated(this.class, this.class);
    }

    public void \u00d500000() {
        this.fireTableRowsUpdated(0, this.getRowCount());
        this.fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 0) {
            return Boolean.class;
        }
        if (n == 5) {
            return voidsuper.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "SE";
            }
            case 1: {
                return "Talent";
            }
            case 2: {
                return "Probe";
            }
            case 3: {
                return "Lern";
            }
            case 4: {
                return "AP";
            }
            case 5: {
                return "Aktiviern";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    public voidsuper new() {
        return (voidsuper)this.getValueAt(this.class, 5);
    }

    @Override
    public int getRowCount() {
        return this.super.size();
    }

    public boolean o00000(voidsuper voidsuper2) {
        return this.\u00d300000.get(voidsuper2);
    }

    @Override
    public Object getValueAt(int n, int n2) {
        voidsuper voidsuper2 = this.super.get(n);
        switch (n2) {
            case 0: {
                return this.\u00d300000.get(voidsuper2);
            }
            case 1: {
                return voidsuper2.toString();
            }
            case 2: {
                return voidsuper2.getTalentprobe();
            }
            case 3: {
                if (this.\u00d300000.get(voidsuper2).booleanValue()) {
                    return this.\u00d600000.\u00d800000().new(voidsuper2, false).new();
                }
                return this.\u00d600000.\u00d800000().new(voidsuper2, false);
            }
            case 4: {
                Integer n3 = 0;
                try {
                    n3 = new Integer(Math.round(this.\u00d600000.\u00d800000().\u00f8O0000().super(voidsuper2, this.\u00d600000.\u00d800000(), this.\u00d300000.get(voidsuper2), false)));
                }
                catch (Stringsuper stringsuper) {
                    // empty catch block
                }
                return n3;
            }
            case 5: {
                return voidsuper2;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        this.class = n;
        return n2 == 0 || n2 == 5;
    }

    public void new(voidsuper voidsuper2) {
        this.\u00d200000.remove(voidsuper2);
        this.o00000();
        this.\u00d400000();
    }

    public void o00000(String string) {
        this.\u00d400000 = string;
        this.o00000();
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        if (object instanceof Boolean) {
            voidsuper voidsuper2;
            this.\u00d300000.put(voidsuper2, new Boolean(this.\u00d300000.get(voidsuper2 = (voidsuper)this.getValueAt(n, 5)) == false));
            this.\u00d400000();
        }
    }

    private void o00000() {
        Collections.sort(this.\u00d200000);
        Iterator<voidsuper> iterator = this.\u00d200000.iterator();
        this.super.clear();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            boolean bl = true;
            if (!this.\u00d400000.endsWith("Alle") && !voidsuper2.getArt().toString().equals(this.\u00d400000)) {
                bl = false;
            }
            if (!bl) continue;
            this.super.add(voidsuper2);
        }
    }

    private void \u00d300000() {
        for (voidsuper voidsuper2 : this.\u00d600000.\u00d800000().\u00f8\u00d30000()) {
            this.\u00d200000.add(voidsuper2);
            this.\u00d300000.put(voidsuper2, new Boolean(false));
        }
        this.o00000();
        this.\u00d500000();
    }
}

