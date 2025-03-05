/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.stammeskrieger.Achaz;
import helden.model.DDZprofessionen.stammeskrieger.AchazTempelwache;
import helden.model.DDZprofessionen.stammeskrieger.AchmadSunni;
import helden.model.DDZprofessionen.stammeskrieger.AlDrakorhim;
import helden.model.DDZprofessionen.stammeskrieger.BeniDervez;
import helden.model.DDZprofessionen.stammeskrieger.BeniUchakani;
import helden.model.DDZprofessionen.stammeskrieger.Blutkrieger;
import helden.model.DDZprofessionen.stammeskrieger.Brobim;
import helden.model.DDZprofessionen.stammeskrieger.Ferkina;
import helden.model.DDZprofessionen.stammeskrieger.Fjarninger;
import helden.model.DDZprofessionen.stammeskrieger.Gjalskerland;
import helden.model.DDZprofessionen.stammeskrieger.Goblin;
import helden.model.DDZprofessionen.stammeskrieger.Kanutepeku;
import helden.model.DDZprofessionen.stammeskrieger.Ork;
import helden.model.DDZprofessionen.stammeskrieger.TapasuulBlutkrieger;
import helden.model.DDZprofessionen.stammeskrieger.Tarisharim;
import helden.model.DDZprofessionen.stammeskrieger.Trollzacker;
import helden.model.DDZprofessionen.stammeskrieger.Waldmensch;
import helden.model.DDZprofessionen.stammeskrieger.Wuestenkrieger;
import helden.model.DDZprofessionen.varianten.FerkinaBesessener;
import java.util.ArrayList;
import java.util.Iterator;

