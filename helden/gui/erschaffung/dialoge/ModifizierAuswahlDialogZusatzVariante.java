/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.Geschlecht;
import helden.framework.int.P;
import helden.gui.components.JScrollPaneFast;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlDialog;
import helden.model.DDZprofessionen.KeineWahl;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ModifizierAuswahlDialogZusatzVariante
extends JPanel
implements ChangeListener {
    private JPanel \u00d600000;
    private JPanel \u00d200000;
    private Map<JToggleButton, P> Object;
    private Map<JToggleButton, P> o00000;
    private ArrayList<ButtonGroup> \u00d500000;
    private ModifizierAuswahlDialog \u00d400000;

    public ModifizierAuswahlDialogZusatzVariante(ModifizierAuswahlDialog modifizierAuswahlDialog) {
        this.\u00d400000 = modifizierAuswahlDialog;
        this.Object = new HashMap<JToggleButton, P>();
        this.o00000 = new HashMap<JToggleButton, P>();
        this.\u00d500000 = new ArrayList();
        this.setName("Varianten-Panel");
        this.setLayout(new BorderLayout());
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.super());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
    }

    public void addVariante(P p2, boolean bl) {
        this.addVariante(p2, 0, bl);
    }

    public void addVariante(P p2, Geschlecht geschlecht, int n, boolean bl) {
        JToggleButton jToggleButton;
        String string;
        while (n >= this.\u00d500000.size()) {
            this.\u00d500000.add(new ButtonGroup());
        }
        boolean bl2 = this.\u00d500000.get(n).getButtonCount() == 0;
        StringBuffer stringBuffer = new StringBuffer(p2.getBezeichner(geschlecht));
        stringBuffer.append(" (");
        stringBuffer.append(p2.getGPKosten());
        stringBuffer.append(" GP)");
        String string2 = string = stringBuffer.toString();
        if (p2.istOptional()) {
            jToggleButton = new JCheckBox(string2);
            jToggleButton.setVerticalAlignment(1);
            jToggleButton.addChangeListener(this);
        } else {
            jToggleButton = new JRadioButton(string2);
            jToggleButton.addChangeListener(this);
            this.\u00d500000.get(n).add(jToggleButton);
        }
        jToggleButton.setName(p2.toString());
        jToggleButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        if (n == 0) {
            this.super().add(jToggleButton);
            this.Object.put(jToggleButton, p2);
        } else {
            if (bl2) {
                JLabel jLabel = p2.istOptional() ? new JLabel("Optionale Varianten: ") : new JLabel("Eine Varianten muss gew\u00e4hlt werden: ");
                int n2 = 25;
                if (n == 1) {
                    n2 = 5;
                }
                jLabel.setBorder(BorderFactory.createEmptyBorder(n2, 5, 5, 0));
                this.super().add(jLabel);
            }
            this.super().add(jToggleButton);
            this.o00000.put(jToggleButton, p2);
        }
        if (!p2.istOptional() && bl2 || bl) {
            jToggleButton.setSelected(true);
            jToggleButton.doClick();
        }
    }

    public void addVariante(P p2, int n, boolean bl) {
        this.addVariante(p2, Geschlecht.\u00d400000, n, bl);
    }

    public void clearVarianten() {
        this.Object = new HashMap<JToggleButton, P>();
        this.o00000 = new HashMap<JToggleButton, P>();
        this.\u00d500000 = new ArrayList();
        this.super().removeAll();
    }

    public void clearZusatzGruppen() {
        this.\u00d200000().removeAll();
        while (this.\u00d500000.size() > 1) {
            this.\u00d500000.remove(1);
        }
        this.o00000.clear();
    }

    public void createSpace() {
        JLabel jLabel = new JLabel(" ");
        jLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
        this.super().add(jLabel);
    }

    public Vector<P> getSelektierteVarianten() {
        P p2;
        Vector<P> vector = new Vector<P>();
        for (JToggleButton jToggleButton : this.Object.keySet()) {
            if (!jToggleButton.isSelected()) continue;
            p2 = this.getVariante(jToggleButton);
            vector.addElement(p2);
        }
        for (JToggleButton jToggleButton : this.o00000.keySet()) {
            if (!jToggleButton.isSelected() || (p2 = this.getVariante(jToggleButton)) instanceof helden.model.profession.KeineWahl || p2 instanceof KeineWahl) continue;
            vector.addElement(p2);
        }
        return vector;
    }

    public P getVariante(JToggleButton jToggleButton) {
        P p2 = this.Object.get(jToggleButton);
        if (p2 == null) {
            p2 = this.o00000.get(jToggleButton);
        }
        return p2;
    }

    public boolean istHauptVariante(JToggleButton jToggleButton) {
        return this.Object.get(jToggleButton) != null;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.\u00d400000.zusatzVariantenWurdenGeaendert();
    }

    private JPanel \u00d200000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new JPanel();
            this.\u00d200000.setLayout(new BoxLayout(this.\u00d200000, 1));
            this.\u00d200000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
        return this.\u00d200000;
    }

    private JPanel super() {
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new JPanel();
            this.\u00d600000.setLayout(new BoxLayout(this.\u00d600000, 1));
            this.\u00d600000.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }
        return this.\u00d600000;
    }
}

