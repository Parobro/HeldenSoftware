/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

import helden.framework.D.P;
import helden.framework.OOoO.o00O;
import helden.framework.held.Object.O0OO;
import helden.framework.held.Object.public;
import helden.framework.held.Stringsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.s_0;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class E
extends AbstractTableModel {
    private O0OO \u00d800000;
    private ArrayList<Zauber> new;
    private ArrayList<Zauber> \u00d300000;
    private HashMap<Zauber, Boolean> \u00d500000;
    private int return;
    private String o00000;
    private String \u00d400000;

    public E(O0OO o0OO2) {
        this.\u00d800000 = o0OO2;
        this.new = new ArrayList();
        this.\u00d300000 = new ArrayList();
        this.\u00d500000 = new HashMap();
        this.o00000 = "Alle";
        this.\u00d400000 = "Alle";
        this.\u00d200000();
    }

    public void \u00d500000(Zauber zauber) {
        this.\u00d500000();
        this.o00000();
    }

    public void Object(Zauber zauber) {
        this.\u00d500000();
        this.o00000();
    }

    public void o00000() {
        this.fireTableRowsUpdated(this.return, this.return);
    }

    public void Object() {
        this.fireTableRowsUpdated(0, this.getRowCount());
        this.fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 3 || n == 1) {
            return Zauber.class;
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
                return "Rep";
            }
            case 2: {
                return "Merkmale";
            }
            case 3: {
                return "Aktivieren";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    public Zauber \u00d400000() {
        return (Zauber)this.getValueAt(this.return, 3);
    }

    @Override
    public int getRowCount() {
        return this.\u00d300000.size();
    }

    public boolean \u00d200000(Zauber zauber) {
        return this.\u00d500000.get(zauber);
    }

    @Override
    public Object getValueAt(int n, int n2) {
        Zauber zauber = this.\u00d300000.get(n);
        switch (n2) {
            case 0: {
                return zauber.toString();
            }
            case 1: {
                return zauber;
            }
            case 2: {
                return zauber.getMerkmaleString(null);
            }
            case 3: {
                return zauber;
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        this.return = n;
        return n2 == 3 || n2 == 1;
    }

    public void o00000(Zauber zauber) {
        this.new.remove(zauber);
        this.\u00d500000();
        this.o00000();
    }

    public void \u00d400000(Zauber zauber) {
        this.\u00d500000();
        this.o00000();
    }

    public void o00000(String string) {
        this.\u00d400000 = string;
        this.\u00d500000();
    }

    public void \u00d200000(String string) {
        this.o00000 = string;
        this.\u00d500000();
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
    }

    private void \u00d500000() {
        Collections.sort(this.new, public.o00000());
        Iterator<Zauber> iterator = this.new.iterator();
        this.\u00d300000.clear();
        while (iterator.hasNext()) {
            Object object;
            Zauber zauber = iterator.next();
            boolean bl = true;
            if (!this.o00000.endsWith("Alle")) {
                if (this.o00000.endsWith("Beherrschte")) {
                    object = this.\u00d800000.\u00d800000().\u00f5O0000().iterator();
                    ArrayList<P> arrayList = new ArrayList<P>();
                    while (object.hasNext()) {
                        P p2 = (P)object.next();
                        if (!p2.if()) continue;
                        arrayList.add(p2);
                    }
                    boolean bl2 = false;
                    for (int i2 = 0; i2 < zauber.getMerkmale(null).length; ++i2) {
                        for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                            if (!((P)arrayList.get(i3)).toString().endsWith(zauber.getMerkmale(null)[i2].toString())) continue;
                            bl2 = true;
                        }
                    }
                    if (!bl2) {
                        bl = false;
                    }
                } else {
                    object = o00O.\u00d200000(this.o00000);
                    if (!zauber.hatMerkmal((o00O)object, null)) {
                        bl = false;
                    }
                }
            }
            if (!this.\u00d400000.endsWith("Alle")) {
                try {
                    object = this.\u00d800000.\u00d800000().\u00d5o0000().super((oo0o_0)zauber, this.\u00d800000.\u00d800000(), false);
                    if (this.\u00d500000.get(zauber).booleanValue()) {
                        if (!((s_0)object).new().toString().equals(this.\u00d400000)) {
                            bl = false;
                        }
                    } else if (!((s_0)object).toString().equals(this.\u00d400000)) {
                        bl = false;
                    }
                }
                catch (Stringsuper stringsuper) {
                    bl = false;
                    stringsuper.printStackTrace();
                }
            }
            if (!bl) continue;
            this.\u00d300000.add(zauber);
        }
    }

    private void \u00d200000() {
        for (Zauber zauber : ZauberFabrik.getInstance().getAlleZauber(this.\u00d800000.\u00d800000().oO0000())) {
            this.new.add(zauber);
            this.\u00d500000.put(zauber, new Boolean(false));
        }
        this.\u00d500000();
        this.Object();
    }
}

