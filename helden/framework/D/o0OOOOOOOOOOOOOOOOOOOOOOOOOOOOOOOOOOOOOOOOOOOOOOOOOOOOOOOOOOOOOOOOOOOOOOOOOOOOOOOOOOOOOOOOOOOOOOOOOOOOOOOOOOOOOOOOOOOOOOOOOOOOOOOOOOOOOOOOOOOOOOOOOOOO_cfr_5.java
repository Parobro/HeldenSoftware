/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.OoOO.G;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.int.OooO;
import helden.framework.oooo.b_0;
import helden.model.DDZKulturen.AlMada;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.kultur.Aranien;
import helden.model.kultur.Maraskan;
import helden.model.kultur.Orkland;
import helden.model.kultur.Svellttal;
import helden.model.kultur.Zyklopeninseln;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO {
    private String o00000;
    private BedingungsVerknuepfung new;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(OooO oooO2) {
        this.o00000 = oooO2.getKulturkundeBezeichnung();
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)10));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.newwhilesuper, (Integer)10));
        if (oooO2 instanceof Orkland) {
            BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
            bedingungsVerknuepfung2.addBedingung(Bedingung.hat(G.\u00d5\u00d6\u00f5000, (Integer)5));
            bedingungsVerknuepfung2.addBedingung(Bedingung.hat(G.O\u00d8\u00f5000, (Integer)5));
            bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung2);
        } else if (oooO2 instanceof helden.model.DDZKulturen.Orkland) {
            BedingungsVerknuepfung bedingungsVerknuepfung3 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
            bedingungsVerknuepfung3.addBedingung(Bedingung.hat(G.\u00d5\u00d6\u00f5000, (Integer)5));
            bedingungsVerknuepfung3.addBedingung(Bedingung.hat(G.O\u00d8\u00f5000, (Integer)5));
            bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung3);
        } else if (oooO2.getMuttersprache() == null || oooO2.getMuttersprache().equals(G.\u00d8\u00f8\u00f4000)) {
            if (oooO2 instanceof Aranien || oooO2 instanceof Maraskan) {
                BedingungsVerknuepfung bedingungsVerknuepfung4 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                bedingungsVerknuepfung4.addBedingung(Bedingung.hat(G.whilewhileString, (Integer)5));
                bedingungsVerknuepfung4.addBedingung(Bedingung.hat(G.newwhileString, (Integer)5));
                bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung4);
            } else if (oooO2 instanceof Zyklopeninseln) {
                BedingungsVerknuepfung bedingungsVerknuepfung5 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                bedingungsVerknuepfung5.addBedingung(Bedingung.hat(G.whilewhileString, (Integer)5));
                bedingungsVerknuepfung5.addBedingung(Bedingung.hat(G.\u00f5\u00f5\u00f4000, (Integer)5));
                bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung5);
            } else if (oooO2 instanceof Svellttal) {
                BedingungsVerknuepfung bedingungsVerknuepfung6 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                bedingungsVerknuepfung6.addBedingung(Bedingung.hat(G.whilewhileString, (Integer)5));
                bedingungsVerknuepfung6.addBedingung(Bedingung.hat(G.\u00f8\u00f6\u00f5000, (Integer)5));
                bedingungsVerknuepfung6.addBedingung(Bedingung.hat(G.nullsuperclass, (Integer)5));
                bedingungsVerknuepfung6.addBedingung(Bedingung.hat(G.\u00d8\u00d3\u00f5000, (Integer)5));
                bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung6);
            } else if (oooO2 instanceof AlMada) {
                BedingungsVerknuepfung bedingungsVerknuepfung7 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                bedingungsVerknuepfung7.addBedingung(Bedingung.hat(G.\u00d3\u00f8\u00f5000, (Integer)5));
                bedingungsVerknuepfung7.addBedingung(Bedingung.hat(G.\u00f5\u00f6\u00f5000, (Integer)5));
                bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung7);
            } else {
                if (!(oooO2 instanceof Suedaventurien)) throw new RuntimeException("Muttersprache fehlt bei der Kultur: " + oooO2.toString());
                BedingungsVerknuepfung bedingungsVerknuepfung8 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
                bedingungsVerknuepfung8.addBedingung(Bedingung.hat(G.\u00d3\u00f8\u00f5000, (Integer)5));
                bedingungsVerknuepfung8.addBedingung(Bedingung.hat(G.\u00f5\u00f6\u00f5000, (Integer)5));
                bedingungsVerknuepfung8.addBedingung(Bedingung.hat(G.\u00d3O\u00f5000, (Integer)5));
                bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung8);
            }
        } else {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(oooO2.getMuttersprache(), (Integer)5));
        }
        this.new = bedingungsVerknuepfung;
    }

    public o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(String string, G ... gArray) {
        this.o00000 = string;
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)10));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.newwhilesuper, (Integer)10));
        if (gArray.length == 1) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(gArray[0], (Integer)5));
        } else {
            BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
            for (G g2 : gArray) {
                bedingungsVerknuepfung2.addBedingung(Bedingung.hat(g2, (Integer)5));
            }
            bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung2);
        }
        this.new = bedingungsVerknuepfung;
    }

    public boolean equals(Object object) {
        return this.toString().equals(object.toString());
    }

    public BedingungsVerknuepfung o00000() {
        return this.new;
    }

    public String new() {
        return this.toString();
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this.o00000;
    }
}

