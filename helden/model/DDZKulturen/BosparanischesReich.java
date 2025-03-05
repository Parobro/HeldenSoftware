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
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Elitekaempfer;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grenzjaeger;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Legionaer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class BosparanischesReich
extends OooO {
    public static final P O\u00d30O00 = new P("Horasiat", 0, false);
    public static final P \u00d5\u00d20O00 = new P("Yaquiria Superior", 0, false);
    public static final P thisvoidreturn = new P("Belenas", 0, false);
    public static final P \u00f4\u00d20O00 = new P("Latifundien", 1, true);
    public static final P Stringvoidreturn = new P("Gro\u00dfstadt", 1, true);
    public static final P \u00d8\u00d20O00 = new P("Oberschicht", 3, true);
    private int \u00f8\u00d20O00 = 0;
    private ArrayList<o0oo_2> \u00f5\u00d20O00;

    public BosparanischesReich() {
    }

    public BosparanischesReich(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 2);
        this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.addTalentwert(voidsuper.O0\u00d6000, 1);
        this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.addTalentwert(voidsuper.oo\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        if (this.istVariante(O\u00d30O00)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.o\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d6\u00d6000, 1);
        }
        if (this.istVariante(\u00d5\u00d20O00)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        }
        if (this.istVariante(thisvoidreturn)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
        }
        if (this.istVariante(\u00f4\u00d20O00)) {
            this.addTalentwert(voidsuper.thisinterfaceObject, -1);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        }
        if (this.istVariante(Stringvoidreturn)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
        }
        if (this.istVariante(\u00d8\u00d20O00)) {
            this.addTalentwert(E.thissuperString, 2);
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f5\u00d6\u00d6000, 1);
            this.addTalentwert(G.\u00f4\u00d3\u00f5000, 3);
            this.addTalentwert(G.\u00d40\u00f6000, 3);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K52";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Bosparanisches Reich";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00f8\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.\u00f5\u00d20O00.get(this.\u00f8\u00d20O00);
        ++this.\u00f8\u00d20O00;
        return o0oo_22;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        if (this.istVariante(\u00d8\u00d20O00)) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)7));
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Elitekaempfer elitekaempfer = new Elitekaempfer(this.getGeschlecht(), g2, g3);
        elitekaempfer.clearMoeglicheVarianten();
        elitekaempfer.addMoeglicheVariante(elitekaempfer.getPraetorianer());
        arrayList.add(elitekaempfer);
        Gardist gardist = new Gardist(this.getGeschlecht(), g2, g3);
        gardist.removeMoeglicheVariante(gardist.getRechtswahrer());
        arrayList.add(gardist);
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Legionaer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Grenzjaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Tierbaendiger tierbaendiger = new Tierbaendiger(this.getGeschlecht(), g2, g3);
        tierbaendiger.removeMoeglicheVariante(tierbaendiger.getChimaerenbaendiger());
        arrayList.add(tierbaendiger);
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getHorasLaboratorienzuBelenas());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getMehrerderMacht());
        arrayList.add(druide);
        arrayList.add(new BosMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        System.out.println(arrayList);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d40\u00f6000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.forObject);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d4oo000));
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00f5\u00d20O00 == null) {
            this.setWahlen();
        }
        return this.\u00f8\u00d20O00 < this.\u00f5\u00d20O00.size();
    }

    public void setWahlen() {
        int[] nArray;
        int[] nArray2;
        this.\u00f5\u00d20O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        if (!this.istVariante(\u00d8\u00d20O00)) {
            arrayList.add(E.\u00f5\u00d3\u00d8000);
            arrayList.add(E.o\u00d6\u00d8000);
            nArray2 = new int[]{1};
            this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray2));
        }
        arrayList = new ArrayList();
        arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
        arrayList.add(voidsuper.privatedoObject);
        nArray2 = new int[]{1};
        this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray2));
        if (this.istVariante(O\u00d30O00)) {
            arrayList = new ArrayList();
            arrayList.add(G.\u00d5\u00f6\u00f5000);
            arrayList.add(G.o\u00f4\u00f5000);
            arrayList.add(G.\u00f5\u00f5\u00f4000);
            nArray = new int[]{3};
            this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(\u00d5\u00d20O00)) {
            arrayList = new ArrayList();
            arrayList.add(G.\u00d8\u00f4\u00f5000);
            arrayList.add(G.\u00d5\u00f8\u00f4000);
            arrayList.add(G.\u00d3\u00d4\u00f5000);
            arrayList.add(G.\u00f5\u00f6\u00f5000);
            nArray = new int[]{3};
            this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(thisvoidreturn)) {
            arrayList = new ArrayList();
            arrayList.add(G.\u00f5\u00f5\u00f4000);
            arrayList.add(G.\u00d5\u00f6\u00f5000);
            arrayList.add(G.\u00d5o\u00f5000);
            arrayList.add(G.thissuperclass);
            arrayList.add(G.\u00f5\u00f6\u00f5000);
            nArray = new int[]{3};
            this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(thisvoidreturn)) {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.o\u00d5\u00d6000);
            arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
            nArray = new int[]{1};
            this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(\u00f4\u00d20O00)) {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
            arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
            nArray = new int[]{1};
            this.\u00f5\u00d20O00.add(new o0oo_2(this, arrayList, nArray));
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Bosparanisches Reich");
        for (P p2 : this.getGewaehlteVarianten()) {
            stringBuffer.append(" - ");
            stringBuffer.append(p2.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 1;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(O\u00d30O00);
        this.addAlleVarianten(\u00d5\u00d20O00);
        this.addAlleVarianten(thisvoidreturn);
        this.addAlleVarianten(\u00f4\u00d20O00);
        this.addAlleVarianten(Stringvoidreturn);
        this.addAlleVarianten(\u00d8\u00d20O00);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(O\u00d30O00);
        this.addMoeglicheVariante(\u00d5\u00d20O00);
        this.addMoeglicheVariante(thisvoidreturn);
        this.addMoeglicheVariante(\u00f4\u00d20O00);
        this.addMoeglicheVariante(Stringvoidreturn);
        this.addMoeglicheVariante(\u00d8\u00d20O00);
    }
}

