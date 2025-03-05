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
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.kultur.BasisTharunKulturen;
import helden.model.tharun.profession.ConossischerBauernguerai;
import helden.model.tharun.profession.NiedererGuerai;
import java.util.ArrayList;

public class Conossos
extends BasisTharunKulturen {
    public Conossos() {
        super("Conossos");
    }

    public Conossos(Geschlecht geschlecht) {
        super(geschlecht, "Conossos");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Hiebwaffen"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Athletik"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Klettern"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 1);
        this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Orientierung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Wettervorhersage"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Tierkunde"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Holzbearbeitung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Lederarbeiten"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Viehzucht"), 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Geiz"));
        arrayList.add(K.o00000("Meeresangst"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K195";
    }

    @Override
    public G getMuttersprache() {
        return G.o\u00f6\u00f5000;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = super.getProfessionen(floatsuper2);
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            arrayList.add(new ConossischerBauernguerai(this.getGeschlecht(), g2, g3));
            NiedererGuerai niedererGuerai = new NiedererGuerai(this.getGeschlecht(), g2, g3);
            niedererGuerai.clearMoeglicheVarianten();
            niedererGuerai.addMoeglicheVariante(niedererGuerai.getNiedererGueraiausConossos());
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
        oOOo.o00000(oooo_0.o00000("Kulturkunde", "Conossos"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Verschwendungssucht"));
        arrayList.add(K.o00000("Verw\u00f6hnt"));
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
    protected void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Raufen"));
        arrayList.add(N.floatsuper().\u00d200000("Ringen"));
        int[] nArray = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("AuP"), 2);
    }
}

