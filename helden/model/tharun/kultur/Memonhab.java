/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.kultur.BasisTharunKulturen;
import helden.model.tharun.profession.NiedererGuerai;
import java.util.ArrayList;

public class Memonhab
extends BasisTharunKulturen {
    public Memonhab() {
        super("Memonhab");
    }

    public Memonhab(Geschlecht geschlecht) {
        super(geschlecht, "Memonhab");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Dolche"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Raufen"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Ringen"), 3);
        this.addTalentwert(N.floatsuper().\u00d200000("Athletik"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Tanzen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Fischen/Angeln"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Orientierung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        this.addTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("T\u00f6pfern"), 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Prophezeien"));
        arrayList.add(K.o00000("Einbildungen"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Krankhafte Reinlichkeit"));
        arrayList.add(K.o00000("Meeresangst"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K198";
    }

    @Override
    public G getMuttersprache() {
        return G.newthisclass;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = super.getProfessionen(floatsuper2);
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            NiedererGuerai niedererGuerai = new NiedererGuerai(this.getGeschlecht(), g2, g3);
            niedererGuerai.clearMoeglicheVarianten();
            niedererGuerai.addMoeglicheVariante(niedererGuerai.getNiedererGueraiausMemonhab());
            arrayList.add(niedererGuerai);
        }
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f8O\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.o00000(oooo_0.o00000("Kulturkunde", "Memonhab"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Albino"));
        arrayList.add(K.o00000("Impulsiv"));
        arrayList.add(K.o00000("Lichtempfindlich"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Hitzeresistenz"));
        if (!this.istVariante(newifreturn)) {
            oo0O.\u00d300000(K.o00000("Autorit\u00e4tsgl\u00e4ubig", 6));
        }
        oo0O.\u00d300000(K.o00000("Dunkelangst", 5));
        return oo0O;
    }

    @Override
    public void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Ackerbau"));
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        int[] nArray = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
    }
}

