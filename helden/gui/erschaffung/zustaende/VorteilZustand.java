/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.C.A;
import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.Einstellungen;
import helden.framework.Filter;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.zustaende.tabellenDefinitionen.TabDefMoeglicheVorteileErschaffung;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VorteilZustand
extends ZweiTabellenZustand {
    public VorteilZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00f8o0000();
        this.O\u00d20000();
        this.createPanel();
    }

    public String getBeschreibungOben() {
        return "Verf\u00fcgbare Vor- und Nachteile:";
    }

    public String getBeschreibungUnten() {
        return "Gew\u00e4hlte Vor- und Nachteile:";
    }

    @Override
    public String getBezeichner() {
        return "Vor- und Nachteile";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        ArrayList<Hinweis> arrayList = this.super.getHswVorteile().pruefe();
        this.super.getPruefer().addPruefStringFuerKosten(arrayList, KostenArt.int);
        return arrayList;
    }

    @Override
    public ArrayList getFilterItems() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("M\u00f6gliche Vor- und Nachteile");
        arrayList.add("Auch ungeeignete Vor- und Nachteile");
        return arrayList;
    }

    @Override
    public String getHelp() {
        String string = "<html><ul>Wenn ein Vorteil oder Nachteil nicht angezeigt wird, sind irgendwelche Bedingungen nicht erf\u00fcllt.";
        if (Einstellungen.getInstance().isTestMode()) {
            string = string + "<li>Behandlung von besonderen Vorteilen Feind, Verbindungen</ul>";
        }
        return string;
    }

    @Override
    public boolean hatFilterBox() {
        return true;
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.super;
    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void updateSoft() {
        super.updateSoft();
    }

    @Override
    protected void filterBoxChanged(Object object, int n) {
        if (n == 0) {
            this.super.getHswVorteile().setzeFilterForMoeglicheVorteile(Filter.\u00d600000);
        } else {
            this.super.getHswVorteile().setzeFilterForMoeglicheVorteile(Filter.\u00d200000);
        }
        this.update();
    }

    private void \u00f8o0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(new TabDefMoeglicheVorteileErschaffung(0, this.super, this));
        ((TabellenDefinition)arrayList.get(0)).setTabname("Vorteile");
        arrayList.add(new TabDefMoeglicheVorteileErschaffung(1, this.super, this));
        ((TabellenDefinition)arrayList.get(1)).setTabname("Nachteile");
        this.setSpaltenOben(arrayList);
    }

    private void O\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){
            private int superreturn = -1;

            @Override
            public int getAnzahl() {
                return VorteilZustand.this.super.getHswVorteile().getVorteile().size();
            }

            @Override
            public void setSelectedRow(int n) {
                if (n == this.superreturn) {
                    return;
                }
                this.superreturn = n;
                if (VorteilZustand.this.super.getHswVorteile().getVorteile().get(n).equals(I.\u00d8\u00f60000)) {
                    VorteilZustand.this.setZusatzComponente(new JLabel(VorteilZustand.this.super.getHswVorteile().getVorteile().get(n).toString()));
                } else {
                    VorteilZustand.this.setZusatzComponente(null);
                }
                VorteilZustand.this.super.fireUpdateNAVI();
            }
        };
        tabellenDefinition.setGlobalname("Automatische und gew\u00e4hlte Vor- und Nachteile");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Vor-/Nachteil", 150, false, String.class){

            @Override
            public Object getData(int n) {
                public public_ = VorteilZustand.this.super.getHswVorteile().getVorteile().get(n);
                return public_.toString();
            }

            @Override
            public String getToolTip(int n) {
                if (!Einstellungen.getInstance().isTestMode()) {
                    return "";
                }
                public public_ = VorteilZustand.this.super.getHswVorteile().getVorteile().get(n);
                String string = "";
                if (public_ instanceof J) {
                    J j2 = (J)public_;
                    string = string + "Wert: " + j2.ObjectString() + "<br>\n";
                    string = string + "Min: " + VorteilZustand.this.super.getHswVorteile().getMinimalWert((J)public_) + "<br>\n";
                    string = string + "Max: " + j2.\u00f5\u00d40000() + "<br>\n";
                    string = string + "Schrittweite: " + j2.\u00d2\u00d50000() + "<br>\n";
                    string = string + "GP: " + j2.supersuper() + "<br>\n";
                    string = string + "GP-Schrittweite: " + j2.voidString() + "<br>\n";
                }
                return string;
            }
        });
        arrayList.add(new SpaltenDefinition("", 150, true, voidsuper.class, SpaltenDefinition.ART.\u00d600000){

            @Override
            public void changed(Object object, int n) {
                public public_ = VorteilZustand.this.super.getHeld().\u00d500000().\u00d300000((I)((public)object));
                ((J)public_).\u00f600000(n);
                VorteilZustand.this.super.getHswVorteile().berechneGPKostenNeu();
                VorteilZustand.this.update();
            }

            @Override
            public void click(Object object, Object object2) {
                R r;
                D d2 = (D)object;
                if (d2.interfacesuper() && !object2.equals((r = (R)d2.\u00f4o0000()).o00000(0))) {
                    d2.o00000(r.o00000(0, object2));
                    VorteilZustand.this.super.getHswVorteile().berechneGPKostenNeu();
                    VorteilZustand.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                public public_ = VorteilZustand.this.super.getHswVorteile().getVorteile().get(n);
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
                    if (d2.interfacesuper()) {
                        A a2 = (A)d2.\u00f5o0000();
                        arrayList.addAll(a2.o00000(0, VorteilZustand.this.super.getSetting(), (R)d2.\u00f4o0000()));
                    } else {
                        arrayList.add(d2.\u00f4o0000());
                    }
                }
                return arrayList;
            }

            @Override
            public int getMax(Object object) {
                return Math.max(((J)object).ObjectString(), ((J)object).\u00f5\u00d40000());
            }

            @Override
            public int getMin(Object object) {
                return VorteilZustand.this.super.getHswVorteile().getMinimalWert((J)object);
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
                D d2;
                if (object instanceof D && (d2 = (D)object).interfacesuper()) {
                    D d3 = (D)object;
                    return ((R)d3.\u00f4o0000()).o00000(0);
                }
                return null;
            }
        });
        arrayList.add(new SpaltenDefinition("", 150, true, voidsuper.class, SpaltenDefinition.ART.\u00d600000){

            @Override
            public Object getData(int n) {
                A a2;
                public public_ = VorteilZustand.this.super.getHswVorteile().getVorteile().get(n);
                if (!(public_ instanceof D)) {
                    return null;
                }
                D d2 = (D)public_;
                if (d2.interfacesuper() && (a2 = (A)d2.\u00f5o0000()).O\u00d30000() > 1) {
                    return d2;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                D d2 = (D)object;
                if (((R)d2.\u00f4o0000()).o00000() > 1) {
                    arrayList.add(((R)d2.\u00f4o0000()).o00000(1));
                }
                return arrayList;
            }
        });
        arrayList.add(new SpaltenDefinition("", 150, true, voidsuper.class, SpaltenDefinition.ART.\u00d600000){

            @Override
            public Object getData(int n) {
                A a2;
                public public_ = VorteilZustand.this.super.getHswVorteile().getVorteile().get(n);
                if (!(public_ instanceof D)) {
                    return null;
                }
                D d2 = (D)public_;
                if (d2.interfacesuper() && (a2 = (A)d2.\u00f5o0000()).O\u00d30000() > 2) {
                    return d2;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                D d2 = (D)object;
                if (((R)d2.\u00f4o0000()).o00000() > 2) {
                    arrayList.add(((R)d2.\u00f4o0000()).o00000(2));
                }
                return arrayList;
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 50, true, voidsuper.class, SpaltenDefinition.ART.\u00d800000){

            @Override
            public Object getData(int n) {
                return VorteilZustand.this.super.getHswVorteile().getVorteile().get(n).supersuper();
            }
        });
        arrayList.add(new SpaltenDefinition("", 48, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                VorteilZustand.this.super.getHswVorteile().remove((public)object);
                if (VorteilZustand.this.super.getHswVorteile().needRecalc((public)object)) {
                    VorteilZustand.this.\u00d8o0000.setCursor(Cursor.getPredefinedCursor(3));
                    VorteilZustand.this.super.recalc();
                    VorteilZustand.this.\u00d8o0000.setCursor(Cursor.getPredefinedCursor(0));
                }
                VorteilZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                public public_ = VorteilZustand.this.super.getHswVorteile().getVorteile().get(n);
                if (VorteilZustand.this.super.getHswVorteile().isAuto(public_)) {
                    return null;
                }
                return public_;
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
    }
}

