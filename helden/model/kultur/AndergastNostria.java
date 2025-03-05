/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Druide;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Gardist;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Hexe;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Stammeskrieger;
import java.util.ArrayList;
import java.util.Iterator;

public class AndergastNostria
extends OooO {
    public static final P \u00f5\u00f5\u00f6000 = new P("Stadt", 0, true);
    public static final P \u00f4\u00f5\u00f6000 = new P("Landadel", 3, true);
    public static final P whileforclass = new P("Gebirge", 1, true);
    public static final P \u00f8\u00f5\u00f6000 = new P("K\u00fcstengebiete", 2, true);
    public static final P ifforclass = new P("Teshkalien", 4, true);
    private int o\u00f6\u00f6000 = 0;
    private int O\u00f6\u00f6000 = 0;

    public AndergastNostria() {
    }

    public AndergastNostria(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return this.istVariante(\u00f4\u00f5\u00f6000);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.o\u00d6\u00d8000, 1);
        this.setTalentwert(E.\u00d3\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
        if (this.istVariante(\u00f5\u00f5\u00f6000)) {
            this.addTalentwert(E.\u00d8\u00d5\u00d8000, 1);
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, -1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, -1);
            this.removeTalent(voidsuper.\u00d5\u00d6\u00d5000);
            this.removeTalent(E.o\u00d6\u00d8000);
        }
        if (this.istVariante(\u00f4\u00f5\u00f6000)) {
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addTalentwert(G.\u00d8\u00d8\u00f5000, 2);
            this.removeTalent(E.o\u00d6\u00d8000);
        }
        if (this.istVariante(whileforclass)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(\u00f8\u00f5\u00f6000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 2);
        }
        if (this.istVariante(ifforclass)) {
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d5o\u00d8000, 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.Stringdo);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ooO000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K03";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Andergast/Nostria";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Andergastsche Namen");
        arrayList.add("Nostrische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.o\u00f6\u00f6000) {
            case 0: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f6000;
                if (!this.istVariante(\u00f5\u00f5\u00f6000)) {
                    ++this.o\u00f6\u00f6000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.thissuperString);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d8\u00d8\u00d5000);
                arrayList.add(voidsuper.thisclassObject);
                int[] nArray = new int[]{2};
                ++this.o\u00f6\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00f6\u00f6000) {
            case 0: {
                arrayList.add(G.\u00d5\u00d6\u00f5000);
                arrayList.add(G.O\u00d8\u00f5000);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                ++this.O\u00f6\u00f6000;
                return new returnsuper(this, arrayList, 4, 4);
            }
        }
        throw new c_1();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(\u00f8\u00f5\u00f6000)) {
            arrayList.add(new for(while.ifinterfaceObject));
            arrayList.add(new for(while.\u00d2\u00d4O000));
        }
        if (this.istVariante(whileforclass)) {
            arrayList.add(new for(while.\u00f6o\u00d5000));
            arrayList.add(new for(while.\u00d2\u00d4O000));
        }
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Schwertgeselle(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        Gardist gardist = new Gardist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(gardist);
        gardist.addMoeglicheVariante(gardist.getBogenschuetze());
        arrayList.add(gardist);
        Ritter ritter = new Ritter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(ritter);
        ritter.addMoeglicheVariante(ritter.getKnappeNostergast());
        arrayList.add(ritter);
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        if (!this.istVariante(\u00f5\u00f5\u00f6000)) {
            arrayList.remove(edelhandwerker);
        }
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.removeMoeglicheVariante(druide.getEiselementarist());
        druide.removeMoeglicheVariante(druide.getErzelementarist());
        druide.removeMoeglicheVariante(druide.getFeuerelementarist());
        druide.removeMoeglicheVariante(druide.getHumuselementarist());
        druide.removeMoeglicheVariante(druide.getLuftelementarist());
        druide.removeMoeglicheVariante(druide.getWasserelementarist());
        arrayList.add(druide);
        arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
        arrayList.add(new Magier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.add12G();
        geweihter.removeMoeglicheVariante(geweihter.getRahja());
        geweihter.addMoeglicheVariante(geweihter.getRahjaNostergast());
        geweihter.addMoeglicheVariante(geweihter.getRahjaTeshkal());
        geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
        geweihter.addMoeglicheVariante(geweihter.getIfirn());
        geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
        arrayList.add(ordenskrieger);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        if (this.istVariante(ifforclass)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(whileforclass) || this.istVariante(\u00f8\u00f5\u00f6000)) {
            if (super.getGewaehlteVerbilligteSonderfertigkeiten() != null) {
                arrayList.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
            }
        } else {
            arrayList.add(new for(while.\u00d2\u00d4O000));
        }
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00f5\u00f5\u00f6000)) {
            return this.o\u00f6\u00f6000 < 2;
        }
        if (this.istVariante(\u00f4\u00f5\u00f6000)) {
            return this.o\u00f6\u00f6000 < 3;
        }
        if (this.istVariante(\u00f8\u00f5\u00f6000)) {
            return this.o\u00f6\u00f6000 < 4;
        }
        return this.o\u00f6\u00f6000 < 1;
    }

    @Override
    public boolean hatMehrTaPVerteilAuswahl() {
        return this.O\u00f6\u00f6000 < 1;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return (this.istVariante(whileforclass) || this.istVariante(\u00f8\u00f5\u00f6000)) && this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Andergast/Nostria");
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(", ");
            stringBuffer.append(iterator.next().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f5\u00f5\u00f6000);
        this.addAlleVarianten(\u00f4\u00f5\u00f6000);
        this.addAlleVarianten(whileforclass);
        this.addAlleVarianten(\u00f8\u00f5\u00f6000);
        this.addAlleVarianten(ifforclass);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 2);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f5\u00f5\u00f6000);
        this.addMoeglicheVariante(\u00f4\u00f5\u00f6000);
        this.addMoeglicheVariante(whileforclass);
        this.addMoeglicheVariante(\u00f8\u00f5\u00f6000);
        this.addMoeglicheVariante(ifforclass);
    }
}

