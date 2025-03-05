/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.return;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.dsa41.orden.BasisOrden;
import helden.model.profession.Geweihter;
import helden.model.profession.geweihter.PeraineTherbunit;
import java.util.ArrayList;

public class Therbuniten
extends BasisOrden {
    public Therbuniten() {
        super("Orden der Therb\u00fbniten");
    }

    @Override
    public ArrayList<helden.framework.oooo.a.b_0> getBedingteWerte() {
        ArrayList<helden.framework.oooo.a.b_0> arrayList = new ArrayList<helden.framework.oooo.a.b_0>();
        arrayList.add(new helden.framework.oooo.a.b_0((Object)new return(b_0.\u00f5\u00f5\u00d2000, 1), Bedingung.hatKeinKarma()));
        return arrayList;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatTalente(1, 12, voidsuper.\u00f4\u00d5\u00d6000, voidsuper.\u00f5\u00f5\u00d6000, voidsuper.StringObjectObject, voidsuper.\u00d5\u00d5\u00d6000), Bedingung.hatTalente(1, 7, voidsuper.\u00f4\u00d5\u00d6000, voidsuper.\u00f5\u00f5\u00d6000, voidsuper.StringObjectObject, voidsuper.\u00d5\u00d5\u00d6000), Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super, 2, 7));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatTalente(2, 7, voidsuper.\u00f4\u00d5\u00d6000, voidsuper.\u00f5\u00f5\u00d6000, voidsuper.StringObjectObject, voidsuper.\u00d5\u00d5\u00d6000), Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super, 1, 7), Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super, 1, 12));
        BedingungsVerknuepfung bedingungsVerknuepfung3 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, bedingungsVerknuepfung, bedingungsVerknuepfung2);
        BedingungsVerknuepfung bedingungsVerknuepfung4 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000, 1, 12), bedingungsVerknuepfung3);
        BedingungsVerknuepfung bedingungsVerknuepfung5 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hatTalente(3, 7, voidsuper.ifforObject, voidsuper.\u00d4\u00f8\u00d5000, voidsuper.\u00d4\u00d2\u00d8000), Bedingung.hatTalente(3, 7, voidsuper.nullvoidObject, voidsuper.\u00f4\u00d2\u00d6000, voidsuper.thisinterfaceObject));
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.whilewhilesuper, (Integer)14), Bedingung.hat(b_0.newwhilesuper, (Integer)13), Bedingung.hat(b_0.O\u00f5\u00d2000, (Integer)13), Bedingung.hat(b_0.returnwhilesuper, (Integer)13), bedingungsVerknuepfung4, bedingungsVerknuepfung5, Bedingung.hatNichtProfession(Geweihter.class, new PeraineTherbunit()));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Peraine"}));
        return oo0O;
    }
}

