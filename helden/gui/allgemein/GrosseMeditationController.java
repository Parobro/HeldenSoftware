/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Setting;
import helden.gui.allgemein.GrosseMeditationPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GrosseMeditationController
implements ActionListener {
    private GrosseMeditationPanel super;
    private JDialog \u00d400000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d200000;
    private boolean \u00d300000;

    public GrosseMeditationController(GrosseMeditationPanel grosseMeditationPanel, AbstractAction abstractAction, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, boolean bl) {
        this.\u00d300000 = bl;
        this.\u00d200000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.super = grosseMeditationPanel;
        if (bl) {
            this.\u00d200000(grosseMeditationPanel, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        } else {
            this.super(grosseMeditationPanel, oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.super.getAbbrechenButton() && JOptionPane.showConfirmDialog(this.super, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.\u00d400000.setVisible(false);
        }
        oooo_1 oooo_12 = new oooo_1(this.\u00d200000);
        if (actionEvent.getSource() == this.super.getOkButton()) {
            if (this.\u00d300000) {
                this.\u00d200000(oooo_12);
            } else {
                this.super(oooo_12);
            }
        }
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO getHeld() {
        return this.\u00d200000;
    }

    public void setDialog(JDialog jDialog) {
        this.\u00d400000 = jDialog;
    }

    private void \u00d200000(oooo_1 oooo_12) {
        P p2 = oooo_0.o00000(while.StringthisString.toString());
        if (!oooo_12.\u00d200000(p2)) {
            JOptionPane.showMessageDialog(this.super, "Die Voraussetzungen f\u00fcr die gr\u00f6\u00dfe Meditation sind nicht erf\u00fcllt.\n" + p2.\u00f5o0000().toString(), "Gro\u00dfe Meditation", 2);
            return;
        }
        try {
            int n = (Integer)this.super.getRkp().getValue();
            int n2 = oooo_12.o00000(n, this.super.getSeCheckBox().isSelected());
            String string = oooo_12.\u00d800000().\u00f5o0000() + " erh\u00e4lt " + n2 + " Astralpunkte hinzu.";
            JOptionPane.showMessageDialog(this.super, string, "Gro\u00dfe Meditation", 1);
            this.\u00d400000.setVisible(false);
        }
        catch (helden.framework.held.oooo_0 oooo_02) {
            if (this.super.getSeCheckBox().isSelected()) {
                JOptionPane.showMessageDialog(this.super, "Dem Helden fehlen die n\u00f6tigen 200 AP", "Gro\u00dfe Meditation", 2);
            } else {
                JOptionPane.showMessageDialog(this.super, "Dem Helden fehlen die n\u00f6tigen 400 AP", "Gro\u00dfe Meditation", 2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            JOptionPane.showMessageDialog(this.super, "Die RkP* k\u00f6nnen nicht h\u00f6her als der Ritualkenntniswert sein.", "Gro\u00dfe Meditation", 2);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.super, "Ung\u00fcltiger Wert eingegeben", "Gro\u00dfe Meditation", 2);
        }
    }

    private void super(oooo_1 oooo_12) {
        P p2 = oooo_0.o00000(while.nullfor.toString());
        if (!oooo_12.\u00d200000(p2)) {
            JOptionPane.showMessageDialog(this.super, "Die Voraussetzungen f\u00fcr die Karmalqueste sind nicht erf\u00fcllt.\n" + p2.\u00f5o0000().toString(), "Karmalqueste", 2);
            return;
        }
        Setting setting = oooo_12.\u00d800000().oO0000().getHauptSetting();
        if (!setting.equals((Object)Setting.\u00f8O0000) && !setting.equals((Object)Setting.returnsuper)) {
            JOptionPane.showMessageDialog(this.super, "Dieses Setting wird noch nicht unterst\u00fctzt", "Karmalqueste", 2);
            return;
        }
        try {
            int n = (Integer)this.super.getRkp().getValue();
            int n2 = oooo_12.\u00d200000(n, this.super.getSeCheckBox().isSelected());
            String string = oooo_12.\u00d800000().\u00f5o0000() + " erh\u00e4lt " + n2 + " Karmapunkte hinzu.";
            JOptionPane.showMessageDialog(this.super, string, "Karmalqueste", 1);
            this.\u00d400000.setVisible(false);
        }
        catch (helden.framework.held.oooo_0 oooo_02) {
            JOptionPane.showMessageDialog(this.super, "Dem Helden fehlen die n\u00f6tigen AP", "Karmalqueste", 2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            JOptionPane.showMessageDialog(this.super, "Die LkP* k\u00f6nnen nicht h\u00f6her als der Liturgiekenntniswert sein.", "Karmalqueste", 2);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(this.super, "Ung\u00fcltiger Wert eingegeben", "Karmalqueste", 2);
        }
    }

    private void \u00d200000(GrosseMeditationPanel grosseMeditationPanel, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        oooo_1 oooo_12 = new oooo_1(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        if (oooo_12.\u00d800000().\u00d5\u00d40000()) {
            grosseMeditationPanel.setTalentString("RkP*");
            grosseMeditationPanel.getRkPSppinner(oooo_12.\u00d800000().forObject());
        } else {
            int n;
            int n2;
            try {
                n2 = oooo_12.\u00d800000().\u00d300000((oo0o_0)voidsuper.privateObjectObject);
            }
            catch (Exception exception) {
                n2 = 0;
            }
            try {
                n = oooo_12.\u00d800000().\u00d300000((oo0o_0)voidsuper.newnewObject);
            }
            catch (Exception exception) {
                n = 0;
            }
            if (n > n2) {
                grosseMeditationPanel.setTalentString("Singen*/2");
                grosseMeditationPanel.getRkPSppinner(HeldenMath.haelfte(n));
            } else {
                grosseMeditationPanel.setTalentString("Musizieren*/2");
                grosseMeditationPanel.getRkPSppinner(HeldenMath.haelfte(n2));
            }
        }
    }

    private void super(GrosseMeditationPanel grosseMeditationPanel, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        oooo_1 oooo_12 = new oooo_1(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        grosseMeditationPanel.setTalentString("LkP*");
        grosseMeditationPanel.getRkPSppinner(oooo_12.\u00d800000().\u00d4\u00d40000());
    }
}

