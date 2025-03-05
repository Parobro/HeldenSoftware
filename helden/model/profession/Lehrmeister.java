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
import helden.model.profession.lehrmeister.BeschwoererkreisdesKarasuk;
import helden.model.profession.lehrmeister.DeveronElgarstynMysteriker;
import helden.model.profession.lehrmeister.DeveronElgarstynSchatten;
import helden.model.profession.lehrmeister.ErbederGraeber;
import helden.model.profession.lehrmeister.Ilarist;
import helden.model.profession.lehrmeister.KreisEinfuehlung;
import helden.model.profession.lehrmeister.LuminoffundMorcalinoVariante;
import helden.model.profession.lehrmeister.MagistraKiranya;
import helden.model.profession.lehrmeister.Nachtwind;
import helden.model.profession.lehrmeister.Niobara;
import helden.model.profession.lehrmeister.RafimBey;
import helden.model.profession.lehrmeister.SchuelerderKhelbaraVariante;
import helden.model.profession.lehrmeister.Sefira;
import helden.model.profession.lehrmeister.SeptimoSargentillian;
import helden.model.profession.lehrmeister.SevastanaGevendar;
import helden.model.profession.lehrmeister.ValeranMenaris;
import helden.model.profession.lehrmeister.XavieraKarsidian;
import java.util.ArrayList;