public class Stammeskrieger
extends BasisDDZProfessionMitGeweihter {
    private P \u00f4o\u00d8O00;
    private P \u00d3o\u00d8O00;
    private P forObjectif;
    private P \u00d8o\u00d8O00;
    private P \u00d4o\u00d8O00;
    private P \u00f8O\u00d8O00;
    private P \u00d3\u00d2\u00d8O00;
    private P returnStringif;
    private P oo\u00d8O00;
    private P \u00f8o\u00d8O00;
    private P o\u00d2\u00d8O00;
    private P O\u00d2\u00d8O00;
    private P \u00d5\u00d2\u00d8O00;
    private P \u00f5o\u00d8O00;
    private P \u00d4\u00d2\u00d8O00;
    private P nullObjectif;
    private P \u00d5o\u00d8O00;
    private P Oo\u00d8O00;
    private P privateObjectif;
    private P newStringif;

    public Stammeskrieger() {
    }

    public Stammeskrieger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAchaz() {
        if (this.\u00f5o\u00d8O00 == null) {
            this.\u00f5o\u00d8O00 = new Achaz();
        }
        return this.\u00f5o\u00d8O00;
    }

    public P getAchazTempelwache() {
        if (this.\u00d4\u00d2\u00d8O00 == null) {
            this.\u00d4\u00d2\u00d8O00 = new AchazTempelwache();
        }
        return this.\u00d4\u00d2\u00d8O00;
    }

    public P getAchmadSunni() {
        if (this.o\u00d2\u00d8O00 == null) {
            this.o\u00d2\u00d8O00 = new AchmadSunni();
        }
        return this.o\u00d2\u00d8O00;
    }

    public P getAlDrakorhim() {
        if (this.oo\u00d8O00 == null) {
            this.oo\u00d8O00 = new AlDrakorhim();
        }
        return this.oo\u00d8O00;
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        return arrayList;
    }

    public P getBeniDervez() {
        if (this.\u00d3\u00d2\u00d8O00 == null) {
            this.\u00d3\u00d2\u00d8O00 = new BeniDervez();
        }
        return this.\u00d3\u00d2\u00d8O00;
    }

    public P getBeniUchakani() {
        if (this.\u00f8o\u00d8O00 == null) {
            this.\u00f8o\u00d8O00 = new BeniUchakani();
        }
        return this.\u00f8o\u00d8O00;
    }

    public P getBessene() {
        if (this.Oo\u00d8O00 == null) {
            this.Oo\u00d8O00 = new FerkinaBesessener();
        }
        return this.Oo\u00d8O00;
    }

    public P getBlutKrieger() {
        if (this.privateObjectif == null) {
            this.privateObjectif = new Blutkrieger();
        }
        return this.privateObjectif;
    }

    public P getBrobim() {
        if (this.\u00d5o\u00d8O00 == null) {
            this.\u00d5o\u00d8O00 = new Brobim();
        }
        return this.\u00d5o\u00d8O00;
    }

    public P getFerkina() {
        if (this.\u00d8o\u00d8O00 == null) {
            this.\u00d8o\u00d8O00 = new Ferkina();
        }
        return this.\u00d8o\u00d8O00;
    }

    public P getFjarninger() {
        if (this.\u00d3o\u00d8O00 == null) {
            this.\u00d3o\u00d8O00 = new Fjarninger();
        }
        return this.\u00d3o\u00d8O00;
    }

    public P getGjalskerland() {
        if (this.forObjectif == null) {
            this.forObjectif = new Gjalskerland();
        }
        return this.forObjectif;
    }

    public P getGoblin() {
        if (this.O\u00d2\u00d8O00 == null) {
            this.O\u00d2\u00d8O00 = new Goblin();
        }
        return this.O\u00d2\u00d8O00;
    }

    @Override
    public String getID() {
        return "P145";
    }

    public P getKanutepeku() {
        if (this.nullObjectif == null) {
            this.nullObjectif = new Kanutepeku();
        }
        return this.nullObjectif;
    }

    public P getOrk() {
        if (this.\u00d5\u00d2\u00d8O00 == null) {
            this.\u00d5\u00d2\u00d8O00 = new Ork();
        }
        return this.\u00d5\u00d2\u00d8O00;
    }

    public P getTapasuulBlutkrieger() {
        if (this.newStringif == null) {
            this.newStringif = new TapasuulBlutkrieger();
        }
        return this.newStringif;
    }

    public P getTarisharim() {
        if (this.returnStringif == null) {
            this.returnStringif = new Tarisharim();
        }
        return this.returnStringif;
    }

    public P getTrollzacker() {
        if (this.\u00d4o\u00d8O00 == null) {
            this.\u00d4o\u00d8O00 = new Trollzacker();
        }
        return this.\u00d4o\u00d8O00;
    }

    public P getWaldmensch() {
        if (this.\u00f4o\u00d8O00 == null) {
            this.\u00f4o\u00d8O00 = new Waldmensch();
        }
        return this.\u00f4o\u00d8O00;
    }

    public P getWuestenkrieger() {
        if (this.\u00f8O\u00d8O00 == null) {
            this.\u00f8O\u00d8O00 = new Wuestenkrieger();
        }
        return this.\u00f8O\u00d8O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getFerkina())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getBessene());
            arrayList.add(arrayList2);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Stammeskrieger: ");
        } else {
            stringBuffer.append("Stammeskriegerin: ");
        }
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getWaldmensch());
        this.addAlleVarianten(this.getFjarninger());
        this.addAlleVarianten(this.getGjalskerland());
        this.addAlleVarianten(this.getFerkina());
        this.addAlleVarianten(this.getTrollzacker());
        this.addAlleVarianten(this.getWuestenkrieger());
        this.addAlleVarianten(this.getBeniDervez());
        this.addAlleVarianten(this.getTarisharim());
        this.addAlleVarianten(this.getAlDrakorhim());
        this.addAlleVarianten(this.getBeniUchakani());
        this.addAlleVarianten(this.getAchmadSunni());
        this.addAlleVarianten(this.getGoblin());
        this.addAlleVarianten(this.getOrk());
        this.addAlleVarianten(this.getAchaz());
        this.addAlleVarianten(this.getAchazTempelwache());
        this.addAlleVarianten(this.getKanutepeku());
        this.addAlleVarianten(this.getBrobim());
        this.addAlleVarianten(this.getBlutKrieger());
        this.addAlleVarianten(this.getTapasuulBlutkrieger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWaldmensch());
        this.addMoeglicheVariante(this.getFjarninger());
        this.addMoeglicheVariante(this.getGjalskerland());
        this.addMoeglicheVariante(this.getFerkina());
        this.addMoeglicheVariante(this.getTrollzacker());
        this.addMoeglicheVariante(this.getWuestenkrieger());
        this.addMoeglicheVariante(this.getBeniDervez());
        this.addMoeglicheVariante(this.getTarisharim());
        this.addMoeglicheVariante(this.getAlDrakorhim());
        this.addMoeglicheVariante(this.getBeniUchakani());
        this.addMoeglicheVariante(this.getAchmadSunni());
        this.addMoeglicheVariante(this.getGoblin());
        this.addMoeglicheVariante(this.getOrk());
        this.addMoeglicheVariante(this.getAchaz());
        this.addMoeglicheVariante(this.getAchazTempelwache());
        this.addMoeglicheVariante(this.getKanutepeku());
        this.addMoeglicheVariante(this.getBlutKrieger());
        this.addMoeglicheVariante(this.getTapasuulBlutkrieger());
    }
}

