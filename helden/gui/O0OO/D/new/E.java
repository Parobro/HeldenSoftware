/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;
import java.util.List;

public class E
extends G {
    private K \u00f8o0000;

    public E(new new_) {
        super(new_);
        this.\u00d5\u00d20000();
        this.\u00f4\u00d20000();
        this.\u00d6\u00d20000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "W\u00e4hlbare Zauber";
    }

    public new voidnew() {
        return (new)super.\u00d200000();
    }

    private void \u00f4\u00d20000() {
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
                return "Repr\u00e4sentation";
            }
        });
        arrayList.add(new SpaltenDefinition("Rep", 20, true, Integer.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                E.this.\u00f8o0000 = (K)object2;
            }

            @Override
            public Object getData(int n) {
                return "";
            }

            @Override
            public List<Object> getItems(Object object) {
                return new ArrayList<Object>(K.\u00d400000());
            }

            @Override
            public Object selectedItem(Object object) {
                return E.this.\u00f8o0000;
            }
        });
        this.o00000(1, tabellenDefinition);
    }

    private void \u00d5\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return E.this.voidnew().\u00d2o0000().size();
            }

            @Override
            public Integer getWeightY() {
                return 6;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Zaubername", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return E.this.voidnew().\u00d2o0000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                E.this.voidnew().\u00d200000(KonkreterZauber.getZauber((Zauber)object, E.this.\u00f8o0000, ""));
                E.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return E.this.voidnew().\u00d2o0000().get(n);
            }
        });
        this.o00000(0, tabellenDefinition);
    }

    private void \u00d6\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return E.this.voidnew().o\u00d30000().size();
            }

            @Override
            public Integer getWeightY() {
                return 3;
            }
        };
        tabellenDefinition.setTabname("W\u00e4hlbare Zauber:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Zauber", 140, false, String.class){

            @Override
            public Object getData(int n) {
                return E.this.voidnew().o\u00d30000().get(n).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                E.this.voidnew().\u00d300000((KonkreterZauber)object);
                E.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return E.this.voidnew().o\u00d30000().get(n);
            }
        });
        this.o00000(2, tabellenDefinition);
    }
}

