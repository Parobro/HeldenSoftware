/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.C.public;
import helden.framework.E.B;
import helden.framework.E.C.K;
import helden.framework.E.F;
import helden.framework.OoOO.voidsuper;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.super.B.super.P;
import java.util.ArrayList;

public class OOOo
extends ZweiTabellenZustand {
    private ArrayList<public> \u00d4\u00d20000;
    private K \u00d3\u00d20000;

    public OOOo(F f2) {
        super(null);
        this.\u00d3\u00d20000 = (K)f2.o00000(B.\u00d200000, 0);
        this.\u00d4\u00d20000 = new ArrayList();
        this.\u00d4\u00d20000.addAll(this.\u00d3\u00d20000.\u00f5\u00d40000().o00000().getListe());
        this.Stringsuper();
        this.\u00d8O0000();
        this.createPanel();
        this.update();
    }

    public void o00000(public public_) {
        if (!this.\u00d4\u00d20000.contains(public_)) {
            this.\u00d4\u00d20000.add(public_);
        }
        this.update();
    }

    public String \u00f4O0000() {
        return "Verf\u00fcgbare Sonderfertigkeiten:";
    }

    public String \u00f5O0000() {
        return "Gew\u00e4hlte Vor- und Nachteile:";
    }

    @Override
    public String getBezeichner() {
        return "Vor- und Nachteile";
    }

    public boolean \u00f8O0000() {
        this.\u00d3\u00d20000.\u00d8\u00d30000();
        for (public public_ : this.\u00d4\u00d20000) {
            this.\u00d3\u00d20000.o00000(public_);
        }
        return true;
    }

    @Override
    public void update() {
        super.update();
    }

    private void \u00d8O0000() {
        P p2 = new P(this, this.\u00d3\u00d20000);
        this.setSpaltenOben(p2);
    }

    private void Stringsuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return OOOo.this.\u00d4\u00d20000.size();
            }
        };
        tabellenDefinition.setGlobalname("Gew\u00e4hlte Vor- und Nachteile:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Vor- / Nachteil", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return ((public)OOOo.this.\u00d4\u00d20000.get(n)).oO0000();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                OOOo.this.\u00d4\u00d20000.remove(object);
                OOOo.this.update();
            }

            @Override
            public Object getData(int n) {
                return OOOo.this.\u00d4\u00d20000.get(n);
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
        tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 0;
            }
        };
        arrayList = tabellenDefinition.getSpaltenDefinition();
        ArrayList<TabellenDefinition> arrayList2 = new ArrayList<TabellenDefinition>();
        arrayList2.add(tabellenDefinition);
        arrayList2.add(tabellenDefinition);
        this.setSpaltenOben(arrayList2);
    }
}

