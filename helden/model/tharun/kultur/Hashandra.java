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

public class Hashandra
extends BasisTharunKulturen {
    public Hashandra() {
        super("Hashandra");
    }

    public Hashandra(Geschlecht geschlecht) {
        super(geschlecht, "Hashandra");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.setTalentwert(N.floatsuper().\u00d200000("Dolche"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Raufen"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Ringen"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Athletik"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Klettern"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Schwimmen"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Etikette"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Fischen/Angeln"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Orientierung"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        this.setTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Ackerbau"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Holzbearbeitung"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Lederarbeiten"), 1);
        this.setTalentwert(N.floatsuper().\u00d200000("Schneidern"), 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Meeresangst"));
        arrayList.add(K.o00000(I.O\u00d5o000, "Kuumis"));
        arrayList.add(K.o00000(I.O\u00d5o000, "Ilshiten"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K193";
    }

    @Override
    public G getMuttersprache() {
        return G.privateinterfaceString;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = super.getProfessionen(floatsuper2);
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            NiedererGuerai niedererGuerai = new NiedererGuerai(this.getGeschlecht(), g2, g3);
            niedererGuerai.clearMoeglicheVarianten();
            niedererGuerai.addMoeglicheVariante(niedererGuerai.getNiedererGueraiausHashandra());
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
        if (this.istVariante(O\u00d80O00) || this.istVariante(\u00d8\u00d60O00)) {
            if (oOOo.newsuper() != 1) {
                throw new IllegalStateException("Anzahl SF stimmt nicht!");
            }
            oOOo.for();
        }
        oOOo.o00000(this.\u00d4\u00d60O00);
        oOOo.o00000(oooo_0.o00000("Kulturkunde", "Hashandra"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Lichtempfindlich"));
        arrayList.add(K.o00000("Lichtscheu"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (!this.istVariante(newifreturn)) {
            oo0O.\u00d300000(K.o00000("Autorit\u00e4tsgl\u00e4ubig", 6));
        }
        oo0O.\u00d300000(K.o00000("Dunkelangst", 5));
        return oo0O;
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
    }
}

