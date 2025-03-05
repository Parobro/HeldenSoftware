/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B;

import helden.framework.E.F;
import helden.framework.held.O;
import helden.gui.super.B.null;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class void
implements ActionListener,
ChangeListener {
    private F String;
    private null o00000;
    private O \u00d200000;
    private JDialog \u00d300000;

    public void(O o, F f2, null nullVal) {
        this.\u00d200000 = o;
        this.String = f2;
        this.o00000 = nullVal;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.o00000.\u00d200000())) {
            try {
                F f2 = this.String.\u00f400000();
                this.String.Object((Integer)this.o00000.\u00d500000().getValue());
                f2.Object((Integer)this.o00000.\u00d300000().getValue());
                F[] fArray = this.\u00d200000.\u00d300000(f2.toString());
                for (int i2 = 0; i2 < fArray.length; ++i2) {
                    if (fArray[i2] != null) continue;
                    fArray[i2] = f2;
                    break;
                }
                this.\u00d300000.setVisible(false);
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
            }
        }
        if (actionEvent.getSource().equals(this.o00000.o00000())) {
            this.\u00d300000.setVisible(false);
        }
    }

    public void o00000(JDialog jDialog) {
        this.\u00d300000 = jDialog;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int n;
        if (changeEvent.getSource().equals(this.o00000.\u00d500000())) {
            n = this.String.\u00f500000() - (Integer)this.o00000.\u00d500000().getValue();
            this.o00000.\u00d300000().setValue(n);
        }
        if (changeEvent.getSource().equals(this.o00000.\u00d300000())) {
            n = this.String.\u00f500000() - (Integer)this.o00000.\u00d300000().getValue();
            this.o00000.\u00d500000().setValue(n);
        }
    }
}

