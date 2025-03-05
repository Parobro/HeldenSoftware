/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.Einstellungen;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.dialoge.SettingsPanel;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import javax.swing.JPanel;

public class SettingsZustand
extends ErschaffungsZustand {
    public SettingsZustand(HEW2 hEW2) {
        super(hEW2);
    }

    @Override
    public String getBezeichner() {
        return "Regelbasis";
    }

    @Override
    public String getHelp() {
        String string = "<html>";
        if (Einstellungen.getInstance().isGoettergeschnkeVergeben()) {
            string = string + "G\u00f6ttergeschenke werden nicht unterst\u00fctzt!<p>";
        }
        return string;
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.class;
    }

    public void setSettings(Settings settings) {
        this.super.setSetting(settings);
    }

    @Override
    public void update() {
    }

    @Override
    protected JPanel getPanel() {
        return new SettingsPanel(this);
    }
}

