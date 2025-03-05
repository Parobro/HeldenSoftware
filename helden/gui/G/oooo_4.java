/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/*
 * Renamed from helden.gui.G.oooo
 */
public class oooo_4
implements ActionListener {
    private int String;
    private int \u00d200000;
    private JRadioButton[][] \u00d300000;
    private ButtonGroup[] o00000;

    public oooo_4(int n, int n2) {
        this.String = n;
        this.\u00d200000 = n2;
        this.\u00d300000 = new JRadioButton[n][n2];
        this.o00000 = new ButtonGroup[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.o00000[i2] = new ButtonGroup();
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JRadioButton jRadioButton = (JRadioButton)actionEvent.getSource();
        int n = this.o00000(jRadioButton);
        for (int i2 = 0; i2 < this.\u00d200000; ++i2) {
            JRadioButton jRadioButton2 = this.\u00d300000[n][i2];
            if (jRadioButton2 == jRadioButton || !jRadioButton2.isSelected()) continue;
            if (n == this.o00000() - 1) {
                this.\u00d300000[0][i2].doClick();
                continue;
            }
            this.\u00d300000[n + 1][i2].doClick();
        }
    }

    public void o00000(JRadioButton jRadioButton, int n, int n2) {
        this.\u00d300000[n][n2] = jRadioButton;
        this.o00000[n2].add(jRadioButton);
        jRadioButton.addActionListener(this);
    }

    public JRadioButton o00000(int n, int n2) {
        return this.\u00d300000[n][n2];
    }

    private int o00000(JRadioButton jRadioButton) {
        int n = 0;
        for (int i2 = 0; i2 < this.\u00d200000; ++i2) {
            for (n = 0; n < this.String; ++n) {
                JRadioButton jRadioButton2 = this.\u00d300000[n][i2];
                if (jRadioButton2 != jRadioButton) continue;
                return n;
            }
        }
        return -1;
    }

    private int o00000() {
        return this.String;
    }
}

