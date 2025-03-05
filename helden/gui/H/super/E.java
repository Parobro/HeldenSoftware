/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H.super;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.D;
import helden.framework.held.U;
import helden.framework.held.object.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.A;
import helden.model.profession.FaehnrichFusskaemper;
import helden.model.profession.FaehnrichKavallerie;
import helden.model.profession.FaehnrichSee;
import helden.model.profession.Gardist;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Jahrmarktskaempfer;
import helden.model.profession.Krieger;
import helden.model.profession.Ritter;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.Stabsfaehnrich;
import helden.model.profession.Stammeskrieger;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class E {
    private helden.framework.held.K o00000;
    private o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 \u00d300000;
    private A \u00d200000;

    public E(helden.framework.held.K k2, A a2) {
        this.o00000 = k2;
        this.\u00d300000 = new o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(this.o00000);
        this.\u00d200000 = a2;
    }

    public int \u00d400000() {
        int n = 0;
        Iterator<voidsuper> iterator = this.o00000.\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = voidsuper2.getArt();
            if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.compareTo(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) != 0 || voidsuper2.equals(helden.framework.OoOO.E.\u00d4\u00d6\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.\u00f4\u00d3\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.\u00d4\u00d4\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.returnnewString) || voidsuper2.equals(helden.framework.OoOO.E.\u00f4\u00d6\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.newnewString) || voidsuper2.equals(helden.framework.OoOO.E.\u00f5\u00d5\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.\u00d5\u00d4\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.\u00d5\u00d6\u00d8000) || voidsuper2.equals(helden.framework.OoOO.E.\u00d3\u00d5\u00d8000)) continue;
            try {
                if (this.o00000.\u00d300000((oo0o_0)voidsuper2) <= 6) continue;
                ++n;
            }
            catch (D d2) {}
        }
        return n;
    }

    public int Object() {
        int n = 0;
        for (P p2 : this.o00000.\u00f5O0000()) {
            if (!p2.\u00f400000()) continue;
            if (p2 instanceof void) {
                void void_ = (void)p2;
                for (Q q : void_.o\u00d40000()) {
                    P p3 = oooo_0.o00000(void_.\u00f500000(), q.\u00d8\u00d30000().toString());
                    n += p3.o\u00d20000();
                }
                continue;
            }
            n += oooo_0.o00000(p2.toString()).o\u00d20000();
        }
        return n;
    }

    public String o00000(voidsuper voidsuper2, int n) {
        Object object;
        int n2 = 0;
        int n3 = n;
        int n4 = 0;
        boolean bl = false;
        if (this.o00000.\u00f8O0000().\u00d300000(voidsuper2)) {
            try {
                n4 = this.o00000.\u00d300000((oo0o_0)voidsuper2);
                if (n4 + n3 > 10) {
                    n3 = 10 - n4;
                    n2 = n - n3;
                }
            }
            catch (D d2) {}
        } else {
            bl = true;
        }
        if (n3 > 0) {
            this.o00000.\u00f8O0000().\u00d300000(voidsuper2, n3);
            object = new helden.framework.A.A("Talent steigern", voidsuper2.toString(), "Sp\u00e4tweihe");
            ((helden.framework.A.A)object).o00000("" + n4, "" + (n4 + n3));
            this.o00000.o00000((helden.framework.A.A)object);
        }
        if (bl && voidsuper2.isKampftalent()) {
            object = (helden.framework.OoOO.E)voidsuper2;
            this.o00000.o00000(voidsuper2, new U((helden.framework.OoOO.E)object, this.o00000.\u00f8O0000()));
        }
        if (n2 > 0) {
            return "- " + n2 + " SE auf " + voidsuper2.toString() + "\n";
        }
        return "";
    }

    public String \u00d200000() {
        M m;
        String string = "";
        if (!this.o00000()) {
            string = string + "Keine g\u00fcltige Profession\n";
        }
        if (this.o00000.\u00d400000() < 900) {
            string = string + "Zuwenig Abenteuerpunkte\n";
        }
        if (this.o00000.o00000(b_0.whilewhilesuper) < 14) {
            string = string + "Mut zu niedrig\n";
        }
        if (this.o00000.o00000(b_0.\u00d5\u00f4\u00d2000) < 11) {
            string = string + "Charisma zu niedrig\n";
        }
        if (this.o00000.o00000(b_0.\u00f4\u00f4\u00d2000) < 12) {
            string = string + "Gewandtheit zu niedrig\n";
        }
        if (this.o00000.o00000(b_0.privatedosuper) < 12) {
            string = string + "K\u00f6rperkraft zu niedrig\n";
        }
        if (this.o00000.o00000(b_0.returnwhilesuper) < 14) {
            string = string + "Konstitution zu niedrig\n";
        }
        if (this.o00000.o00000(b_0.\u00f5\u00f5\u00d2000) < 5) {
            string = string + "Sozialstatus zu niedrig\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00f5\u00d8o000)) {
            string = string + "Halbzauberer\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00d5\u00d3O000)) {
            string = string + "Viertelzauberer\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.forsupersuper)) {
            string = string + "Vollzauberer\n";
        }
        if (this.o00000.\u00d8\u00d20000()) {
            string = string + "Geweihter\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.Ooo000)) {
            string = string + "Einbeinig\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.newfor)) {
            string = string + "Glasknochen\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00d3Oo000)) {
            string = string + "Lahm\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00d30\u00d2000)) {
            string = string + "Nachtblind\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00d3\u00d3O000)) {
            string = string + "Stubenhocker\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00d8\u00f8O000) && (m = (M)this.o00000.\u00d500000().\u00d300000(I.\u00d8\u00f8O000)).intsuper().contains(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString())) {
            string = string + "Unf\u00e4higkeit f\u00fcr Talentgruppe Kampf\n";
        }
        if (this.o00000.\u00d500000().\u00d400000(I.\u00d3\u00d8o000)) {
            string = string + "Wahnvorstellungen\n";
        }
        if (this.\u00d400000() < 3) {
            string = string + "Nicht gen\u00fcgend Nahkampftalente mit TaW 7\n";
        }
        if (!this.\u00d300000.\u00d200000(voidsuper.ifforObject, 4)) {
            string = string + "Taw Athletik zu niedrig\n";
        }
        if (!this.\u00d300000.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 10)) {
            string = string + "Taw K\u00f6rperbehrrschung zu niedrig\n";
        }
        if (!this.\u00d300000.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 7)) {
            string = string + "Taw Selbstbeherrschung zu niedrig\n";
        }
        if (!this.\u00d300000.\u00d200000(voidsuper.oo\u00d6000, 4)) {
            string = string + "Taw G\u00f6tter und Kulte zu niedrig\n";
        }
        if (this.Object() < 1000) {
            string = string + "Nicht ge\u00fcngend AP in Kampfsonderfertigkeiten\n";
        }
        return string;
    }

    public boolean o00000() {
        for (super super_ : this.o00000.nullsuper()) {
            if (!(super_ instanceof Gladiator) && !(super_ instanceof Soeldner) && !(super_ instanceof Schwertgeselle) && !(super_ instanceof Soldat) && !(super_ instanceof Krieger) && !(super_ instanceof FaehnrichFusskaemper) && !(super_ instanceof FaehnrichKavallerie) && !(super_ instanceof FaehnrichSee) && !(super_ instanceof Gardist) && !(super_ instanceof Jahrmarktskaempfer) && !(super_ instanceof Ritter) && !(super_ instanceof Stammeskrieger) && !(super_ instanceof Stabsfaehnrich)) continue;
            return true;
        }
        return false;
    }

    public void o00000(Geweihter geweihter) {
        String string = "";
        string = this.\u00d200000();
        if (!string.equals("")) {
            string = "Eine Sp\u00e4tweise zum Kor-Geweihten ist aus den folgenden Gr\u00fcnden nicht m\u00f6glich:\n\n" + string;
            JOptionPane.showMessageDialog(null, string, "Sp\u00e4tweihe Kor-Geweihter", 2);
            return;
        }
        this.\u00d300000.o00000(I.\u00f5\u00d8O000, "Sp\u00e4tweihe");
        this.\u00d300000.o00000(I.\u00d3\u00d30000, "Sp\u00e4tweihe");
        string = string + this.o00000(helden.framework.OoOO.E.\u00d8\u00d5\u00d8000, 1);
        string = string + this.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        string = string + this.o00000(voidsuper.thisinterfaceObject, 2);
        string = string + this.o00000(voidsuper.StringclassObject, 1);
        string = string + this.o00000(voidsuper.oo\u00d6000, 4);
        string = string + this.o00000(voidsuper.nullvoidObject, 4);
        string = string + this.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.\u00d300000.o00000(voidsuper.\u00d3\u00d2\u00d6000, 3, "Sp\u00e4tweihe");
        G g2 = this.o00000.\u00f800000().getSchrift();
        if (g2 != null) {
            string = string + this.o00000(g2, 5);
        } else {
            JOptionPane.showMessageDialog(null, "Die Schrift der Muttersprache wurde nicht gesteigert, da die Muttersprache keine Schrift hat.", "Sp\u00e4tweihe Kor-Geweihter", 2);
        }
        geweihter.setGeschlecht(this.o00000.\u00d300000());
        this.o00000.\u00d800000().o00000(String._o.\u00d200000, geweihter);
        this.\u00d300000.\u00d200000(1, "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00d6\u00d8\u00d8000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00f8\u00d8\u00d3000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00f5\u00d4\u00f4000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00d8\u00d3\u00f4000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00d3\u00f5O000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.Stringnull.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00d2O\u00f5000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00f5\u00d5\u00d4000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00d3\u00d4\u00d3000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000(while.\u00d3oo000.toString(), "Sp\u00e4tweihe");
        this.\u00d300000.o00000((P)K.o00000(helden.framework.OoOO.E.\u00d8\u00d5\u00d8000, "Korspie\u00df"), "Sp\u00e4tweihe");
        this.\u00d200000.\u00d800000();
        String string2 = "";
        if (!string.equals("")) {
            string2 = string2 + "\n\nIhnen stehen noch folgende spezielle Erfahrungen zur Verf\u00fcgung:\n";
            string2 = string2 + string;
        }
        this.\u00d300000.o00000(900, "Sp\u00e4tweihe" + string2);
        string2 = "Sp\u00e4tweihe zum Kor-Geweihten erfolgreich durchgef\u00fchrt." + string2;
        JOptionPane.showMessageDialog(null, string2, "Sp\u00e4tweihe Kor-Geweihter", 2);
    }
}

