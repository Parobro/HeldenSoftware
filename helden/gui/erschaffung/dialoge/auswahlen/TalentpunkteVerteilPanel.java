/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.auswahlen;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oOoO.returnsuper;
import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TalentpunkteVerteilPanel
extends JPanel {
    private returnsuper \u00d800000;
    private JPanel \u00f400000;
    private GridBagLayout \u00d500000;
    private GridBagConstraints \u00d300000;
    private GridBagConstraints new;
    private GridBagConstraints return;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f500000;
    private Map<String, Integer> if;
    private ChangeListener \u00d400000;
    private JTextField o00000;

    public TalentpunkteVerteilPanel(returnsuper returnsuper2, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ChangeListener changeListener) {
        this.\u00d800000 = returnsuper2;
        this.\u00f500000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.if = new HashMap<String, Integer>();
        this.\u00d400000 = changeListener;
        this.setName("Verteil-Panel");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.o00000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void erhoeheTalentpunkte() {
        String string = this.o00000.getText();
        int n = Integer.parseInt(string);
        string = "" + ++n;
        this.o00000.setText(string);
    }

    public int getTalentwert(String string) {
        Integer n = this.if.get(string);
        return n;
    }

    public boolean hatNochTalentpunkte() {
        String string = this.o00000.getText();
        int n = Integer.parseInt(string);
        return n > 0;
    }

    public void reduziereTalentpunkte() {
        String string = this.o00000.getText();
        int n = Integer.parseInt(string);
        string = "" + --n;
        this.o00000.setText(string);
    }

    public void setTalentwert(String string, int n) {
        this.if.put(string, new Integer(n));
    }

    private Component o00000() {
        if (this.\u00f400000 == null) {
            JLabel jLabel;
            this.\u00f400000 = new JPanel();
            this.\u00d500000 = new GridBagLayout();
            this.\u00f400000.setLayout(this.\u00d500000);
            this.\u00d300000 = new GridBagConstraints();
            this.\u00d300000.weightx = 0.0;
            this.\u00d300000.gridx = 0;
            this.\u00d300000.gridy = 1;
            this.\u00d300000.anchor = 17;
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.anchor = 17;
            this.new = new GridBagConstraints();
            this.new.weightx = 0.0;
            this.new.gridx = 1;
            this.new.fill = 2;
            this.new.insets.left = 5;
            this.return = new GridBagConstraints();
            this.return.weightx = 0.2;
            this.return.gridx = 2;
            this.return.gridy = 1;
            this.return.anchor = 10;
            if (this.\u00d800000.\u00f400000() != null) {
                jLabel = new JLabel(this.\u00d800000.\u00f400000() + "<br> <br>");
                this.\u00d500000.setConstraints(jLabel, gridBagConstraints);
                this.\u00f400000.add(jLabel);
            }
            jLabel = new JLabel("Zu verteilen:");
            this.\u00d500000.setConstraints(jLabel, this.\u00d300000);
            this.\u00f400000.add(jLabel);
            this.o00000 = new JTextField();
            this.o00000.setEditable(false);
            this.new.gridy = 1;
            this.\u00d500000.setConstraints(this.o00000, this.new);
            this.\u00f400000.add(this.o00000);
            this.o00000.setText("" + this.\u00d800000.while());
            for (int i2 = 0; i2 < this.\u00d800000.o00000().size(); ++i2) {
                String string;
                voidsuper voidsuper2 = (voidsuper)this.\u00d800000.o00000().get(i2);
                JLabel jLabel2 = new JLabel(voidsuper2.toString());
                this.\u00d300000.gridy = i2 + 2;
                this.\u00d500000.setConstraints(jLabel2, this.\u00d300000);
                this.\u00f400000.add(jLabel2);
                try {
                    string = "" + this.\u00f500000.\u00d300000(voidsuper2);
                }
                catch (D d2) {
                    string = "n.a.";
                }
                JTextField jTextField = new JTextField(string);
                jTextField.setEditable(false);
                this.new.gridy = i2 + 2;
                this.\u00d500000.setConstraints(jTextField, this.new);
                this.\u00f400000.add(jTextField);
                JSpinner jSpinner = new JSpinner();
                jSpinner.setModel(new SpinnerNumberModel(0, 0, this.\u00d800000.oO0000(), 1));
                jSpinner.setName(voidsuper2.toString());
                jSpinner.addChangeListener(this.\u00d400000);
                this.return.gridy = i2 + 2;
                this.\u00d500000.setConstraints(jSpinner, this.return);
                this.\u00f400000.add(jSpinner);
                this.if.put(voidsuper2.toString(), new Integer(0));
            }
            this.\u00f400000.setBorder(BorderFactory.createEmptyBorder(5, 35, 5, 35));
        }
        return this.\u00f400000;
    }
}

