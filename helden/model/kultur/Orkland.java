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
import helden.framework.OoOO.N;
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
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.Bauer;
import helden.model.profession.Bergmann;
import helden.model.profession.Fischer;
import helden.model.profession.Fuhrmann;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Schamane;
import helden.model.profession.Soeldner;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Tageloehner;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;
import java.util.Iterator;

public class Orkland
extends OooO {
    public static final P \u00d800O00 = new P("Korogai", 3, false);
    public static final P o00O00 = new P("Mokolash", 3, false);
    public static final P \u00f4\u00f8\u00f8000 = new P("Olochtai", 4, false);
    public static final P \u00f400O00 = new P("Orichai", 2, false);
    public static final P \u00f5\u00f8\u00f8000 = new P("Truanzhai", 3, false);
    public static final P O00O00 = new P("Tscharshai", 5, false);
    public static final P \u00d500O00 = new P("Zholochai", 4, false);
    public static final P \u00d8\u00f8\u00f8000 = new P("Ergoch (Sklaven)", 1, false);
    public static final P \u00d400O00 = new P("Grishik (Bauern)", 3, false);
    public static final P \u00d300O00 = new P("Drasdech (Handwerker)", 5, false);
    public static final P whileStringreturn = new P("Khurkach (Krieger und J\u00e4ger)", 5, false);
    public static final P thisclassreturn = new P("Okwach (Elite-Krieger, Priester, Schamanen)", 8, false);
    protected int \u00f8\u00f8\u00f8000 = 0;
    private helden.framework.D.P ifStringreturn;

    public Orkland() {
    }

    public Orkland(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d3\u00d6\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        if (this.istVariante(\u00d8\u00f8\u00f8000)) {
            this.removeTalent(E.\u00d3\u00d6\u00d8000);
            this.addTalentwert(voidsuper.thisvoidObject, 2);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        }
        if (this.istVariante(whileStringreturn)) {
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        }
        if (this.istVariante(thisclassreturn)) {
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        }
        if (this.istVariante(\u00d800O00)) {
            this.addTalentwert(voidsuper.forObjectObject, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d8\u00d5000, 1);
        }
        if (this.istVariante(o00O00)) {
            this.addTalentwert(voidsuper.returnprivateObject, 2);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 2);
            this.addTalentwert(voidsuper.thisclassObject, 1);
        }
        if (this.istVariante(\u00f4\u00f8\u00f8000)) {
            this.addTalentwert(E.newnewString, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f80\u00d8000, 2);
        }
        if (this.istVariante(\u00f400O00)) {
            this.addTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
        }
        if (this.istVariante(\u00f5\u00f8\u00f8000)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        }
        if (this.istVariante(O00O00)) {
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d5o\u00d8000, 2);
        }
        if (this.istVariante(\u00d500O00)) {
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(E.newnewString, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.nullvoidObject, 1);
        }
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(\u00d8\u00f8\u00f8000);
        arrayList.add(\u00d400O00);
        arrayList.add(\u00d300O00);
        arrayList.add(whileStringreturn);
        arrayList.add(thisclassreturn);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.thisdo);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.newnew);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K31";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Orks";
    }

    @Override
    public int getMaximalSozialstatus() {
        if (this.istVariante(\u00d8\u00f8\u00f8000)) {
            return 2;
        }
        if (this.istVariante(\u00d400O00) || this.istVariante(\u00d300O00)) {
            return 4;
        }
        return 5;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (this.istVariante(\u00d8\u00f8\u00f8000) && b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        if (this.istVariante(\u00d400O00) && b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        if (this.istVariante(\u00d300O00) && b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        if (this.istVariante(whileStringreturn) && b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        if (this.istVariante(thisclassreturn) && b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public G getMuttersprache() {
        return G.O\u00d8\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Orkische Namen");
        return arrayList;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
        arrayList.add(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f8\u00f8\u00f8000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{2, 1};
                ++this.\u00f8\u00f8\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                int[] nArray = new int[]{2};
                ++this.\u00f8\u00f8\u00f8000;
                if (!this.istVariante(\u00d300O00)) {
                    ++this.\u00f8\u00f8\u00f8000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                int[] nArray = new int[]{2};
                ++this.\u00f8\u00f8\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00f8\u00f8\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        L l3;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        if (this.istVariante(\u00d8\u00f8\u00f8000)) {
            l3 = new Bauer(this.getGeschlecht(), g2, g3);
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Bauer)l3).getErntehelfer());
            l3.addMoeglicheVariante(((Bauer)l3).getFeldsklave());
            l3.addMoeglicheVariante(((Bauer)l3).getKnecht());
            l3.addMoeglicheVariante(((Bauer)l3).getLeibeigener());
            arrayList.add(l3);
            l2 = new Tageloehner(this.getGeschlecht(), g2, g3);
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Tageloehner)l2).getBauhelfer());
            l2.addMoeglicheVariante(((Tageloehner)l2).getHolzfaeller());
            arrayList.add(l2);
        }
        if (this.istVariante(\u00d400O00)) {
            l3 = new Bauer(this.getGeschlecht(), g2, g3);
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Bauer)l3).getFreibauer());
            l3.addMoeglicheVariante(((Bauer)l3).getViehzuechter());
            arrayList.add(l3);
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
                l3 = new Haendler(this.getGeschlecht(), g2, g3);
                l3.clearMoeglicheVarianten();
                l3.addMoeglicheVariante(((Haendler)l3).getFahrenderHaendler());
                arrayList.add(l3);
                arrayList.add(new Fuhrmann(this.getGeschlecht(), g2, g3));
            }
            l3 = new Haendler(this.getGeschlecht(), g2, g3);
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Haendler)l3).getTauschhaendler());
            arrayList.add(l3);
            l2 = new Handwerker(this.getGeschlecht(), g2, g3);
            l2.addMoeglicheVariante(((Handwerker)l2).getArchaischeOrk());
            arrayList.add(l2);
            arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
            arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        }
        if (this.istVariante(whileStringreturn)) {
            arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
            l3 = new Jaeger(this.getGeschlecht(), g2, g3);
            l3.removeMoeglicheVariante(((Jaeger)l3).getWildhueter());
            arrayList.add(l3);
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
            l3 = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            l3.clearMoeglicheVarianten();
            l3.addMoeglicheVariante(((Stammeskrieger)l3).getOrk());
            arrayList.add(l3);
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
    public G getSchrift() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(\u00d800O00)) {
            oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        }
        if (this.istVariante(o00O00)) {
            oOOo.o00000(oooo_0.o00000(while.nullnewsuper.toString()));
        }
        if (this.istVariante(\u00f4\u00f8\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
            if (this.ifStringreturn != null) {
                oOOo.o00000(this.ifStringreturn);
            }
        }
        if (this.istVariante(\u00f400O00) || this.istVariante(O00O00) || this.istVariante(\u00d500O00)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        }
        if (this.istVariante(\u00f5\u00f8\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
            oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
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
        arrayList.add(K.o00000(I.\u00f4\u00d20000, voidsuper.\u00d5\u00d5\u00d5000, voidsuper.O0\u00d6000, voidsuper.O\u00f6\u00d5000, voidsuper.\u00d8\u00d5\u00d6000, voidsuper.thisinterfaceObject, voidsuper.newnullObject, voidsuper.forpublicObject, voidsuper.forclassObject, voidsuper.\u00d30\u00d8000, voidsuper.StringclassObject));
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.newfor);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        if (this.istVariante(\u00f4\u00f8\u00f8000)) {
            oo0O.\u00d300000(K.o00000(I.\u00f5\u00d50000, "nur rohes Fleisch"));
        }
        return oo0O;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        arrayList.add(this.getAlleZusatzVarianten());
        return arrayList;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.istVariante(\u00f4\u00f8\u00f8000) && this.ifStringreturn == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(whileStringreturn) || this.istVariante(thisclassreturn)) {
            return this.\u00f8\u00f8\u00f8000 < 4;
        }
        if (this.istVariante(\u00d300O00)) {
            return this.\u00f8\u00f8\u00f8000 < 3;
        }
        return this.\u00f8\u00f8\u00f8000 < 2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Orkland");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
        this.ifStringreturn = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d800O00);
        this.addAlleVarianten(o00O00);
        this.addAlleVarianten(\u00f4\u00f8\u00f8000);
        this.addAlleVarianten(\u00f400O00);
        this.addAlleVarianten(\u00f5\u00f8\u00f8000);
        this.addAlleVarianten(O00O00);
        this.addAlleVarianten(\u00d500O00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 2);
        if (this.istVariante(\u00d8\u00f8\u00f8000)) {
            this.putModifikator(b_0.whilewhilesuper, -2);
            this.putModifikator(b_0.returnwhilesuper, 1);
        }
        if (this.istVariante(\u00d300O00)) {
            this.putModifikator(b_0.O\u00f5\u00d2000, 1);
        }
        if (this.istVariante(whileStringreturn)) {
            this.putModifikator(b_0.whilewhilesuper, 1);
        }
        if (this.istVariante(thisclassreturn)) {
            this.putModifikator(b_0.whilewhilesuper, 1);
            this.putModifikator(b_0.newwhilesuper, 1);
        }
        if (this.istVariante(\u00d800O00)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
        }
        if (this.istVariante(\u00f4\u00f8\u00f8000)) {
            this.putModifikator(b_0.thispublicsuper, 2);
        }
        if (this.istVariante(O00O00)) {
            this.putModifikator(b_0.newwhilesuper, 1);
        }
        if (this.istVariante(\u00d500O00)) {
            this.putModifikator(b_0.whilewhilesuper, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d800O00);
        this.addMoeglicheVariante(o00O00);
        this.addMoeglicheVariante(\u00f4\u00f8\u00f8000);
        this.addMoeglicheVariante(\u00f400O00);
        this.addMoeglicheVariante(\u00f5\u00f8\u00f8000);
        this.addMoeglicheVariante(O00O00);
        this.addMoeglicheVariante(\u00d500O00);
    }
}

