/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Schamane;
import helden.model.profession.Seefahrer;
import helden.model.profession.Stammeskrieger;
import java.util.ArrayList;

public class Goblinstamm
extends OooO {
    public static final P returnprivateclass = new P("Ebene", 4, true);
    public static final P \u00f4\u00d2\u00f8000 = new P("Gebirge", 3, true);
    public static final P \u00d5\u00d2\u00f8000 = new P("Schneegoblins", 1, true);
    private int \u00d8\u00d2\u00f8000 = 0;

    public Goblinstamm() {
    }

    public Goblinstamm(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.istMaennlich()) {
            this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
            this.setTalentwert(E.newnewString, 1);
            this.setTalentwert(voidsuper.ifforObject, 2);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
            this.setTalentwert(voidsuper.returnforObject, 3);
            this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.setTalentwert(voidsuper.thisvoidObject, 1);
            this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
            this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.setTalentwert(voidsuper.StringvoidObject, 2);
            this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 4);
            this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, -2);
            this.setTalentwert(voidsuper.oo\u00d6000, 1);
            this.setTalentwert(voidsuper.o\u00d5\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00f80\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        } else {
            this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
            this.setTalentwert(E.newnewString, 1);
            this.setTalentwert(voidsuper.ifforObject, 1);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
            this.setTalentwert(voidsuper.returnforObject, 3);
            this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.setTalentwert(voidsuper.thisvoidObject, 1);
            this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00d8\u00d5\u00d6000, 1);
            this.setTalentwert(voidsuper.thisinterfaceObject, 2);
            this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.setTalentwert(voidsuper.StringvoidObject, 2);
            this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
            this.setTalentwert(voidsuper.oo\u00d6000, 1);
            this.setTalentwert(voidsuper.o\u00d5\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.setTalentwert(voidsuper.\u00f80\u00d8000, 2);
            this.setTalentwert(voidsuper.\u00f5\u00f5\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
            this.setTalentwert(voidsuper.o\u00f6\u00d6000, 1);
            this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
        }
        if (this.istVariante(returnprivateclass)) {
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.addTalentwert(G.whilewhileString, 3);
            this.addTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 2);
        }
        if (this.istVariante(\u00f4\u00d2\u00f8000)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 3);
        }
        if (this.istVariante(\u00d5\u00d2\u00f8000)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00d5o0000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K22";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Goblins";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 3;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d8\u00f4\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Goblinische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8\u00d2\u00f8000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d8\u00d2\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d8\u00d2\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter2;
        L l2;
        L l3;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (this.istMaennlich()) {
            l3 = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getGoblin());
            arrayList.add(l3);
            if (this.istVariante(\u00d5\u00d2\u00f8000)) {
                l2 = new Seefahrer(this.getGeschlecht(), g2, g3);
                l2.clearMoeglicheVarianten();
                l2.addMoeglicheVariante(((Seefahrer)l2).getRobbenjaeger());
                arrayList.add(l2);
            }
            l2 = new helden.model.profession.Jaeger(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((helden.model.profession.Jaeger)l2).getVarianteJaeger());
            arrayList.add(l2);
            arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        }
        if (!this.istMaennlich()) {
            l3 = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Handwerker)l3).getArchaischeNordens());
            arrayList.add(l3);
            l2 = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Schamane)l2).getStammesGoblinSchamane());
            arrayList.add(l2);
        }
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        l3 = new Prospektor(this.getGeschlecht(), g2, g3);
        l3.clearMoeglicheVarianten();
        l3.addMoeglicheVariante(((Prospektor)l3).getSammler());
        arrayList.add(l3);
        l2 = new Haendler(this.getGeschlecht(), g2, g3);
        l2.clearMoeglicheVarianten();
        l2.addMoeglicheVariante(((Haendler)l2).getTauschhaendler());
        arrayList.add(l2);
        if (this.istMaennlich()) {
            basisDDZProfessionMitGeweihter2 = new helden.model.DDZprofessionen.Stammeskrieger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter2.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((helden.model.DDZprofessionen.Stammeskrieger)basisDDZProfessionMitGeweihter2).getGoblin());
            arrayList.add(basisDDZProfessionMitGeweihter2);
            if (this.istVariante(\u00d5\u00d2\u00f8000)) {
                basisDDZProfessionMitGeweihter = new helden.model.DDZprofessionen.Seefahrer(this.getGeschlecht(), g2, g3);
                basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
                basisDDZProfessionMitGeweihter.addMoeglicheVariante(((helden.model.DDZprofessionen.Seefahrer)basisDDZProfessionMitGeweihter).getRobbenjaeger());
                arrayList.add(basisDDZProfessionMitGeweihter);
            }
            basisDDZProfessionMitGeweihter = new Jaeger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Jaeger)basisDDZProfessionMitGeweihter).getVarianteJaeger());
            arrayList.add(basisDDZProfessionMitGeweihter);
            arrayList.add(new helden.model.DDZprofessionen.Kundschafter(this.getGeschlecht(), g2, g3));
        }
        if (!this.istMaennlich()) {
            basisDDZProfessionMitGeweihter2 = new helden.model.DDZprofessionen.Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            basisDDZProfessionMitGeweihter2.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((helden.model.DDZprofessionen.Handwerker)basisDDZProfessionMitGeweihter2).getArchaischeNordens());
            arrayList.add(basisDDZProfessionMitGeweihter2);
        }
        arrayList.add(new helden.model.DDZprofessionen.Hirte(this.getGeschlecht(), g2, g3));
        basisDDZProfessionMitGeweihter2 = new helden.model.DDZprofessionen.Prospektor(this.getGeschlecht(), g2, g3);
        basisDDZProfessionMitGeweihter2.clearMoeglicheVarianten();
        basisDDZProfessionMitGeweihter2.addMoeglicheVariante(((helden.model.DDZprofessionen.Prospektor)basisDDZProfessionMitGeweihter2).getSammler());
        arrayList.add(basisDDZProfessionMitGeweihter2);
        basisDDZProfessionMitGeweihter = new helden.model.DDZprofessionen.Haendler(this.getGeschlecht(), g2, g3);
        basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
        basisDDZProfessionMitGeweihter.addMoeglicheVariante(((helden.model.DDZprofessionen.Haendler)basisDDZProfessionMitGeweihter).getTauschhaendler());
        arrayList.add(basisDDZProfessionMitGeweihter);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(returnprivateclass)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        }
        if (this.istVariante(\u00f4\u00d2\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        }
        if (this.istVariante(\u00d5\u00d2\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.newfor);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f5\u00d50000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        if (this.istVariante(\u00d5\u00d2\u00f8000)) {
            oo0O.\u00d300000(K.o00000(I.\u00d5\u00d40000));
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istMaennlich()) {
            return this.\u00d8\u00d2\u00f8000 < 2;
        }
        return this.\u00d8\u00d2\u00f8000 < 1;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Goblinstamm");
        if (this.istVariante(returnprivateclass)) {
            stringBuffer.append(returnprivateclass.toString());
        }
        if (this.istVariante(\u00f4\u00d2\u00f8000)) {
            stringBuffer.append(\u00f4\u00d2\u00f8000.toString());
        }
        if (this.istVariante(\u00d5\u00d2\u00f8000)) {
            stringBuffer.append(\u00d5\u00d2\u00f8000.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        if (this.istMaennlich()) {
            return 4;
        }
        return 5;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(returnprivateclass);
        this.addAlleVarianten(\u00f4\u00d2\u00f8000);
        this.addAlleVarianten(\u00d5\u00d2\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, -1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 4);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(returnprivateclass);
        this.addMoeglicheVariante(\u00f4\u00d2\u00f8000);
        this.addMoeglicheVariante(\u00d5\u00d2\u00f8000);
    }
}

