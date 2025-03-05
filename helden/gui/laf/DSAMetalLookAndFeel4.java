/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.laf;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.laf.DSAMetalTheme4;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;
import javax.swing.plaf.metal.MetalLookAndFeel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DSAMetalLookAndFeel4
extends MetalLookAndFeel
implements PropertyChangeListener {
    private static A super;

    public static void setFrame(A a2) {
        super = a2;
    }

    public DSAMetalLookAndFeel4() {
        DSAMetalLookAndFeel4.setCurrentTheme(new DSAMetalTheme4());
        Einstellungen.getInstance().addListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (!"Change_Font".equals(propertyChangeEvent.getPropertyName())) {
            return;
        }
        if (DSAMetalLookAndFeel4.class.getName().equals(Einstellungen.getInstance().getLookAndFeel()) && super != null) {
            DSAMetalTheme4.resetFont();
            SwingUtilities.updateComponentTreeUI(super);
        }
    }
}

