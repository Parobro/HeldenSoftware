/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.held.K;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.profession.Bergmann;
import helden.model.profession.Gaukler;
import helden.model.profession.Magier;
import helden.model.profession.Scharlatan;
import helden.model.rasse.Zwerg;
import java.util.ArrayList;
import java.util.Iterator;

public class HEW2Eigenschaften {
    protected K Object;
    private HEW2 o00000;
    private int \u00d400000 = 0;
    private boolean \u00d200000 = false;

    public HEW2Eigenschaften(HEW2 hEW2) {
        this.o00000 = hEW2;
    }

    public int erlaubteAnzahlGPinEigenschaften() {
        return this.o00000.getMaxgpeigenschaft();
    }

    public int getEigenschaftenGP() {
        return this.\u00d400000;
    }

    public K getHeld() {
        return this.Object;
    }

    public int getMaximalEigenschaftswert(b_0 b_02) {
        int n = this.getHeld().\u00d3\u00d30000().\u00d200000(b_02);
        if (this.getHeld().o00000(I.\u00d3\u00d3O000) && (b_02.equals(b_0.\u00f4\u00f4\u00d2000) || b_02.equals(b_0.privatedosuper) || b_02.equals(b_0.returnwhilesuper))) {
            int n2 = this.o00000.getMaxeigenschaft() + n;
            if (n2 > 11) {
                return 11;
            }
            return n2;
        }
        int n3 = !b_02.equals(b_0.\u00f5\u00f5\u00d2000) ? this.o00000.getMaxeigenschaft() + n : this.o00000() + n;
        return n3;
    }

