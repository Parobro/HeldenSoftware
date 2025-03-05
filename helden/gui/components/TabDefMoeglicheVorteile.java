/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.C.A;
import helden.framework.C.D;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.private;
import helden.framework.held.object.oooo_0;
import helden.framework.settings.Settings;
import helden.gui.components.GuiModus;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class TabDefMoeglicheVorteile
extends TabellenDefinition {
    protected HashMap<M, R> O\u00d40000 = new HashMap();
    private GuiModus voidObject;
    private floatsuper \u00f8\u00d30000;

    public TabDefMoeglicheVorteile(GuiModus guiModus, floatsuper floatsuper2) {
        this.voidObject = guiModus;
        this.\u00f8\u00d30000 = floatsuper2;
    }

    public abstract void addVorteil(public var1);

    public void createSpalten() {
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        this.spalteName(arrayList);
        this.spalteAuswahl1(arrayList);
        this.spalteAuswahl2(arrayList);
        this.spalteAuswahl3(arrayList);
        this.spalteKosten(arrayList);
        this.spalteAddButton(arrayList);
    }

    @Override
    public abstract int getAnzahl();

    public GridBagConstraints getConstraints(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }

    public abstract int getMinimalWert(J var1);

    public abstract Settings getSetting();

    public abstract public getVorteilFuerZeile(int var1);

    public void spalteAddButton(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("  ", 35, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                public public_ = (public)object;
                if (public_ instanceof D) {
                    try {
                        Object object2;
                        D d2 = (D)public_.clone();
                        if (d2.interfacesuper()) {
                            object2 = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                            d2.o00000(object2);
                        }
                        if ((object2 = d2.\u00f5o0000().o00000(d2.\u00f4o0000(), TabDefMoeglicheVorteile.this.\u00f8\u00d30000, TabDefMoeglicheVorteile.this.voidObject.equals((Object)GuiModus.new))) != null && !((String)object2).isEmpty()) {
                            JOptionPane.showMessageDialog(null, object2, "Fehler beim Wahl des VT/NT", 1);
                            return;
                        }
                        TabDefMoeglicheVorteile.this.addVorteil(d2);
                    }
                    catch (Exception exception) {
                        private.\u00d200000("Cannot clone " + public_.toString() + ": " + exception.toString(), "alle");
                        exception.printStackTrace();
                        Thread.dumpStack();
                    }
                } else {
                    TabDefMoeglicheVorteile.this.addVorteil(public_);
                }
            }

            @Override
            public Object getData(int n) {
                return TabDefMoeglicheVorteile.this.getVorteilFuerZeile(n);
            }
        });
    }

    public void spalteAuswahl1(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 150, true, voidsuper.class, SpaltenDefinition.ART.\u00d600000){

            @Override
            public void changed(Object object, int n) {
                ((J)object).oO0000(n);
                TabDefMoeglicheVorteile.this.update();
            }

            @Override
            public void click(Object object) {
            }

            @Override
            public void click(Object object, Object object2) {
                D d2 = (D)object;
                if (d2.interfacesuper()) {
                    R r = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                    if (!object2.equals(r.o00000(0))) {
                        TabDefMoeglicheVorteile.this.putAuswahl(d2.\u00f5o0000(), r.o00000(0, object2));
                        TabDefMoeglicheVorteile.this.update();
                    }
                } else {
                    d2.o00000(object2);
                    TabDefMoeglicheVorteile.this.updateSoft();
                }
            }

            @Override
            public Object getData(int n) {
                return TabDefMoeglicheVorteile.this.getVorteilFuerZeile(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                if (object instanceof D) {
                    D d2 = (D)object;
                    if (d2.interfacesuper()) {
                        if (TabDefMoeglicheVorteile.this.voidObject.equals((Object)GuiModus.\u00d500000)) {
                            return ((A)d2.\u00f5o0000()).o00000(0, TabDefMoeglicheVorteile.this.getSetting());
                        }
                        return ((A)d2.\u00f5o0000()).o00000(0, TabDefMoeglicheVorteile.this.getSetting(), TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000()));
                    }
                    return d2.o00000(TabDefMoeglicheVorteile.this.getSetting());
                }
                ArrayList<Object> arrayList = new ArrayList<Object>();
                return arrayList;
            }

            @Override
            public int getMax(Object object) {
                return Math.max(((J)object).ObjectString(), ((J)object).\u00f5\u00d40000());
            }

            @Override
            public int getMin(Object object) {
                return TabDefMoeglicheVorteile.this.getMinimalWert((J)object);
            }

            @Override
            public int getSchrittweite(Object object) {
                return ((J)object).\u00d2\u00d50000();
            }

            @Override
            public int getValue(Object object) {
                return ((J)object).ObjectString();
            }

            @Override
            public Object selectedItem(Object object) {
                D d2 = (D)object;
                if (d2.interfacesuper()) {
                    R r = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                    return r.o00000(0);
                }
                return null;
            }
        });
    }

    public void spalteAuswahl2(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 80, true, voidsuper.class, SpaltenDefinition.ART.String){

            @Override
            public void click(Object object, Object object2) {
                D d2 = (D)object;
                if (d2.interfacesuper()) {
                    R r = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                    if (!object2.equals(r.o00000(1))) {
                        TabDefMoeglicheVorteile.this.putAuswahl(d2.\u00f5o0000(), r.o00000(1, object2));
                        TabDefMoeglicheVorteile.this.update();
                    }
                } else {
                    oooo_0.\u00f500000("Click in TabDefmoeglicheVorteil aufgerufen");
                }
            }

            @Override
            public Object getData(int n) {
                A a2;
                D d2;
                public public_ = TabDefMoeglicheVorteile.this.getVorteilFuerZeile(n);
                if (public_ instanceof D && (d2 = (D)public_).interfacesuper() && (a2 = (A)d2.\u00f5o0000()).O\u00d30000() > 1) {
                    return public_;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                D d2 = (D)object;
                A a2 = (A)d2.\u00f5o0000();
                if (TabDefMoeglicheVorteile.this.voidObject.equals((Object)GuiModus.\u00d500000)) {
                    return a2.o00000(1, TabDefMoeglicheVorteile.this.getSetting());
                }
                return a2.o00000(1, TabDefMoeglicheVorteile.this.getSetting(), TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000()));
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                Object object = this.getData(n);
                if (object == null) {
                    return SpaltenDefinition.ART.\u00d800000;
                }
                A a2 = (A)((D)object).\u00f5o0000();
                if (a2.o00000(1, TabDefMoeglicheVorteile.this.getSetting(), TabDefMoeglicheVorteile.this.getAuswahl(a2)).size() == 0) {
                    return SpaltenDefinition.ART.\u00f500000;
                }
                return SpaltenDefinition.ART.\u00d300000;
            }

            @Override
            public Object selectedItem(Object object) {
                D d2 = (D)object;
                R r = (R)d2.\u00f4o0000();
                return r.o00000(1);
            }

            @Override
            public void setText(Object object, String string) {
                D d2 = (D)object;
                R r = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                TabDefMoeglicheVorteile.this.putAuswahl(d2.\u00f5o0000(), r.o00000(1, string));
            }
        });
    }

    public void spalteAuswahl3(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 80, true, voidsuper.class, SpaltenDefinition.ART.String){

            @Override
            public void click(Object object, Object object2) {
                D d2 = (D)object;
                if (d2.interfacesuper()) {
                    R r = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                    if (!object2.equals(r.o00000(2))) {
                        TabDefMoeglicheVorteile.this.putAuswahl(d2.\u00f5o0000(), r.o00000(2, object2));
                        TabDefMoeglicheVorteile.this.updateSoft();
                    }
                } else {
                    oooo_0.\u00f500000("Click in TabDefmoeglicheVorteil aufgerufen");
                }
            }

            @Override
            public Object getData(int n) {
                A a2;
                D d2;
                public public_ = TabDefMoeglicheVorteile.this.getVorteilFuerZeile(n);
                if (public_ instanceof D && (d2 = (D)public_).interfacesuper() && (a2 = (A)d2.\u00f5o0000()).O\u00d30000() > 2) {
                    return public_;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                D d2 = (D)object;
                A a2 = (A)d2.\u00f5o0000();
                if (TabDefMoeglicheVorteile.this.voidObject.equals((Object)GuiModus.\u00d500000)) {
                    return a2.o00000(2, TabDefMoeglicheVorteile.this.getSetting());
                }
                return a2.o00000(2, TabDefMoeglicheVorteile.this.getSetting(), TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000()));
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                Object object = this.getData(n);
                if (object == null) {
                    return SpaltenDefinition.ART.\u00d800000;
                }
                A a2 = (A)((D)object).\u00f5o0000();
                if (a2.o00000(2, TabDefMoeglicheVorteile.this.getSetting(), TabDefMoeglicheVorteile.this.getAuswahl(a2)).size() == 0) {
                    return SpaltenDefinition.ART.\u00f500000;
                }
                return SpaltenDefinition.ART.\u00d300000;
            }

            @Override
            public Object selectedItem(Object object) {
                D d2 = (D)object;
                R r = (R)d2.\u00f4o0000();
                return r.o00000(2);
            }

            @Override
            public void setText(Object object, String string) {
                D d2 = (D)object;
                R r = TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000());
                TabDefMoeglicheVorteile.this.putAuswahl(d2.\u00f5o0000(), r.o00000(2, string));
            }
        });
    }

    public void spalteKosten(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("GP", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d800000){

            @Override
            public Object getData(int n) {
                D d2;
                public public_ = TabDefMoeglicheVorteile.this.getVorteilFuerZeile(n);
                if (public_ instanceof D && (d2 = (D)public_).interfacesuper()) {
                    d2.\u00d2o0000();
                    d2.o00000(TabDefMoeglicheVorteile.this.getAuswahl(d2.\u00f5o0000()));
                    return d2.supersuper();
                }
                return public_.supersuper();
            }
        });
    }

    public void spalteName(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("Vor-/Nachteil", 150, false, String.class){

            @Override
            public Object getData(int n) {
                return TabDefMoeglicheVorteile.this.getVorteilFuerZeile(n);
            }
        });
    }

    public abstract void update();

    public abstract void updateSoft();

    protected R getAuswahl(M m) {
        R r = this.O\u00d40000.get(m);
        if (r == null) {
            this.putAuswahl(m, (R)m.\u00d5o0000().get(0));
            return this.getAuswahl(m);
        }
        return r;
    }

    protected void putAuswahl(M m, R r) {
        this.O\u00d40000.put(m, r);
    }
}