public class Lehrmeister
extends L
implements Q {
    private P ifwhilevoid;
    private P \u00f8O\u00d2O00;
    private P \u00f4O\u00d2O00;
    private P \u00f8o\u00d2O00;
    private P newwhilevoid;
    private P \u00d3o\u00d2O00;
    private P \u00f5O\u00d2O00;
    private P oo\u00d2O00;
    private P Oo\u00d2O00;
    private Nachtwind \u00f5o\u00d2O00;
    private SeptimoSargentillian \u00f4o\u00d2O00;
    private P \u00d5o\u00d2O00;
    private ValeranMenaris \u00d4o\u00d2O00;
    private XavieraKarsidian privatedovoid;
    private Sefira \u00d8o\u00d2O00;
    private DeveronElgarstynMysteriker \u00d8O\u00d2O00;
    private DeveronElgarstynSchatten returnwhilevoid;

    public Lehrmeister() {
    }

    public Lehrmeister(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getDeveronMyst() {
        if (this.\u00d8O\u00d2O00 == null) {
            this.\u00d8O\u00d2O00 = new DeveronElgarstynMysteriker();
        }
        return this.\u00d8O\u00d2O00;
    }

    public P getDeveronSchatten() {
        if (this.returnwhilevoid == null) {
            this.returnwhilevoid = new DeveronElgarstynSchatten();
        }
        return this.returnwhilevoid;
    }

    public P getErbederGraeber() {
        if (this.newwhilevoid == null) {
            this.newwhilevoid = new ErbederGraeber();
        }
        return this.newwhilevoid;
    }

    @Override
    public String getGildenzugehoerigkeit() {
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!(p2 instanceof Q)) continue;
            return ((Q)((Object)p2)).getGildenzugehoerigkeit();
        }
        return null;
    }

    @Override
    public String getID() {
        return "P83";
    }

    public P getIlarist() {
        if (this.\u00d3o\u00d2O00 == null) {
            this.\u00d3o\u00d2O00 = new Ilarist();
        }
        return this.\u00d3o\u00d2O00;
    }

    public P getKarasuk() {
        if (this.\u00f5O\u00d2O00 == null) {
            this.\u00f5O\u00d2O00 = new BeschwoererkreisdesKarasuk();
        }
        return this.\u00f5O\u00d2O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKhelbara() {
        if (this.oo\u00d2O00 == null) {
            this.oo\u00d2O00 = new SchuelerderKhelbaraVariante();
        }
        return this.oo\u00d2O00;
    }

    public P getKreisDerEinfuehlung() {
        if (this.\u00f8O\u00d2O00 == null) {
            this.\u00f8O\u00d2O00 = new KreisEinfuehlung();
        }
        return this.\u00f8O\u00d2O00;
    }

    public P getLundM() {
        if (this.Oo\u00d2O00 == null) {
            this.Oo\u00d2O00 = new LuminoffundMorcalinoVariante();
        }
        return this.Oo\u00d2O00;
    }

    public P getMagistraKiranya() {
        if (this.\u00f4O\u00d2O00 == null) {
            this.\u00f4O\u00d2O00 = new MagistraKiranya();
        }
        return this.\u00f4O\u00d2O00;
    }

    public P getNachtwind() {
        if (this.\u00f5o\u00d2O00 == null) {
            this.\u00f5o\u00d2O00 = new Nachtwind();
        }
        return this.\u00f5o\u00d2O00;
    }

    public P getNiobara() {
        if (this.\u00d5o\u00d2O00 == null) {
            this.\u00d5o\u00d2O00 = new Niobara();
        }
        return this.\u00d5o\u00d2O00;
    }

    public P getRafimBey() {
        if (this.ifwhilevoid == null) {
            this.ifwhilevoid = new RafimBey();
        }
        return this.ifwhilevoid;
    }

    public P getSchuelerderXavieraKarsidian() {
        if (this.privatedovoid == null) {
            this.privatedovoid = new XavieraKarsidian();
        }
        return this.privatedovoid;
    }

    public P getSefira() {
        if (this.\u00d8o\u00d2O00 == null) {
            this.\u00d8o\u00d2O00 = new Sefira();
        }
        return this.\u00d8o\u00d2O00;
    }

    public P getSeptimoSargentillian() {
        if (this.\u00f4o\u00d2O00 == null) {
            this.\u00f4o\u00d2O00 = new SeptimoSargentillian();
        }
        return this.\u00f4o\u00d2O00;
    }

    public P getSevastanaGevendar() {
        if (this.\u00f8o\u00d2O00 == null) {
            this.\u00f8o\u00d2O00 = new SevastanaGevendar();
        }
        return this.\u00f8o\u00d2O00;
    }

    public P getValeranMenaris() {
        if (this.\u00d4o\u00d2O00 == null) {
            this.\u00d4o\u00d2O00 = new ValeranMenaris();
        }
        return this.\u00d4o\u00d2O00;
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
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Privater Lehrmeister");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getRafimBey());
        this.addAlleVarianten(this.getKreisDerEinfuehlung());
        this.addAlleVarianten(this.getMagistraKiranya());
        this.addAlleVarianten(this.getSevastanaGevendar());
        this.addAlleVarianten(this.getErbederGraeber());
        this.addAlleVarianten(this.getIlarist());
        this.addAlleVarianten(this.getKarasuk());
        this.addAlleVarianten(this.getKhelbara());
        this.addAlleVarianten(this.getLundM());
        this.addAlleVarianten(this.getNachtwind());
        this.addAlleVarianten(this.getSeptimoSargentillian());
        this.addAlleVarianten(this.getNiobara());
        this.addAlleVarianten(this.getSchuelerderXavieraKarsidian());
        this.addAlleVarianten(this.getSefira());
        this.addAlleVarianten(this.getDeveronMyst());
        this.addAlleVarianten(this.getDeveronSchatten());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getRafimBey());
        this.addMoeglicheVariante(this.getKreisDerEinfuehlung());
        this.addMoeglicheVariante(this.getMagistraKiranya());
        this.addMoeglicheVariante(this.getSevastanaGevendar());
        this.addMoeglicheVariante(this.getErbederGraeber());
        this.addMoeglicheVariante(this.getIlarist());
        this.addMoeglicheVariante(this.getKarasuk());
        this.addMoeglicheVariante(this.getKhelbara());
        this.addMoeglicheVariante(this.getLundM());
        this.addMoeglicheVariante(this.getNachtwind());
        this.addMoeglicheVariante(this.getSeptimoSargentillian());
        this.addMoeglicheVariante(this.getNiobara());
        this.addMoeglicheVariante(this.getSchuelerderXavieraKarsidian());
        this.addMoeglicheVariante(this.getSefira());
    }
}

