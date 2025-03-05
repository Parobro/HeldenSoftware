/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.D.F;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.DarstellungAuswahlSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.util.ArrayList;
import java.util.List;

public class TabDefSonderfertigkeitenTupelASFSpalten
extends SpaltenDefinition {
    private TabDefSonderfertigkeiten thisint;
    private int \u00d80O000;

    public TabDefSonderfertigkeitenTupelASFSpalten(TabDefSonderfertigkeiten tabDefSonderfertigkeiten, int n) {
        super("", 80, true, voidsuper.class, SpaltenDefinition.ART.String);
        this.thisint = tabDefSonderfertigkeiten;
        this.\u00d80O000 = n;
    }

    @Override
    public void click(Object object, Object object2) {
        if (object instanceof F) {
            Q q = (Q)this.thisint.classString.get(object);
            if (object2.equals(((R)q.\u00d8\u00d30000()).o00000(this.\u00d80O000))) {
                return;
            }
            R r = ((R)q.\u00d8\u00d30000()).o00000(this.\u00d80O000, object2);
            q.new(r);
            this.thisint.classString.put((P)object, q);
            this.thisint.update();
        } else if (object instanceof K) {
            K k2 = this.thisint.getTS(object);
            if (this.\u00d80O000 == 0) {
                if (k2.o\u00d30000().equals(object2)) {
                    return;
                }
                k2.new((oo0o_0)object2);
                k2.\u00d400000(((oo0o_0)object2).getSpezialisierungen().get(0));
                this.thisint.update();
            } else if (this.\u00d80O000 == 1) {
                if (object2 == null || k2.\u00f5\u00d20000() != null && k2.\u00f5\u00d20000().equals(object2)) {
                    return;
                }
                k2.\u00d400000((String)object2);
                this.thisint.update();
            }
        } else if (object instanceof void) {
            P p2 = (P)this.thisint.classString.get(object);
            P p3 = ((DarstellungAuswahlSonderfertigkeiten)object2).getSf();
            this.thisint.classString.put((P)object, p3);
            if (!p3.o00000(p2)) {
                this.thisint.update();
            }
        }
    }

    @Override
    public Object getData(int n) {
        P p2 = this.thisint.get(n);
        if (p2 instanceof K) {
            if (this.\u00d80O000 <= 1) {
                return p2;
            }
            return null;
        }
        if (p2 instanceof F) {
            F f2 = (F)p2;
            if (f2.\u00f8\u00d40000() <= this.\u00d80O000) {
                return null;
            }
            return p2;
        }
        if (p2 instanceof void) {
            if (this.\u00d80O000 < 1) {
                return p2;
            }
            return null;
        }
        return null;
    }

    @Override
    public List<Object> getItems(Object object) {
        if (object instanceof K) {
            switch (this.\u00d80O000) {
                case 0: {
                    if (((K)object).privatesuper()) {
                        return this.thisint.getErlaubteZSTalente();
                    }
                    return this.thisint.getErlaubteTSTalente();
                }
                case 1: {
                    K k2 = this.thisint.getTS(object);
                    ArrayList<Object> arrayList = new ArrayList<Object>();
                    if (k2 == null) {
                        return new ArrayList<Object>();
                    }
                    arrayList.addAll(k2.o\u00d30000().getSpezialisierungen());
                    arrayList.add("<Eigene Eingabe>");
                    return arrayList;
                }
            }
        }
        if (object instanceof F) {
            F f2 = (F)object;
            if (f2.\u00f8\u00d40000() <= this.\u00d80O000) {
                return new ArrayList<Object>();
            }
            return f2.o00000(this.\u00d80O000, this.thisint.getSetting());
        }
        if (object instanceof void) {
            return ((void)object).o00000(this.thisint.getSetting());
        }
        return new ArrayList<Object>();
    }

    @Override
    public SpaltenDefinition.ART getMultifunctionalArt(int n) {
        P p2 = (P)this.getData(n);
        if (p2 == null) {
            return SpaltenDefinition.ART.null;
        }
        if (p2 instanceof K) {
            return SpaltenDefinition.ART.\u00d300000;
        }
        if (this.getItems(p2).size() == 0) {
            return SpaltenDefinition.ART.\u00f500000;
        }
        return SpaltenDefinition.ART.\u00d300000;
    }

    @Override
    public String getToolTip(int n) {
        P p2 = (P)this.getData(n);
        if (p2 instanceof F) {
            return ((F)p2).return(this.\u00d80O000);
        }
        return "";
    }

    @Override
    public Object selectedItem(Object object) {
        if (object instanceof F) {
            Q q = (Q)this.thisint.classString.get(object);
            return ((R)q.\u00d8\u00d30000()).o00000(this.\u00d80O000);
        }
        if (object instanceof K) {
            K k2 = this.thisint.getTS(object);
            if (k2 == null) {
                return k2;
            }
            switch (this.\u00d80O000) {
                case 0: {
                    return k2.o\u00d30000();
                }
                case 1: {
                    return k2.\u00f5\u00d20000();
                }
            }
            return null;
        }
        if (object instanceof void) {
            return this.thisint.classString.get(object);
        }
        return null;
    }

    @Override
    public void setText(Object object, String string) {
        Q q = (Q)this.thisint.classString.get(object);
        R r = ((R)q.\u00d8\u00d30000()).o00000(this.\u00d80O000, string);
        q.new(r);
        this.thisint.classString.put((P)object, q);
    }
}

