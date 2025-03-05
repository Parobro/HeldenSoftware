/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.Q;
import helden.framework.int.super;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.magier.AlAnfaLeibmagier;
import helden.model.profession.magier.AlAnfaSeekrieg;
import helden.model.profession.magier.Andergast;
import helden.model.profession.magier.Belhanka;
import helden.model.profession.magier.Bethana;
import helden.model.profession.magier.Brabak;
import helden.model.profession.magier.DonnerbachHeilung;
import helden.model.profession.magier.DonnerbachVerstaendigung;
import helden.model.profession.magier.DrakoniaEis;
import helden.model.profession.magier.DrakoniaErz;
import helden.model.profession.magier.DrakoniaFeuer;
import helden.model.profession.magier.DrakoniaHumus;
import helden.model.profession.magier.DrakoniaLuft;
import helden.model.profession.magier.DrakoniaWasser;
import helden.model.profession.magier.Elburum;
import helden.model.profession.magier.Elenvina;
import helden.model.profession.magier.Fasar1gemaessigt;
import helden.model.profession.magier.Fasar1hart;
import helden.model.profession.magier.Fasar2;
import helden.model.profession.magier.Festum;
import helden.model.profession.magier.Gareth1;
import helden.model.profession.magier.Gareth2;
import helden.model.profession.magier.Gerasim;
import helden.model.profession.magier.Grangor;
import helden.model.profession.magier.InstitutDerArkanenAnalysen;
import helden.model.profession.magier.Khunchom;
import helden.model.profession.magier.Kuslik1;
import helden.model.profession.magier.Kuslik2;
import helden.model.profession.magier.LowangenMacht;
import helden.model.profession.magier.LowangenVerformungen;
import helden.model.profession.magier.MendenaInitiator;
import helden.model.profession.magier.MendenaInspirator;
import helden.model.profession.magier.MendenaInstrukteur;
import helden.model.profession.magier.MendenaInvokator;
import helden.model.profession.magier.Methumis;
import helden.model.profession.magier.Mherwed;
import helden.model.profession.magier.Mirham;
import helden.model.profession.magier.Neersand;
import helden.model.profession.magier.Norburg;
import helden.model.profession.magier.Nostria;
import helden.model.profession.magier.Olport;
import helden.model.profession.magier.Perricum;
import helden.model.profession.magier.Punin1;
import helden.model.profession.magier.Punin2;
import helden.model.profession.magier.RashdulDaemonisch;
import helden.model.profession.magier.RashdulElementar;
import helden.model.profession.magier.RivaBerater;
import helden.model.profession.magier.RivaLeibwaechter;
import helden.model.profession.magier.Rommilys;
import helden.model.profession.magier.Sinoda;
import helden.model.profession.magier.SulmanAlNassori;
import helden.model.profession.magier.Thorwal;
import helden.model.profession.magier.Tuzak;
import helden.model.profession.magier.Vinsalt;
import helden.model.profession.magier.YolGhurmakFlammensaeule;
import helden.model.profession.magier.YolGhurmakHoellenwindes;
import helden.model.profession.magier.YolGhurmakUnmetalls;
import helden.model.profession.magier.YolGhurmakWucherung;
import helden.model.profession.magier.Ysilia;
import helden.model.profession.magier.Zorgan;
import helden.model.profession.varianten.VollRunenzauberer;
import java.util.ArrayList;
import java.util.Iterator;

