/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.A;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.O0OO.A.oOOO;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class String
extends G {
    private oOOO \u00f8O0000;

    public String(new new_, oOOO oOOO2) {
        super(new_);
        this.\u00f8O0000 = oOOO2;
        this.\u00d6o0000();
        this.\u00f6o0000();
        this.\u00f5o0000();
        this.dosuper();
        this.\u00d600000();
    }

    public new \u00f4o0000() {
        return (new)super.\u00d200000();
    }

    private void \u00f6o0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return String.this.\u00f8O0000.\u00f800000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talentname", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return String.this.\u00f8O0000.\u00f800000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                String.this.\u00f8O0000.o00000((voidsuper)object);
                String.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return String.this.\u00f8O0000.\u00f800000().get(n);
            }
        });
        this.o00000(2, tabellenDefinition);
    }

    private void \u00d6o0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return String.this.\u00f4o0000().\u00d3o0000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talentname", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return String.this.\u00f4o0000().\u00d3o0000().get(n).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Kategorie", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return String.this.\u00f4o0000().\u00d3o0000().get(n).getArt().toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                String.this.\u00f8O0000.o00000((oo0o_0)object);
                String.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return String.this.\u00f4o0000().\u00d3o0000().get(n);
            }
        });
        this.o00000(tabellenDefinition);
    }

    private void \u00f5o0000() {
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
        for (int i2 = 1; i2 < 10; ++i2) {
            arrayList.add(this.Object(i2));
        }
        this.o00000(1, tabellenDefinition);
    }

    private void dosuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return String.this.\u00f8O0000.OO0000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Werte", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                if (String.this.\u00f8O0000.OO0000().get(n) > 0) {
                    return "+" + String.this.\u00f8O0000.OO0000().get(n);
                }
                return String.this.\u00f8O0000.OO0000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                String.this.\u00f8O0000.\u00d400000((Integer)object);
                String.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return String.this.\u00f8O0000.OO0000().get(n);
            }
        });
        this.o00000(3, tabellenDefinition);
    }

    private SpaltenDefinition Object(final int n) {
        return new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+" + n){

            @Override
            public void click(Object object) {
                String.this.\u00f8O0000.\u00d500000((Integer)object);
                String.this.\u00d500000();
            }

            @Override
            public Object getData(int n2) {
                return new Integer(n);
            }
        };
    }
}

