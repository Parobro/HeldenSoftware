/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.a;

import helden.framework.held.A.E;
import helden.plugin.werteplugin.HeldAngaben;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.held.A.OoOO
 */
public class oooo_0
implements HeldAngaben {
    private int \u00d800000;
    private int \u00d300000;
    private String \u00d400000 = "-";
    private String oO0000 = "-";
    private String new = "";
    private String \u00f800000 = "";
    private E OO0000;
    private String[] o00000 = new String[]{"", "", "", ""};
    private String[] \u00f500000 = new String[]{"", "", "", "", "", ""};
    private String[] if = new String[]{"Notizen", "", "", "", "", "", "", "", "", "", "", ""};
    private int[] \u00d500000 = new int[]{0, 0};
    private int return;
    private String \u00f400000 = "";

    public int \u00d200000() {
        return this.return;
    }

    @Override
    public String getAugenFarbe() {
        return this.\u00d400000;
    }

    @Override
    public String[] getAussehenText() {
        return this.o00000;
    }

    @Override
    public String[] getFamilieText() {
        return this.\u00f500000;
    }

    public E super() {
        return this.OO0000;
    }

    @Override
    public String getGeburtstagString() {
        if (this.OO0000 != null) {
            return this.OO0000.toString();
        }
        return "";
    }

    @Override
    public int getGewicht(boolean bl) {
        if (bl) {
            return (int)((double)this.\u00d300000 * 1.75);
        }
        return this.\u00d300000;
    }

    @Override
    public int getGPRest() {
        return this.\u00d500000[1];
    }

    @Override
    public int getGPStart() {
        return this.\u00d500000[0];
    }

    @Override
    public String getGpWerte() {
        if (this.\u00d500000[0] == 0) {
            return " Eingegeben oder vor Version 4.3 generiert";
        }
        return " Startwert = " + this.\u00d500000[0] + " Rest = " + this.\u00d500000[1];
    }

    @Override
    public int getGroesse() {
        return this.\u00d800000;
    }

    @Override
    public String getHaarFarbe() {
        return this.oO0000;
    }

    @Override
    public String[] getNotiz() {
        return this.if;
    }

    @Override
    public String getStand() {
        return this.new;
    }

    public String \u00d300000() {
        return this.\u00f400000;
    }

    @Override
    public String getTitel() {
        return this.\u00f800000;
    }

    public void \u00d400000(int n) {
        this.return = n;
    }

    public void class(String string) {
        this.\u00d400000 = string;
    }

    public void super(String[] stringArray) {
        this.o00000 = stringArray;
    }

    public void \u00d200000(String[] stringArray) {
        this.\u00f500000 = stringArray;
    }

    public void super(E e) {
        this.OO0000 = e;
    }

    public void \u00d200000(int n) {
        this.\u00d300000 = n;
    }

    public void super(int n) {
        this.\u00d500000[1] = n;
    }

    public void super(int n, int n2) {
        this.\u00d500000[0] = n;
        this.\u00d500000[1] = n2;
    }

    public void \u00d300000(int n) {
        this.\u00d800000 = n;
    }

    public void super(String string) {
        this.oO0000 = string;
    }

    public void \u00d300000(String[] stringArray) {
        this.if = stringArray;
    }

    public void \u00d400000(String string) {
        this.new = string;
    }

    public void \u00d200000(String string) {
        this.\u00f400000 = string;
    }

    public void \u00d300000(String string) {
        this.\u00f800000 = string;
    }
}

