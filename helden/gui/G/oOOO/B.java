/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.oOOO;

import helden.framework.C.D;
import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.O0OO;
import helden.gui.G.oOOO.A;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
extends ZweiTabellenZustand {
    private O0OO \u00d4\u00d50000;

    public B(O0OO o0OO2) {
        super(null);
        this.\u00d4\u00d50000 = o0OO2;
        this.\u00f8\u00d30000();
        this.nullObject();
        this.createPanel();
    }

    public String O\u00d40000() {
        return "Verf\u00fcgbare Vor- und Nachteile:";
    }

    public String o\u00d40000() {
        return "Gew\u00e4hlte Vor- und Nachteile:";
    }

    @Override
    public String getBezeichner() {
        return "Vor- und Nachteile";
    }

    public GridBagConstraints new(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }

    @Override
    public String getHelp() {
        return super.getHelp();
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void updateSoft() {
        super.updateSoft();
    }

    private void \u00f8\u00d30000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(new A(0, this.\u00d4\u00d50000, this));
        ((TabellenDefinition)arrayList.get(0)).setTabname("Vorteile");
        arrayList.add(new A(1, this.\u00d4\u00d50000, this));
        ((TabellenDefinition)arrayList.get(1)).setTabname("Nachteile");
        this.setSpaltenOben(arrayList);
    }

    private void nullObject() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){
            private int \u00f4\u00f50000 = -1;

            @Override
            public int getAnzahl() {
                return B.this.\u00d4\u00d50000.\u00d800000().\u00d500000().o00000().getListe().size();
            }

            @Override
            public void setSelectedRow(int n) {
                if (n == this.\u00f4\u00f50000) {
                    return;
                }
                this.\u00f4\u00f50000 = n;
            }
        };
        tabellenDefinition.setGlobalname("Automatische und gew\u00e4hlte Vor- und Nachteile");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Vor-/Nachteil", 150, false, String.class){

            @Override
            public Object getData(int n) {
                public public_ = B.this.\u00d4\u00d50000.\u00d800000().\u00d500000().o00000().getListe().get(n);
                return public_.toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 150, true, voidsuper.class, SpaltenDefinition.ART.\u00d600000){

            @Override
            public void changed(Object object, int n) {
                ((J)object).\u00f600000(n);
                B.this.update();
            }

            @Override
            public Object getData(int n) {
                public public_ = B.this.\u00d4\u00d50000.\u00d800000().\u00d500000().o00000().getListe().get(n);
                if (public_ instanceof J || public_ instanceof D) {
                    return public_;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                if (object instanceof D) {
                    D d2 = (D)object;
                    arrayList.add(d2.\u00f4o0000());
                }
                return arrayList;
            }

            @Override
            public int getMax(Object object) {
                return 40;
            }

            @Override
            public int getMin(Object object) {
                return 1;
            }

            @Override
            public int getSchrittweite(Object object) {
                return ((J)object).\u00d2\u00d50000();
            }

            @Override
            public int getValue(Object object) {
                return ((J)object).ObjectString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                B.this.\u00d4\u00d50000.\u00d200000((public)object);
                B.this.update();
            }

            @Override
            public Object getData(int n) {
                public public_ = B.this.\u00d4\u00d50000.\u00d800000().\u00d500000().o00000().getListe().get(n);
                return public_;
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
    }
}

