/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.B;
import helden.framework.E.C.K;
import helden.framework.E.F;
import helden.framework.E.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.super.B.super.String;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class class
extends ZweiTabellenZustand {
    private ArrayList<E> publicsuper;
    private K \u00f4o0000;

    public class(F f2) {
        super(null);
        this.\u00f4o0000 = (K)f2.o00000(B.\u00d200000, 0);
        this.publicsuper = new ArrayList();
        this.publicsuper.addAll(this.\u00f4o0000.\u00d6\u00d40000());
        this.\u00d800000();
        this.\u00d500000();
        this.createPanel();
        this.update();
    }

    public void o00000(E e) {
        this.publicsuper.add(e);
        this.update();
    }

    public boolean return() {
        this.\u00f4o0000.ifObject();
        for (E e : this.publicsuper) {
            this.\u00f4o0000.o00000(e);
        }
        return true;
    }

    @Override
    public void update() {
        super.update();
    }

    private void \u00d500000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 0;
            }
        };
        String string = new String(this);
        tabellenDefinition.setPanel(string);
        this.setSpaltenOben(tabellenDefinition);
    }

    private void \u00d800000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return class.this.publicsuper.size();
            }
        };
        tabellenDefinition.setGlobalname("Gew\u00e4hlte Arten von Tierangriffen:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 180, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return class.this.publicsuper.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                class.this.publicsuper.remove(object);
                class.this.update();
            }

            @Override
            public Object getData(int n) {
                return class.this.publicsuper.get(n);
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
        this.setSpaltenOben(arrayList2);
    }
}

