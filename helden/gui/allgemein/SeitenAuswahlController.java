/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.gui.A;
import helden.gui.allgemein.SeitenAuswahlTabel;
import helden.gui.allgemein.Utils;
import helden.gui.components.JScrollPaneFast;
import helden.gui.oooo_1;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SeitenAuswahlController
implements ActionListener {
    private JDialog \u00d200000;
    private JButton \u00d500000;
    private JButton o00000;
    private boolean \u00d400000;
    private SeitenAuswahlTabel Object;

    public SeitenAuswahlController(A a2) {
        this.Object = new SeitenAuswahlTabel(a2, false);
        this.createNavigationsPanel();
        this.\u00d200000 = new JDialog(a2, "Seiten / Hintergrund Auswahl", true);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.Object);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.\u00d200000.getContentPane().add(jScrollPaneFast);
        this.\u00d200000.getContentPane().add((Component)this.createNavigationsPanel(), "South");
        this.\u00d200000.setSize(900, 500);
        Utils.zentriere(this.\u00d200000);
        this.\u00d200000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.getAbbrechenButton()) {
            this.\u00d400000 = false;
            this.\u00d200000.setVisible(false);
        }
        if (actionEvent.getSource() == this.getOkButton()) {
            this.super();
            this.\u00d400000 = true;
            this.\u00d200000.setVisible(false);
        }
    }

    public JPanel createNavigationsPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setName("Navigationspanel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(this.getOkButton());
        jPanel.add(this.getAbbrechenButton());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return jPanel;
    }

    public JButton getAbbrechenButton() {
        if (this.o00000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Delete.gif")));
            this.o00000 = new JButton("Abbrechen", imageIcon);
            this.o00000.setName("Abbrechen");
            this.o00000.addActionListener(this);
        }
        return this.o00000;
    }

    public JButton getOkButton() {
        if (this.\u00d500000 == null) {
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Check.gif")));
            this.\u00d500000 = new JButton("OK", imageIcon);
            this.\u00d500000.setName("OK");
            this.\u00d500000.addActionListener(this);
        }
        return this.\u00d500000;
    }

    public boolean isChnaged() {
        return this.\u00d400000;
    }

    private void super() {
    }
}

