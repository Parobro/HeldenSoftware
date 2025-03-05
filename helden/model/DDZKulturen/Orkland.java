/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Bergmann;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Fuhrmann;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tageloehner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.profession.Schamane;
import java.util.ArrayList;
import java.util.Iterator;

public class Orkland
extends helden.model.kultur.Orkland {
    public static final helden.framework.int.P Stringclassreturn = new helden.framework.int.P("Ghorinchai", 4, false);
    public static final helden.framework.int.P \u00f800O00 = new helden.framework.int.P("Tordochai", 2, false);
    private P \u00f500O00;

    public Orkland() {
    }

    public Orkland(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        if (this.istVariante(Stringclassreturn)) {
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(voidsuper.ifforObject, 1);
        }
        if (this.istVariante(\u00f800O00)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(E.newnewString, 1);
        }
    }

    @Override
    public String getID() {
        return "K75";
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d4O000.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f8\u00f8\u00f8000) {
            case 1: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.o\u00f4\u00f5000);
                int[] nArray = new int[]{2};
                ++this.\u00f8\u00f8\u00f8000;
                if (!this.istVariante(\u00d300O00)) {
                    ++this.\u00f8\u00f8\u00f8000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        return super.getNextTalentAuswahl();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (this.istVariante(\u00d8\u00f8\u00f8000)) {
            basisDDZProfessionMitGeweihter = new Bauer(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getErntehelfer());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getFeldsklave());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getKnecht());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getLeibeigener());
            arrayList.add(basisDDZProfessionMitGeweihter);
            l2 = new Tageloehner(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Tageloehner)l2).getBauhelfer());
            l2.addMoeglicheVariante(((Tageloehner)l2).getHolzfaeller());
            arrayList.add(l2);
        }
        if (this.istVariante(\u00d400O00)) {
            basisDDZProfessionMitGeweihter = new Bauer(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getFreibauer());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Bauer)basisDDZProfessionMitGeweihter).getViehzuechter());
            arrayList.add(basisDDZProfessionMitGeweihter);
            if (this.istVariante(\u00d800O00)) {
                arrayList.add(new Bergmann(this.getGeschlecht(), g2, g3));
            }
            arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
            arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
            l2 = new Prospektor(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            if (this.istVariante(\u00d800O00)) {
                l2.addMoeglicheVariante(((Prospektor)l2).getGoldsucher());
            }
            l2.addMoeglicheVariante(((Prospektor)l2).getSammler());
            arrayList.add(l2);
        }
        if (this.istVariante(\u00d300O00)) {
            if (this.istVariante(O00O00)) {
                basisDDZProfessionMitGeweihter = new Haendler(this.getGeschlecht(), g2, g3);
                basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
                basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Haendler)basisDDZProfessionMitGeweihter).getFahrenderHaendler());
                arrayList.add(basisDDZProfessionMitGeweihter);
                arrayList.add(new Fuhrmann(this.getGeschlecht(), g2, g3));
            }
            basisDDZProfessionMitGeweihter = new Haendler(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Haendler)basisDDZProfessionMitGeweihter).getTauschhaendler());
            arrayList.add(basisDDZProfessionMitGeweihter);
            l2 = new Handwerker(this.getGeschlecht(), g2, g3);
            l2.addMoeglicheVariante(((Handwerker)l2).getArchaischeOrk());
            arrayList.add(l2);
            arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
            arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        }
        if (this.istVariante(whileStringreturn)) {
            arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
            basisDDZProfessionMitGeweihter = new Jaeger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.removeMoeglicheVariante(((Jaeger)basisDDZProfessionMitGeweihter).getWildhueter());
            arrayList.add(basisDDZProfessionMitGeweihter);
            arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
            l2 = new Soeldner(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Soeldner)l2).getSklavenAufseher());
            arrayList.add(l2);
            Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            stammeskrieger.clearMoeglicheVarianten();
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getOrk());
            arrayList.add(stammeskrieger);
        }
        if (this.istVariante(thisclassreturn)) {
            basisDDZProfessionMitGeweihter = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getOrk());
            arrayList.add(basisDDZProfessionMitGeweihter);
            l2 = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Schamane)l2).getTairachPriester());
            l2.addMoeglicheVariante(((Schamane)l2).getGraveshPriester());
            l2.addMoeglicheVariante(((Schamane)l2).getGraveshPriesterGeweiht());
            l2.addMoeglicheVariante(((Schamane)l2).getRakaiPriester());
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        if (this.istVariante(Stringclassreturn) && this.\u00f500O00 != null) {
            oOOo.o00000(this.\u00f500O00);
        }
        return oOOo;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.istVariante(\u00f800O00)) {
            J j2 = (J)K.o00000(I.\u00f4\u00f50000);
            j2.oO0000(5);
            oo0O.\u00d300000(j2);
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.istVariante(Stringclassreturn) && this.\u00f500O00 == null;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Orkland");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<helden.framework.int.P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00f500O00 = p2;
    }

    @Override
    protected void setzeAlleVarianten() {
        super.setzeAlleVarianten();
        this.addAlleVarianten(Stringclassreturn);
        this.addAlleVarianten(\u00f800O00);
    }

    @Override
    protected void setzeModifikationen() {
        super.setzeModifikationen();
        if (this.istVariante(Stringclassreturn)) {
            this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 2);
        }
        if (this.istVariante(\u00f800O00)) {
            this.putModifikator(b_0.privatedosuper, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        super.setzeMoeglicheVarianten();
        this.addMoeglicheVariante(Stringclassreturn);
        this.addMoeglicheVariante(\u00f800O00);
    }
}

