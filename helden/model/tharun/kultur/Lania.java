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
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.kultur.BasisTharunKulturen;
import helden.model.tharun.profession.LanianischeHalbeGuerai;
import helden.model.tharun.profession.NiedererAzaraiderNanurta;
import helden.model.tharun.profession.NiedererGuerai;
import java.util.ArrayList;

public class Lania
extends BasisTharunKulturen {
    public Lania() {
        super("Lania");
    }

    public Lania(Geschlecht geschlecht) {
        super(geschlecht, "Lania");
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(N.floatsuper().\u00d200000("Dolche"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Singen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Tanzen"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Zechen"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Bet\u00f6ren"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        this.addTalentwert(voidsuper.oo\u00d6000, 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        this.addTalentwert(N.floatsuper().\u00d200000("Schneidern"), 2);
        this.addTalentwert(N.floatsuper().\u00d200000("Kochen"), 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Wohlklang"));
        arrayList.add(K.o00000("Herausragendes Aussehen"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Meeresangst"));
        arrayList.add(K.o00000("Verw\u00f6hnt"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K196";
    }

    @Override
    public G getMuttersprache() {
        return G.O\u00f6\u00f5000;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = super.getProfessionen(floatsuper2);
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            NiedererAzaraiderNanurta niedererAzaraiderNanurta = new NiedererAzaraiderNanurta(this.getGeschlecht(), g2, g3);
            niedererAzaraiderNanurta.clearMoeglicheVarianten();
            niedererAzaraiderNanurta.addMoeglicheVariante(niedererAzaraiderNanurta.getNiedererAzaraiderNanurtaM());
            arrayList.remove(niedererAzaraiderNanurta);
            NiedererGuerai niedererGuerai = new NiedererGuerai(this.getGeschlecht(), g2, g3);
            niedererGuerai.clearMoeglicheVarianten();
            niedererGuerai.addMoeglicheVariante(niedererGuerai.getNiedererGueraiausLania());
            arrayList.add(niedererGuerai);
        } else {
            NiedererAzaraiderNanurta niedererAzaraiderNanurta = new NiedererAzaraiderNanurta(this.getGeschlecht(), g2, g3);
            niedererAzaraiderNanurta.clearMoeglicheVarianten();
            niedererAzaraiderNanurta.addMoeglicheVariante(niedererAzaraiderNanurta.getNiedererAzaraiderNanurtaW());
            arrayList.add(niedererAzaraiderNanurta);
            arrayList.add(new LanianischeHalbeGuerai(this.getGeschlecht(), g2, g3));
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
        oOOo.o00000(oooo_0.o00000("Kulturkunde", "Lania"));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
        arrayList.add(K.o00000("J\u00e4hzorn"));
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
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
        int[] nArray2 = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Baukunst"));
        arrayList.add(voidsuper.\u00f4o\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Geschichtswissen"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Stoffe f\u00e4rben"));
        int[] nArray3 = new int[]{2, 1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Ackerbau"));
        arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
        arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
        int[] nArray4 = new int[]{1};
        this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray4));
    }
}

