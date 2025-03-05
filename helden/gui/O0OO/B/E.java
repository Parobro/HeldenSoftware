/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.B;

import helden.gui.O0OO.A;
import helden.gui.O0OO.B.C;
import helden.gui.O0OO.D.F;
import helden.gui.O0OO.D.ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.O0OO.ooOO.Object;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class E
extends A {
    public E(helden.gui.A a2) {
        super(a2);
        this.o00000 = new Object();
        this.\u00d200000();
    }

    @Override
    public boolean o00000() {
        try {
            return C.\u00d300000().o00000((Object)this.o00000);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
        }
        catch (TransformerException transformerException) {
            transformerException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (RuntimeException runtimeException) {
            JOptionPane.showMessageDialog(null, runtimeException.getMessage(), "Fehler", 0);
        }
        return false;
    }

    @Override
    protected void Object() {
        this.o00000(new F(this.o00000));
        this.o00000(new ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this.o00000));
    }
}

