/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.tharun.kultur.BasisTharunKulturen;
import helden.model.tharun.profession.NiedererGuerai;
import java.util.ArrayList;

public class Kuum
extends BasisTharunKulturen {
    public Kuum() {
        super("Kuum");
    }

    public Kuum(Geschlecht geschlecht) {
        super(geschlecht, "Kuum");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Raufen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Ringen"), 3);
        this.addTalentwert(N.floatsuper().\u00d200000("Athletik"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Orientierung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Geografie"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Tierkunde"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Fahrzeug lenken"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Lederarbeiten"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Viehzucht"), 2);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("Impulsiv"));
        arrayList.add(K.o00000("Meeresangst"));
        arrayList.add(K.o00000("Sucht", "Battushikh"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K194";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f8\u00f4\u00f5000;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = super.getProfessionen(floatsuper2);
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            NiedererGuerai niedererGuerai = new NiedererGuerai(this.getGeschlecht(), g2, g3);
            niedererGuerai.clearMoeglicheVarianten();
            niedererGuerai.addMoeglicheVariante(niedererGuerai.getNiedererGueraiausKuum());
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
        oOOo.o00000(oooo_0.o00000("Kulturkunde", "Kuum"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Glasknochen"));
        arrayList.add(K.o00000("Platzangst"));
        arrayList.add(K.o00000("Lichtempfindlich"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Hitzeresistenz"));
        oo0O.\u00d300000(K.o00000("Richtungssinn"));
        oo0O.\u00d300000(K.o00000("Autorit\u00e4tsgl\u00e4ubig", 6));
        if (!this.istVariante(newifreturn)) {
            oo0O.\u00d300000(K.o00000("Dunkelangst", 5));
        }
        oo0O.\u00d300000(K.o00000("Raumangst", 6));
        return oo0O;
    }

    @Override
    protected void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000("Ortskenntnis", "Stadt"));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d30000));
        this.\u00f8\u00d60O00.add(new objectsuper_0(this, arrayList, 1));
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("AuP"), 2);
    }
}

