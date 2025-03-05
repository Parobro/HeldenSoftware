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
import helden.framework.int.L;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.kultur.BasisTharunKulturen;
import helden.model.tharun.profession.Brigantai;
import helden.model.tharun.profession.IlshitischerAdliger;
import helden.model.tharun.profession.Kymanai;
import helden.model.tharun.profession.Masha;
import helden.model.tharun.profession.Maturai;
import helden.model.tharun.profession.NiedererAzaraiderNanurta;
import helden.model.tharun.profession.NiedererAzaraidesArkanZin;
import helden.model.tharun.profession.NiedererAzaraidesNuminoru;
import helden.model.tharun.profession.NiedererAzaraidesOjoSombri;
import helden.model.tharun.profession.NiedererAzaraidesPateshi;
import helden.model.tharun.profession.NiedererAzaraidesShinXirit;
import helden.model.tharun.profession.NiedererAzaraidesSindayru;
import helden.model.tharun.profession.NiedererAzaraidesZirraku;
import helden.model.tharun.profession.NiedererGuerai;
import helden.model.tharun.profession.Numinai;
import java.util.ArrayList;

public class IlshiVailen
extends BasisTharunKulturen {
    public IlshiVailen() {
        super("Ilshi Vailen");
    }

    public IlshiVailen(Geschlecht geschlecht) {
        super(geschlecht, "Ilshi Vailen");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Dolche"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Raufen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Ringen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 3);
        this.addTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Fischen/Angeln"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Orientierung"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        this.addTalentwert(N.floatsuper().\u00d200000("Heraldik"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Malen/Zeichnen"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Schneidern"), 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Meeresangst"));
        arrayList.add(K.o00000("Vorurteile"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K201";
    }

    @Override
    public G getMuttersprache() {
        return G.StringObjectclass;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Brigantai(this.getGeschlecht(), g2, g3));
        arrayList.add(new Numinai(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kymanai(this.getGeschlecht(), g2, g3));
        arrayList.add(new Maturai(this.getGeschlecht(), g2, g3));
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            arrayList.add(new NiedererAzaraidesArkanZin(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesNuminoru(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesOjoSombri(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesPateshi(this.getGeschlecht(), g2, g3));
            l2 = new NiedererAzaraidesShinXirit(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((NiedererAzaraidesShinXirit)l2).getShinXiritIlshiVailen());
            arrayList.add(l2);
            arrayList.add(new NiedererAzaraidesSindayru(this.getGeschlecht(), g2, g3));
            NiedererAzaraidesZirraku niedererAzaraidesZirraku = new NiedererAzaraidesZirraku(this.getGeschlecht(), g2, g3);
            niedererAzaraidesZirraku.clearMoeglicheVarianten();
            niedererAzaraidesZirraku.addMoeglicheVariante(niedererAzaraidesZirraku.getZirrakuIlshiVailen());
            arrayList.add(niedererAzaraidesZirraku);
        } else {
            l2 = new NiedererAzaraiderNanurta(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((NiedererAzaraiderNanurta)l2).getNiedererAzaraiderNanurtaW());
            arrayList.add(l2);
        }
        arrayList.add(new Masha(this.getGeschlecht(), g2, g3));
        arrayList.add(new IlshitischerAdliger(this.getGeschlecht(), g2, g3));
        l2 = new NiedererGuerai(this.getGeschlecht(), g2, g3);
        l2.clearMoeglicheVarianten();
        l2.addMoeglicheVariante(((NiedererGuerai)l2).getNiedererGueraiausIlshiVailen());
        arrayList.add(l2);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f8O\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.o00000(oooo_0.o00000("Kulturkunde", "Ilshi Vailen"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Impulsiv"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (!this.istVariante(newifreturn)) {
            oo0O.\u00d300000(K.o00000("Autorit\u00e4tsgl\u00e4ubig", 8));
        }
        oo0O.\u00d300000(K.o00000("Dunkelangst", 5));
        return oo0O;
    }

    @Override
    public void setAuswahlen() {
        super.setAuswahlen();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Athletik"));
        arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
        arrayList.add(voidsuper.returnprivateObject);
        int[] nArray = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray2 = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Ackerbau"));
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        int[] nArray3 = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray3));
    }
}

