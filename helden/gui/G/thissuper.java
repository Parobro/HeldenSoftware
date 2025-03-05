/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.Object.O0OO;
import helden.gui.G.U;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class thissuper
implements ActionListener,
FocusListener {
    private U o00000;
    private O0OO Object;
    private JDialog \u00d200000;

    public thissuper(U u2) {
        this.o00000 = u2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.\u00d400000()) {
            int n = this.o00000.Object(this.Object.\u00d800000());
            if (n >= 0) {
                if (n > 0) {
                    if (JOptionPane.showConfirmDialog(this.o00000, "Wirklich fortfahren?", "Leere Eingabe!", 0) == 0) {
                        this.o00000.\u00d200000(this.Object.\u00d800000());
                        this.\u00d200000.setVisible(false);
                    }
                } else {
                    this.o00000.\u00d200000(this.Object.\u00d800000());
                    this.\u00d200000.setVisible(false);
                }
            } else {
                JOptionPane.showConfirmDialog(this.o00000, "Die Eingabe ist zu lang \nMax: 25 Zeichen !", "Bitte \u00e4ndern Sie die Eingabe", -1);
            }
        }
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        JTextField jTextField = (JTextField)focusEvent.getSource();
        if (jTextField.getText().length() > 25) {
            JLabel jLabel = this.o00000.o00000(jTextField);
            jLabel.setEnabled(false);
            jLabel.setToolTipText("Zu lang");
        } else {
            JLabel jLabel = this.o00000.o00000(jTextField);
            jLabel.setEnabled(true);
            jLabel.setToolTipText("L\u00e4nge OK");
        }
    }

    public void o00000(JDialog jDialog) {
        this.\u00d200000 = jDialog;
    }

    public void o00000(O0OO o0OO2) {
        this.Object = o0OO2;
        if (o0OO2 != null) {
            this.o00000.\u00d200000();
            this.o00000.o00000(o0OO2.\u00d800000());
            this.o00000.\u00d500000();
        }
    }
}

