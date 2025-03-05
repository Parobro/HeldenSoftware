/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super;

import helden.framework.A.A;
import helden.framework.held.object.oooo_1;
import helden.gui.super.oOoO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class I
implements FocusListener,
ActionListener,
PropertyChangeListener {
    private oOoO super;
    private oooo_1 \u00d200000;

    public I(oOoO oOoO2) {
        this.super = oOoO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.o00000();
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {
        this.o00000();
    }

    @Override
    public void focusLost(FocusEvent focusEvent) {
        this.o00000();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("FreieAP")) {
            this.super.\u00f6\u00d20000().setText("" + this.\u00d200000.\u00d800000().\u00d400000());
            this.super.\u00f6\u00d30000().setText("" + this.\u00d200000.\u00d800000().\u00d4\u00d30000());
            this.super.\u00f6\u00d30000().setText("" + this.\u00d200000.\u00d800000().\u00d5\u00d30000());
        }
    }

    public void o00000(oooo_1 oooo_12) {
        this.\u00d200000 = oooo_12;
        oooo_12.o00000(this);
    }

    private int o00000(int n, String string) {
        int n2 = n;
        try {
            if (string.indexOf("-") >= 0) {
                String[] stringArray = new String[]{string.substring(0, string.indexOf("-")).trim(), string.substring(string.indexOf("-") + 1, string.length()).trim()};
                n2 = stringArray[0].equals("") ? this.\u00d200000.\u00d800000().o\u00d30000() - Integer.parseInt(stringArray[1]) : Integer.parseInt(stringArray[0]) - Integer.parseInt(stringArray[1]);
            } else if (string.indexOf("+") >= 0) {
                String[] stringArray = new String[]{string.substring(0, string.indexOf("+")).trim(), string.substring(string.indexOf("+") + 1, string.length()).trim()};
                n2 = stringArray[0].equals("") ? this.\u00d200000.\u00d800000().o\u00d30000() + Integer.parseInt(stringArray[1]) : Integer.parseInt(stringArray[0]) + Integer.parseInt(stringArray[1]);
            } else {
                n2 = Integer.parseInt(string);
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.super.classObject().setText("" + n);
        }
        return n2;
    }

    private void o00000() {
        if (this.\u00d200000 != null) {
            this.\u00d200000.o00000(this.super.O\u00d40000().getText());
            int n = this.o00000(this.\u00d200000.\u00d800000().o\u00d30000(), this.super.classObject().getText());
            int n2 = n - this.\u00d200000.\u00d800000().o\u00d30000();
            if (n2 != 0) {
                A a2 = new A("Abenteuerpunkte", (Object)"", "", (Integer)0, (Integer)0, (Integer)n2, (Integer)0, n - n2, n);
                this.\u00d200000.\u00d800000().\u00d8O0000().add(a2);
            }
            this.\u00d200000.\u00d200000(n);
            this.super.classObject().setText("" + this.\u00d200000.\u00d800000().o\u00d30000());
            this.super.\u00f6\u00d20000().setText("" + this.\u00d200000.\u00d800000().\u00d400000());
            this.super.\u00f6\u00d30000().setText("" + this.\u00d200000.\u00d800000().\u00d4\u00d30000());
            this.super.floatnew().setText("" + this.\u00d200000.\u00d800000().\u00d5\u00d30000());
            this.super.\u00d5\u00d30000().setText(this.\u00d200000.\u00d800000().thissuper().super().toString());
        }
    }
}

