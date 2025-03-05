/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.framework.ExternesProgramm;
import helden.framework.held.Object.private;
import helden.gui.A;
import helden.gui.oO0O;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.AbstractAction;

/*
 * Renamed from helden.gui.oOoO
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oooo_0
extends AbstractAction {
    private static final long \u00d300000 = -8115075707442246595L;
    private static HashMap<String, oooo_0> new = new HashMap();
    private ExternesProgramm o00000;

    public static oooo_0 o00000(A a2, ExternesProgramm externesProgramm) {
        if (new.get(externesProgramm.toString()) == null) {
            new.put(externesProgramm.toString(), new oooo_0(a2, externesProgramm));
        }
        return new.get(externesProgramm.toString());
    }

    public oooo_0(A a2, ExternesProgramm externesProgramm) {
        super(externesProgramm.toString());
        this.o00000 = externesProgramm;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = this.o00000.getPfad() + System.getProperty("file.separator");
        String string2 = "";
        for (int i2 = 0; i2 < string.length() - 1; ++i2) {
            string2 = string.substring(i2, i2 + 1).equals("/") ? string2 + System.getProperty("file.separator") : string2 + string.substring(i2, i2 + 1);
        }
        String string3 = "";
        if (System.getProperty("os.name").startsWith("Mac")) {
            string3 = string3 + "java -jar " + this.o00000.getParameter() + " " + string2 + System.getProperty("file.separator") + this.o00000.getDatei();
            if (this.o00000.getJarParameter() != null) {
                string3 = string3 + " " + this.o00000.getJarParameter();
            }
            try {
                Runtime.getRuntime().exec(string3);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else if (System.getProperty("os.name").startsWith("Windows")) {
            string3 = string3 + "java -jar " + this.o00000.getParameter() + " " + this.o00000.getDatei();
            if (this.o00000.getJarParameter() != null) {
                string3 = string3 + " " + this.o00000.getJarParameter();
            }
            try {
                Runtime.getRuntime().exec(string3, null, new File(string2 + System.getProperty("file.separator")));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (System.getProperty("os.name").startsWith("Linux")) {
            string3 = string3 + "java -jar " + this.o00000.getParameter() + " " + string2 + System.getProperty("file.separator") + this.o00000.getDatei();
            if (this.o00000.getJarParameter() != null) {
                string3 = string3 + " " + this.o00000.getJarParameter();
            }
            try {
                Runtime.getRuntime().exec(string3);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else {
            private.\u00d200000(System.getProperty("os.name"), "alle");
            throw new oO0O(System.getProperty("os.name"));
        }
    }
}

