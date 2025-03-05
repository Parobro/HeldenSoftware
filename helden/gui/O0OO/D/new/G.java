/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OOoO.K;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;
import java.util.List;

public class G
extends helden.gui.O0OO.D.G {
    private K O\u00d20000;

    public G(new new_) {
        super(new_);
        this.\u00f5\u00d20000();
        this.O\u00d30000();
        this.\u00f6\u00d20000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Zauber";
    }

    public new floatnew() {
        return (new)super.\u00d200000();
    }

    private void O\u00d30000() {
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
                G.this.O\u00d20000 = (K)object2;
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
                return G.this.O\u00d20000;
            }
        });
        this.o00000(1, tabellenDefinition);
    }

    private void \u00f5\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return G.this.floatnew().\u00d2o0000().size();
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
                return G.this.floatnew().\u00d2o0000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                G.this.floatnew().o00000((oo0o_0)KonkreterZauber.getZauber((Zauber)object, G.this.O\u00d20000, ""));
                G.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return G.this.floatnew().\u00d2o0000().get(n);
            }
        });
        this.o00000(0, tabellenDefinition);
    }

    private void \u00f6\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return G.this.floatnew().\u00f5O0000().size();
            }

            @Override
            public Integer getWeightY() {
                return 3;
            }
        };
        tabellenDefinition.setTabname("Automatische und aktivierte Talente:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("HZ", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

            @Override
            public Object getData(int n) {
                oo0o_0 oo0o_02 = G.this.floatnew().\u00f5O0000().get(n).new();
                return oo0o_02;
            }

            @Override
            public boolean getSelected(Object object) {
                return G.this.floatnew().o\u00d20000().contains(object);
            }

            @Override
            public void selected(Object object, boolean bl) {
                KonkreterZauber konkreterZauber = (KonkreterZauber)object;
                if (bl) {
                    G.this.floatnew().o00000(konkreterZauber);
                } else {
                    G.this.floatnew().String(konkreterZauber);
                }
            }
        });
        arrayList.add(new SpaltenDefinition("Talentname", 140, false, String.class){

            @Override
            public Object getData(int n) {
                return G.this.floatnew().\u00f5O0000().get(n).new().toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Wert", 20, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                interface interface_ = (interface)object;
                interface_.o00000(n);
                G.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                interface interface_ = G.this.floatnew().\u00f5O0000().get(n);
                return interface_;
            }

            @Override
            public int getMax(Object object) {
                return 20;
            }

            @Override
            public int getMin(Object object) {
                return -20;
            }

            @Override
            public int getValue(Object object) {
                interface interface_ = (interface)object;
                return interface_.\u00d300000();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                G.this.floatnew().o00000((interface)object);
                G.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                interface interface_ = G.this.floatnew().\u00f5O0000().get(n);
                return interface_;
            }
        });
        this.o00000(2, tabellenDefinition);
    }
}

