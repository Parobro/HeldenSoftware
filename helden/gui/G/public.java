/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.Geschlecht;
import helden.framework.held.Object.O0OO;
import helden.framework.settings.Settings;
import helden.gui.G.D;
import helden.gui.g.oooo_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class public
extends D
implements ActionListener {
    private oooo_0 \u00f5O0000 = new oooo_0(this);

    public public(O0OO o0OO2) {
        super(o0OO2);
        Geschlecht geschlecht = o0OO2.\u00d800000().\u00d300000();
        if (geschlecht == null) {
            geschlecht = Geschlecht.\u00d400000;
        } else {
            this.\u00f5O0000.\u00d400000().setEnabled(false);
            this.\u00f5O0000.new().setEnabled(false);
        }
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            this.\u00f5O0000.\u00d400000().setSelected(true);
        } else {
            this.\u00f5O0000.new().setSelected(true);
        }
        this.\u00d600000().o00000(geschlecht);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.\u00f5O0000.\u00d400000()) {
            this.\u00d600000().o00000(Geschlecht.\u00d400000);
            if (this.\u00d600000().oo0000() != null) {
                this.\u00d600000().oo0000().setGeschlecht(Geschlecht.\u00d400000);
            }
        }
        if (actionEvent.getSource() == this.\u00f5O0000.new()) {
            this.\u00d600000().o00000(Geschlecht.\u00d300000);
            if (this.\u00d600000().oo0000() != null) {
                this.\u00d600000().oo0000().setGeschlecht(Geschlecht.\u00d300000);
            }
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle das Geschlecht";
    }

    @Override
    public JPanel super() {
        return this.\u00f5O0000;
    }

    public Settings \u00d2O0000() {
        return this.\u00d600000().\u00d800000().oO0000();
    }

    public void super(Settings settings) {
        this.\u00d600000().\u00d200000(settings);
    }
}

