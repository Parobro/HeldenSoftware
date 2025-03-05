/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.B;

import helden.gui.A;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends JPanel {
    private JPasswordField \u00d500000;
    private JPasswordField \u00d200000;
    private JPasswordField \u00d400000;
    private JButton Object;
    private A o00000;

    public C(A a2, JDialog jDialog) {
        super(null);
        this.o00000 = a2;
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets.top = 3;
        gridBagConstraints.insets.bottom = 2;
        gridBagConstraints.insets.right = 3;
        gridBagConstraints.insets.left = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        JLabel jLabel = new JLabel("altes Passwort");
        gridBagLayout.setConstraints(jLabel, gridBagConstraints);
        this.add(jLabel);
        ++gridBagConstraints.gridx;
        gridBagLayout.setConstraints(this.\u00d200000(), gridBagConstraints);
        this.add(this.\u00d200000());
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        jLabel = new JLabel("neues Passwort");
        gridBagLayout.setConstraints(jLabel, gridBagConstraints);
        this.add(jLabel);
        ++gridBagConstraints.gridx;
        gridBagLayout.setConstraints(this.super(), gridBagConstraints);
        this.add(this.super());
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        jLabel = new JLabel("neues Passwort");
        gridBagLayout.setConstraints(jLabel, gridBagConstraints);
        this.add(jLabel);
        ++gridBagConstraints.gridx;
        gridBagLayout.setConstraints(this.\u00d300000(), gridBagConstraints);
        this.add(this.\u00d300000());
        gridBagConstraints.gridx = 0;
        ++gridBagConstraints.gridy;
        ++gridBagConstraints.gridx;
        gridBagLayout.setConstraints(this.\u00d400000(), gridBagConstraints);
        this.add(this.\u00d400000());
    }

    public JButton \u00d400000() {
        if (this.Object == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Check.gif"));
            this.Object = new JButton("\u00c4ndern", imageIcon);
            this.Object.setName("\u00c4ndern");
            this.Object.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    new String(C.this.\u00d200000().getPassword());
                    String string = new String(C.this.super().getPassword());
                    String string2 = new String(C.this.\u00d300000().getPassword());
                    if (!string.equals(string2) || string.length() < 6) {
                        JOptionPane.showMessageDialog(C.this.o00000, "Die Passw\u00f6rter sind nicht gleich oder nicht lang genug.\n", "", 2);
                        return;
                    }
                }
            });
        }
        return this.Object;
    }

    public JPasswordField super() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JPasswordField();
            Dimension dimension = this.\u00d200000.getPreferredSize();
            dimension.setSize(200, dimension.height);
            this.\u00d200000.setPreferredSize(dimension);
        }
        return this.\u00d200000;
    }

    public JPasswordField \u00d300000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JPasswordField();
            Dimension dimension = this.\u00d400000.getPreferredSize();
            dimension.setSize(200, dimension.height);
            this.\u00d400000.setPreferredSize(dimension);
        }
        return this.\u00d400000;
    }

    public JPasswordField \u00d200000() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JPasswordField();
            Dimension dimension = this.\u00d500000.getPreferredSize();
            dimension.setSize(200, dimension.height);
            this.\u00d500000.setPreferredSize(dimension);
        }
        return this.\u00d500000;
    }
}

