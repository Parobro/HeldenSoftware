/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H;

import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.U;
import helden.framework.d.oooo_0;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.L;
import helden.framework.held.Object.private;
import helden.framework.held.Stringsuper;
import helden.framework.held.object.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.int.N;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.H.O0OO;
import helden.gui.allgemein.Utils;
import helden.gui.components.AuswahlPanel;
import helden.gui.oooo_1;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.magier.Brabak;
import helden.model.profession.magier.Festum;
import helden.model.profession.magier.InstitutDerArkanenAnalysen;
import helden.model.profession.magier.LowangenVerformungen;
import helden.model.profession.magier.Mendena;
import helden.model.profession.magier.Mherwed;
import helden.model.profession.magier.RashdulDaemonisch;
import helden.model.profession.magier.RashdulElementar;
import helden.model.profession.magier.Sinoda;
import helden.model.profession.magier.StandardMagierVariante;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class A
extends AbstractAction {
    private static A float;
    private helden.gui.A \u00f500000;
    private K OO0000;
    private super \u00d400000;
    private ArrayList<oo0o_0> \u00f400000;
    private ArrayList<oo0o_0> void;
    private ArrayList<oo0o_0> \u00d500000;
    private ArrayList<oo0o_0> o00000;
    private ArrayList<oo0o_0> Object;
    private String \u00d200000;
    private helden.framework.held.object.oooo_1 \u00d600000;
    private o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 \u00f600000;

    public static A o00000(helden.gui.A a2) {
        if (float == null) {
            float = new A(a2);
        }
        return float;
    }

    private A(helden.gui.A a2) {
        super("Magische Fortbildung ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Blank.gif"))));
        this.\u00f500000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        StandardMagierVariante standardMagierVariante;
        this.\u00f400000 = new ArrayList();
        this.void = new ArrayList();
        this.\u00d500000 = new ArrayList();
        this.o00000 = new ArrayList();
        this.Object = new ArrayList();
        this.OO0000 = (K)this.\u00f500000.\u00d2O0000();
        this.\u00d600000 = new helden.framework.held.object.oooo_1(this.OO0000);
        this.\u00f600000 = new o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(this.OO0000);
        this.\u00d400000 = new Magier(this.OO0000.\u00d300000(), this.OO0000.O\u00d20000(), this.OO0000.\u00f5\u00d20000());
        if (!this.String()) {
            // empty if block
        }
        if ((standardMagierVariante = this.o00000()) == null) {
            return;
        }
        this.\u00d400000.waehleVariante(standardMagierVariante);
        this.\u00d400000.setSetting(this.OO0000.oO0000());
        ArrayList<for> arrayList = this.\u00d300000(standardMagierVariante);
        ArrayList<P> arrayList2 = new ArrayList<P>(1);
        for (Object object : this.\u00d400000.getSonderfertigkeiten()) {
            if (!((P)object).toString().startsWith("Merkmalskenntnis:")) continue;
            arrayList2.add((P)object);
        }
        if (standardMagierVariante.getClass().equals(RashdulDaemonisch.class)) {
            arrayList2.add(oooo_0.o00000(while.o0\u00d4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00d3\u00f6000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d2\u00f8\u00f6000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d5\u00f80000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f6\u00f5\u00d5000.toString()));
            arrayList2.add(oooo_0.o00000(while.returnfloat.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00d2o000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d3\u00f6\u00d3000.toString()));
        } else if (standardMagierVariante.getClass().equals(RashdulElementar.class)) {
            arrayList2.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
            arrayList2.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
            arrayList2.add(oooo_0.o00000(while.nullreturnnew.toString()));
        } else if (standardMagierVariante.getClass().equals(LowangenVerformungen.class)) {
            arrayList2.add(oooo_0.o00000(while.\u00d2oO000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f5\u00d2\u00d6000.toString()));
        } else if (standardMagierVariante.getClass().equals(Brabak.class)) {
            arrayList2.add(oooo_0.o00000(while.o0\u00d4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00d3\u00f6000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d2\u00f8\u00f6000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d5\u00f80000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f6\u00f5\u00d5000.toString()));
            arrayList2.add(oooo_0.o00000(while.returnfloat.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00d2o000.toString()));
            arrayList2.add(oooo_0.o00000(while.o\u00d6\u00d5000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d3\u00f6\u00d3000.toString()));
        } else if (standardMagierVariante instanceof Mendena) {
            arrayList2.add(oooo_0.o00000(while.\u00d2oO000));
            arrayList2.add(oooo_0.o00000(while.ifdoObject));
            arrayList2.add(oooo_0.o00000(while.\u00f5\u00d2\u00d6000));
        } else if (standardMagierVariante instanceof Festum) {
            arrayList2.add(oooo_0.o00000(while.oO\u00d8000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
            arrayList2.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
            arrayList2.add(oooo_0.o00000(while.nullreturnnew.toString()));
            arrayList2.add(oooo_0.o00000(while.o\u00f50000.toString()));
        } else if (standardMagierVariante instanceof Mherwed) {
            arrayList2.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
            arrayList2.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
            arrayList2.add(oooo_0.o00000(while.nullreturnnew.toString()));
            arrayList2.add(oooo_0.o00000(while.oO\u00d8000.toString()));
        } else if (standardMagierVariante instanceof Sinoda) {
            arrayList2.add(oooo_0.o00000(while.\u00d2oO000.toString()));
            arrayList2.add(oooo_0.o00000(while.\u00f5\u00d2\u00d6000.toString()));
        }
        if (arrayList2.size() == 0) {
            Object object;
            object = "K\u00f6nnte das Merkmal in der Variante nicht finden.\n\n";
            object = (String)object + "Bitte kontaktieren sie die Entwickler.\n";
            JOptionPane.showMessageDialog(null, object, "Fehler", 2);
            return;
        }
        this.\u00d200000 = arrayList2.size() > 1 ? ((P)this.o00000(arrayList2, "W\u00e4hle ein Merkmal\n")).toString() : ((P)arrayList2.get(0)).toString();
        this.o00000(standardMagierVariante);
        this.\u00d200000(standardMagierVariante);
        int n = this.o00000(this.OO0000, standardMagierVariante);
        int n2 = this.o00000(this.OO0000, standardMagierVariante, n);
        int n3 = this.\u00d300000();
        int n4 = n2 + n3;
        if (this.OO0000.\u00d400000() < n4) {
            String string = "Nicht gen\u00fcgend Abenteuerpunkte f\u00fcr die Magische Fortbildung\n\n";
            string = string + "F\u00fcr die Fortbildung selber werden " + n2 + " AP (GP*" + n + ")ben\u00f6tigt.\n";
            string = string + "F\u00fcr die Aktivierung von " + this.\u00d500000.size() + " Zaubern ";
            string = string + "und " + this.\u00f400000.size() + " Talente: ";
            string = string + n3 + " AP\n\n";
            string = string + "Insgesamt werden " + n4 + " AP ben\u00f6tigt.";
            JOptionPane.showMessageDialog(null, string, "Nicht gen\u00fcgend AP", 2);
            return;
        }
        String string = "";
        string = string + "Akademie: " + this.\u00d400000.toString().substring(7) + "\n";
        string = string + "Kosten f\u00fcr die Fortbildung: " + n2 + " AP (GP*" + n + ")\n";
        string = string + "F\u00fcr die Aktivierung von " + this.\u00d500000.size() + " Zaubern ";
        string = string + "und " + this.\u00f400000.size() + " Talente: ";
        string = string + n3 + " AP\n\n";
        string = string + "Gew\u00e4hltes Merkmal: " + this.\u00d200000.toString().substring(18) + "\n";
        int n5 = JOptionPane.showConfirmDialog(null, string = string + "\n\n Fortbildung durchf\u00fchren?", "Magische Fortbildung", 0);
        if (n5 != 0) {
            return;
        }
        this.o00000(arrayList);
        this.\u00d600000.o00000(n2, "Magische Fortbildung", "", "", "", "", "");
        this.\u00f500000.\u00d800000();
    }

    private void o00000(ArrayList<for> arrayList) {
        this.OO0000.\u00d800000().o00000(String._o.\u00d800000, this.\u00d400000);
        for (for for_ : arrayList) {
            if (this.OO0000.thisObject().contains(for_)) continue;
            this.\u00d400000.addGewahlteVerbilligteSonderfertigkeit(for_);
        }
        this.\u00f600000.o00000(oooo_0.o00000(this.\u00d200000), "Magische Fortbildung");
        this.\u00d200000();
        this.\u00d500000();
        this.o00000(this.\u00d400000);
    }

    private ArrayList<for> \u00d300000(StandardMagierVariante standardMagierVariante) {
        ArrayList<Object> arrayList;
        int n;
        ArrayList<for> arrayList2 = new ArrayList<for>();
        if (standardMagierVariante.getAnzahlSonderfertigkeitAuswahlen() > 0) {
            for (n = 0; n < standardMagierVariante.getAnzahlSonderfertigkeitAuswahlen(); ++n) {
                arrayList = standardMagierVariante.getSonderfertigkeitAuswahl(n).o00000();
                P p2 = this.o00000(arrayList, "W\u00e4hle eine Sonderfertigkeit.\nWird zu einer verbilligten Sonderfertigkeit.\n");
                for (for for_ : for.o00000(p2)) {
                    arrayList2.add(for_);
                }
            }
        }
        if (standardMagierVariante.getAnzahlVerbilligteSonderfertigkeitAuswahlen() > 0) {
            for (n = 0; n < standardMagierVariante.getAnzahlVerbilligteSonderfertigkeitAuswahlen(); ++n) {
                arrayList = standardMagierVariante.getVerbilligteSonderfertigkeitAuswahl(n).o00000();
                arrayList2.add((for)((Object)this.o00000(arrayList, "W\u00e4hle eine verbilligte Sonderfertigkeit.\n")));
            }
        }
        return arrayList2;
    }

    private int o00000(K k2, StandardMagierVariante standardMagierVariante) {
        int n = 30;
        if (standardMagierVariante.getGildenzugehoerigkeit().equals(this.OO0000.returnnew())) {
            n = 25;
        }
        return n;
    }

    private int o00000(K k2, StandardMagierVariante standardMagierVariante, int n) {
        int n2 = n * standardMagierVariante.getGPKosten();
        if (standardMagierVariante instanceof InstitutDerArkanenAnalysen) {
            n2 = 500;
        }
        return n2;
    }

    private StandardMagierVariante o00000() {
        StandardMagierVariante standardMagierVariante;
        int n = this.OO0000.\u00d800000().Object(String._o.\u00d800000).size();
        switch (n) {
            case 0: {
                Magier magier;
                standardMagierVariante = this.\u00d200000(this.\u00d400000);
                if (standardMagierVariante == null) {
                    return null;
                }
                if (this.OO0000.\u00d800000().hatProfession(Magier.class) == null || !(magier = (Magier)this.OO0000.\u00d800000().hatProfession(Magier.class)).hatVariante(standardMagierVariante)) break;
                String string = "Ein Zweistudium an seiner Heimakademie ist nicht m\u00f6glich.\n";
                JOptionPane.showMessageDialog(null, string, "Kein Zweistudium m\u00f6glich.", 2);
                return null;
            }
            case 1: {
                Magier magier = (Magier)this.\u00d400000;
                Magier magier2 = (Magier)this.OO0000.\u00d800000().Object(String._o.\u00d800000).get(0);
                if (magier2.hatVariante(magier.getInstitutDerArkanenAnalysen())) {
                    String string = "Ein Drittstudium ist mit diesem Held nicht mehr m\u00f6glich.\n";
                    JOptionPane.showMessageDialog(null, string, "Kein Drittstudium m\u00f6glich", 2);
                    return null;
                }
                standardMagierVariante = (StandardMagierVariante)magier.getInstitutDerArkanenAnalysen();
                break;
            }
            default: {
                String string = "Ein weiteres Studium ist nicht m\u00f6glich.\n";
                JOptionPane.showMessageDialog(null, string, "Kein Viertstudium m\u00f6glich.", 2);
                return null;
            }
        }
        if (standardMagierVariante instanceof InstitutDerArkanenAnalysen && !this.String(standardMagierVariante)) {
            return null;
        }
        return standardMagierVariante;
    }

    public void \u00d200000() {
        for (KonkreterZauber konkreterZauber : this.\u00d500000) {
            try {
                this.\u00d600000.o00000(konkreterZauber.getZauber(), konkreterZauber.getRep(), "", true);
                this.OO0000.if().o00000().o00000("Magische Fortbildung");
            }
            catch (Exception exception) {
                private.\u00d200000("Fehler. Zuwenig AP", "sven");
            }
        }
        Iterator<oo0o_0> iterator = this.\u00f400000.iterator();
        while (iterator.hasNext()) {
            try {
                this.\u00d600000.o00000(iterator.next(), null, null, true);
                this.OO0000.if().o00000().o00000("Magische Fortbildung");
            }
            catch (Exception exception) {
                private.\u00d200000("Fehler. Zuwenig AP", "sven");
            }
        }
    }

    public void \u00d200000(StandardMagierVariante standardMagierVariante) {
        N n = (N)((helden.framework.int.L)this.\u00d400000).getGewaehlteVarianten().get(0);
        for (int i2 = 0; i2 < 2; ++i2) {
            Iterator<oo0o_0> iterator;
            if (i2 == 0) {
                private.\u00d200000(this.OO0000.\u00d800000().getMuttersprache() + " " + this.OO0000.\u00d800000().getMuttersprachenSchrift(), "alle");
                iterator = n.getTalentwerte(this.OO0000.O\u00d20000(), this.OO0000.\u00f5\u00d20000(), 0).iterator();
            } else {
                iterator = this.Object.iterator();
            }
            while (iterator.hasNext()) {
                KonkreterZauber konkreterZauber;
                oo0o_0 oo0o_02 = iterator.next();
                if (oo0o_02.getArt() != oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000 && oo0o_02.getArt() != oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000 && !(standardMagierVariante instanceof InstitutDerArkanenAnalysen)) continue;
                boolean bl = true;
                if (oo0o_02.getArt() == oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000) {
                    konkreterZauber = (KonkreterZauber)oo0o_02;
                    bl = this.OO0000.\u00d5o0000().\u00d300000(konkreterZauber);
                } else {
                    try {
                        this.OO0000.\u00d300000(oo0o_02);
                    }
                    catch (D d2) {
                        bl = false;
                    }
                }
                if (oo0o_02.getArt() == oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000) {
                    konkreterZauber = (KonkreterZauber)oo0o_02;
                    if (bl) {
                        this.o00000.add(konkreterZauber);
                        continue;
                    }
                    this.\u00d500000.add(konkreterZauber);
                    continue;
                }
                if (bl) {
                    this.void.add(oo0o_02);
                    continue;
                }
                this.\u00f400000.add(oo0o_02);
            }
        }
    }

    public int \u00d300000() {
        int n = 0;
        OOOo oOOo = new OOOo();
        oOOo.o00000(this.OO0000.\u00f5O0000());
        oOOo.o00000(oooo_0.o00000(this.\u00d200000));
        for (KonkreterZauber oo0o_02 : this.\u00d500000) {
            L l2 = new L(this.OO0000);
            try {
                n += Math.round(l2.super((oo0o_0)oo0o_02, this.OO0000, true, false));
            }
            catch (Stringsuper stringsuper) {
                private.\u00d200000("Fehler " + stringsuper.getMessage(), "sven");
            }
        }
        for (oo0o_0 oo0o_02 : this.\u00f400000) {
            try {
                n += Math.round(this.OO0000.\u00f8O0000().super(oo0o_02, this.OO0000, true, false));
            }
            catch (Stringsuper stringsuper) {
                private.\u00d200000("Fehler " + stringsuper.getMessage(), "sven");
            }
        }
        return n;
    }

    public void o00000(super super_) {
        Magier magier = (Magier)super_;
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        magier.setzeHauszauber(arrayList);
        this.OO0000.\u00d5o0000().\u00d300000(arrayList);
    }

    public void \u00d500000() {
        for (KonkreterZauber konkreterZauber : this.o00000) {
            this.\u00d600000.o00000((U)konkreterZauber, (Boolean)true);
        }
        Iterator<oo0o_0> iterator = this.void.iterator();
        while (iterator.hasNext()) {
            this.\u00d600000.o00000((U)iterator.next(), (Boolean)true);
        }
    }

    public boolean o00000(oo0o_0 oo0o_02, Integer n) {
        boolean bl = true;
        try {
            if (this.OO0000.\u00d300000(oo0o_02) < n) {
                bl = false;
            }
        }
        catch (Stringsuper stringsuper) {
            bl = false;
        }
        return bl;
    }

    public boolean String(StandardMagierVariante standardMagierVariante) {
        String string = "";
        InstitutDerArkanenAnalysen institutDerArkanenAnalysen = (InstitutDerArkanenAnalysen)standardMagierVariante;
        HashMap<oo0o_0, Integer> hashMap = institutDerArkanenAnalysen.getTalentVoraussetzungen();
        for (Map.Entry<oo0o_0, Integer> entry : hashMap.entrySet()) {
            if (this.o00000(entry.getKey(), entry.getValue())) continue;
            string = string + entry.getKey() + "\n";
        }
        if (!string.equals("")) {
            Map.Entry<oo0o_0, Integer> entry;
            entry = "Die folgende Talente sind f\u00fcr eine Magische Weiterbildung an dem Institut der arkanen Analysen zu niedrig:\n\n" + string;
            JOptionPane.showMessageDialog(null, entry, "Talente", 2);
            return false;
        }
        return true;
    }

    private <G> G o00000(ArrayList<G> arrayList, String string) {
        AuswahlPanel<G> auswahlPanel = new AuswahlPanel<G>(arrayList, string, 1);
        JDialog jDialog = new JDialog(Utils.getFrame(this.\u00f500000), "Magische Fortbildung", true);
        auswahlPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(auswahlPanel);
        jDialog.setSize(600, 400);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
        return auswahlPanel.getAusgewaelteVarianteimPanelList().get(0);
    }

    private StandardMagierVariante \u00d200000(super super_) {
        O0OO o0OO2 = new O0OO(this, this.OO0000, super_);
        JDialog jDialog = new JDialog(Utils.getFrame(this.\u00f500000), "Magische Fortbildung", true);
        o0OO2.\u00d800000().o00000(jDialog);
        jDialog.getContentPane().add(o0OO2);
        jDialog.setSize(600, 400);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
        return (StandardMagierVariante)o0OO2.\u00d600000();
    }

    private boolean String() {
        if (this.OO0000.\u00d800000().hatProfession(Magier.class) == null && this.OO0000.\u00d800000().hatProfession(Lehrmeister.class) == null) {
            String string = "Weiterbildung ist nur f\u00fcr Magier verf\u00fcgbar.\n";
            JOptionPane.showMessageDialog(null, string, "Nur f\u00fcr Magier", 2);
            return false;
        }
        if (this.OO0000.returnnew() == null || this.OO0000.returnnew().equals("keine")) {
            String string = "Keine Gildenzugeh\u00f6rigkeit.\n";
            JOptionPane.showMessageDialog(null, string, "Nur f\u00fcr Magier", 2);
            return false;
        }
        if (this.OO0000.o00000(b_0.newwhilesuper) < 15 || this.OO0000.o00000(b_0.whilewhilesuper) < 12 || this.OO0000.o00000(b_0.\u00f8\u00f4\u00d2000) < 15) {
            String string = "Die Eigenschaften des Helden sind f\u00fcr eine Fortbildung nicht hoch genug.\n";
            JOptionPane.showMessageDialog(null, string, "Eigenschaft", 2);
            return false;
        }
        return true;
    }

    private void o00000(StandardMagierVariante standardMagierVariante) {
        int n = standardMagierVariante.getAnzahlTalentAuswahlen();
        for (int i2 = 0; i2 < n; ++i2) {
            m_0 m_02 = null;
            try {
                m_02 = standardMagierVariante.getTalentAuswahl(i2);
            }
            catch (Exception exception) {
                // empty catch block
            }
            int n2 = m_02.\u00d300000().length;
            ArrayList<oo0o_0> arrayList = m_02.new();
            ArrayList<oo0o_0> arrayList2 = new ArrayList<oo0o_0>();
            for (oo0o_0 oo0o_02 : arrayList) {
                if (oo0o_02.getArt() != oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000 && oo0o_02.getArt() != oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000) continue;
                arrayList2.add(oo0o_02);
            }
            if (arrayList2.size() <= n2) {
                this.Object.addAll(arrayList2);
                continue;
            }
            AuswahlPanel auswahlPanel = new AuswahlPanel(arrayList2, "W\u00e4hle " + n2 + " Talente/Zauber:", n2);
            JDialog jDialog = new JDialog(Utils.getFrame(this.\u00f500000), "Magische Fortbildung", true);
            auswahlPanel.getController().setDialog(jDialog);
            jDialog.getContentPane().add(auswahlPanel);
            jDialog.setSize(600, 400);
            Utils.zentriere(jDialog);
            do {
                jDialog.setVisible(true);
            } while (!auswahlPanel.check());
            this.Object.addAll(auswahlPanel.getAusgewaelteVarianteimPanelList());
        }
    }
}

