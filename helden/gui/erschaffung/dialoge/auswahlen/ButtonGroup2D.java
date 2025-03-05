/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.auswahlen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ButtonGroup2D
implements ActionListener {
    private int \u00d400000;
    private int \u00d200000;
    private JRadioButton[][] \u00d300000;
    private ButtonGroup[] super;

    public ButtonGroup2D(int n, int n2) {
        this.\u00d400000 = n;
        this.\u00d200000 = n2;
        this.\u00d300000 = new JRadioButton[n][n2];
        this.super = new ButtonGroup[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.super[i2] = new ButtonGroup();
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JRadioButton jRadioButton = (JRadioButton)actionEvent.getSource();
        int n = this.super(jRadioButton);
        for (int i2 = 0; i2 < this.\u00d200000; ++i2) {
            JRadioButton jRadioButton2 = this.\u00d300000[n][i2];
            if (jRadioButton2 == jRadioButton || !jRadioButton2.isSelected()) continue;
            if (n == this.super() - 1) {
                this.\u00d300000[0][i2].doClick();
                continue;
            }
            this.\u00d300000[n + 1][i2].doClick();
        }
    }

    public void addButton(JRadioButton jRadioButton, int n, int n2) {
        this.\u00d300000[n][n2] = jRadioButton;
        this.super[n2].add(jRadioButton);
        jRadioButton.addActionListener(this);
    }

    public JRadioButton getRadioButtonAt(int n, int n2) {
        return this.\u00d300000[n][n2];
    }

    private int super(JRadioButton jRadioButton) {
        int n = 0;
        for (int i2 = 0; i2 < this.\u00d200000; ++i2) {
            for (n = 0; n < this.\u00d400000; ++n) {
                JRadioButton jRadioButton2 = this.\u00d300000[n][i2];
                if (jRadioButton2 != jRadioButton) continue;
                return n;
            }
        }
        return -1;
    }

    private int super() {
        return this.\u00d400000;
    }
}

