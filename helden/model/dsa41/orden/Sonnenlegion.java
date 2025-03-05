/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.return;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.dsa41.orden.BasisOrden;
import helden.model.profession.FaehnrichFusskaemper;
import helden.model.profession.FaehnrichKavallerie;
import helden.model.profession.Krieger;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Ritter;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import java.util.ArrayList;

public class Sonnenlegion
extends BasisOrden {
    public Sonnenlegion() {
        super("Sonnenlegion");
    }

    @Override
    public ArrayList<b_0> getBedingteWerte() {
        ArrayList<b_0> arrayList = new ArrayList<b_0>();
        arrayList.add(new b_0((Object)new return(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000, 1), Bedingung.hatKeinKarma()));
        return arrayList;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatNicht(I.\u00d5\u00d3O000), Bedingung.hatNicht(I.\u00f5\u00d8o000), Bedingung.hatNicht(I.forsupersuper), Bedingung.hatNicht(I.\u00d3O0000), Bedingung.hatNicht(I.newif), Bedingung.hatNicht(I.nullclass), Bedingung.hatNicht(I.\u00f8\u00d2o000), Bedingung.hatNicht(I.newfor), Bedingung.hatNicht(I.privateclass), Bedingung.hatNicht(I.o\u00f5O000), Bedingung.hatNicht(I.thisclass), Bedingung.hatNicht(I.\u00f40\u00d2000), Bedingung.hatNicht(I.\u00f5\u00d6O000), Bedingung.hatNicht(I.\u00d3\u00d6o000), Bedingung.hatNicht(I.\u00f4\u00f5o000));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hatProfession(Krieger.class), Bedingung.hatProfession(FaehnrichFusskaemper.class), Bedingung.hatProfession(FaehnrichKavallerie.class), Bedingung.hatProfession(Ordenskrieger.class), Bedingung.hatProfession(Schwertgeselle.class), Bedingung.hatProfession(Ritter.class), Bedingung.hatProfession(Soldat.class), Bedingung.hatProfession(Soeldner.class));
        BedingungsVerknuepfung bedingungsVerknuepfung3 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)5), Bedingung.hat(voidsuper.\u00f4\u00d2\u00d6000, (Integer)5));
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(helden.framework.oooo.b_0.whilewhilesuper, (Integer)15), Bedingung.hat(helden.framework.oooo.b_0.\u00f4\u00f4\u00d2000, (Integer)14), Bedingung.hat(helden.framework.oooo.b_0.returnwhilesuper, (Integer)12), Bedingung.hat(helden.framework.oooo.b_0.privatedosuper, (Integer)14), Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000, 2, 10), Bedingung.hat(voidsuper.ifforObject, (Integer)7), Bedingung.hat(voidsuper.\u00d4\u00d2\u00d8000, (Integer)7), Bedingung.hat(voidsuper.\u00d5O\u00d6000, (Integer)10), Bedingung.hat(voidsuper.\u00d4\u00f8\u00d5000, (Integer)10), Bedingung.hat(voidsuper.oo\u00d6000, (Integer)7), Bedingung.hat(voidsuper.nullvoidObject, (Integer)7), bedingungsVerknuepfung3, bedingungsVerknuepfung2, bedingungsVerknuepfung);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d8\u00d5\u00d8000, 1);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 4);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Praios"}));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        return oo0O;
    }
}

