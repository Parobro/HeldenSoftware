/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Dschungelstaemme
extends helden.model.kultur.Dschungelstaemme {
    public static final P o\u00d5\u00f8000 = new P("Wudu", 1, false);
    private int O\u00d5\u00f8000 = 0;

    public Dschungelstaemme() {
    }

    public Dschungelstaemme(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        if (this.istVariante(o\u00d5\u00f8000)) {
            this.removeTalent(voidsuper.returnprivateObject);
            this.removeTalent(voidsuper.\u00f80\u00d6000);
            this.removeTalent(voidsuper.thisclassObject);
            this.addTalentwert(voidsuper.\u00d5\u00d3\u00d8000, 2);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, -2);
            this.addTalentwert(voidsuper.StringObjectObject, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        if (this.istVariante(o\u00d5\u00f8000)) {
            arrayList.remove(I.whilereturn);
            arrayList.add(I.ifreturn);
            arrayList.add(I.\u00f4\u00f50000);
            arrayList.add(I.\u00d8\u00d4O000);
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return "K74";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Dschungelst\u00e4mme";
    }

    @Override
    public G getMuttersprache() {
        if (this.istVariante(o\u00d5\u00f8000)) {
            return G.returnStringclass;
        }
        return G.\u00d5o\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00d5\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                ++this.O\u00d5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter2;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        if (this.istVariante(privateinterfaceclass)) {
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getWaldmensch());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getKanutepeku());
        } else if (this.istVariante(o\u00d5\u00f8000)) {
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getBlutKrieger());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getTapasuulBlutkrieger());
        } else {
            stammeskrieger.waehleVariante(stammeskrieger.getWaldmensch());
        }
        arrayList.add(stammeskrieger);
        if (!this.istVariante(o\u00d5\u00f8000)) {
            basisDDZProfessionMitGeweihter2 = new Fischer(this.getGeschlecht(), g2, g3);
            if (this.istVariante(privateinterfaceclass)) {
                basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((Fischer)basisDDZProfessionMitGeweihter2).getBergungstaucher());
                basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((Fischer)basisDDZProfessionMitGeweihter2).getHarpunier());
                basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((Fischer)basisDDZProfessionMitGeweihter2).getUnterwasserjaeger());
            }
            arrayList.add(basisDDZProfessionMitGeweihter2);
            arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
            arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
            basisDDZProfessionMitGeweihter = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            arrayList.remove(basisDDZProfessionMitGeweihter);
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Haendler)basisDDZProfessionMitGeweihter).getTauschhaendler());
            arrayList.add(basisDDZProfessionMitGeweihter);
        } else {
            basisDDZProfessionMitGeweihter2 = new Grosswildjaeger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter2.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((Grosswildjaeger)basisDDZProfessionMitGeweihter2).getSklavenjaeger());
            arrayList.add(basisDDZProfessionMitGeweihter2);
        }
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        basisDDZProfessionMitGeweihter2 = new Prospektor(this.getGeschlecht(), g2, g3);
        if (this.istVariante(o\u00d5\u00f8000)) {
            basisDDZProfessionMitGeweihter2.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((Prospektor)basisDDZProfessionMitGeweihter2).getSammler());
        }
        arrayList.add(basisDDZProfessionMitGeweihter2);
        basisDDZProfessionMitGeweihter = new Handwerker(this.getGeschlecht(), g2, g3);
        basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
        basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Handwerker)basisDDZProfessionMitGeweihter).getArchaischeSuedAventuriens());
        arrayList.add(basisDDZProfessionMitGeweihter);
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        if (!this.istVariante(o\u00d5\u00f8000)) {
            schamane.waehleVariante(schamane.getMedizinmannDschungelstaemme());
        } else {
            schamane.waehleVariante(schamane.getMedizinmannWudu());
        }
        arrayList.add(schamane);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        if (this.istVariante(o\u00d5\u00f8000)) {
            return G.returnnewclass;
        }
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        if (this.istVariante(o\u00d5\u00f8000)) {
            u2.\u00d500000("Wudu");
        } else {
            u2.\u00d500000(this.getKulturkundeBezeichnung());
        }
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        if (this.istVariante(o\u00d5\u00f8000)) {
            arrayList.add(I.nullclass);
            arrayList.add(I.whilereturn);
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.istVariante(o\u00d5\u00f8000)) {
            oo0O.new(K.o00000(I.O\u00f4O000));
            oo0O.new(K.o00000(I.\u00d50o000));
            oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.O\u00d5\u00f8000 < 1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(super.toString());
        if (this.istVariante(o\u00d5\u00f8000)) {
            stringBuffer.append("/Wudu");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        super.setzeAlleVarianten();
        this.addAlleVarianten(o\u00d5\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        super.setzeModifikationen();
        if (this.istVariante(o\u00d5\u00f8000)) {
            this.putModifikator(b_0.thispublicsuper, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        super.setzeMoeglicheVarianten();
        this.addMoeglicheVariante(o\u00d5\u00f8000);
    }
}

