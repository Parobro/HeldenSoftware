/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.B;

import helden.framework.int.C;
import helden.gui.O0OO.A.B;
import helden.gui.O0OO.B.D;
import helden.gui.O0OO.D.new.E;
import helden.gui.O0OO.D.new.F;
import helden.gui.O0OO.D.new.G;
import helden.gui.O0OO.D.new.M;
import helden.gui.O0OO.D.new.N;
import helden.gui.O0OO.D.new.O00O;
import helden.gui.O0OO.D.new.O0OO;
import helden.gui.O0OO.D.new.for;
import helden.gui.O0OO.D.new.if;
import helden.gui.O0OO.D.new.public;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.O0OO.ooOO.new;
import helden.gui.o0oo.d.new.oooo_0;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class A
extends helden.gui.O0OO.A {
    private boolean \u00d300000;
    private boolean \u00d400000 = false;
    private O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o \u00d500000;

    public A(helden.gui.A a2) {
        super(a2);
    }

    public A(helden.gui.A a2, C c, boolean bl, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o _o2) {
        super(a2);
        this.setTitle(_o2.toString());
        this.\u00d500000 = _o2;
        this.\u00d300000 = bl;
        if (bl) {
            this.o00000 = new new(_o2);
            ((new)this.o00000).o00000(new new(c, _o2));
            ((new)this.o00000).privatenew();
        } else {
            this.o00000 = new new(c, _o2);
        }
        this.\u00d200000();
    }

    public boolean \u00d400000() {
        return this.\u00d400000;
    }

    @Override
    public boolean o00000() {
        new new_ = (new)this.o00000;
        if (new_.whilesuper().isEmpty() || new_.\u00f8o0000().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bitte einen Namen (weiblich/m\u00e4nnlich) vergeben.", "Name", 0);
            return false;
        }
        String string = "";
        for (int i2 = 0; i2 < new_.\u00f5\u00d20000().size(); ++i2) {
            B b = new_.\u00f5\u00d20000().get(i2);
            if (b.o00000()) continue;
            string = string + " " + (i2 + 1);
        }
        if (!string.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Mindestens eine der Auswahlen ist fehlerhaft!\nBetroffene Auswahlen: " + string, "Auswahlen fehlerhaft", 0);
            return false;
        }
        try {
            D.\u00d200000().o00000(new_, this.\u00d300000);
            this.\u00d400000 = true;
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
        return true;
    }

    @Override
    protected void Object() {
        this.o00000(new helden.gui.O0OO.D.F(this.o00000));
        this.o00000(new oooo_0((new)this.o00000));
        this.o00000(new M((new)this.o00000));
        this.o00000(new O0OO((new)this.o00000, 0));
        this.o00000(new O0OO((new)this.o00000, 1));
        this.o00000(new O0OO((new)this.o00000, 2));
        this.o00000(new F((new)this.o00000, 0));
        this.o00000(new F((new)this.o00000, 1));
        this.o00000(new public((new)this.o00000));
        if (this.\u00d500000.equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000) || this.\u00d500000.equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super)) {
            this.o00000(new if((new)this.o00000));
            this.o00000(new G((new)this.o00000));
            this.o00000(new E((new)this.o00000));
            this.o00000(new for((new)this.o00000));
        }
        if (this.\u00d500000.equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000)) {
            this.o00000(new helden.gui.O0OO.D.new.A((new)this.o00000, 0));
            this.o00000(new helden.gui.O0OO.D.new.A((new)this.o00000, 1));
            this.o00000(new O00O((new)this.o00000));
        }
        this.o00000(new N((new)this.o00000));
    }
}

