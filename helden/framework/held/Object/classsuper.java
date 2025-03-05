/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class classsuper {
    private String[] super;

    public void o00000(String[] stringArray) {
        this.super = stringArray;
        this.\u00d200000(this.super);
    }

    public String toString() {
        if (this.super == null) {
            return "\nKeine Infos gefunden";
        }
        String string = "Besitzer: " + this.super[0] + "\nHelden ID: " + this.super[1] + "\nHelden Name: " + this.super[2] + "\nZugriff: " + this.super[3] + "\nNSC: " + this.super[4] + "\nMeisterLogin: " + this.super[5] + "\neingesetze AP: " + this.super[6] + "\nHelden Version: " + this.super[7] + "\nRasse: " + this.super[8] + "\nKultur: " + this.super[9] + "\nProfession1: " + this.super[10] + "\nProfession2: " + this.super[11] + "\nProfession3: " + this.super[12];
        return string;
    }

    private void \u00d200000(String[] stringArray) {
        this.super[12] = this.super[12].substring(0, this.super[12].indexOf(";"));
        if (this.super[3].equals("o")) {
            this.super[3] = " \u00f6ffendlich";
        } else if (this.super[3].equals("p")) {
            this.super[3] = " privat";
        } else if (this.super[3].equals("e")) {
            this.super[3] = " Meister/Einzelperson";
        }
        if (this.super[4].equals("j")) {
            this.super[4] = "angemeldet";
        } else if (this.super[4].equals("n")) {
            this.super[4] = "nein";
        } else if (this.super[4].equals("o")) {
            this.super[4] = "offiziell";
        }
        if (this.super[7].length() > 5) {
            this.super[7] = this.super[7].substring(0, 2) + "." + this.super[7].substring(2, 4) + "." + this.super[7].substring(4, 6);
        }
        this.super[8] = RassenFabrik.getNamebyID(this.super[8]);
        this.super[9] = KulturFabrik.getNamebyID(this.super[9]);
        this.super[10] = ProfessionenFabrik.getNamebyID(this.super[10]);
    }
}

