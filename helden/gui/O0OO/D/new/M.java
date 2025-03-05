/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.oooo.b_0;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class M
extends G {
    private ArrayList<b_0> \u00d3\u00d20000 = this.classObject().\u00f6o0000();

    public M(new new_) {
        super(new_);
        this.\u00f6\u00d30000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Eigenschaften";
    }

    public new classObject() {
        return (new)super.\u00d200000();
    }

    private void \u00f6\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return M.this.\u00d3\u00d20000.size();
            }
        };
        tabellenDefinition.setGlobalname("Eigenschaften:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Eigenschaft", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return M.this.\u00d3\u00d20000.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Min", 50, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                M.this.classObject().o00000((b_0)object, n);
                M.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                b_0 b_02 = (b_0)M.this.\u00d3\u00d20000.get(n);
                if (b_02.publicString() || b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                    return b_02;
                }
                return null;
            }

            @Override
            public int getMax(Object object) {
                return 14;
            }

            @Override
            public int getMin(Object object) {
                b_0 b_02 = (b_0)object;
                if (b_02.publicString() && !b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                    return 8;
                }
                return 1;
            }

            @Override
            public int getValue(Object object) {
                return M.this.classObject().\u00d500000((b_0)object);
            }
        });
        arrayList.add(new SpaltenDefinition("Max", 50, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                M.this.classObject().\u00d600000(n);
                M.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                b_0 b_02 = (b_0)M.this.\u00d3\u00d20000.get(n);
                if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                    return b_02;
                }
                return null;
            }

            @Override
            public int getMax(Object object) {
                return 14;
            }

            @Override
            public int getMin(Object object) {
                return 1;
            }

            @Override
            public int getValue(Object object) {
                return M.this.classObject().thisnew();
            }
        });
        arrayList.add(new SpaltenDefinition("Modifizierer", 50, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                M.this.classObject().\u00d200000((b_0)object, n);
                M.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                b_0 b_02 = (b_0)M.this.\u00d3\u00d20000.get(n);
                return b_02;
            }

            @Override
            public int getMax(Object object) {
                b_0 b_02 = (b_0)object;
                if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                    return 3;
                }
                if (b_02.publicString()) {
                    return 3;
                }
                return 40;
            }

            @Override
            public int getMin(Object object) {
                b_0 b_02 = (b_0)object;
                if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                    return 0;
                }
                if (b_02.publicString()) {
                    return -3;
                }
                return -10;
            }

            @Override
            public int getValue(Object object) {
                return M.this.classObject().String((b_0)object);
            }
        });
        this.o00000(tabellenDefinition);
    }
}

