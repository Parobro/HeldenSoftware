/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.String;

import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.O0OO;
import helden.gui.G.String.oOOO;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
extends TabellenDefinition {
    private O0OO \u00f6\u00f50000;
    private oOOO \u00f8\u00f50000;

    public B(O0OO o0OO2, oOOO oOOO2) {
        this.\u00f6\u00f50000 = o0OO2;
        this.\u00f8\u00f50000 = oOOO2;
        this.setGlobalname("Gew\u00e4hlte Sonderfertigkeiten:");
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return B.this.\u00f6\u00f50000.\u00d800000().\u00f5O0000().\u00d3O0000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Nutzbar", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public Object getData(int n) {
                return B.this.\u00f6\u00f50000.\u00d800000().\u00f5O0000().\u00d3O0000().get(n);
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                return SpaltenDefinition.ART.\u00f600000;
            }

            @Override
            public boolean getSelected(Object object) {
                return B.this.\u00f6\u00f50000.null((P)object);
            }

            @Override
            public boolean isEditable() {
                return false;
            }

            @Override
            public void selected(Object object, boolean bl) {
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                B.this.\u00f6\u00f50000.\u00f500000((P)object);
                B.this.\u00f8\u00f50000.update();
            }

            @Override
            public Object getData(int n) {
                return B.this.\u00f6\u00f50000.\u00d800000().\u00f5O0000().\u00d3O0000().get(n);
            }
        });
    }

    @Override
    public int getAnzahl() {
        return this.\u00f6\u00f50000.\u00d800000().\u00f5O0000().\u00d3O0000().size();
    }

    @Override
    public Integer getWeightY() {
        return 10;
    }
}

