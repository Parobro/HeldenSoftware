/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.KeineWahl;
import helden.model.profession.kaempferudw.Ottajasko;
import helden.model.profession.kaempferudw.RobbenjaegerOttajasko;
import helden.model.profession.kaempferudw.RobbenjaegerSippe;
import helden.model.profession.kaempferudw.SeefahrerOttajasko;
import helden.model.profession.kaempferudw.SeefahrerSippe;
import helden.model.profession.kaempferudw.Sippe;
import helden.model.profession.varianten.RekkerBogskari;
import helden.model.profession.varianten.RekkerFotskari;
import helden.model.profession.varianten.RekkerHerverkmader;
import helden.model.profession.varianten.RekkerMangskari;
import helden.model.profession.varianten.RekkerRiddari;
import helden.model.profession.varianten.RekkerSjahskari;
import java.util.ArrayList;
import java.util.Iterator;

public class KaempferUdw
extends L {
    private P \u00d3\u00d5\u00d4O00;
    private P privatepublicnull;
    private P \u00f4\u00d4\u00d4O00;
    private P \u00f5\u00d4\u00d4O00;
    private P \u00d5\u00d5\u00d4O00;
    private P newprivatenull;
    private P o\u00d5\u00d4O00;
    private P returnprivatenull;
    private P O\u00d5\u00d4O00;
    private P \u00d4\u00d5\u00d4O00;
    private P \u00f8\u00d4\u00d4O00;
    private P \u00d8\u00d4\u00d4O00;

    public KaempferUdw() {
    }

    public KaempferUdw(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getRekkerBogskari());
        arrayList.add(this.getRekkerFotskari());
        arrayList.add(this.getRekkerHerverkmader());
        arrayList.add(this.getRekkerMangskari());
        arrayList.add(this.getRekkerRiddari());
        arrayList.add(this.getRekkerSjahskari());
        return arrayList;
    }

    @Override
    public String getID() {
        return "P86";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getOttajasko() {
        if (this.privatepublicnull == null) {
            this.privatepublicnull = new Ottajasko();
        }
        return this.privatepublicnull;
    }

    public P getRekkerBogskari() {
        if (this.o\u00d5\u00d4O00 == null) {
            this.o\u00d5\u00d4O00 = new RekkerBogskari();
        }
        return this.o\u00d5\u00d4O00;
    }

    public P getRekkerFotskari() {
        if (this.returnprivatenull == null) {
            this.returnprivatenull = new RekkerFotskari();
        }
        return this.returnprivatenull;
    }

    public P getRekkerHerverkmader() {
        if (this.O\u00d5\u00d4O00 == null) {
            this.O\u00d5\u00d4O00 = new RekkerHerverkmader();
        }
        return this.O\u00d5\u00d4O00;
    }

    public P getRekkerMangskari() {
        if (this.\u00d4\u00d5\u00d4O00 == null) {
            this.\u00d4\u00d5\u00d4O00 = new RekkerMangskari();
        }
        return this.\u00d4\u00d5\u00d4O00;
    }

    public P getRekkerRiddari() {
        if (this.\u00f8\u00d4\u00d4O00 == null) {
            this.\u00f8\u00d4\u00d4O00 = new RekkerRiddari();
        }
        return this.\u00f8\u00d4\u00d4O00;
    }

    public P getRekkerSjahskari() {
        if (this.\u00d8\u00d4\u00d4O00 == null) {
            this.\u00d8\u00d4\u00d4O00 = new RekkerSjahskari();
        }
        return this.\u00d8\u00d4\u00d4O00;
    }

    public P getRobbenjaegerOttajasko() {
        if (this.newprivatenull == null) {
            this.newprivatenull = new RobbenjaegerOttajasko();
        }
        return this.newprivatenull;
    }

    public P getRobbenjaegerSippe() {
        if (this.\u00d5\u00d5\u00d4O00 == null) {
            this.\u00d5\u00d5\u00d4O00 = new RobbenjaegerSippe();
        }
        return this.\u00d5\u00d5\u00d4O00;
    }

    public P getSeefahrerOttajasko() {
        if (this.\u00f5\u00d4\u00d4O00 == null) {
            this.\u00f5\u00d4\u00d4O00 = new SeefahrerOttajasko();
        }
        return this.\u00f5\u00d4\u00d4O00;
    }

    public P getSeefahrerSippe() {
        if (this.\u00f4\u00d4\u00d4O00 == null) {
            this.\u00f4\u00d4\u00d4O00 = new SeefahrerSippe();
        }
        return this.\u00f4\u00d4\u00d4O00;
    }

    public P getSippe() {
        if (this.\u00d3\u00d5\u00d4O00 == null) {
            this.\u00d3\u00d5\u00d4O00 = new Sippe();
        }
        return this.\u00d3\u00d5\u00d4O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getOttajasko()) || p2.equals(this.getSippe())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(new KeineWahl());
            arrayList2.add(this.getRekkerBogskari());
            arrayList2.add(this.getRekkerFotskari());
            arrayList2.add(this.getRekkerHerverkmader());
            arrayList2.add(this.getRekkerMangskari());
            arrayList2.add(this.getRekkerRiddari());
            arrayList2.add(this.getRekkerSjahskari());
            arrayList.add(arrayList2);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("K\u00e4mpfer");
        } else {
            stringBuffer.append("K\u00e4mpferin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getSippe());
        this.addAlleVarianten(this.getOttajasko());
        this.addAlleVarianten(this.getSeefahrerOttajasko());
        this.addAlleVarianten(this.getSeefahrerSippe());
        this.addAlleVarianten(this.getRobbenjaegerOttajasko());
        this.addAlleVarianten(this.getRobbenjaegerSippe());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSippe());
        this.addMoeglicheVariante(this.getOttajasko());
        this.addMoeglicheVariante(this.getSeefahrerOttajasko());
        this.addMoeglicheVariante(this.getSeefahrerSippe());
        this.addMoeglicheVariante(this.getRobbenjaegerOttajasko());
        this.addMoeglicheVariante(this.getRobbenjaegerSippe());
    }
}

