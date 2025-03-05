/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.framework.zauber.TharunZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public final class KonkreterZauber
extends oo0o_0 {
    private Zauber o\u00f8\u00d2000;
    private K newprivatesuper;
    private String O\u00f8\u00d2000;
    private ArrayList<String> \u00f8\u00f6\u00d2000;

    public static KonkreterZauber get(Zauber zauber, K k2, String string) {
        KonkreterZauber konkreterZauber = new KonkreterZauber(zauber.toString(), k2, string);
        return konkreterZauber;
    }

    public static String getBezeichner(String string, String string2, String string3) {
        String string4 = string + " [" + string2.toString() + "]";
        if (!string3.equals("")) {
            string4 = string4 + " [" + string3 + "]";
        }
        return string4;
    }

    public static KonkreterZauber getZauber(String string, K k2, String string2) {
        KonkreterZauber konkreterZauber = new KonkreterZauber(string, k2, string2);
        return konkreterZauber;
    }

    public static KonkreterZauber getZauber(TharunZauber tharunZauber) {
        KonkreterZauber konkreterZauber = new KonkreterZauber(tharunZauber.toString(), K.\u00f8o0000, "");
        return konkreterZauber;
    }

    public static KonkreterZauber getZauber(Zauber zauber, K k2, String string) {
        KonkreterZauber konkreterZauber = new KonkreterZauber(zauber.toString(), k2, string);
        return konkreterZauber;
    }

    private KonkreterZauber(String string, K k2, String string2) {
        this(ZauberFabrik.getInstance().getZauberfertigkeit(string), string, k2, string2);
    }

    private KonkreterZauber(Zauber zauber, String string, K k2, String string2) {
        super(KonkreterZauber.getBezeichner(string, k2.toString(), string2), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000);
        this.newprivatesuper = k2;
        this.o\u00f8\u00d2000 = zauber;
        this.O\u00f8\u00d2000 = string2;
        this.setProbe(zauber.getTalentprobe());
        this.uebernehmeMoeglicheVarianten();
        ArrayList<String> arrayList = new ArrayList<String>();
        if (zauber.getSpezialisierungen() != null) {
            arrayList.addAll(zauber.getSpezialisierungen());
        }
        if (k2.equals(K.\u00f800000)) {
            arrayList.add("Erzwingen");
        }
        if (!Zauber.nullpublicnew.equals(zauber)) {
            arrayList.add("Artefaktzauber");
        }
        arrayList.add("ver\u00e4nderte Technik");
        this.setSpezialisierungen(arrayList);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        KonkreterZauber konkreterZauber = (KonkreterZauber)object;
        if (this.newprivatesuper == null ? konkreterZauber.newprivatesuper != null : !this.newprivatesuper.equals(konkreterZauber.newprivatesuper)) {
            return false;
        }
        if (this.O\u00f8\u00d2000 == null ? konkreterZauber.O\u00f8\u00d2000 != null : !this.O\u00f8\u00d2000.equals(konkreterZauber.O\u00f8\u00d2000)) {
            return false;
        }
        return !(this.o\u00f8\u00d2000 == null ? konkreterZauber.o\u00f8\u00d2000 != null : !this.o\u00f8\u00d2000.equals(konkreterZauber.o\u00f8\u00d2000));
    }

    public String getHexalogie() {
        return this.o\u00f8\u00d2000.getHexalogie();
    }

    @Override
    public s_0 getKategorie(boolean bl) {
        return this.o\u00f8\u00d2000.getKategorie(bl);
    }

    public o00O[] getMerkmale() {
        return this.o\u00f8\u00d2000.getMerkmale(this.newprivatesuper);
    }

    public String getMerkmaleString() {
        return this.o\u00f8\u00d2000.getMerkmaleString(this.newprivatesuper);
    }

    public String getModMR() {
        return this.o\u00f8\u00d2000.getModMR();
    }

    public ArrayList<String> getMoeglicheVarianten() {
        return this.\u00f8\u00f6\u00d2000;
    }

    public String getQuelle() {
        return this.o\u00f8\u00d2000.getQuelle();
    }

    public K getRep() {
        return this.newprivatesuper;
    }

    public K[] getRepraesentationen() {
        return this.o\u00f8\u00d2000.getRepraesentationen();
    }

    public String getVariante() {
        return this.O\u00f8\u00d2000;
    }

    public Zauber getZauber() {
        return this.o\u00f8\u00d2000;
    }

    public String getZaubername() {
        return this.o\u00f8\u00d2000.toString();
    }

    public int hashCode() {
        int n = 1;
        n = this.newprivatesuper == null ? 31 * n : 31 * n + this.newprivatesuper.hashCode();
        n = this.O\u00f8\u00d2000 == null ? 31 * n : 31 * n + this.O\u00f8\u00d2000.hashCode();
        n = this.o\u00f8\u00d2000 == null ? 31 * n : 31 * n + this.o\u00f8\u00d2000.hashCode();
        return n;
    }

    public boolean hatDaemonischesMerkmal() {
        return this.o\u00f8\u00d2000.hatMerkmalDaemonisch(this.newprivatesuper);
    }

    public boolean hatElementaresMerkmal() {
        return this.o\u00f8\u00d2000.hatMerkmalElementar(this.newprivatesuper);
    }

    public boolean hatMerkmal(o00O o00O2) {
        return this.o\u00f8\u00d2000.hatMerkmal(o00O2, this.newprivatesuper);
    }

    public void setRep(K k2) {
        this.newprivatesuper = k2;
    }

    public void setVariante(String string) {
        this.O\u00f8\u00d2000 = string;
    }

    public void setZauber(Zauber zauber) {
        this.o\u00f8\u00d2000 = zauber;
    }

    @Override
    public String toStringKomplett() {
        StringBuffer stringBuffer = new StringBuffer(this.getZaubername());
        if (!this.O\u00f8\u00d2000.equals("")) {
            stringBuffer.append(" [" + this.O\u00f8\u00d2000 + "] ");
        }
        stringBuffer.append(this.o\u00f8\u00d2000.getTalentprobe().toString());
        return stringBuffer.toString();
    }

    public void uebernehmeMoeglicheVarianten() {
        if (this.o\u00f8\u00d2000.hatVarianten() && this.o\u00f8\u00d2000.getVarianten() != null) {
            this.\u00f8\u00f6\u00d2000 = new ArrayList();
            for (int i2 = 0; i2 < this.o\u00f8\u00d2000.getVarianten().size(); ++i2) {
                this.\u00f8\u00f6\u00d2000.add(this.o\u00f8\u00d2000.getVarianten().get(i2));
            }
        }
    }
}

