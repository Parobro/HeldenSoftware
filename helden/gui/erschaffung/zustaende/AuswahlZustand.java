/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.Einstellungen;
import helden.framework.OOoO.String;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.W;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.o0oo_2;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialog;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialogCheckBox;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialogExtended;
import helden.gui.erschaffung.dialoge.GeneralisierteListenAuswahlDialogRadioButtons;
import helden.gui.erschaffung.dialoge.auswahlen.AuswahlListe;
import helden.gui.erschaffung.dialoge.auswahlen.ListenAuswahlPanel;
import helden.gui.erschaffung.dialoge.auswahlen.MehrfachAuswahlListe;
import helden.gui.erschaffung.dialoge.auswahlen.TalentAuswahlPanel;
import helden.gui.erschaffung.dialoge.auswahlen.TalentpunkteVerteilPanel;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AuswahlZustand
extends ErschaffungsZustand
implements ChangeListener {
    private JPanel Objectsuper = new JPanel();
    private JPanel \u00d3o0000;
    private o0oo_2 \u00f4O0000;
    private W<?> \u00f6O0000;
    private returnsuper \u00f8O0000;
    private int voidsuper = 0;
    private boolean Oo0000;
    private oooo_0 \u00d2o0000;

    public AuswahlZustand(HEW2 hEW2) {
        super(hEW2);
    }

    public boolean auswahlGueltig() {
        if (this.\u00d3o0000 instanceof TalentAuswahlPanel) {
            TalentAuswahlPanel talentAuswahlPanel = (TalentAuswahlPanel)this.\u00d3o0000;
            Vector<JRadioButton> vector = talentAuswahlPanel.getRadioButtons();
            ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
            for (int i2 = 0; i2 < vector.size(); ++i2) {
                JRadioButton jRadioButton = vector.elementAt(i2);
                if (!jRadioButton.isSelected()) continue;
                java.lang.String string = jRadioButton.getName();
                int n = Integer.parseInt(string.substring(0, string.indexOf(",")));
                int n2 = Integer.parseInt(string.substring(string.indexOf(",") + 1, string.length()));
                Integer[] integerArray = new Integer[]{n, n2};
                this.super.getAktionen().add(new String(this.\u00f4O0000.o00000().get(n).toString(), "" + this.\u00f4O0000.\u00d500000()[n2]));
                arrayList.add(integerArray);
                this.\u00f4O0000.o00000(n, n2, this.super.getHeld(), this.super.getHeld().\u00d5o0000(), this.super.isBGBProfession(this.\u00f4O0000.\u00d400000()));
            }
            this.super.getHswAuswahlen().addAuswahl(talentAuswahlPanel.getTalentAuswahl().\u00d300000(), arrayList);
            return true;
        }
        if (this.\u00d3o0000 instanceof AuswahlListe) {
            AuswahlListe auswahlListe = (AuswahlListe)((Object)this.\u00d3o0000);
            Vector<Integer> vector = auswahlListe.getSelektierteIndices();
            if (vector.size() != this.\u00f6O0000.\u00d800000()) {
                JOptionPane.showMessageDialog(this.Objectsuper, "Es m\u00fcssen genau " + this.\u00f6O0000.\u00d800000() + " Elemente gew\u00e4hlt werden.", "Falsche Anzahl", 2);
                return false;
            }
            Iterator<Integer> iterator = vector.iterator();
            ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
            while (iterator.hasNext()) {
                int n = iterator.next();
                if (n == -1) {
                    if (this.\u00f6O0000.\u00d800000() > 1) {
                        JOptionPane.showMessageDialog(this.Objectsuper, "Es m\u00fcssen genau " + this.\u00f6O0000.\u00d800000() + " Elemente gew\u00e4hlt werden.", "Falsche Anzahl", 2);
                        return false;
                    }
                    JOptionPane.showMessageDialog(this.Objectsuper, "Es muss " + this.\u00f6O0000.\u00d800000() + " Element gew\u00e4hlt werden.", "Falsche Anzahl", 2);
                    return false;
                }
                Integer[] integerArray = new Integer[]{n};
                arrayList.add(integerArray);
                this.\u00f6O0000.o00000(n, this.super.getHeld());
                this.super.getAktionen().add(new String(this.\u00f6O0000.o00000().get(n).toString(), ""));
            }
            this.super.getHswAuswahlen().addAuswahl(this.\u00f6O0000.return(), arrayList);
            return true;
        }
        if (this.\u00d3o0000 instanceof TalentpunkteVerteilPanel) {
            int n;
            int n3;
            if (this.\u00f8O0000.\u00f800000()) {
                int n4;
                n3 = 0;
                for (n4 = 0; n4 < this.\u00f8O0000.o00000().size(); ++n4) {
                    voidsuper voidsuper2 = (voidsuper)this.\u00f8O0000.o00000().get(n4);
                    n = ((TalentpunkteVerteilPanel)this.\u00d3o0000).getTalentwert(voidsuper2.toString());
                    if (n <= 0) continue;
                    ++n3;
                }
                n4 = this.\u00f8O0000.if();
                if (n4 != -1 && n3 > n4) {
                    JOptionPane.showMessageDialog(this.Objectsuper, "Die Punkte d\u00fcrfen nur auf maximal " + n4 + " Talente verteilt werden.", "Regelversto\u00df", 2);
                    return false;
                }
                n4 = this.\u00f8O0000.\u00f500000();
                if (n4 != -1 && n3 < n4) {
                    JOptionPane.showMessageDialog(this.Objectsuper, "Die Punkte m\u00fcssen auf mindestens " + n4 + " Talente verteilt werden.", "Regelversto\u00df", 2);
                    return false;
                }
            }
            for (n3 = 0; n3 < this.\u00f8O0000.o00000().size(); ++n3) {
                voidsuper voidsuper3 = (voidsuper)this.\u00f8O0000.o00000().get(n3);
                int n5 = ((TalentpunkteVerteilPanel)this.\u00d3o0000).getTalentwert(voidsuper3.toString());
                if (n5 <= 0 || n5 >= this.\u00f8O0000.OO0000()) continue;
                JOptionPane.showMessageDialog(this.Objectsuper, "Das Talent " + voidsuper3.toString() + " muss mindestens " + this.\u00f8O0000.OO0000() + " Punkte bekommen", "Regelversto\u00df", 2);
                return false;
            }
            if (((TalentpunkteVerteilPanel)this.\u00d3o0000).hatNochTalentpunkte() && 1 == JOptionPane.showConfirmDialog(this.Objectsuper, "Es d\u00fcrfen " + this.\u00f8O0000.while() + " Punkte verteilt werden!" + "\nSollen die restlichen Punkte verfallen?", "nicht alle Punkte verteillt!", 0)) {
                return false;
            }
            ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
            for (int i3 = 0; i3 < this.\u00f8O0000.o00000().size(); ++i3) {
                voidsuper voidsuper4 = (voidsuper)this.\u00f8O0000.o00000().get(i3);
                n = ((TalentpunkteVerteilPanel)this.\u00d3o0000).getTalentwert(voidsuper4.toString());
                if (n <= 0) continue;
                Integer[] integerArray = new Integer[]{i3, n};
                arrayList.add(integerArray);
                this.\u00f8O0000.o00000(i3, n, this.super.getHeld());
                this.super.getAktionen().add(new String(this.\u00f8O0000.o00000().get(i3).toString(), "" + n));
            }
            this.super.getHswAuswahlen().addAuswahl(this.\u00f8O0000.\u00f400000(), arrayList);
            return true;
        }
        if (this.\u00d3o0000 instanceof GeneralisierteListenAuswahlDialog) {
            Object object;
            Vector<Integer> vector = ((GeneralisierteListenAuswahlDialog)this.\u00d3o0000).getSelektierteIndices();
            if (this.\u00d2o0000.\u00d600000() == -1) {
                object = (GeneralisierteListenAuswahlDialogExtended)this.\u00d3o0000;
                if (!((GeneralisierteListenAuswahlDialogExtended)object).isGueltig()) {
                    JOptionPane.showMessageDialog(this.Objectsuper, "Die get\u00e4tigte Auswahl passt nicht zu den Bedingungen f\u00fcr die Auswahl!", "Nicht korrekte Auswahl", 2);
                    return false;
                }
            } else if (vector.size() != this.\u00d2o0000.\u00d600000()) {
                JOptionPane.showMessageDialog(this.Objectsuper, "Es m\u00fcssen genau " + this.\u00d2o0000.\u00d600000() + " Elemente gew\u00e4hlt werden.", "Falsche Anzahl", 2);
                return false;
            }
            object = vector.iterator();
            ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
            while (object.hasNext()) {
                int n = (Integer)object.next();
                Integer[] integerArray = new Integer[]{n};
                arrayList.add(integerArray);
                this.\u00d2o0000.o00000(n, this.super.getHeld(), this.super.isBGBProfession(this.\u00d2o0000.String()));
                this.super.getAktionen().add(new String(this.\u00d2o0000.\u00d300000().get(n).toString(), ""));
            }
            this.super.getHswAuswahlen().addAuswahl(this.\u00d2o0000.\u00d500000(), arrayList);
            return true;
        }
        return false;
    }

    public JPanel getAuswahlpanel() {
        return this.\u00d3o0000;
    }

    @Override
    public java.lang.String getBezeichner() {
        return "Auswahl";
    }

    @Override
    public java.lang.String getHelp() {
        if (Einstellungen.getInstance().isTestMode()) {
            return "<html><ul><li>Beschreibungen m\u00fcssen \u00fcbernommen werden<li>Fernziel: Auch bei den Auswahlen ist ein zur\u00fcck m\u00f6glich</ul>";
        }
        return super.getHelp();
    }

    @Override
    public JPanel getPanel() {
        return this.Objectsuper;
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.\u00d400000;
    }

    public boolean naechsteAuswahl() {
        this.Objectsuper.removeAll();
        this.Objectsuper.setLayout(new BorderLayout());
        this.super.updateMutterspracheInProfession(this.super.getHeld());
        if (this.super.getHswAuswahlen().hatMehrListenAuswahl()) {
            this.\u00f6O0000 = this.super.getHswAuswahlen().getNextListenAuswahl();
            this.\u00d3o0000 = this.\u00f6O0000.\u00d800000() == 1 ? new ListenAuswahlPanel() : new MehrfachAuswahlListe();
            AuswahlListe auswahlListe = (AuswahlListe)((Object)this.\u00d3o0000);
            auswahlListe.setElemente(this.\u00f6O0000.o00000());
            this.Objectsuper.add((Component)new JLabel(this.\u00f6O0000.return()), "North");
        } else if (this.super.getHswAuswahlen().getGenerischeListenAuswahlen().size() > this.voidsuper) {
            this.\u00d2o0000 = this.super.getHswAuswahlen().getGenerischeListenAuswahlen().get(this.voidsuper);
            ++this.voidsuper;
            this.\u00d2o0000.o00000(this.super.getBt());
            java.lang.String string = "";
            if (this.\u00d2o0000.\u00d600000() == -1) {
                this.\u00d3o0000 = new GeneralisierteListenAuswahlDialogExtended(this.\u00d2o0000);
                string = "<html>Auswahl";
            } else if (this.\u00d2o0000.\u00d600000() == 1) {
                this.\u00d3o0000 = new GeneralisierteListenAuswahlDialogRadioButtons(this.\u00d2o0000);
                string = "<html>Triff eine Wahl";
            } else {
                this.\u00d3o0000 = new GeneralisierteListenAuswahlDialogCheckBox(this.\u00d2o0000);
                string = "<html>Es k\u00f6nnen " + this.\u00d2o0000.\u00d600000() + " Auswahlen vorgenommen werden.";
            }
            if (this.\u00d2o0000.o00000() != null) {
                string = this.\u00d2o0000.o00000();
            }
            this.Objectsuper.add((Component)new JLabel(string), "North");
        } else if (this.super.getHswAuswahlen().hatMehrTalentAuswahl()) {
            this.\u00f4O0000 = this.super.getHswAuswahlen().getNextTalentAuswahl();
            if (this.\u00f4O0000 == null) {
                helden.framework.held.object.oooo_0.\u00f500000("Talentauswahl ist null");
            }
            this.\u00d3o0000 = new TalentAuswahlPanel(this.\u00f4O0000, this.super.getHeld());
            java.lang.String string = "<html>Treffe eine Wahl (" + this.\u00f4O0000.\u00d400000().toString() + "):" + "<br>" + this.\u00f4O0000.new();
            if (this.super.isBGBProfession(this.\u00f4O0000.\u00d400000())) {
                string = string + "<br>Die Werte bestimmen, um wieviele Punkte die jeweiligen Talente sp\u00e4ter  mit AP aus der Breitgef\u00e4cherten Bildung gesteigert werden d\u00fcrfen.";
            }
            this.Objectsuper.add((Component)new JLabel(string), "North");
        } else if (this.super.getHswAuswahlen().hatMehrVerteilTalentAuswahl()) {
            this.\u00f8O0000 = this.super.getHswAuswahlen().getNextVerteilTalentAuswahl();
            this.\u00d3o0000 = new TalentpunkteVerteilPanel(this.\u00f8O0000, this.super.getHeld(), this);
            this.Oo0000 = false;
        } else {
            this.\u00d3o0000 = new JPanel();
            return false;
        }
        this.Objectsuper.add((Component)this.\u00d3o0000, "Center");
        this.Objectsuper.revalidate();
        return true;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int n;
        int n2;
        if (this.Oo0000) {
            return;
        }
        this.Oo0000 = true;
        JSpinner jSpinner = (JSpinner)changeEvent.getSource();
        java.lang.String string = jSpinner.getName();
        int n3 = (Integer)jSpinner.getValue();
        TalentpunkteVerteilPanel talentpunkteVerteilPanel = (TalentpunkteVerteilPanel)this.\u00d3o0000;
        if (n3 > n2) {
            for (n = n2 = talentpunkteVerteilPanel.getTalentwert(string); talentpunkteVerteilPanel.hatNochTalentpunkte() && n < n3; ++n) {
                talentpunkteVerteilPanel.reduziereTalentpunkte();
            }
            jSpinner.setValue(new Integer(n));
        } else {
            while (n > n3) {
                talentpunkteVerteilPanel.erhoeheTalentpunkte();
                --n;
            }
        }
        talentpunkteVerteilPanel.setTalentwert(string, n);
        this.Oo0000 = false;
    }

    @Override
    public void update() {
    }
}

