/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.D.new.B;
import helden.gui.O0OO.D.new.K;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.werkzeug.HEW2SF;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class F
extends G
implements B {
    protected HashMap<P, P> \u00d8O0000;
    private int \u00f4O0000;

    public F(new new_, int n) {
        super(new_);
        this.\u00f4O0000 = n;
        this.\u00d8O0000 = new HashMap();
        this.Oo0000();
        this.\u00f5O0000();
        this.\u00d600000();
    }

    @Override
    public void o00000(P p2) {
        if (this.\u00f4O0000 == 0) {
            this.oo0000().\u00d2\u00d20000().o00000(p2);
        } else if (p2 instanceof Q || p2 instanceof helden.framework.D.K) {
            this.oo0000().\u00d6\u00d20000().add(for.o00000(p2).get(0));
        } else {
            this.oo0000().\u00d6\u00d20000().add(new for(p2.\u00f500000()));
        }
    }

    @Override
    public void \u00d200000(P p2) {
    }

    @Override
    public HashMap<P, P> void() {
        return this.\u00d8O0000;
    }

    public String \u00f6O0000() {
        return "Verf\u00fcgbare Sonderfertigkeiten:";
    }

    public String classsuper() {
        return "Gew\u00e4hlte Sonderfertigkeiten:";
    }

    @Override
    public String Object() {
        if (this.\u00f4O0000 == 0) {
            return "Sonderfertigkeiten (auto)";
        }
        return "Sonderfertigkeiten (verbilligt)";
    }

    public new oo0000() {
        return (new)super.\u00d200000();
    }

    public boolean \u00f4O0000() {
        return true;
    }

    private Object \u00d200000(int n) {
        if (this.\u00f4O0000 == 0) {
            return this.oo0000().\u00d2\u00d20000().\u00d3O0000().get(n);
        }
        return this.oo0000().\u00d6\u00d20000().get(n);
    }

    private void \u00f5O0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        for (int i2 = 0; i2 < HEW2SF.Object.length; ++i2) {
            arrayList.add(new K(i2, this.oo0000(), this, false));
            arrayList.get(i2).setTabname(HEW2SF.Object[i2]);
            arrayList.get(i2).setGlobalname("M\u00f6gliche Sonderfertigkeiten:");
            arrayList.get(i2).setHideWennLeer(true);
        }
        this.o00000(arrayList);
    }

    private void Oo0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                if (F.this.\u00f4O0000 == 0) {
                    return F.this.oo0000().\u00d2\u00d20000().\u00d3O0000().size();
                }
                return F.this.oo0000().\u00d6\u00d20000().size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return F.this.\u00d200000(n).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                F.this.oo0000().o00000(object, F.this.\u00f4O0000);
                F.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return F.this.\u00d200000(n);
            }
        });
        this.\u00d200000(tabellenDefinition);
    }
}

