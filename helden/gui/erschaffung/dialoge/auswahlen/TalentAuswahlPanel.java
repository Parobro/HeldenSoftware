/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.auswahlen;

import helden.framework.OoOO.U;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.gui.components.JScrollPaneFast;
import helden.gui.erschaffung.dialoge.auswahlen.ButtonGroup2D;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TalentAuswahlPanel
extends JPanel {
    private o0oo_2 \u00f400000;
    private JPanel Object;
    private GridBagLayout \u00d600000;
    private GridBagConstraints o00000;
    private GridBagConstraints \u00d200000;
    private GridBagConstraints void;
    private Vector<JRadioButton> \u00d500000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d400000;

    public TalentAuswahlPanel(o0oo_2 o0oo_22, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00f400000 = o0oo_22;
        this.\u00d400000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.setName("Auswahl-Panel");
        this.setLayout(new BorderLayout());
        this.\u00d500000 = new Vector();
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.o00000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public Vector<JRadioButton> getRadioButtons() {
        return this.\u00d500000;
    }

    public o0oo_2 getTalentAuswahl() {
        return this.\u00f400000;
    }

    private Component o00000() {
        if (this.Object == null) {
            Object object;
            int n;
            this.Object = new JPanel();
            this.\u00d600000 = new GridBagLayout();
            this.Object.setLayout(this.\u00d600000);
            this.o00000 = new GridBagConstraints();
            this.o00000.weightx = 0.0;
            this.o00000.gridx = 0;
            this.o00000.anchor = 17;
            this.\u00d200000 = new GridBagConstraints();
            this.\u00d200000.weightx = 0.0;
            this.\u00d200000.gridx = 1;
            this.\u00d200000.anchor = 17;
            this.\u00d200000.insets.left = 5;
            this.void = new GridBagConstraints();
            this.void.weightx = 0.2;
            this.void.anchor = 10;
            int n2 = this.\u00f400000.\u00d500000().length;
            JPanel jPanel = new JPanel();
            this.o00000.gridy = 0;
            this.\u00d600000.setConstraints(jPanel, this.o00000);
            this.Object.add(jPanel);
            JLabel jLabel = new JLabel("aktuell");
            this.\u00d200000.gridy = 0;
            this.\u00d600000.setConstraints(jLabel, this.\u00d200000);
            this.Object.add(jLabel);
            for (int i2 = 0; i2 < n2; ++i2) {
                JLabel jLabel2 = new JLabel("+" + this.\u00f400000.\u00d500000()[i2]);
                this.void.gridy = 0;
                this.void.gridx = i2 + 2;
                this.\u00d600000.setConstraints(jLabel2, this.void);
                this.Object.add(jLabel2);
            }
            ButtonGroup2D buttonGroup2D = new ButtonGroup2D(this.\u00f400000.o00000().size(), n2);
            for (n = 0; n < this.\u00f400000.o00000().size(); ++n) {
                String string;
                object = this.\u00f400000.o00000().get(n);
                if (object == null) {
                    oooo_0.\u00f500000("Auswahl ist null " + this.\u00f400000.new());
                    continue;
                }
                JLabel jLabel3 = new JLabel(((U)object).toString());
                this.o00000.gridy = n + 1;
                this.\u00d600000.setConstraints(jLabel3, this.o00000);
                this.Object.add(jLabel3);
                try {
                    string = "" + this.\u00d400000.\u00d300000((oo0o_0)object);
                }
                catch (D d2) {
                    string = "n.a.";
                }
                if (this.\u00d400000.O\u00d20000() != null && this.\u00d400000.O\u00d20000().equals(object)) {
                    string = string + " Muttersprache";
                }
                if (((K)this.\u00d400000).O\u00d40000().contains(object)) {
                    string = string + " Zweit-/Lehrsprache";
                }
                JLabel jLabel4 = new JLabel(string);
                this.\u00d200000.gridy = n + 1;
                this.\u00d600000.setConstraints(jLabel4, this.\u00d200000);
                this.Object.add(jLabel4);
                for (int i3 = 0; i3 < n2; ++i3) {
                    JRadioButton jRadioButton = new JRadioButton();
                    jRadioButton.setName("" + n + "," + i3);
                    this.\u00d500000.addElement(jRadioButton);
                    this.void.gridy = n + 1;
                    this.void.gridx = i3 + 2;
                    this.\u00d600000.setConstraints(jRadioButton, this.void);
                    this.Object.add(jRadioButton);
                    buttonGroup2D.addButton(jRadioButton, n, i3);
                }
            }
            System.out.println("Anzahl: " + n2 + buttonGroup2D);
            for (n = n2 - 1; n >= 0; --n) {
                object = buttonGroup2D.getRadioButtonAt(0, n);
                if (object == null) {
                    oooo_0.\u00f500000("Fehler in der Talentauswahl " + this.getTalentAuswahl());
                }
                ((AbstractButton)object).doClick();
            }
            this.Object.setBorder(BorderFactory.createEmptyBorder(5, 35, 5, 35));
        }
        return this.Object;
    }
}

