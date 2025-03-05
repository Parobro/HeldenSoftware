/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.Filter;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.model.profession.Geweihter;
import helden.model.profession.Magier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ProfessionsZustand
extends ModifizierAuswahlZustand<super>
implements ActionListener {
    private JCheckBox \u00f400000;
    private JCheckBox int;

    public ProfessionsZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00d800000.getFilterBox().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.\u00d800000.getFilterBox())) {
            this.aktuallisiereTree(this.getRPKgemaessFilter(), this.super.getHauptProfession());
        }
        this.getWerkzeug().fireUpdateNAVI();
    }

    public void aktualisiereCheckBoxes() {
        if (this.super.hatElfischeProfession()) {
            if (this.super.isBGB()) {
                this.\u00f400000.setSelected(false);
            }
            if (this.super.isVeteran()) {
                this.int.setSelected(false);
            }
            this.int.setEnabled(false);
            this.\u00f400000.setEnabled(false);
            this.super.setBGB(false);
            this.super.setVeteran(false);
        } else {
            this.\u00f400000.setEnabled(!this.super.isVeteran());
            this.int.setEnabled(!this.super.isBGB());
        }
    }

    @Override
    public boolean anzeigen(super super_, P p2) {
        L l2;
        if (!this.super.getSetting().contains(super_, p2)) {
            return false;
        }
        if (super_ instanceof Geweihter) {
            l2 = (Geweihter)super_;
            if (p2 != null && p2.equals(((Geweihter)l2).getKor())) {
                return false;
            }
        }
        if (super_ instanceof Magier) {
            l2 = (Magier)super_;
            if (p2 != null && p2.equals(((Magier)l2).getInstitutDerArkanenAnalysen())) {
                return false;
            }
        }
        if (this.\u00d800000.getFilterBox().getSelectedItem().equals((Object)Filter.o00000)) {
            return true;
        }
        if (p2 == null) {
            return true;
        }
        if (p2.getWahlBedingung() == null) {
            return true;
        }
        return this.super.getBt().Object(p2.getWahlBedingung());
    }

    @Override
    public ArrayList<super> getAlleRPK() {
        return this.getWerkzeug().getAlleProfessionen();
    }

    @Override
    public String getBezeichner() {
        return "Profession";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        if (!this.isActive() || this.super.getHauptProfession() == null) {
            return null;
        }
        ArrayList<Hinweis> arrayList = this.super.getPruefer().pruefeProfessionen();
        return arrayList;
    }

    @Override
    public String getHelp() {
        String string = "<html><body>";
        if (this.\u00d800000.getFilterBox().getSelectedItem().equals((Object)Filter.o00000)) {
            string = string + "Sie haben die Filtereinstellung auf alle ver\u00e4ndert! Mit dieser Auswahl haben sie Zugriff auf Professionen,  die m\u00f6glicherweise mit ihrer Rassen und Kulturauswahl nicht vereinbar sind und zu diversen Fehlern f\u00fchren k\u00f6nnen.<p><p>";
        }
        return string;
    }

    @Override
    public ArrayList<super> getMoeglicheRPK() {
        return this.getWerkzeug().getMoeglicheProfessionen(false);
    }

    @Override
    public ArrayList<super> getUebliche() {
        return new ArrayList<super>();
    }

    @Override
    public List<JComponent> getZusatzGuiElemente() {
        ArrayList<JComponent> arrayList = new ArrayList<JComponent>();
        this.\u00f400000 = new JCheckBox("Breitgef\u00e4cherte Bildung");
        this.\u00f400000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
                boolean bl = abstractButton.getModel().isSelected();
                ProfessionsZustand.this.super.setBGB(bl);
                ProfessionsZustand.this.aktualisiereCheckBoxes();
            }
        });
        arrayList.add(this.\u00f400000);
        this.int = new JCheckBox("Veteran");
        this.int.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
                boolean bl = abstractButton.getModel().isSelected();
                ProfessionsZustand.this.super.setVeteran(bl);
                ProfessionsZustand.this.aktualisiereCheckBoxes();
            }
        });
        arrayList.add(this.int);
        return arrayList;
    }

    @Override
    public boolean hatFilterBox() {
        return true;
    }

    @Override
    public boolean hatNameFilter() {
        return true;
    }

    @Override
    public boolean hatUeblicheFiler() {
        return false;
    }

    @Override
    public boolean isActive() {
        return this.super.isKulturGesetzt() && this.super.getPhase() == HEW2.PHASEN.\u00d200000;
    }

    @Override
    public void setRPK(super super_, ArrayList<P> arrayList) {
        super.setRPK(super_, arrayList);
        this.aktualisiereCheckBoxes();
    }

    @Override
    public void update() {
        this.aktuallisiereTree(this.getRPKgemaessFilter(), this.super.getHauptProfession());
    }
}

