/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererazaraidesshinxirit;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.profession.niedererazaraidesshinxirit.NiedererAzaraidesShinXiritVariante;
import java.util.ArrayList;

public class ShinXiritIlshiVailen
extends NiedererAzaraidesShinXiritVariante {
    public ShinXiritIlshiVailen() {
        super("Niederer Azarai des Shin-Xirit aus Ilshi Vailen", "Niederer Azarai des Shin-Xirit aus Ilshi Vailen", 18, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 0;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000("Karmalqueste"));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d4\u00d8000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.newnewObject, 3);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(K.o00000("Gueraiausbildung"));
        return oo0O;
    }
}

