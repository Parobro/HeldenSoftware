/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.BasisProfessionTharun;
import helden.model.tharun.profession.niedererguerai.ConossosVariante;
import helden.model.tharun.profession.niedererguerai.HashandraVariante;
import helden.model.tharun.profession.niedererguerai.IlshiVailenVariante;
import helden.model.tharun.profession.niedererguerai.JueVariante;
import helden.model.tharun.profession.niedererguerai.KuumVariante;
import helden.model.tharun.profession.niedererguerai.LaniaVariante;
import helden.model.tharun.profession.niedererguerai.MemonhabVariante;
import helden.model.tharun.profession.niedererguerai.TharunVariante;
import helden.model.tharun.profession.niedererguerai.ThuaraVariante;
import java.util.Iterator;

public class NiedererGuerai
extends BasisProfessionTharun {
    private P \u00d3\u00f5\u00d6O00;
    private P \u00d4\u00f5\u00d6O00;
    private ConossosVariante \u00f5\u00f4\u00d6O00;
    private LaniaVariante O\u00f5\u00d6O00;
    private JueVariante \u00f8\u00f4\u00d6O00;
    private MemonhabVariante privateinterfaceint;
    private ThuaraVariante o\u00f5\u00d6O00;
    private IlshiVailenVariante \u00f4\u00f4\u00d6O00;
    private TharunVariante newthisif;

    public NiedererGuerai() {
    }

    public NiedererGuerai(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P221";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getNiedererGueraiausConossos() {
        if (this.\u00f5\u00f4\u00d6O00 == null) {
            this.\u00f5\u00f4\u00d6O00 = new ConossosVariante();
        }
        return this.\u00f5\u00f4\u00d6O00;
    }

    public P getNiedererGueraiausHashandra() {
        if (this.\u00d3\u00f5\u00d6O00 == null) {
            this.\u00d3\u00f5\u00d6O00 = new HashandraVariante();
        }
        return this.\u00d3\u00f5\u00d6O00;
    }

    public P getNiedererGueraiausIlshiVailen() {
        if (this.\u00f4\u00f4\u00d6O00 == null) {
            this.\u00f4\u00f4\u00d6O00 = new IlshiVailenVariante();
        }
        return this.\u00f4\u00f4\u00d6O00;
    }

    public P getNiedererGueraiausJue() {
        if (this.\u00f8\u00f4\u00d6O00 == null) {
            this.\u00f8\u00f4\u00d6O00 = new JueVariante();
        }
        return this.\u00f8\u00f4\u00d6O00;
    }

    public P getNiedererGueraiausKuum() {
        if (this.\u00d4\u00f5\u00d6O00 == null) {
            this.\u00d4\u00f5\u00d6O00 = new KuumVariante();
        }
        return this.\u00d4\u00f5\u00d6O00;
    }

    public P getNiedererGueraiausLania() {
        if (this.O\u00f5\u00d6O00 == null) {
            this.O\u00f5\u00d6O00 = new LaniaVariante();
        }
        return this.O\u00f5\u00d6O00;
    }

    public P getNiedererGueraiausMemonhab() {
        if (this.privateinterfaceint == null) {
            this.privateinterfaceint = new MemonhabVariante();
        }
        return this.privateinterfaceint;
    }

    public P getNiedererGueraiausTharun() {
        if (this.newthisif == null) {
            this.newthisif = new TharunVariante();
        }
        return this.newthisif;
    }

    public P getNiedererGueraiausThuara() {
        if (this.o\u00f5\u00d6O00 == null) {
            this.o\u00f5\u00d6O00 = new ThuaraVariante();
        }
        return this.o\u00f5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Niederer Guerai");
        } else {
            stringBuffer.append("Niederer Guerai");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
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
        this.addAlleVarianten(this.getNiedererGueraiausHashandra());
        this.addAlleVarianten(this.getNiedererGueraiausKuum());
        this.addAlleVarianten(this.getNiedererGueraiausConossos());
        this.addAlleVarianten(this.getNiedererGueraiausLania());
        this.addAlleVarianten(this.getNiedererGueraiausIlshiVailen());
        this.addAlleVarianten(this.getNiedererGueraiausJue());
        this.addAlleVarianten(this.getNiedererGueraiausMemonhab());
        this.addAlleVarianten(this.getNiedererGueraiausTharun());
        this.addAlleVarianten(this.getNiedererGueraiausThuara());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNiedererGueraiausHashandra());
        this.addMoeglicheVariante(this.getNiedererGueraiausKuum());
        this.addMoeglicheVariante(this.getNiedererGueraiausConossos());
        this.addMoeglicheVariante(this.getNiedererGueraiausLania());
        this.addMoeglicheVariante(this.getNiedererGueraiausIlshiVailen());
        this.addMoeglicheVariante(this.getNiedererGueraiausJue());
        this.addMoeglicheVariante(this.getNiedererGueraiausMemonhab());
        this.addMoeglicheVariante(this.getNiedererGueraiausTharun());
        this.addMoeglicheVariante(this.getNiedererGueraiausThuara());
    }
}

