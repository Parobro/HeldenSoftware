/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.B;

import helden.framework.C.A.void;
import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.OOoO.R;
import helden.framework.c.a.oooo_0;
import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import helden.framework.geld.WaehrungsFabrik;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.A;
import helden.gui.B.String;
import helden.gui.allgemein.Utils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class B
implements ActionListener {
    private String o00000;
    private JDialog \u00d400000;
    private K new;
    private A \u00d300000;

    public B(String string, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, A a2) {
        this.\u00d300000 = a2;
        this.new = (K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.o00000 = string;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.\u00d400000()) {
            this.\u00d300000.\u00d800000();
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() instanceof JButton && this.o00000.\u00d300000().\u00d200000().o00000((JButton)actionEvent.getSource()) != null) {
            public public_ = this.o00000.\u00d300000().\u00d200000().o00000((JButton)actionEvent.getSource());
            if (public_.equals(I.whilenewsuper)) {
                this.o00000(public_);
            } else if (public_ instanceof void) {
                this.o00000((void)public_);
            } else {
                M m;
                Object object;
                int n = public_.\u00d600000();
                if (this.new.\u00d400000() < n) {
                    JOptionPane.showMessageDialog(Utils.getFrame(this.o00000), "Nicht gen\u00fcgend Abenteuerpunkte f\u00fcr diese Aktion.", "AP", 0);
                    return;
                }
                java.lang.String string = public_.oO0000();
                java.lang.String string2 = "";
                java.lang.String string3 = "";
                if (public_ instanceof J) {
                    object = (J)public_;
                    string2 = "" + ((J)object).ObjectString();
                    string3 = "" + (((J)object).ObjectString() - 1);
                    if (((J)object).ObjectString() > 1) {
                        ((J)object).oO0000(((J)object).ObjectString() - 1);
                    } else {
                        this.new.new(public_);
                    }
                } else if (public_ instanceof helden.framework.C.void) {
                    object = (helden.framework.C.void)public_;
                    m = ((helden.framework.C.void)object).\u00f6\u00d50000();
                    R r = (R)((D)object).\u00f4o0000();
                    Integer n2 = (Integer)r.o00000(0);
                    string2 = "" + n2;
                    string3 = "" + (n2 - 1);
                    if (n2 > 1) {
                        r.\u00d200000(0, n2 - 1);
                        ((D)object).o00000(r);
                    } else {
                        m.intsuper().remove(r);
                    }
                    ((helden.framework.C.A)m).voidnew();
                    if (m.intsuper().size() == 0) {
                        this.new.new(m);
                    }
                } else if (public_ instanceof D) {
                    object = (D)public_;
                    m = ((D)object).\u00f5o0000();
                    if (m instanceof oooo_0) {
                        oooo_0 oooo_02 = (oooo_0)m;
                        oooo_02.supersuper((R)((D)object).\u00f4o0000());
                    } else {
                        m.intsuper().remove(((D)object).\u00f4o0000());
                    }
                    m.voidnew();
                    if (m.intsuper().size() == 0) {
                        this.new.new(m);
                    }
                } else {
                    this.new.new(public_);
                }
                object = new helden.framework.A.A("Nachteile senken", string, "", 0, 0, -n, 0);
                ((helden.framework.A.A)object).\u00d600000(string3);
                ((helden.framework.A.A)object).\u00d200000(string2);
                int n3 = this.new.\u00d400000();
                this.new.new(n3 - n);
                this.new.o00000((helden.framework.A.A)object);
            }
            this.new.\u00d4\u00d20000().resetModifikationen();
            this.new.\u00d500000().\u00f400000();
            this.\u00d300000.\u00d800000();
            this.o00000.\u00d300000().super();
        }
    }

    public OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000() {
        return this.new;
    }

    public void o00000(JDialog jDialog) {
        this.\u00d400000 = jDialog;
    }

    private void o00000(public public_) {
        J j2 = (J)public_;
        Waehrung waehrung = WaehrungsFabrik.getInstance().getWaehrungen("Mittelreich");
        Muenze muenze = waehrung.getMuenzen("Dukat");
        int n = this.new.\u00f400000().getMuenzAnzahl(muenze);
        if (n == 0) {
            JOptionPane.showMessageDialog(Utils.getFrame(this.o00000), "Schulden k\u00f6nnen nur mit Dukaten gesenkt werden\nUnd ihre Geldb\u00f6rse ist leer", "Kein Geld", 1);
            return;
        }
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(1, 1, Math.min(n, j2.ObjectString()), 1);
        JSpinner jSpinner = new JSpinner(spinnerNumberModel);
        int n2 = JOptionPane.showOptionDialog(null, jSpinner, "Wieviele Dukaten zur\u00fcckzahlen?", 2, 3, null, null, null);
        if (n2 == 0) {
            Integer n3 = (Integer)jSpinner.getValue();
            System.out.println(n3);
            j2.oO0000(j2.ObjectString() - n3);
            if (j2.ObjectString() == 0) {
                this.new.new(j2);
            }
            Vector<java.lang.String> vector = this.new.\u00f400000().getGeldStrings(true);
            this.new.\u00f400000().addMuenze(muenze, -n3.intValue());
            Vector<java.lang.String> vector2 = this.new.\u00f400000().getGeldStrings(true);
            helden.framework.A.A a2 = new helden.framework.A.A("Nachteile senken", j2, n3 + " Dukaten zur\u00fcckgezahlt", 0, 0, 0, 0);
            a2.\u00d600000("" + j2.ObjectString());
            a2.\u00d200000("" + (j2.ObjectString() + n3));
            this.new.o00000(a2);
            oooo_1 oooo_12 = new oooo_1(this.new);
            oooo_12.o00000(vector, vector2, "Gelb\u00f6rse f\u00fcr Schulden");
        }
    }

    private void o00000(void void_) {
        Object object = JOptionPane.showInputDialog(this.\u00d400000, "Bitte die Regeln auf Seite 270 WdH beachten.\nBitte den Bereich zum Abbauen w\u00e4hlen:", "Stubenhocker abbauen", -1, null, void_.Oo0000().toArray(), void_);
        if (object == null) {
            return;
        }
        int n = object instanceof oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 ? 500 : 300;
        if (this.new.\u00d400000() < n) {
            JOptionPane.showMessageDialog(Utils.getFrame(this.o00000), "Nicht gen\u00fcgend Abenteuerpunkte f\u00fcr diese Aktion.", "AP", 0);
            return;
        }
        void_.\u00d400000(object.toString());
        helden.framework.A.A a2 = new helden.framework.A.A("Nachteile senken", void_, "Normal: " + object.toString(), 0, 0, -n, 0);
        int n2 = this.new.\u00d400000();
        this.new.new(n2 - n);
        this.new.o00000(a2);
        this.new.\u00d4\u00d20000().resetModifikationen();
        this.o00000.\u00d300000().super();
    }
}