    public int getMinimalEigenschaftswert(b_0 b_02) {
        int n = 0;
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.getHeld().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            n = Math.max(n, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getMinimalEigenschaftswert(b_02));
        }
        if (n == 8 || b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            n += this.getHeld().\u00d3\u00d30000().\u00d200000(b_02);
        }
        return n;
    }

    public boolean isMuttersprachenklugheitwarnung() {
        return this.\u00d200000;
    }

    public void passeGenerierungsKostenAn() {
        this.o00000.getKosten().removeAllKostenEntries(KostenEntry.kostenBereich.\u00d300000);
        this.\u00d400000 = 0;
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            b_0 b_02 = iterator.next();
            int n = this.o00000.getHeld().\u00d3\u00d30000().\u00d200000(b_02);
            if (b_02.equals(b_0.\u00f5\u00f5\u00d2000) && n > 0) {
                n -= this.getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000);
            } else {
                this.\u00d400000 += n;
            }
            this.o00000.getKosten().addKosten(b_02.toString() + ": " + this.o00000.getHeld().\u00d3\u00d30000().do(b_02), new KostenEntry(KostenEntry.kostenBereich.\u00d300000, KostenArt.int, n, b_02, this.o00000.getHeld().\u00d3\u00d30000().do(b_02)));
        }
    }

    public ArrayList<Hinweis> pruefe() {
        K k2 = this.o00000.getHeld();
        ArrayList<Hinweis> arrayList = null;
        arrayList = new ArrayList<Hinweis>();
        if (this.getEigenschaftenGP() > this.erlaubteAnzahlGPinEigenschaften()) {
            arrayList.add(new Hinweis("Zuviele Eigenschaftspunkte"));
        }
        if (k2.o\u00d20000().getClass().equals(Zwerg.class) && !k2.\u00d300000().istMaennlich() && k2.o00000(b_0.whilewhilesuper) < 12) {
            arrayList.add(new Hinweis("Der Mutwert einer Zwergin muss mindestens 12 betragen."));
        }
        if (k2.\u00d4O0000().getClass().equals(Gaukler.class) && k2.o00000(b_0.O\u00f5\u00d2000) < 13 && k2.o00000(b_0.\u00f4\u00f4\u00d2000) < 13) {
            arrayList.add(new Hinweis("Beim Gaukler muss entweder Fingerfertigkeit\noder Gewandtheit mindestens 13 sein."));
        }
        if (k2.\u00d4O0000().getClass().equals(Bergmann.class) && !(k2.o\u00d20000() instanceof Zwerg) && k2.o00000(b_0.\u00f5\u00f5\u00d2000) > 8) {
            arrayList.add(new Hinweis("Als Nicht-Zwerg darf ein Bergmann h\u00f6chstens\neinen Sozialstatus von 8 haben."));
        }
        if (k2.\u00d4O0000().getClass().equals(Magier.class) && k2.\u00d4O0000().getGewaehlteVarianten().contains(((Magier)k2.\u00d4O0000()).getGrangor())) {
            int n = 0;
            if (k2.o00000(b_0.whilewhilesuper) >= 11) {
                ++n;
            }
            if (k2.o00000(b_0.newwhilesuper) >= 13) {
                ++n;
            }
            if (k2.o00000(b_0.\u00f8\u00f4\u00d2000) >= 11) {
                ++n;
            }
            if (k2.o00000(b_0.\u00d5\u00f4\u00d2000) >= 12) {
                ++n;
            }
            if (k2.o00000(b_0.O\u00f5\u00d2000) >= 12) {
                ++n;
            }
            if (n < 4) {
                arrayList.add(new Hinweis("F\u00fcr einen Magier aus Grangor gelten die Voraussetzungen\nMU 11, KL 13, IN 11, CH 12, FF 12.\nNur eine darf um 1 niedriger sein."));
            }
        }
        if (k2.\u00d4O0000().getClass().equals(Scharlatan.class) && k2.o00000(b_0.newwhilesuper) < 13 && k2.o00000(b_0.\u00f8\u00f4\u00d2000) < 13) {
            arrayList.add(new Hinweis("Beim Scharlatan muss entweder Klugheit\noder Intuition mindestens 13 sein."));
        }
        if (this.o00000.getMaxeigenschaft() != 14) {
            arrayList.add(new Hinweis("Kein Standard. Max Eigenschafts-Wert f\u00fcr Helden: " + this.o00000.getMaxeigenschaft(), Hinweis.HinweisArt.\u00d200000));
        }
        if (this.o00000.getGpmax() != 110) {
            arrayList.add(new Hinweis("Kein Standard. Max GP f\u00fcr Helden: " + this.o00000.getGpmax(), Hinweis.HinweisArt.\u00d200000));
        }
        if (this.o00000.getMaxgpeigenschaft() != 100) {
            arrayList.add(new Hinweis("Kein Standard. Max Eigenschafts-GP f\u00fcr Helden: " + this.o00000.getMaxgpeigenschaft(), Hinweis.HinweisArt.\u00d200000));
        }
        for (b_0 b_02 : b_0.o\u00d60000()) {
            if (this.o00000.getHswEigenschaften().getMaximalEigenschaftswert(b_02) >= this.o00000.getHswEigenschaften().getMinimalEigenschaftswert(b_02)) continue;
            arrayList.add(new Hinweis("Held ist nicht erschaffbar, da der Minimalwert f\u00fcr " + b_02 + " gr\u00f6\u00dfer ist, als der zugeh\u00f6rige Maximalwert.", Hinweis.HinweisArt.o00000));
        }
        arrayList.addAll(this.o00000.getPruefer().pruefeEigenschaftenAusProf());
        return arrayList;
    }

    public void setEigenschaft(b_0 b_02, int n) {
        this.getHeld().\u00d3\u00d30000().super(b_02, n);
        this.getHeld().\u00d3\u00d30000().\u00d200000(b_02, this.getHeld().\u00d3\u00d30000().\u00d200000(b_02));
        this.o00000.recalc();
        this.passeGenerierungsKostenAn();
    }

    public void setEigenschaftInklModi(b_0 b_02, int n) {
        int n2 = this.getHeld().\u00d3\u00d30000().\u00d200000(b_02);
        if (b_02.equals(b_0.newwhilesuper) && n - n2 < this.getHeld().o00000(b_02)) {
            this.\u00d200000 = true;
        }
        this.setEigenschaft(b_02, n - n2);
    }

    public void setHeld(K k2) {
        this.Object = k2;
        this.setzeGueltigeEigenschaftswerte();
        this.passeGenerierungsKostenAn();
        this.o00000.fireUpdate();
    }

    public void setzeGueltigeEigenschaftswerte() {
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            b_0 b_02 = iterator.next();
            int n = this.getMinimalEigenschaftswert(b_02);
            int n2 = this.getMaximalEigenschaftswert(b_02);
            if (this.getHeld().o00000(b_02) < n) {
                this.setEigenschaftInklModi(b_02, n);
            }
            if (this.getHeld().o00000(b_02) <= n2) continue;
            this.setEigenschaftInklModi(b_02, n2);
        }
    }

    void o00000(K k2) {
        K k3 = this.Object;
        this.setHeld(k2);
        if (k3 != null) {
            Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
            while (iterator.hasNext()) {
                b_0 b_02 = iterator.next();
                this.setEigenschaft(b_02, k3.\u00d3\u00d30000().\u00d200000(b_02));
                String string = "Miserable Eigenschaft: " + b_02;
                String string2 = "Herausragende Eigenschaft: " + b_02;
                if (this.o00000.getHeld().return(string)) {
                    this.o00000.getHswEigenschaften().setEigenschaft(b_02, 8);
                }
                if (this.o00000.getHeld().return(string2)) {
                    J j2 = (J)this.o00000.getHeld().\u00d500000().new(string2);
                    this.o00000.getHswEigenschaften().setEigenschaft(b_02, this.o00000.getMaxeigenschaft() + j2.ObjectString());
                }
                if (this.getHeld().o00000(b_02) <= this.getMaximalEigenschaftswert(b_02)) continue;
                this.o00000.getHswEigenschaften().setEigenschaftInklModi(b_02, this.getMaximalEigenschaftswert(b_02));
            }
        }
        this.setzeGueltigeEigenschaftswerte();
        this.passeGenerierungsKostenAn();
    }

    private int o00000() {
        if (this.getHeld().\u00d4O0000() == null) {
            return this.getHeld().\u00f800000().getMaximalSozialstatus();
        }
        int n = Math.min(this.getHeld().\u00d800000().getMaximalSozialstatus(), this.getHeld().\u00f800000().getMaximalSozialstatus());
        int n2 = this.getHeld().\u00d800000().getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000);
        n = Math.max(n, n2);
        return n;
    }
}

