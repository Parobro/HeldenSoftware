/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.spielleiterBrief;

import helden.gui.allgemein.spielleiterBrief.SpielleiterBriefController;
import helden.gui.allgemein.spielleiterBrief.SpielleiterBriefInlinePanel;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SpielleiterBriefHauptPanel
extends JPanel {
    private static final long serialVersionUID = -3879752313893414552L;
    private SpielleiterBriefController \u00d300000;
    private JPanel \u00d800000;
    private JButton class;
    private JPanel \u00d400000;
    private JButton \u00d600000;
    private JButton \u00d200000;
    private JScrollPane super;

    public SpielleiterBriefHauptPanel(SpielleiterBriefController spielleiterBriefController) {
        this.\u00d300000 = spielleiterBriefController;
        this.\u00d200000();
    }

    public JButton getBtnDrucken() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JButton("Drucken");
            this.\u00d600000.addActionListener(this.\u00d300000);
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Print.gif"));
            this.\u00d600000.setIcon(imageIcon);
        }
        return this.\u00d600000;
    }

    public JButton getBtnSchlieen() {
        if (this.class == null) {
            this.class = new JButton("Schlie\u00dfen");
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Delete.gif"));
            this.class.setIcon(imageIcon);
            this.class.addActionListener(this.\u00d300000);
        }
        return this.class;
    }

    public JButton getBtnSpeichern() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JButton("Speichern");
            this.\u00d200000.addActionListener(this.\u00d300000);
            ImageIcon imageIcon = new ImageIcon(Thread.currentThread().getContextClassLoader().getResource("helden/gui/icons/Save.gif"));
            this.\u00d200000.setIcon(imageIcon);
        }
        return this.\u00d200000;
    }

    private JPanel \u00d300000() {
        if (this.\u00d400000 == null) {
            this.\u00d400000 = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0, 77, 0};
            gridBagLayout.rowHeights = new int[]{23, 0};
            gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
            this.\u00d400000.setLayout(gridBagLayout);
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            this.\u00d400000.add((Component)this.getBtnDrucken(), gridBagConstraints);
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints2.gridx = 1;
            gridBagConstraints2.gridy = 0;
            this.\u00d400000.add((Component)this.getBtnSpeichern(), gridBagConstraints2);
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.insets = new Insets(5, 5, 5, 0);
            gridBagConstraints3.gridx = 2;
            gridBagConstraints3.gridy = 0;
            this.\u00d400000.add((Component)this.getBtnSchlieen(), gridBagConstraints3);
        }
        return this.\u00d400000;
    }

    private JScrollPane String() {
        if (this.super == null) {
            this.super = new JScrollPane();
            this.super.setHorizontalScrollBarPolicy(31);
            this.super.setViewportView(this.o00000());
        }
        return this.super;
    }

    private JPanel o00000() {
        if (this.\u00d800000 == null) {
            this.\u00d800000 = new JPanel();
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0, 0};
            gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
            this.\u00d800000.setLayout(gridBagLayout);
            for (int i2 = 1; i2 < 11; ++i2) {
                GridBagConstraints gridBagConstraints = new GridBagConstraints();
                gridBagConstraints.insets = new Insets(5, 5, 5, 5);
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = i2;
                gridBagConstraints.fill = 2;
                String string = "";
                string = i2 < 10 ? "Spieler   " + i2 + ": " : "Spieler " + i2 + ": ";
                SpielleiterBriefInlinePanel spielleiterBriefInlinePanel = new SpielleiterBriefInlinePanel(this.\u00d300000.getGemerktenHeld(i2 - 1), this.\u00d300000, string);
                this.\u00d300000.getInlinePanelList().add(spielleiterBriefInlinePanel);
                this.\u00d800000.add((Component)spielleiterBriefInlinePanel, gridBagConstraints);
            }
        }
        return this.\u00d800000;
    }

    private void \u00d200000() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{680, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
        this.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.insets = new Insets(0, 0, 5, 0);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add((Component)this.String(), gridBagConstraints);
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 1;
        this.add((Component)this.\u00d300000(), gridBagConstraints2);
    }
}

