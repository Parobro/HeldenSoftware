/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.A;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.D.new.OooO;
import helden.gui.O0OO.D.new.int;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends G
implements OooO {
    private helden.gui.O0OO.A.C \u00f500000;

    public C(new new_, helden.gui.O0OO.A.C c) {
        super(new_);
        this.\u00f500000 = c;
        this.\u00f400000();
        this.float();
        this.\u00f600000();
        this.\u00d600000();
    }

    @Override
    public void o00000(I i2) {
        this.\u00f500000.o00000((public)i2);
    }

    public new \u00f500000() {
        return (new)super.\u00d200000();
    }

    private void float() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return C.this.\u00f500000.\u00d400000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Vor- und Nachteile", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return C.this.\u00f500000.\u00d400000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                C.this.\u00f500000.new((public)object);
                C.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return C.this.\u00f500000.\u00d400000().get(n);
            }
        });
        this.o00000(2, tabellenDefinition);
    }

    private void \u00f400000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(new int(0, this.\u00f500000(), this, false));
        ((TabellenDefinition)arrayList.get(0)).setTabname("Vorteile");
        ((TabellenDefinition)arrayList.get(0)).setGlobalname("M\u00f6gliche Vor- und Nachteile");
        arrayList.add(new int(1, this.\u00f500000(), this, false));
        ((TabellenDefinition)arrayList.get(1)).setTabname("Nachteile");
        this.o00000(arrayList);
    }

    private void \u00f600000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 1;
            }

            @Override
            public Integer getWeightY() {
                return 1;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return "Anzahl zu w\u00e4hlender Vor-/Nachteile: ";
            }
        });
        arrayList.add(new SpaltenDefinition("", 80, true, P.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                C.this.\u00f500000.o00000((Integer)object2);
            }

            @Override
            public Object getData(int n) {
                return "0";
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (int i2 = 1; i2 < 5; ++i2) {
                    arrayList.add(new Integer(i2));
                }
                return arrayList;
            }

            @Override
            public Object selectedItem(Object object) {
                return new Integer(C.this.\u00f500000.\u00d300000());
            }
        });
        this.o00000(1, tabellenDefinition);
    }
}

