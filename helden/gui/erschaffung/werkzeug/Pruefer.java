/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.HeldenMath;
import helden.framework.held.K;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Iterator;

public class Pruefer {
    private HEW2 o00000;

    public Pruefer(HEW2 hEW2) {
        this.o00000 = hEW2;
    }

    public void addPruefStringFuerKosten(ArrayList<Hinweis> arrayList, KostenArt kostenArt) {
        if (this.o00000.getKosten().getKosten(kostenArt) > this.o00000.getKosten().getVerfuegbarePunkte(kostenArt)) {
            arrayList.add(new Hinweis("Es wurden zuviele " + kostenArt.toString() + " ausgegeben."));
        }
    }

    public boolean hatFehler() {
        for (Hinweis hinweis : this.pruefe()) {
            if (!hinweis.getHinweisart().equals((Object)Hinweis.HinweisArt.o00000)) continue;
            return true;
        }
        return false;
    }

    public ArrayList<Hinweis> pruefe() {
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        if (this.o00000.getPhase().equals((Object)HEW2.PHASEN.class)) {
            return arrayList;
        }
        this.o00000(arrayList, this.pruefeKultur());
        this.o00000(arrayList, this.pruefeBGB());
        this.o00000(arrayList, this.pruefeProfessionen());
        if (this.o00000.getPhase().equals((Object)HEW2.PHASEN.\u00d200000) || this.o00000.getPhase().equals((Object)HEW2.PHASEN.\u00d400000)) {
            return arrayList;
        }
        this.o00000(arrayList, this.o00000.getHswEigenschaften().pruefe());
        this.o00000(arrayList, this.o00000.getSf().pruefe(KostenEntry.kostenBereich.\u00d800000));
        this.o00000(arrayList, this.o00000.getSf().pruefe(KostenEntry.kostenBereich.class));
        this.o00000(arrayList, this.o00000.getTalente().pruefe());
        this.o00000(arrayList, this.o00000.getHswVorteile().pruefe());
        this.o00000(arrayList, this.o00000.getHswZauber().pruefe());
        this.addPruefStringFuerKosten(arrayList, KostenArt.\u00f600000);
        this.addPruefStringFuerKosten(arrayList, KostenArt.int);
        this.addPruefStringFuerKosten(arrayList, KostenArt.\u00f400000);
        this.addPruefStringFuerKosten(arrayList, KostenArt.\u00f800000);
        for (KostenArt kostenArt : this.o00000.getKosten().getRKPKostenArten()) {
            this.addPruefStringFuerKosten(arrayList, kostenArt);
        }
        return arrayList;
    }

    public ArrayList<Hinweis> pruefeBGB() {
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        if (this.o00000.isBGB() && this.o00000.getBGBProfession() != null) {
            if (this.o00000.getBGBProfession().istZeitaufwendig() && this.o00000.getHauptProfession().istZeitaufwendig()) {
                arrayList.add(new Hinweis("Es wurden zwei zeitaufwendige Professionen ausgew\u00e4hlt."));
            }
            if (this.o00000.getBGBProfession().toString().equals(this.o00000.getHauptProfession().toString())) {
                arrayList.add(new Hinweis("Es wurde zweimal die gleiche Profession gew\u00e4hlt."));
            }
        }
        return arrayList;
    }

