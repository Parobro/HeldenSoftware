/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.D.new.OooO;
import helden.gui.O0OO.D.new.int;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OO
extends G
implements OooO {
    private int if;

    public O0OO(new new_, int n) {
        super(new_);
        this.if = n;
        this.OO0000();
        this.public();
        this.\u00d600000();
    }

    @Override
    public void o00000(I i2) {
        this.\u00d2O0000().\u00d200000((public)i2, this.if);
    }

    @Override
    public String Object() {
        switch (this.if) {
            case 0: {
                return "VT/NT (auto)";
            }
            case 1: {
                return "VT/NT (empfohlen)";
            }
            case 2: {
                return "VT/NT (ungeeignet)";
            }
        }
        return "";
    }

    public new \u00d2O0000() {
        return (new)super.\u00d200000();
    }

    private Oo0O oO0000() {
        switch (this.if) {
            case 0: {
                return this.\u00d2O0000().\u00d3\u00d30000().\u00d2\u00d30000();
            }
            case 1: {
                return new Oo0O();
            }
            case 2: {
                return new Oo0O();
            }
        }
        return null;
    }

    private public o00000(int n) {
        switch (this.if) {
            case 0: {
                return this.\u00d2O0000().\u00d2\u00d30000().o00000().getListe().get(n);
            }
            case 1: {
                return this.\u00d2O0000().\u00d8o0000().get(n);
            }
            case 2: {
                return this.\u00d2O0000().Stringnew().get(n);
            }
        }
        return null;
    }

    private void OO0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(new int(0, this.\u00d2O0000(), this, this.if != 0));
        ((TabellenDefinition)arrayList.get(0)).setTabname("Vorteile");
        ((TabellenDefinition)arrayList.get(0)).setGlobalname("M\u00f6gliche Vor- und Nachteile");
        arrayList.add(new int(1, this.\u00d2O0000(), this, this.if != 0));
        ((TabellenDefinition)arrayList.get(1)).setTabname("Nachteile");
        this.o00000(arrayList);
    }

    private void public() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                switch (O0OO.this.if) {
                    case 0: {
                        return O0OO.this.\u00d2O0000().\u00d2\u00d30000().o00000().getListe().size();
                    }
                    case 1: {
                        return O0OO.this.\u00d2O0000().\u00d8o0000().size();
                    }
                    case 2: {
                        return O0OO.this.\u00d2O0000().Stringnew().size();
                    }
                }
                return 0;
            }
        };
        tabellenDefinition.setGlobalname("Automatische und gew\u00e4hlte Vor- und Nachteile");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Vor-/Nachteil", 150, false, String.class){

            @Override
            public Object getData(int n) {
                public public_ = O0OO.this.o00000(n);
                return public_.toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 150, true, voidsuper.class, SpaltenDefinition.ART.\u00d600000){

            @Override
            public void changed(Object object, int n) {
                ((J)object).\u00f600000(n);
                O0OO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                public public_ = O0OO.this.o00000(n);
                if (public_ instanceof J || public_ instanceof D) {
                    return public_;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                if (object instanceof D) {
                    D d2 = (D)object;
                    arrayList.add(d2.\u00f4o0000());
                }
                return arrayList;
            }

            @Override
            public int getMax(Object object) {
                return ((J)object).\u00f5\u00d40000();
            }

            @Override
            public int getMin(Object object) {
                return 0;
            }

            @Override
            public int getSchrittweite(Object object) {
                return ((J)object).\u00d2\u00d50000();
            }

            @Override
            public int getValue(Object object) {
                return ((J)object).ObjectString();
            }
        });
        if (this.\u00d2O0000().oo0000()) {
            arrayList.add(new SpaltenDefinition("VT/NT entf\u00e4llt", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

                @Override
                public Object getData(int n) {
                    public public_ = O0OO.this.o00000(n);
                    if (O0OO.this.\u00d2O0000().oo0000() && O0OO.this.oO0000().o00000(public_)) {
                        return public_;
                    }
                    return null;
                }

                @Override
                public boolean getSelected(Object object) {
                    return O0OO.this.oO0000().o00000((public)object);
                }

                @Override
                public void selected(Object object, boolean bl) {
                    public public_ = (public)object;
                    if (bl) {
                        if (!O0OO.this.\u00d2O0000().\u00d6o0000().contains(public_)) {
                            O0OO.this.\u00d2O0000().\u00d6o0000().add(public_);
                            O0OO.this.\u00d500000();
                        }
                    } else {
                        O0OO.this.\u00d2O0000().\u00d6o0000().remove(public_);
                    }
                }
            });
        }
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                O0OO.this.\u00d2O0000().o00000((public)object, O0OO.this.if);
                O0OO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                public public_ = O0OO.this.o00000(n);
                if (O0OO.this.\u00d2O0000().oo0000() && O0OO.this.oO0000().o00000(public_)) {
                    return null;
                }
                return public_;
            }
        });
        this.\u00d200000(tabellenDefinition);
    }
}

