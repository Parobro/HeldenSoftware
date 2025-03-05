/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.B;

import helden.framework.C.I;
import helden.framework.held.Object.O0OO;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.G.B.B;
import helden.gui.G.D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Object
extends D
implements ActionListener,
ChangeListener {
    private B returnnew;
    private O0OO \u00d8\u00d20000;

    public Object(O0OO o0OO2) {
        super(o0OO2);
        this.returnnew = new B(this, o0OO2);
        this.\u00d8\u00d20000 = o0OO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof JComboBox && actionEvent.getSource() == this.returnnew.class()) {
            this.returnnew.\u00d800000().\u00d200000((String)this.returnnew.class().getSelectedItem());
            this.returnnew.\u00d800000().fireTableDataChanged();
        }
        if (actionEvent.getSource() instanceof JButton) {
            if (((JButton)actionEvent.getSource()).getText().equals("+")) {
                KonkreterZauber konkreterZauber = this.returnnew.super();
                String string = "";
                if (konkreterZauber.getZauber().hatVarianten()) {
                    java.lang.Object object = null;
                    if (konkreterZauber.getMoeglicheVarianten() == null) {
                        while (object == null || object.toString().length() < 3) {
                            object = JOptionPane.showInputDialog(this.returnnew, "Bitte Variante f\u00fcr den Zauber angeben (min 3 Zeichen): ", "Variantenwahl", -1, null, null, null);
                            if (object != null) continue;
                            return;
                        }
                    } else {
                        object = JOptionPane.showInputDialog(this.returnnew, "W\u00e4hle eine Variante", "Variantenwahl", -1, null, konkreterZauber.getMoeglicheVarianten().toArray(), null);
                    }
                    if (object == null) {
                        return;
                    }
                    string = object.toString();
                }
                if (this.\u00d200000(konkreterZauber = KonkreterZauber.getZauber(konkreterZauber.getZaubername(), konkreterZauber.getRep(), string))) {
                    JOptionPane.showMessageDialog(this.returnnew, "Zauber bereits in der Repr\u00e4senattion und\nmit der Varianten vorhanden.\n Bitte eine andere Variante w\u00e4hlen!", "Zauber schon vorhanden", 0);
                    return;
                }
                if (this.\u00d8\u00d20000.\u00d800000().o00000(I.\u00d5\u00d3O000)) {
                    JOptionPane.showMessageDialog(this.returnnew, "Beim Viertelzauberer m\u00fcssen die \nZauber \u00fcber den Vorteil \u00dcbernat\u00fcrlichebegabung \naktiviert werden.", "Viertelzauberer", 1);
                    return;
                }
                this.super(konkreterZauber);
            } else if (((JButton)actionEvent.getSource()).getText().equals("-")) {
                if (this.\u00d8\u00d20000.\u00d800000().o00000(I.\u00d5\u00d3O000)) {
                    JOptionPane.showMessageDialog(this.returnnew, "Beim Viertelzauberer m\u00fcssen die \nZauber \u00fcber den Vorteil \u00dcbernat\u00fcrlichebegabung \ndeaktiviert werden.", "Viertelzauberer", 1);
                    return;
                }
                this.\u00d300000(this.returnnew.\u00f400000().o00000());
            }
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle die Zauber";
    }

    @Override
    public JPanel super() {
        return this.returnnew;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource() instanceof JSpinner) {
            JSpinner jSpinner = (JSpinner)changeEvent.getSource();
            KonkreterZauber konkreterZauber = this.returnnew.int().o00000(jSpinner);
            if (konkreterZauber != null) {
                this.\u00d8\u00d20000.\u00d800000().\u00d5o0000().super(konkreterZauber, (int)((Integer)jSpinner.getValue()));
            }
        }
    }

    private void super(KonkreterZauber konkreterZauber) {
        this.\u00d8\u00d20000.\u00d800000().\u00d5o0000().super(konkreterZauber, (Integer)0);
        this.returnnew.\u00d400000().add(0, konkreterZauber);
        this.returnnew.\u00d800000().Object();
        this.returnnew.\u00f400000().String();
    }

    private boolean \u00d200000(KonkreterZauber konkreterZauber) {
        if (!konkreterZauber.getZauber().hatVarianten()) {
            return false;
        }
        for (KonkreterZauber konkreterZauber2 : this.\u00d8\u00d20000.\u00d800000().\u00d5o0000().class(konkreterZauber.getZauber())) {
            if (!konkreterZauber2.getZauber().equals(konkreterZauber.getZauber()) || !konkreterZauber2.getRep().equals(konkreterZauber.getRep()) || !konkreterZauber2.getVariante().equals(konkreterZauber.getVariante())) continue;
            return true;
        }
        return false;
    }

    private void \u00d300000(KonkreterZauber konkreterZauber) {
        this.\u00d8\u00d20000.\u00d800000().\u00d5o0000().super(konkreterZauber);
        this.returnnew.\u00d800000().Object();
        this.returnnew.\u00f400000().String();
    }
}

