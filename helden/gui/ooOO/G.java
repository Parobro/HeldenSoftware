/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.held.K;
import helden.gui.A;
import helden.gui.ooOO.FA;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public final class G
extends FA {
    private static final long String = 6469323753944869852L;
    private static G \u00d300000;

    public static G \u00d200000(A a2) {
        if (\u00d300000 == null) {
            \u00d300000 = new G(a2);
        }
        return \u00d300000;
    }

    private G(A a2) {
        super(a2);
        this.putValue("Name", "(BETA) Held drucken (Nur ge\u00e4nderte Seiten)...");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        K k2 = (K)this.\u00d200000.\u00d2O0000();
        if (k2 != null) {
            if (k2.\u00f4\u00d30000()) {
                int n = JOptionPane.showConfirmDialog(this.\u00d200000, "Es wurden nicht alle Kampfwerte verteilt,\nm\u00f6chten sie das jetzt nachholen?", "Kampfwerte nicht verteilt!", 0);
                if (n == 1) {
                    this.o00000(k2, true);
                }
            } else {
                this.o00000(k2, true);
            }
        }
    }
}

