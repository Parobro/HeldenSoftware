/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.hexe.FahrendeGemeinschaft;
import helden.model.profession.hexe.SchoeneDerNacht;
import helden.model.profession.hexe.SchwarzeWitwe;
import helden.model.profession.hexe.SchwesterDesWissens;
import helden.model.profession.hexe.SeherinVonHeuteUndMorgen;
import helden.model.profession.hexe.TochterDerErde;
import helden.model.profession.hexe.VerschwiegeneSchwester;
import java.util.ArrayList;

public class Hexe
extends L {
    private P o\u00d5\u00d5O00;
    private P whilereturnint;
    private P \u00d8\u00d5\u00d5O00;
    private P \u00d4\u00d5\u00d5O00;
    private P \u00d5\u00d5\u00d5O00;
    private P thisvoidint;
    private P \u00d3\u00d5\u00d5O00;

    public Hexe() {
    }

    public Hexe(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFahrendeGemeinschaft() {
        if (this.\u00d8\u00d5\u00d5O00 == null) {
            this.\u00d8\u00d5\u00d5O00 = new FahrendeGemeinschaft();
        }
        return this.\u00d8\u00d5\u00d5O00;
    }

    @Override
    public String getID() {
        return "P35";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getSchoeneDerNacht() {
        if (this.\u00d3\u00d5\u00d5O00 == null) {
            this.\u00d3\u00d5\u00d5O00 = new SchoeneDerNacht();
        }
        return this.\u00d3\u00d5\u00d5O00;
    }

    public P getSchwarzeWitwe() {
        if (this.whilereturnint == null) {
            this.whilereturnint = new SchwarzeWitwe();
        }
        return this.whilereturnint;
    }

    public P getSchwesterDesWissens() {
        if (this.\u00d5\u00d5\u00d5O00 == null) {
            this.\u00d5\u00d5\u00d5O00 = new SchwesterDesWissens();
        }
        return this.\u00d5\u00d5\u00d5O00;
    }

    public P getSeherenVonHeuteUndMorgen() {
        if (this.\u00d4\u00d5\u00d5O00 == null) {
            this.\u00d4\u00d5\u00d5O00 = new SeherinVonHeuteUndMorgen();
        }
        return this.\u00d4\u00d5\u00d5O00;
    }

    public P getTochterDerErde() {
        if (this.o\u00d5\u00d5O00 == null) {
            this.o\u00d5\u00d5O00 = new TochterDerErde();
        }
        return this.o\u00d5\u00d5O00;
    }

    public P getVerschewiegeneSchwester() {
        if (this.thisvoidint == null) {
            this.thisvoidint = new VerschwiegeneSchwester();
        }
        return this.thisvoidint;
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
        return true;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Hexer");
        } else {
            stringBuffer.append("Hexe");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getTochterDerErde());
        this.addAlleVarianten(this.getSchwarzeWitwe());
        this.addAlleVarianten(this.getFahrendeGemeinschaft());
        this.addAlleVarianten(this.getSeherenVonHeuteUndMorgen());
        this.addAlleVarianten(this.getSchwesterDesWissens());
        this.addAlleVarianten(this.getVerschewiegeneSchwester());
        this.addAlleVarianten(this.getSchoeneDerNacht());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getTochterDerErde());
        this.addMoeglicheVariante(this.getSchwarzeWitwe());
        this.addMoeglicheVariante(this.getFahrendeGemeinschaft());
        this.addMoeglicheVariante(this.getSeherenVonHeuteUndMorgen());
        this.addMoeglicheVariante(this.getSchwesterDesWissens());
        this.addMoeglicheVariante(this.getVerschewiegeneSchwester());
        this.addMoeglicheVariante(this.getSchoeneDerNacht());
    }
}

