/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
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
import helden.framework.oOoO.void;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Entdecker;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grenzjaeger;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Legionaer;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Taugenichts;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import java.util.ArrayList;
import java.util.List;

public class Suedaventurien
extends OooO {
    public static final P O\u00d40O00 = new P("Corapia", 0, false);
    public static final P \u00f4\u00d30O00 = new P("Mysobien und Brabacia", 0, false);
    public static final P privatevoidreturn = new P("Kemi", 0, false);
    public static final P newnullreturn = new P("Sylla", 0, false);
    private ArrayList<o0oo_2> \u00d3\u00d40O00;
    private int \u00f5\u00d30O00 = 0;
    private G \u00d4\u00d40O00 = null;
    private G \u00f8\u00d30O00 = null;
    private helden.framework.D.P o\u00d40O00 = null;

    public Suedaventurien() {
    }

    public Suedaventurien(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        this.\u00d4\u00d40O00 = g2;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.addTalentwert(voidsuper.ifforObject, 1);
        this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.addTalentwert(voidsuper.StringvoidObject, 1);
        this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.addTalentwert(voidsuper.nullObjectObject, 1);
        this.addTalentwert(voidsuper.oo\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.addTalentwert(voidsuper.thisclassObject, 1);
        if (this.istVariante(O\u00d40O00)) {
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 2);
        }
        if (this.istVariante(\u00f4\u00d30O00)) {
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        }
        if (this.istVariante(privatevoidreturn)) {
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
        }
        if (this.istVariante(newnullreturn)) {
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
            if (this.getMuttersprache() != null && this.getMuttersprache().equals(G.\u00d3\u00f8\u00f5000)) {
                this.addTalentwert(G.\u00f5\u00f6\u00f5000, 3);
            } else {
                this.addTalentwert(G.\u00d3\u00f8\u00f5000, 3);
            }
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d80\u00d2000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K44";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Bosparanische S\u00fcdprovinzen";
    }

    @Override
    public G getMuttersprache() {
        if (this.istVariante(O\u00d40O00) || this.istVariante(\u00f4\u00d30O00)) {
            this.\u00d4\u00d40O00 = G.\u00d3\u00f8\u00f5000;
        } else if (this.istVariante(privatevoidreturn)) {
            this.\u00d4\u00d40O00 = G.\u00d3O\u00f5000;
        }
        return this.\u00d4\u00d40O00;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        U u3 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u3.\u00d500000("Sylla");
        arrayList.add(u2);
        arrayList.add(u3);
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        arrayList.add(G.newwhileString);
        return new oo0o_2(this, arrayList, 1, "Muttersprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.\u00d3\u00d40O00.get(this.\u00f5\u00d30O00);
        ++this.\u00f5\u00d30O00;
        return o0oo_22;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f8\u00f6O000));
        if (this.istVariante(newnullreturn)) {
            arrayList.add(new for(while.ifinterfaceObject));
            arrayList.add(new for<String>("Sylla", while.\u00d30\u00d2000, false));
        }
        if (this.istVariante(\u00f4\u00d30O00)) {
            arrayList.add(new for(while.nullnewsuper));
            arrayList.add(new for<String>("Brabacia", while.\u00d30\u00d2000, false));
        }
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Gardist gardist = new Gardist(this.getGeschlecht(), g2, g3);
        gardist.removeMoeglicheVariante(gardist.getRechtswahrer());
        arrayList.add(gardist);
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Legionaer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        Soldat soldat = new Soldat(this.getGeschlecht(), g2, g3);
        soldat.clearMoeglicheVarianten();
        soldat.addMoeglicheVariante(soldat.getSeesoldat());
        arrayList.add(soldat);
        if (this.istVariante(privatevoidreturn)) {
            basisDDZProfessionMitGeweihter = new Stammeskrieger(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getWaldmensch());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getKanutepeku());
            arrayList.add(basisDDZProfessionMitGeweihter);
        }
        arrayList.add(new Entdecker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Grenzjaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hofkuenstler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        basisDDZProfessionMitGeweihter = new Tierbaendiger(this.getGeschlecht(), g2, g3);
        basisDDZProfessionMitGeweihter.removeMoeglicheVariante(((Tierbaendiger)basisDDZProfessionMitGeweihter).getChimaerenbaendiger());
        arrayList.add(basisDDZProfessionMitGeweihter);
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getHorasLaboratorienzuBelenas());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        arrayList.add(new Druide(this.getGeschlecht(), g2, g3));
        arrayList.add(new BosMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        if (this.getMuttersprache() == null) {
            return null;
        }
        if (this.getMuttersprache().equals(G.\u00d3\u00f8\u00f5000)) {
            this.\u00f8\u00d30O00 = G.\u00d40\u00f6000;
        }
        if (this.getMuttersprache().equals(G.\u00d3O\u00f5000)) {
            this.\u00f8\u00d30O00 = G.\u00d8\u00d4\u00f5000;
        }
        if (this.getMuttersprache().equals(G.newwhileString)) {
            this.\u00f8\u00d30O00 = G.\u00d3o\u00f5000;
        }
        return this.\u00f8\u00d30O00;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        if (!this.istVariante(newnullreturn)) {
            U u2 = (U)oooo_0.o00000("Kulturkunde");
            if (this.istVariante(privatevoidreturn)) {
                u2.\u00d500000("Kemi");
            } else {
                u2.\u00d500000(this.getKulturkundeBezeichnung());
            }
            oOOo.o00000(u2);
        } else if (this.o\u00d40O00 != null) {
            oOOo.o00000(this.o\u00d40O00);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d30o000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d5\u00d40000);
        return arrayList;
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        List<for> list = super.getVerbilligteSonderfertigkeiten();
        if (this.istVariante(newnullreturn) && this.o\u00d40O00 != null) {
            U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
            u2.\u00d500000(this.getKulturkundeBezeichnung());
            if (u2.o00000(this.o\u00d40O00)) {
                list.add(new for<String>("Sylla", while.\u00d2o\u00f5000, false));
            } else {
                list.add(new for<String>(this.getKulturkundeBezeichnung(), while.\u00d2o\u00f5000, false));
            }
        }
        return list;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.istVariante(O\u00d40O00)) {
            oo0O.\u00d300000(K.o00000(I.\u00d4oo000));
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.o\u00d40O00 == null;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getMuttersprache() == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00d3\u00d40O00 == null) {
            this.setWahlen();
        }
        return this.\u00f5\u00d30O00 < this.\u00d3\u00d40O00.size();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return !this.istVariante(privatevoidreturn) && this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return true;
    }

    public void setWahlen() {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        this.\u00d3\u00d40O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
        arrayList.add(voidsuper.returnprivateObject);
        int[] nArray4 = new int[]{1};
        this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.o\u00d5\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
        int[] nArray5 = new int[]{1};
        this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray5));
        if (this.istVariante(\u00f4\u00d30O00)) {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
            arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
            nArray3 = new int[]{1, 1};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray3));
        } else {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
            arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
            nArray3 = new int[]{1};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray3));
        }
        arrayList = new ArrayList();
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
        nArray3 = new int[]{1};
        this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray3));
        if (this.istVariante(\u00f4\u00d30O00)) {
            arrayList = new ArrayList();
            arrayList.add(E.\u00d3\u00d6\u00d8000);
            arrayList.add(E.\u00d3\u00d5\u00d8000);
            nArray2 = new int[]{1};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray2));
            arrayList = new ArrayList();
            arrayList.add(voidsuper.O\u00f6\u00d5000);
            arrayList.add(voidsuper.\u00d3\u00f4\u00d6000);
            nArray = new int[]{1};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray));
            arrayList = new ArrayList();
            arrayList.add(G.\u00d3O\u00f5000);
            arrayList.add(G.\u00d5o\u00f5000);
            arrayList.add(G.newwhileString);
            arrayList.add(G.thissuperclass);
            int[] nArray6 = new int[]{3};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray6));
        }
        if (this.istVariante(privatevoidreturn)) {
            arrayList = new ArrayList();
            arrayList.add(E.\u00d4\u00d4\u00d8000);
            arrayList.add(E.\u00d3\u00d6\u00d8000);
            arrayList.add(E.\u00d3\u00d5\u00d8000);
            nArray2 = new int[]{1};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray2));
            arrayList = new ArrayList();
            arrayList.add(G.\u00d3\u00f8\u00f5000);
            arrayList.add(G.newwhileString);
            nArray = new int[]{3};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(newnullreturn)) {
            arrayList = new ArrayList();
            arrayList.add(E.\u00f4\u00d4\u00d8000);
            arrayList.add(E.thissuperString);
            nArray2 = new int[]{1};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray2));
            arrayList = new ArrayList();
            arrayList.add(G.\u00d3\u00f8\u00f5000);
            arrayList.add(G.newwhileString);
            arrayList.remove(this.getMuttersprache());
            nArray = new int[]{3};
            this.\u00d3\u00d40O00.add(new o0oo_2(this, arrayList, nArray));
        }
    }

    @Override
    public void setzeMuttersprache(G g2) {
        this.\u00d4\u00d40O00 = g2;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.\u00f8\u00d30O00 = g2;
    }

    @Override
    public String toString() {
        return "Bosparanische S\u00fcdprovinzen";
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
        this.o\u00d40O00 = p2;
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        if (this.istVariante(privatevoidreturn)) {
            new for(while.\u00f8\u00f6O000);
            new for<String>(this.getKulturkundeBezeichnung(), while.\u00d2o\u00f5000, false);
        }
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 1;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(O\u00d40O00);
        this.addAlleVarianten(privatevoidreturn);
        this.addAlleVarianten(\u00f4\u00d30O00);
        this.addAlleVarianten(newnullreturn);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(O\u00d40O00);
        this.addMoeglicheVariante(privatevoidreturn);
        this.addMoeglicheVariante(\u00f4\u00d30O00);
        this.addMoeglicheVariante(newnullreturn);
    }
}