public class Magier
extends L
implements Q {
    private P O\u00d4\u00d2O00;
    private P O\u00d2\u00d2O00;
    private P \u00d5\u00d3\u00d2O00;
    private P \u00d8\u00d2\u00d2O00;
    private P o\u00d2\u00d2O00;
    private P \u00f4\u00d2\u00d2O00;
    private P \u00d3\u00d6\u00d2O00;
    private P \u00d5\u00d5\u00d2O00;
    private P \u00f4\u00d6\u00d2O00;
    private P \u00f5\u00d4\u00d2O00;
    private P nullpublicvoid;
    private P \u00d5\u00d2\u00d2O00;
    private P \u00d4\u00d5\u00d2O00;
    private P \u00d8\u00d5\u00d2O00;
    private P o\u00d5\u00d2O00;
    private P returnprivatevoid;
    private P newprivatevoid;
    private P whilewhilevoid;
    private P \u00f5\u00d2\u00d2O00;
    private P forpublicvoid;
    private P whileprivatevoid;
    private P O\u00d5\u00d2O00;
    private P O\u00d3\u00d2O00;
    private P \u00f5\u00d3\u00d2O00;
    private P thispublicvoid;
    private P \u00f5\u00d6\u00d2O00;
    private P \u00d8\u00d6\u00d2O00;
    private P \u00d3\u00d5\u00d2O00;
    private P O\u00d8\u00d2O00;
    private P \u00d3\u00d2\u00d2O00;
    private P \u00d4\u00d3\u00d2O00;
    private P \u00d3\u00d4\u00d2O00;
    private P nullinterfacevoid;
    private P Stringinterfacevoid;
    private P Stringpublicvoid;
    private P o\u00d4\u00d2O00;
    private P privateinterfacevoid;
    private P \u00f4\u00d3\u00d2O00;
    private P \u00d8\u00d3\u00d2O00;
    private P \u00f8\u00d4\u00d2O00;
    private P \u00f8\u00d5\u00d2O00;
    private P O\u00d6\u00d2O00;
    private P \u00d4\u00d2\u00d2O00;
    private P \u00d5\u00d4\u00d2O00;
    private P \u00f8\u00d2\u00d2O00;
    private P \u00d3\u00d3\u00d2O00;
    private P o\u00d6\u00d2O00;
    private P privatepublicvoid;
    private P forinterfacevoid;
    private P o\u00d3\u00d2O00;
    private P ifprivatevoid;
    private P \u00f5\u00d5\u00d2O00;
    private P \u00f4\u00d4\u00d2O00;
    private P thisinterfacevoid;
    private P \u00d8\u00d4\u00d2O00;
    private P \u00f4\u00d5\u00d2O00;
    private P \u00d4\u00d4\u00d2O00;
    private P \u00d5\u00d6\u00d2O00;
    private P \u00f8\u00d6\u00d2O00;
    private P \u00d4\u00d6\u00d2O00;
    private MendenaInvokator \u00f8\u00d3\u00d2O00;

    public Magier() {
    }

    public Magier(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAlAnfaLeibmagier() {
        if (this.O\u00d2\u00d2O00 == null) {
            this.O\u00d2\u00d2O00 = new AlAnfaLeibmagier();
        }
        return this.O\u00d2\u00d2O00;
    }

    public P getAlAnfaSeekrieg() {
        if (this.\u00f4\u00d2\u00d2O00 == null) {
            this.\u00f4\u00d2\u00d2O00 = new AlAnfaSeekrieg();
        }
        return this.\u00f4\u00d2\u00d2O00;
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getVollRunenZauberer());
        return arrayList;
    }

    public P getAndergast() {
        if (this.O\u00d4\u00d2O00 == null) {
            this.O\u00d4\u00d2O00 = new Andergast();
        }
        return this.O\u00d4\u00d2O00;
    }

    public P getBelhanka() {
        if (this.\u00d5\u00d3\u00d2O00 == null) {
            this.\u00d5\u00d3\u00d2O00 = new Belhanka();
        }
        return this.\u00d5\u00d3\u00d2O00;
    }

    public P getBethana() {
        if (this.\u00d8\u00d2\u00d2O00 == null) {
            this.\u00d8\u00d2\u00d2O00 = new Bethana();
        }
        return this.\u00d8\u00d2\u00d2O00;
    }

    public P getBrabak() {
        if (this.o\u00d2\u00d2O00 == null) {
            this.o\u00d2\u00d2O00 = new Brabak();
        }
        return this.o\u00d2\u00d2O00;
    }

    public P getDonnerbachHeilung() {
        if (this.\u00d3\u00d6\u00d2O00 == null) {
            this.\u00d3\u00d6\u00d2O00 = new DonnerbachHeilung();
        }
        return this.\u00d3\u00d6\u00d2O00;
    }

    public P getDonnerbachVerstaendigung() {
        if (this.\u00d5\u00d5\u00d2O00 == null) {
            this.\u00d5\u00d5\u00d2O00 = new DonnerbachVerstaendigung();
        }
        return this.\u00d5\u00d5\u00d2O00;
    }

    public P getDrakoniaEis() {
        if (this.\u00d8\u00d5\u00d2O00 == null) {
            this.\u00d8\u00d5\u00d2O00 = new DrakoniaEis();
        }
        return this.\u00d8\u00d5\u00d2O00;
    }

    public P getDrakoniaErz() {
        if (this.\u00d4\u00d5\u00d2O00 == null) {
            this.\u00d4\u00d5\u00d2O00 = new DrakoniaErz();
        }
        return this.\u00d4\u00d5\u00d2O00;
    }

    public P getDrakoniaFeuer() {
        if (this.\u00f4\u00d6\u00d2O00 == null) {
            this.\u00f4\u00d6\u00d2O00 = new DrakoniaFeuer();
        }
        return this.\u00f4\u00d6\u00d2O00;
    }

    public P getDrakoniaHumus() {
        if (this.\u00f5\u00d4\u00d2O00 == null) {
            this.\u00f5\u00d4\u00d2O00 = new DrakoniaHumus();
        }
        return this.\u00f5\u00d4\u00d2O00;
    }

    public P getDrakoniaLuft() {
        if (this.\u00d5\u00d2\u00d2O00 == null) {
            this.\u00d5\u00d2\u00d2O00 = new DrakoniaLuft();
        }
        return this.\u00d5\u00d2\u00d2O00;
    }

    public P getDrakoniaWasser() {
        if (this.nullpublicvoid == null) {
            this.nullpublicvoid = new DrakoniaWasser();
        }
        return this.nullpublicvoid;
    }

    public P getElburum() {
        if (this.o\u00d5\u00d2O00 == null) {
            this.o\u00d5\u00d2O00 = new Elburum();
        }
        return this.o\u00d5\u00d2O00;
    }

    public P getElenvina() {
        if (this.returnprivatevoid == null) {
            this.returnprivatevoid = new Elenvina();
        }
        return this.returnprivatevoid;
    }

    public P getFasar1gemaessigt() {
        if (this.whilewhilevoid == null) {
            this.whilewhilevoid = new Fasar1gemaessigt();
        }
        return this.whilewhilevoid;
    }

    public P getFasar1hart() {
        if (this.\u00f5\u00d2\u00d2O00 == null) {
            this.\u00f5\u00d2\u00d2O00 = new Fasar1hart();
        }
        return this.\u00f5\u00d2\u00d2O00;
    }

    public P getFasar2() {
        if (this.forpublicvoid == null) {
            this.forpublicvoid = new Fasar2();
        }
        return this.forpublicvoid;
    }

    public P getFestum() {
        if (this.newprivatevoid == null) {
            this.newprivatevoid = new Festum();
        }
        return this.newprivatevoid;
    }

    public P getGareth1() {
        if (this.whileprivatevoid == null) {
            this.whileprivatevoid = new Gareth1();
        }
        return this.whileprivatevoid;
    }

    public P getGareth2() {
        if (this.O\u00d5\u00d2O00 == null) {
            this.O\u00d5\u00d2O00 = new Gareth2();
        }
        return this.O\u00d5\u00d2O00;
    }

    public P getGerasim() {
        if (this.O\u00d3\u00d2O00 == null) {
            this.O\u00d3\u00d2O00 = new Gerasim();
        }
        return this.O\u00d3\u00d2O00;
    }

    @Override
    public String getGildenzugehoerigkeit() {
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!(p2 instanceof Q)) continue;
            return ((Q)((Object)p2)).getGildenzugehoerigkeit();
        }
        return null;
    }

    public P getGrangor() {
        if (this.\u00f5\u00d3\u00d2O00 == null) {
            this.\u00f5\u00d3\u00d2O00 = new Grangor();
        }
        return this.\u00f5\u00d3\u00d2O00;
    }

    @Override
    public String getID() {
        return "P48";
    }

    public P getInstitutDerArkanenAnalysen() {
        if (this.\u00f5\u00d5\u00d2O00 == null) {
            this.\u00f5\u00d5\u00d2O00 = new InstitutDerArkanenAnalysen();
        }
        return this.\u00f5\u00d5\u00d2O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKhunchom() {
        if (this.thispublicvoid == null) {
            this.thispublicvoid = new Khunchom();
        }
        return this.thispublicvoid;
    }

    public P getKuslik1() {
        if (this.\u00f5\u00d6\u00d2O00 == null) {
            this.\u00f5\u00d6\u00d2O00 = new Kuslik1();
        }
        return this.\u00f5\u00d6\u00d2O00;
    }

    public P getKuslik2() {
        if (this.\u00d8\u00d6\u00d2O00 == null) {
            this.\u00d8\u00d6\u00d2O00 = new Kuslik2();
        }
        return this.\u00d8\u00d6\u00d2O00;
    }

    public P getLowangenMacht() {
        if (this.\u00d3\u00d5\u00d2O00 == null) {
            this.\u00d3\u00d5\u00d2O00 = new LowangenMacht();
        }
        return this.\u00d3\u00d5\u00d2O00;
    }

    public P getLowangenVerformungen() {
        if (this.O\u00d8\u00d2O00 == null) {
            this.O\u00d8\u00d2O00 = new LowangenVerformungen();
        }
        return this.O\u00d8\u00d2O00;
    }

    public P getMendenaInitiator() {
        if (this.\u00d4\u00d4\u00d2O00 == null) {
            this.\u00d4\u00d4\u00d2O00 = new MendenaInitiator();
        }
        return this.\u00d4\u00d4\u00d2O00;
    }

    public P getMendenaInspirator() {
        if (this.\u00d5\u00d6\u00d2O00 == null) {
            this.\u00d5\u00d6\u00d2O00 = new MendenaInspirator();
        }
        return this.\u00d5\u00d6\u00d2O00;
    }

    public P getMendenaInstrukteuer() {
        if (this.\u00f8\u00d6\u00d2O00 == null) {
            this.\u00f8\u00d6\u00d2O00 = new MendenaInstrukteur();
        }
        return this.\u00f8\u00d6\u00d2O00;
    }

    public P getMendenaInvokator() {
        if (this.\u00f8\u00d3\u00d2O00 == null) {
            this.\u00f8\u00d3\u00d2O00 = new MendenaInvokator();
        }
        return this.\u00f8\u00d3\u00d2O00;
    }

    public P getMethumis() {
        if (this.\u00d3\u00d2\u00d2O00 == null) {
            this.\u00d3\u00d2\u00d2O00 = new Methumis();
        }
        return this.\u00d3\u00d2\u00d2O00;
    }

    public P getMherwed() {
        if (this.\u00d4\u00d3\u00d2O00 == null) {
            this.\u00d4\u00d3\u00d2O00 = new Mherwed();
        }
        return this.\u00d4\u00d3\u00d2O00;
    }

    public P getMirham() {
        if (this.\u00d3\u00d4\u00d2O00 == null) {
            this.\u00d3\u00d4\u00d2O00 = new Mirham();
        }
        return this.\u00d3\u00d4\u00d2O00;
    }

    public P getNeersand() {
        if (this.nullinterfacevoid == null) {
            this.nullinterfacevoid = new Neersand();
        }
        return this.nullinterfacevoid;
    }

    public P getNorburg() {
        if (this.Stringinterfacevoid == null) {
            this.Stringinterfacevoid = new Norburg();
        }
        return this.Stringinterfacevoid;
    }

    public P getNostria() {
        if (this.Stringpublicvoid == null) {
            this.Stringpublicvoid = new Nostria();
        }
        return this.Stringpublicvoid;
    }

    public P getOlport() {
        if (this.o\u00d4\u00d2O00 == null) {
            this.o\u00d4\u00d2O00 = new Olport();
        }
        return this.o\u00d4\u00d2O00;
    }

    public P getPerricum() {
        if (this.privateinterfacevoid == null) {
            this.privateinterfacevoid = new Perricum();
        }
        return this.privateinterfacevoid;
    }

    public P getPunin1() {
        if (this.\u00f4\u00d3\u00d2O00 == null) {
            this.\u00f4\u00d3\u00d2O00 = new Punin1();
        }
        return this.\u00f4\u00d3\u00d2O00;
    }

    public P getPunin2() {
        if (this.\u00d8\u00d3\u00d2O00 == null) {
            this.\u00d8\u00d3\u00d2O00 = new Punin2();
        }
        return this.\u00d8\u00d3\u00d2O00;
    }

    public P getRashdulDaemonisch() {
        if (this.\u00f8\u00d5\u00d2O00 == null) {
            this.\u00f8\u00d5\u00d2O00 = new RashdulDaemonisch();
        }
        return this.\u00f8\u00d5\u00d2O00;
    }

    public P getRashdulElementar() {
        if (this.\u00f8\u00d4\u00d2O00 == null) {
            this.\u00f8\u00d4\u00d2O00 = new RashdulElementar();
        }
        return this.\u00f8\u00d4\u00d2O00;
    }

    public P getRivaBerater() {
        if (this.O\u00d6\u00d2O00 == null) {
            this.O\u00d6\u00d2O00 = new RivaBerater();
        }
        return this.O\u00d6\u00d2O00;
    }

    public P getRivaLeibwaechter() {
        if (this.\u00d4\u00d2\u00d2O00 == null) {
            this.\u00d4\u00d2\u00d2O00 = new RivaLeibwaechter();
        }
        return this.\u00d4\u00d2\u00d2O00;
    }

    public P getRommilys() {
        if (this.\u00d5\u00d4\u00d2O00 == null) {
            this.\u00d5\u00d4\u00d2O00 = new Rommilys();
        }
        return this.\u00d5\u00d4\u00d2O00;
    }

    public P getSinoda() {
        if (this.\u00f8\u00d2\u00d2O00 == null) {
            this.\u00f8\u00d2\u00d2O00 = new Sinoda();
        }
        return this.\u00f8\u00d2\u00d2O00;
    }

    public P getSulmanAlNassori() {
        if (this.\u00d3\u00d3\u00d2O00 == null) {
            this.\u00d3\u00d3\u00d2O00 = new SulmanAlNassori();
        }
        return this.\u00d3\u00d3\u00d2O00;
    }

    public P getThorwal() {
        if (this.o\u00d6\u00d2O00 == null) {
            this.o\u00d6\u00d2O00 = new Thorwal();
        }
        return this.o\u00d6\u00d2O00;
    }

    public P getTuzak() {
        if (this.privatepublicvoid == null) {
            this.privatepublicvoid = new Tuzak();
        }
        return this.privatepublicvoid;
    }

    public P getVinsalt() {
        if (this.forinterfacevoid == null) {
            this.forinterfacevoid = new Vinsalt();
        }
        return this.forinterfacevoid;
    }

    public P getVollRunenZauberer() {
        if (this.\u00d4\u00d6\u00d2O00 == null) {
            this.\u00d4\u00d6\u00d2O00 = new VollRunenzauberer();
        }
        return this.\u00d4\u00d6\u00d2O00;
    }

    public P getYolGurmakF() {
        if (this.\u00f4\u00d5\u00d2O00 == null) {
            this.\u00f4\u00d5\u00d2O00 = new YolGhurmakFlammensaeule();
        }
        return this.\u00f4\u00d5\u00d2O00;
    }

    public P getYolGurmakH() {
        if (this.thisinterfacevoid == null) {
            this.thisinterfacevoid = new YolGhurmakHoellenwindes();
        }
        return this.thisinterfacevoid;
    }

    public P getYolGurmakU() {
        if (this.\u00f4\u00d4\u00d2O00 == null) {
            this.\u00f4\u00d4\u00d2O00 = new YolGhurmakUnmetalls();
        }
        return this.\u00f4\u00d4\u00d2O00;
    }

    public P getYolGurmakW() {
        if (this.\u00d8\u00d4\u00d2O00 == null) {
            this.\u00d8\u00d4\u00d2O00 = new YolGhurmakWucherung();
        }
        return this.\u00d8\u00d4\u00d2O00;
    }

    public P getYsilia() {
        if (this.o\u00d3\u00d2O00 == null) {
            this.o\u00d3\u00d2O00 = new Ysilia();
        }
        return this.o\u00d3\u00d2O00;
    }

    public P getZorgan() {
        if (this.ifprivatevoid == null) {
            this.ifprivatevoid = new Zorgan();
        }
        return this.ifprivatevoid;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 != null && p2.equals(this.getOlport())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getVollRunenZauberer());
            arrayList.add(arrayList2);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        super.istZeitaufwendig();
        return true;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.getGewaehlteVarianten().size() == 0) {
            if (this.istMaennlich()) {
                return "Magier";
            }
            return "Magierin";
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
        this.addAlleVarianten(this.getAndergast());
        this.addAlleVarianten(this.getAlAnfaLeibmagier());
        this.addAlleVarianten(this.getAlAnfaSeekrieg());
        this.addAlleVarianten(this.getBelhanka());
        this.addAlleVarianten(this.getBethana());
        this.addAlleVarianten(this.getBrabak());
        this.addAlleVarianten(this.getDonnerbachHeilung());
        this.addAlleVarianten(this.getDonnerbachVerstaendigung());
        this.addAlleVarianten(this.getDrakoniaFeuer());
        this.addAlleVarianten(this.getDrakoniaHumus());
        this.addAlleVarianten(this.getDrakoniaWasser());
        this.addAlleVarianten(this.getDrakoniaLuft());
        this.addAlleVarianten(this.getDrakoniaErz());
        this.addAlleVarianten(this.getDrakoniaEis());
        this.addAlleVarianten(this.getElburum());
        this.addAlleVarianten(this.getElenvina());
        this.addAlleVarianten(this.getFasar1gemaessigt());
        this.addAlleVarianten(this.getFasar1hart());
        this.addAlleVarianten(this.getFasar2());
        this.addAlleVarianten(this.getFestum());
        this.addAlleVarianten(this.getGareth1());
        this.addAlleVarianten(this.getGareth2());
        this.addAlleVarianten(this.getGerasim());
        this.addAlleVarianten(this.getGrangor());
        this.addAlleVarianten(this.getKhunchom());
        this.addAlleVarianten(this.getKuslik1());
        this.addAlleVarianten(this.getKuslik2());
        this.addAlleVarianten(this.getInstitutDerArkanenAnalysen());
        this.addAlleVarianten(this.getLowangenMacht());
        this.addAlleVarianten(this.getLowangenVerformungen());
        this.addAlleVarianten(this.getMethumis());
        this.addAlleVarianten(this.getMherwed());
        this.addAlleVarianten(this.getMirham());
        this.addAlleVarianten(this.getNeersand());
        this.addAlleVarianten(this.getNorburg());
        this.addAlleVarianten(this.getNostria());
        this.addAlleVarianten(this.getOlport());
        this.addAlleVarianten(this.getPerricum());
        this.addAlleVarianten(this.getPunin1());
        this.addAlleVarianten(this.getPunin2());
        this.addAlleVarianten(this.getRashdulElementar());
        this.addAlleVarianten(this.getRashdulDaemonisch());
        this.addAlleVarianten(this.getRivaBerater());
        this.addAlleVarianten(this.getRivaLeibwaechter());
        this.addAlleVarianten(this.getRommilys());
        this.addAlleVarianten(this.getSinoda());
        this.addAlleVarianten(this.getSulmanAlNassori());
        this.addAlleVarianten(this.getThorwal());
        this.addAlleVarianten(this.getTuzak());
        this.addAlleVarianten(this.getVinsalt());
        this.addAlleVarianten(this.getYsilia());
        this.addAlleVarianten(this.getZorgan());
        this.addAlleVarianten(this.getYolGurmakF());
        this.addAlleVarianten(this.getYolGurmakU());
        this.addAlleVarianten(this.getYolGurmakH());
        this.addAlleVarianten(this.getYolGurmakW());
        this.addAlleVarianten(this.getMendenaInitiator());
        this.addAlleVarianten(this.getMendenaInspirator());
        this.addAlleVarianten(this.getMendenaInstrukteuer());
        this.addAlleVarianten(this.getMendenaInvokator());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAndergast());
        this.addMoeglicheVariante(this.getAlAnfaLeibmagier());
        this.addMoeglicheVariante(this.getAlAnfaSeekrieg());
        this.addMoeglicheVariante(this.getBelhanka());
        this.addMoeglicheVariante(this.getBethana());
        this.addMoeglicheVariante(this.getBrabak());
        this.addMoeglicheVariante(this.getDonnerbachHeilung());
        this.addMoeglicheVariante(this.getDonnerbachVerstaendigung());
        this.addMoeglicheVariante(this.getDrakoniaFeuer());
        this.addMoeglicheVariante(this.getDrakoniaHumus());
        this.addMoeglicheVariante(this.getDrakoniaWasser());
        this.addMoeglicheVariante(this.getDrakoniaLuft());
        this.addMoeglicheVariante(this.getDrakoniaErz());
        this.addMoeglicheVariante(this.getDrakoniaEis());
        this.addMoeglicheVariante(this.getElburum());
        this.addMoeglicheVariante(this.getElenvina());
        this.addMoeglicheVariante(this.getFasar1gemaessigt());
        this.addMoeglicheVariante(this.getFasar1hart());
        this.addMoeglicheVariante(this.getFasar2());
        this.addMoeglicheVariante(this.getFestum());
        this.addMoeglicheVariante(this.getGareth1());
        this.addMoeglicheVariante(this.getGareth2());
        this.addMoeglicheVariante(this.getGerasim());
        this.addMoeglicheVariante(this.getGrangor());
        this.addMoeglicheVariante(this.getKhunchom());
        this.addMoeglicheVariante(this.getKuslik1());
        this.addMoeglicheVariante(this.getKuslik2());
        this.addMoeglicheVariante(this.getLowangenMacht());
        this.addMoeglicheVariante(this.getLowangenVerformungen());
        this.addMoeglicheVariante(this.getMethumis());
        this.addMoeglicheVariante(this.getMherwed());
        this.addMoeglicheVariante(this.getMirham());
        this.addMoeglicheVariante(this.getNeersand());
        this.addMoeglicheVariante(this.getNorburg());
        this.addMoeglicheVariante(this.getNostria());
        this.addMoeglicheVariante(this.getPerricum());
        this.addMoeglicheVariante(this.getPunin1());
        this.addMoeglicheVariante(this.getPunin2());
        this.addMoeglicheVariante(this.getRashdulElementar());
        this.addMoeglicheVariante(this.getRashdulDaemonisch());
        this.addMoeglicheVariante(this.getRivaBerater());
        this.addMoeglicheVariante(this.getRivaLeibwaechter());
        this.addMoeglicheVariante(this.getRommilys());
        this.addMoeglicheVariante(this.getSinoda());
        this.addMoeglicheVariante(this.getSulmanAlNassori());
        this.addMoeglicheVariante(this.getThorwal());
        this.addMoeglicheVariante(this.getTuzak());
        this.addMoeglicheVariante(this.getVinsalt());
        this.addMoeglicheVariante(this.getYsilia());
        this.addMoeglicheVariante(this.getZorgan());
        this.addMoeglicheVariante(this.getYolGurmakF());
        this.addMoeglicheVariante(this.getYolGurmakU());
        this.addMoeglicheVariante(this.getYolGurmakH());
        this.addMoeglicheVariante(this.getYolGurmakW());
        this.addMoeglicheVariante(this.getMendenaInitiator());
        this.addMoeglicheVariante(this.getMendenaInspirator());
        this.addMoeglicheVariante(this.getMendenaInstrukteuer());
        this.addMoeglicheVariante(this.getMendenaInvokator());
    }
}

