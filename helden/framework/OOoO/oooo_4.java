/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.D.while;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;

/*
 * Renamed from helden.framework.OoOO.oooO
 */
public class oooo_4
extends voidsuper {
    public static final oooo_4 \u00d5\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Sehen)", o0Oo.\u00d300000);
    public static final oooo_4 \u00d3\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (H\u00f6ren)", o0Oo.if);
    public static final oooo_4 privateclassfloat = new oooo_4("Runenfertigkeitswert (F\u00fchlen)", o0Oo.OO0000);
    public static final oooo_4 o\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Schmecken)", o0Oo.\u00d8O0000);
    public static final oooo_4 forclassfloat = new oooo_4("Runenfertigkeitswert (Licht)", o0Oo.oO0000);
    public static final oooo_4 O\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Finsternis)", o0Oo.while);
    public static final oooo_4 \u00f5\u00d5\u00f5O00 = new oooo_4("Runenfertigkeitswert (H\u00e4rte)", o0Oo.new);
    public static final oooo_4 \u00d4\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Weichheit)", o0Oo.o00000);
    public static final oooo_4 returnreturnfloat = new oooo_4("Runenfertigkeitswert (Feuer)", o0Oo.\u00d500000);
    public static final oooo_4 \u00f8\u00d5\u00f5O00 = new oooo_4("Runenfertigkeitswert (Wasser)", o0Oo.\u00d4O0000);
    public static final oooo_4 \u00f5\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Erde)", o0Oo.\u00f400000);
    public static final oooo_4 \u00f8\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Luft)", o0Oo.\u00f500000);
    public static final oooo_4 \u00f4\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (Kampf)", o0Oo.\u00d800000);
    public static final oooo_4 newreturnfloat = new oooo_4("Runenfertigkeitswert (Frieden)", o0Oo.\u00d3O0000);
    public static final oooo_4 \u00d8\u00d6\u00f5O00 = new oooo_4("Runenfertigkeitswert (K\u00f6rper)", o0Oo.\u00f5O0000);
    public static final oooo_4 \u00d8\u00d5\u00f5O00 = new oooo_4("Runenfertigkeitswert (Geist)", o0Oo.\u00d5O0000);
    private o0Oo O\u00d8\u00f5O00;
    private BedingungsVerknuepfung \u00f4\u00d5\u00f5O00;
    private BedingungsVerknuepfung ifreturnfloat;

    protected oooo_4(String string, o0Oo o0Oo2) {
        super(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d800000, false, new l_0(b_0.\u00f5\u00d8\u00d2000, b_0.\u00f5\u00d8\u00d2000, b_0.\u00f5\u00d8\u00d2000), "");
        this.O\u00d8\u00f5O00 = o0Oo2;
        this.\u00f4\u00d5\u00f5O00 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(while.\u00d3\u00f4\u00d2000), Bedingung.hatSfAuswahl(while.\u00d5\u00d2o000, this.O\u00d8\u00f5O00));
        this.ifreturnfloat = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hatSfAuswahl(while.\u00d3\u00f5\u00f6000, this.O\u00d8\u00f5O00));
        this.O\u00d8\u00f5O00.o00000(this);
    }

    @Override
    public s_0 getKategorie(boolean bl) {
        return this.O\u00d8\u00f5O00.\u00d500000();
    }

    public AbstraktBedingung \u00d2\u00d5O000() {
        return this.\u00f4\u00d5\u00f5O00;
    }

    public o0Oo o\u00d5O000() {
        return this.O\u00d8\u00f5O00;
    }

    public AbstraktBedingung publicfor() {
        return this.ifreturnfloat;
    }
}

