/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.E;

import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.T;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.s_0;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OOoO
extends AbstractTableModel {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d200000;
    private oooo_1 \u00d400000;
    private T o00000;
    private int Object;

    public OOoO(oooo_1 oooo_12) {
        this.\u00d200000 = oooo_12.\u00d800000();
        this.\u00d400000 = oooo_12;
        this.o00000 = this.\u00d200000.\u00f8O0000();
    }

    public void super() {
        this.fireTableRowsUpdated(this.Object, this.Object);
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 0) {
            return Boolean.class;
        }
        if (n == 4) {
            return helden.framework.OoOO.D.class;
        }
        if (n == 7) {
            return voidsuper.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "SE";
            }
            case 1: {
                return "Art";
            }
            case 2: {
                return "Talent";
            }
            case 3: {
                return "Wert";
            }
            case 4: {
                return "Lernmethode";
            }
            case 5: {
                return "Kat.";
            }
            case 6: {
                return "Kosten";
            }
            case 7: {
                return "Steigern";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    @Override
    public int getRowCount() {
        return this.o00000.\u00d300000();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        voidsuper voidsuper2 = (voidsuper)this.o00000.\u00d200000(n);
        switch (n2) {
            case 0: {
                return this.o00000.\u00d400000(voidsuper2);
            }
            case 1: {
                return voidsuper2.getArt().toString();
            }
            case 2: {
                StringBuffer stringBuffer = new StringBuffer(voidsuper2.toStringKomplett());
                if (this.o00000.super((oo0o_0)voidsuper2, this.\u00d200000.\u00d500000())) {
                    stringBuffer.append(" (L)");
                }
                if (this.o00000.\u00d300000(voidsuper2)) {
                    stringBuffer.append(" (M+)");
                }
                if (this.o00000.super(voidsuper2)) {
                    stringBuffer.append(" (M-)");
                }
                if (voidsuper2.isMetatalent()) {
                    stringBuffer.append(" [M]");
                }
                return stringBuffer.toString();
            }
            case 3: {
                Integer n3 = null;
                try {
                    n3 = new Integer(this.o00000.\u00f400000(voidsuper2));
                }
                catch (D d2) {
                    d2.printStackTrace();
                }
                return n3;
            }
            case 4: {
                return this.o00000.super((oo0o_0)voidsuper2);
            }
            case 5: {
                if (voidsuper2.isMetatalent()) {
                    return "";
                }
                s_0 s_02 = this.\u00d200000.new(voidsuper2, false);
                return s_02.toString();
            }
            case 6: {
                if (voidsuper2.isMetatalent()) {
                    return "";
                }
                Integer n4 = new Integer(Math.round(this.\u00d200000.o00000(voidsuper2, false)));
                return n4;
            }
            case 7: {
                return voidsuper2;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        this.Object = n;
        voidsuper voidsuper2 = (voidsuper)this.o00000.\u00d200000(n);
        if (voidsuper2.isMetatalent()) {
            return false;
        }
        return n2 == 0 || n2 == 4 || n2 == 7;
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        voidsuper voidsuper2;
        if (object instanceof Boolean) {
            voidsuper2 = (voidsuper)this.o00000.\u00d200000(n);
            this.\u00d400000.o00000((U)voidsuper2, (Boolean)object);
            this.super();
        }
        if (object instanceof helden.framework.OoOO.D) {
            voidsuper2 = (voidsuper)this.o00000.\u00d200000(n);
            this.\u00d400000.o00000((oo0o_0)voidsuper2, (helden.framework.OoOO.D)object);
            this.super();
        }
    }
}

