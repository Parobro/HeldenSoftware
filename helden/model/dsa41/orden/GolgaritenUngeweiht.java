/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.while;
import helden.framework.OoOO.return;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.dsa41.orden.BasisOrden;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.ordenskrieger.GolgaritUngeweiht;
import java.util.ArrayList;

public class GolgaritenUngeweiht
extends BasisOrden {
    public GolgaritenUngeweiht() {
        super("Orden des Heiligen Golgari (Ungeweiht)");
    }

    @Override
    public ArrayList<helden.framework.oooo.a.b_0> getBedingteWerte() {
        ArrayList<helden.framework.oooo.a.b_0> arrayList = new ArrayList<helden.framework.oooo.a.b_0>();
        arrayList.add(new helden.framework.oooo.a.b_0((Object)new return(b_0.\u00f5\u00f5\u00d2000, 1), Bedingung.hatKeinKarma()));
        return arrayList;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hatNicht(while.o\u00d4\u00d4000), Bedingung.hatNicht(while.\u00d6\u00d8\u00d8000), Bedingung.hatNicht(I.\u00d3\u00f5O000), Bedingung.hatNicht(I.\u00f8\u00d50000));
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000, 2, 10), Bedingung.hat(voidsuper.ifforObject, (Integer)7), Bedingung.hat(voidsuper.\u00d4\u00d2\u00d8000, (Integer)7), Bedingung.hat(voidsuper.\u00d5O\u00d6000, (Integer)10), Bedingung.hat(voidsuper.\u00d4\u00f8\u00d5000, (Integer)10), bedingungsVerknuepfung, Bedingung.hatNichtProfession(Ordenskrieger.class, new GolgaritUngeweiht()));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Boron"}));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

