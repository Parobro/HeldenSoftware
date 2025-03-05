/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.held.object.oooo_2;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.allgemein.AktivierungRenderer;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AktivierenPanel
extends JPanel
implements ItemListener {
    private JComboBox \u00d600000;
    private JButton \u00d200000;
    private JCheckBox \u00d500000;
    private boolean String;
    private ActionListener o00000;
    private boolean \u00d300000;

    public AktivierenPanel(ActionListener actionListener, boolean bl, boolean bl2) {
        this.setName("AktivierenPanel");
        this.setLayout(new BoxLayout(this, 0));
        this.o00000 = actionListener;
        this.add(this.getFreieTalenteComboBox());
        this.\u00d300000 = bl2;
        if (bl) {
            JPanel jPanel = new JPanel();
            jPanel.add(new JLabel("SE:"));
            this.\u00d500000 = new JCheckBox();
            jPanel.add(this.\u00d500000);
            this.add(jPanel);
        }
        this.add(this.getAktivierungsButton());
        this.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    public JButton getAktivierungsButton() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JButton("aktivieren");
            this.\u00d200000.setName("Aktivierung");
            this.\u00d200000.addActionListener(this.o00000);
            this.\u00d200000.setEnabled(false);
        }
        return this.\u00d200000;
    }

    public JComboBox getFreieTalenteComboBox() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JComboBox();
            this.\u00d600000.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
            this.\u00d600000.addItemListener(this);
        }
        return this.\u00d600000;
    }

    public boolean isSE() {
        return this.\u00d500000.isSelected();
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (this.getFreieTalenteComboBox() == itemEvent.getSource()) {
            this.super();
        }
    }

    public void zeigeAktivierbares(oooo_2 oooo_22, boolean bl) {
        this.String = bl;
        if (bl) {
            this.super(oooo_22.\u00d800000().\u00f8\u00d30000());
        } else {
            this.super(oooo_22.\u00f500000().getZauberListe());
        }
        this.getFreieTalenteComboBox().setRenderer(new AktivierungRenderer(oooo_22, this.\u00d300000));
    }

    private void super(ArrayList<?> arrayList) {
        DefaultComboBoxModel<Object> defaultComboBoxModel = new DefaultComboBoxModel<Object>(arrayList.toArray());
        this.getFreieTalenteComboBox().setModel(defaultComboBoxModel);
        this.super();
        if (arrayList.size() == 0) {
            this.getAktivierungsButton().setEnabled(false);
        } else {
            this.getAktivierungsButton().setEnabled(true);
        }
    }

    private void super() {
        if (this.getFreieTalenteComboBox().getItemCount() <= 1) {
            this.getFreieTalenteComboBox().setToolTipText("");
        } else if (this.String) {
            this.getFreieTalenteComboBox().setToolTipText("");
        } else {
            String string;
            if (this.getFreieTalenteComboBox().getSelectedItem() instanceof KonkreterZauber) {
                string = "Merkmale: " + ((KonkreterZauber)this.getFreieTalenteComboBox().getSelectedItem()).getMerkmaleString();
                string = string + " Komplexit\u00e4t: " + ((KonkreterZauber)this.getFreieTalenteComboBox().getSelectedItem()).getKategorie(false);
            } else {
                string = "Merkmale: " + ((Zauber)this.getFreieTalenteComboBox().getSelectedItem()).getMerkmaleString(null);
                string = string + " Komplexit\u00e4t: " + ((Zauber)this.getFreieTalenteComboBox().getSelectedItem()).getKategorie(false);
            }
            this.getFreieTalenteComboBox().setToolTipText(string);
        }
    }
}

