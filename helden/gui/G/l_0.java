/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.framework.held.Object.O0OO;
import helden.gui.G.D;
import helden.gui.G.f;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.l
 */
public class l_0
extends D
implements ChangeListener,
ActionListener {
    private f \u00d4\u00d20000;
    private O0OO \u00d5\u00d20000;

    public l_0(O0OO o0OO2) {
        super(o0OO2);
        this.\u00d5\u00d20000 = o0OO2;
        this.\u00d4\u00d20000 = new f(this);
        this.\u00d4\u00d20000.o00000().setSelected(o0OO2.\u00f8O0000());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    @Override
    public String \u00d200000() {
        return "Informationen zum Editor";
    }

    @Override
    public JPanel super() {
        return this.\u00d4\u00d20000;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource() == this.\u00d4\u00d20000.o00000()) {
            this.\u00d5\u00d20000.o00000((Boolean)this.\u00d4\u00d20000.o00000().isSelected());
        }
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }
}

