/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class if
extends G {
    private ArrayList<voidsuper> o\u00d20000 = new ArrayList();

    public if(new new_) {
        super(new_);
        for (voidsuper voidsuper2 : this.publicnew().\u00d3o0000()) {
            if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000) || voidsuper2.toString().equals("Muttersprache")) continue;
            this.o\u00d20000.add(voidsuper2);
        }
        this.o\u00d30000();
        this.\u00d2\u00d30000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Zweit-/Lehrsprachen";
    }

    public new publicnew() {
        return (new)super.\u00d200000();
    }

    private void o\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return if.this.o\u00d20000.size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talentname", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return ((voidsuper)if.this.o\u00d20000.get(n)).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                if.this.publicnew().\u00d200000((helden.framework.OoOO.G)object);
                if.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return if.this.o\u00d20000.get(n);
            }
        });
        this.o00000(tabellenDefinition);
    }

    private void \u00d2\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return if.this.publicnew().returnsuper().size();
            }
        };
        tabellenDefinition.setTabname("Zweit- und Lehrsprachen:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talentname", 140, false, String.class){

            @Override
            public Object getData(int n) {
                return if.this.publicnew().returnsuper().get(n).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                if.this.publicnew().o00000((helden.framework.OoOO.G)object);
                if.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return if.this.publicnew().returnsuper().get(n);
            }
        });
        this.\u00d200000(tabellenDefinition);
    }
}