    public ArrayList<Hinweis> pruefeEigenschaftenAusProf() {
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            b_0 b_02 = iterator.next();
            if (!b_02.publicString()) continue;
            int n = 0;
            n = Math.max(n, this.o00000(this.o00000.\u00f800000.getMinimalEigenschaftswert(b_02)));
            n = Math.max(n, this.o00000(this.o00000.\u00d2o0000.getMinimalEigenschaftswert(b_02)));
            n = Math.max(n, this.o00000(this.o00000.\u00d6O0000.getMinimalEigenschaftswert(b_02)));
            if (this.o00000.getHeld().o00000(b_02) >= n) continue;
            arrayList.add(new Hinweis("Die Eigenschaft " + b_02.toString() + " ist zu niedrig.\n" + "Mindestwert: " + n + "\n" + "Ggf. ist eine herausragende Eigenschaft ist notwendig!", Hinweis.HinweisArt.o00000));
        }
        return arrayList;
    }

    public ArrayList<Hinweis> pruefeGebildetMagisch() {
        int n;
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        if (this.o00000.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000) > 0 && (n = this.o00000.magischeAPausGebildet()) > HeldenMath.haelfte(this.o00000.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000))) {
            arrayList.add(new Hinweis("Von den " + this.o00000.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000) + " AP " + " aus Gebildet d\u00fcrfen nur " + HeldenMath.haelfte(this.o00000.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000)) + " f\u00fcr Zauber und magische Sonderfertigkeiten ausgegeben werden." + " Es wurden aber bereits " + n + " AP ausgegeben."));
        }
        return arrayList;
    }

    public ArrayList<Hinweis> pruefeKultur() {
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        boolean bl = false;
        if (this.o00000.getKultur() != null) {
            for (OooO oooO2 : this.o00000.getRasse().getKulturen(false)) {
                if (!oooO2.getID().equals(this.o00000.getKultur().getID())) continue;
                bl = true;
                break;
            }
            if (!bl) {
                arrayList.add(new Hinweis("Die Kultur geh\u00f6rt nicht zu den \u00fcblichen oder m\u00f6glichen Kulturen der Rasse.", Hinweis.HinweisArt.\u00d200000));
            }
        }
        return arrayList;
    }

    public ArrayList<Hinweis> pruefeProfessionen() {
        K k2;
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        int n = 0;
        int n2 = 99;
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            b_0 b_02 = iterator.next();
            if (!b_02.publicString()) continue;
            n = 0;
            n2 = 99;
            n = Math.max(n, this.o00000.\u00f800000.getMinimalEigenschaftswert(b_02));
            n = Math.max(n, this.o00000.\u00d2o0000.getMinimalEigenschaftswert(b_02));
            n = Math.max(n, this.o00000.\u00d6O0000.getMinimalEigenschaftswert(b_02));
            n2 = this.o00000.getMaxeigenschaft();
            n2 += this.o00000.\u00f800000.getModifikator(b_02);
            n2 += this.o00000.\u00d2o0000.getModifikator(b_02);
            if (n <= (n2 += this.o00000.\u00d6O0000.getModifikator(b_02))) continue;
            arrayList.add(new Hinweis("Die Eigenschaftsbedingungen bzgl. Rasse, Kultur und Profession sind  f\u00fcr die Eigenschaft " + b_02.toString() + " nicht ohne Herausragende Eigenschaften erf\u00fcllbar. " + "(Min: " + n + " Max: " + n2 + ")", Hinweis.HinweisArt.Object));
        }
        if (this.o00000.getHauptProfession() != null) {
            boolean bl = false;
            for (super super_ : this.o00000.getKultur().getProfessionen(this.o00000.getBt())) {
                if (!super_.getID().equals(this.o00000.getHauptProfession().getID())) continue;
                bl = true;
            }
            if (!bl) {
                arrayList.add(new Hinweis("Die Profession geh\u00f6rt nicht zu den m\u00f6glichen Professionen der Kultur.", Hinweis.HinweisArt.\u00d200000));
            }
        }
        if ((k2 = this.o00000.getHeld()) != null && k2.o\u00d50000() && !k2.privateObject()) {
            if (k2.\u00f4\u00d40000()) {
                arrayList.add(new Hinweis("Die von ihnen gew\u00e4hlte Kombination (nicht elfische Kultur + elfische Profession) ist nicht von den Regeln abgedeckt. Sie haben zwar den Vorteil Vollzauberer, jedoch keine Repr\u00e4sentation.", Hinweis.HinweisArt.Object));
            } else if (k2.nullsuper().size() > 0 && !k2.nullsuper().get(0).istMagischeProfession()) {
                arrayList.add(new Hinweis("Die von ihnen gew\u00e4hlte Kombination (nicht elfische Kultur + nicht magische menschliche Profession) ist nicht von den Regeln abgedeckt. Es ist unklar, was mit dem Vorteil Vollzauberer passiert.", Hinweis.HinweisArt.Object));
            }
        }
        return arrayList;
    }

    public boolean sindFehlerVorhanden() {
        for (Hinweis hinweis : this.pruefe()) {
            if (!hinweis.getHinweisart().equals((Object)Hinweis.HinweisArt.o00000)) continue;
            return true;
        }
        return false;
    }

    private void o00000(ArrayList<Hinweis> arrayList, ArrayList<Hinweis> arrayList2) {
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
    }

    private int o00000(int n) {
        if (n == 8) {
            return 1;
        }
        return n;
    }
}

