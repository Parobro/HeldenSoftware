/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.D.F;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo.a_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeitenTupelASFSpalten;
import helden.gui.components.WaffenmeisterDialog;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import helden.gui.icons.IconFactory;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class TabDefSonderfertigkeiten
extends TabellenDefinition {
    public static final String[] \u00d2\u00d50000 = new String[]{"Allgemein", "Elfenlied", "Gel\u00e4ndekunde", "Geweiht", "Liturgie", "Fernkampf", "Nahkampf", "Man\u00f6ver", "Magisch", "Merkmalskenntnis", "Objektritual", "Schamanenritual", "Repr\u00e4sentation", "Ritualkenntnis", "Pakt", "Sonstiges"};
    private K \u00d4\u00d50000 = K.o00000(voidsuper.\u00d8\u00d5\u00d5000, voidsuper.\u00d8\u00d5\u00d5000.getSpezialisierungen().get(0));
    private K \u00d6\u00d50000 = K.new(Zauber.Stringpublicnew, Zauber.Stringpublicnew.getSpezialisierungen().get(0), true);
    protected HashMap<P, Object> classString;
    private int \u00d3\u00d50000;
    private GuiModus \u00d8\u00d50000;

    public TabDefSonderfertigkeiten(int n, GuiModus guiModus) {
        this.\u00d3\u00d50000 = n;
        this.classString = new HashMap();
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        this.\u00d8\u00d50000 = guiModus;
        switch (guiModus) {
            case \u00d800000: {
                this.new(arrayList);
                this.o00000(arrayList);
                this.\u00d300000(arrayList);
                this.\u00f800000(arrayList);
                this.return(arrayList);
                this.\u00f400000(arrayList);
                this.\u00f500000(arrayList);
                break;
            }
            case \u00d500000: {
                this.\u00d300000(arrayList);
                this.\u00f800000(arrayList);
                this.\u00f500000(arrayList);
                break;
            }
            case return: {
                this.\u00d300000(arrayList);
                this.\u00f800000(arrayList);
                this.\u00f500000(arrayList);
                this.\u00d400000(arrayList);
                break;
            }
            case \u00d400000: {
                this.\u00d300000(arrayList);
                arrayList.add(new TabDefSonderfertigkeitenTupelASFSpalten(this, 0));
                this.\u00f500000(arrayList);
                break;
            }
            case new: {
                this.\u00d800000(arrayList);
                this.\u00d300000(arrayList);
                this.\u00f800000(arrayList);
                this.if(arrayList);
                this.\u00f500000(arrayList);
                break;
            }
            case o00000: {
                this.\u00d300000(arrayList);
                this.\u00f800000(arrayList);
                this.\u00d500000(arrayList);
                this.\u00f500000(arrayList);
            }
        }
    }

    public void addVerbilligtesSonderfertigkeit(P p2) {
    }

    public P get(int n) {
        P p2 = this.\u00d3\u00d50000 != -1 ? this.getVListe().getListe(this.\u00d3\u00d50000).get(n) : this.getVListe().getListe().get(n);
        if (p2 instanceof K) {
            K k2 = (K)p2;
            k2.\u00d400000((String)this.classString.get(k2.o\u00d30000()));
            return k2;
        }
        if (p2 instanceof F) {
            F f2 = (F)p2;
            Q q = (Q)this.classString.get(p2);
            if (q == null) {
                f2.new(this.getSetting());
                ArrayList arrayList = new ArrayList(f2.\u00f8\u00d30000());
                if (arrayList.size() == 0) {
                    System.out.println("Expandiere M\u00f6gliche leer f\u00fcr " + p2);
                    return null;
                }
                this.classString.put(p2, f2.\u00d300000((R)arrayList.get(0)));
            }
        } else if (p2 instanceof void) {
            void void_ = (void)p2;
            Q q = (Q)this.classString.get(p2);
            if (q == null) {
                List list = void_.o00000(this.getSetting());
                if (list.size() == 0) {
                    System.out.println("Expandiere M\u00f6gliche leer f\u00fcr " + p2 + " " + p2.getClass().getSimpleName());
                    return null;
                }
                q = list.get(0);
                this.classString.put(p2, q);
            }
            int n2 = void_.return(q.\u00d8\u00d30000());
            q.new(n2);
        }
        return p2;
    }

    @Override
    public int getAnzahl() {
        if (this.\u00d3\u00d50000 == -1) {
            return this.getVListe().getListe().size();
        }
        if (this.\u00d3\u00d50000 >= this.getVListe().getAnzahlListen()) {
            return 0;
        }
        return this.getVListe().getListe(this.\u00d3\u00d50000).size();
    }

    public GridBagConstraints getConstraints(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }

    public K getMagischTS() {
        return this.\u00d6\u00d50000;
    }

    public K getNichtmagischTS() {
        return this.\u00d4\u00d50000;
    }

    public String getStringForToolTip(int n) {
        String string = "";
        P p2 = this.o00000(this.get(n));
        if (Einstellungen.getInstance().isTestMode()) {
            string = "<html><body>" + p2.getClass().toString() + "<br>" + "Normale Kosten: ";
            if (p2 instanceof void) {
                Q q = (Q)this.classString.get(p2);
                string = string + q.o\u00d20000() + " <-> " + p2.newnew();
            } else {
                string = string + p2.newnew();
            }
            string = string + "<br>";
            if (this.get(n).\u00d8o0000() != null) {
                for (String string2 : this.get(n).\u00d8o0000()) {
                    string = string + string2;
                    string = string + "<br>";
                }
            }
        }
        return string;
    }

    public K getTS(Object object) {
        Comparable<Object> comparable;
        if (this.classString.get(this.\u00d4\u00d50000) == null && this.getErlaubteTSTalente().size() > 0) {
            comparable = (oo0o_0)this.getErlaubteTSTalente().get(0);
            this.classString.put(this.\u00d4\u00d50000, K.o00000(comparable, ((oo0o_0)comparable).getSpezialisierungen().get(0)));
        }
        if (this.classString.get(this.\u00d6\u00d50000) == null && this.getErlaubteZSTalente().size() > 0) {
            comparable = (KonkreterZauber)this.getErlaubteZSTalente().get(0);
            this.classString.put(this.\u00d6\u00d50000, K.new(comparable, ((oo0o_0)comparable).getSpezialisierungen().get(0), true));
        }
        K k2 = ((K)(comparable = (K)object)).privatesuper() ? (K)this.classString.get(this.getMagischTS()) : (K)this.classString.get(this.getNichtmagischTS());
        return k2;
    }

    public boolean istVerbilligt(P p2) {
        if (p2 instanceof void) {
            Q q = (Q)this.classString.get(p2);
            return q.o\u00d20000() < p2.newnew();
        }
        return p2.\u00d800000();
    }

    protected abstract void addSonderfertigkeit(P var1);

    protected abstract void forceUpdateKosten();

    protected abstract floatsuper getBedingungsTester();

    protected abstract List<Object> getErlaubteTSTalente();

    protected abstract List<Object> getErlaubteZSTalente();

    protected abstract int getKostenTalentSpezialisierung(K var1);

    protected abstract D getLernMethode(P var1);

    protected abstract List<Object> getMoeglicheLehrmeisterArten(P var1);

    protected abstract JPanel getPanelFuePanelSpalte(Object var1);

    protected abstract Settings getSetting();

    protected abstract String getToolTipFuerPanelSpalte(Object var1);

    protected abstract KategorienArrayList<P> getVListe();

    protected abstract boolean isSE(P var1);

    protected abstract void setLernMethode(P var1, D var2);

    protected abstract void setSE(P var1, boolean var2);

    protected abstract void update();

    protected abstract void updateKosten();

    private int new(int n) {
        P p2 = this.get(n);
        return this.getAPKosten(p2);
    }

    protected int getAPKosten(P p2) {
        if (p2 == null) {
            return 9999;
        }
        if (p2 instanceof K) {
            K k2 = this.getTS(p2);
            if (k2 == null) {
                return 0;
            }
            return this.getKostenTalentSpezialisierung(k2);
        }
        if (p2 instanceof void) {
            void void_ = (void)p2;
            Q q = (Q)this.classString.get(p2);
            return void_.return(q.\u00d8\u00d30000());
        }
        return p2.o\u00d20000();
    }

    private int o00000(int n) {
        P p2 = this.get(n);
        if (p2 == null) {
            return 9999;
        }
        if (p2 instanceof K) {
            K k2 = this.getTS(p2);
            return this.getKostenTalentSpezialisierung(k2);
        }
        if (p2 instanceof void) {
            void void_ = (void)p2;
            Q q = (Q)this.classString.get(p2);
            return void_.return(q.\u00d8\u00d30000());
        }
        return p2.newnew();
    }

    private void \u00f500000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 35, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                P p2 = TabDefSonderfertigkeiten.this.o00000(object);
                if (p2 != null) {
                    TabDefSonderfertigkeiten.this.addSonderfertigkeit(p2);
                    TabDefSonderfertigkeiten.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                return TabDefSonderfertigkeiten.this.get(n);
            }
        });
    }

    private void return(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("AP", 50, false, String.class){

            @Override
            public Object getData(int n) {
                return TabDefSonderfertigkeiten.this.new(n);
            }
        });
    }

    private void if(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("Kosten", 50, false, String.class){

            @Override
            public Object getData(int n) {
                int n2 = TabDefSonderfertigkeiten.this.new(n);
                Integer n3 = HeldenMath.durchFuenfzig(n2);
                if (n3 == 0 && n2 > 0) {
                    n3 = 1;
                }
                return n2 + " AP / " + n3 + " GP";
            }
        });
    }

    private void \u00d500000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("Kosten", 50, false, String.class){

            @Override
            public Object getData(int n) {
                int n2 = TabDefSonderfertigkeiten.this.o00000(n);
                return n2 + " AP";
            }
        });
    }

    private void \u00f400000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("Lernmethode", 90, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                D d2 = TabDefSonderfertigkeiten.this.getLernMethode((P)object);
                if (object2.equals(d2)) {
                    return;
                }
                TabDefSonderfertigkeiten.this.setLernMethode((P)object, (D)object2);
                TabDefSonderfertigkeiten.this.forceUpdateKosten();
                TabDefSonderfertigkeiten.this.update();
            }

            @Override
            public Object getData(int n) {
                P p2 = TabDefSonderfertigkeiten.this.get(n);
                if (TabDefSonderfertigkeiten.this.getMoeglicheLehrmeisterArten(p2).size() == 0) {
                    return null;
                }
                return p2;
            }

            @Override
            public List<Object> getItems(Object object) {
                return TabDefSonderfertigkeiten.this.getMoeglicheLehrmeisterArten((P)object);
            }

            @Override
            public Object selectedItem(Object object) {
                return TabDefSonderfertigkeiten.this.getLernMethode((P)object);
            }
        });
    }

    private void \u00d800000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 25, false, voidsuper.class, SpaltenDefinition.ART.null, ""){

            @Override
            public Object getData(int n) {
                return TabDefSonderfertigkeiten.this.get(n);
            }

            @Override
            public JPanel getPanel(Object object) {
                return TabDefSonderfertigkeiten.this.getPanelFuePanelSpalte(object);
            }

            @Override
            public String getToolTip(int n) {
                return TabDefSonderfertigkeiten.this.getToolTipFuerPanelSpalte(TabDefSonderfertigkeiten.this.get(n));
            }
        });
    }

    private P o00000(P p2) {
        try {
            if (p2 instanceof K) {
                K k2 = (K)this.getTS(p2).clone();
                return k2;
            }
            if (p2 instanceof F) {
                Q q = (Q)this.classString.get(p2);
                Q q2 = (Q)q.clone();
                return q2;
            }
            P p3 = (P)this.classString.get(p2);
            if (p3 != null) {
                return p3;
            }
            return p2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
            return null;
        }
    }

    private P o00000(Object object) {
        boolean bl;
        Q<R> q = this.o00000((P)object);
        if (q == null) {
            return null;
        }
        if (q instanceof K) {
            K k2 = (K)((Object)q);
            if (k2.\u00f5\u00d20000().equals("<Eigene Eingabe>") || k2.\u00f5\u00d20000().equalsIgnoreCase("DUMMY")) {
                String string = (String)JOptionPane.showInputDialog(null, "Bitte Spezialisierung angeben (min 3, max 14 Zeichen): ", "Variantenwahl", -1, null, null, null);
                if (string == null || string.length() < 3 || string.length() > 14) {
                    return null;
                }
                k2.\u00d400000(string);
            }
            this.classString.remove(this.\u00d4\u00d50000);
            this.classString.remove(this.\u00d6\u00d50000);
            return k2;
        }
        boolean bl2 = bl = this.\u00d8\u00d50000.equals((Object)GuiModus.\u00d800000) || this.\u00d8\u00d50000.equals((Object)GuiModus.new);
        if (q instanceof Q) {
            void void_ = ((Q)q).\u00d4\u00d30000();
            floatsuper floatsuper2 = this.getBedingungsTester();
            if (void_ instanceof a_0) {
                Q<R> q2 = void_.\u00d300000(((Q)q).\u00d8\u00d30000());
                if (bl && !this.getBedingungsTester().Object(q2.\u00f5o0000())) {
                    JOptionPane.showMessageDialog(null, "Die Bedinungen sind nicht erf\u00fcllt:\n" + q2.\u00f5o0000().toString(), "Bedingungen", 0);
                    return null;
                }
                q = WaffenmeisterDialog.show(q2);
                if (q == null) {
                    return null;
                }
            } else if (void_ instanceof F) {
                Q q3 = q;
                String string = ((F)q3.\u00d4\u00d30000()).o00000((R)q3.\u00d8\u00d30000(), floatsuper2, bl);
                if (string != null) {
                    JOptionPane.showMessageDialog(null, string, q3.\u00d4\u00d30000().\u00f500000(), 0);
                    return null;
                }
            } else {
                Q q4 = q;
                if (bl && !this.getBedingungsTester().Object(q4.\u00f5o0000())) {
                    JOptionPane.showMessageDialog(null, "<html><body>Die Bedinungen sind nicht erf\u00fcllt:<br>" + q4.\u00f5o0000().toStringFormatiertHTML(), "Bedingungen", 0);
                    return null;
                }
            }
        }
        ((P)q).new(this.getAPKosten((P)object));
        return q;
    }

    private void o00000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("SE", 10, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

            @Override
            public Object getData(int n) {
                return TabDefSonderfertigkeiten.this.get(n);
            }

            @Override
            public boolean getSelected(Object object) {
                return TabDefSonderfertigkeiten.this.isSE((P)object);
            }

            @Override
            public String getToolTip(int n) {
                return TabDefSonderfertigkeiten.this.getStringForToolTip(n);
            }

            @Override
            public void selected(Object object, boolean bl) {
                P p2 = (P)object;
                if (TabDefSonderfertigkeiten.this.isSE(p2) != bl) {
                    TabDefSonderfertigkeiten.this.setSE(p2, bl);
                    TabDefSonderfertigkeiten.this.update();
                }
            }
        });
    }

    private void \u00d300000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 140, false, String.class){

            @Override
            public Object getData(int n) {
                P p2 = TabDefSonderfertigkeiten.this.get(n);
                if (p2 == null) {
                    return null;
                }
                if (p2 instanceof K) {
                    if (!((K)p2).o\u00d30000().istZauber()) {
                        return "Talentspezialisierung";
                    }
                    return "Zauberspezialisierung";
                }
                return p2.\u00f500000();
            }
        });
    }

    private void \u00f800000(ArrayList<SpaltenDefinition> arrayList) {
        for (int i2 = 0; i2 < 3; ++i2) {
            arrayList.add(new TabDefSonderfertigkeitenTupelASFSpalten(this, i2));
        }
    }

    private void new(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 10, false, voidsuper.class, SpaltenDefinition.ART.null, ""){

            @Override
            public Object getData(int n) {
                return TabDefSonderfertigkeiten.this.get(n);
            }

            @Override
            public JPanel getPanel(Object object) {
                JPanel jPanel = new JPanel();
                P p2 = (P)object;
                int n = 0;
                jPanel.setLayout(new GridBagLayout());
                if (TabDefSonderfertigkeiten.this.istVerbilligt(p2)) {
                    jPanel.add((Component)new JLabel(IconFactory.getIconVerbilligt()), TabDefSonderfertigkeiten.this.getConstraints(n++, 0, 1));
                }
                return jPanel;
            }

            @Override
            public String getToolTip(int n) {
                return TabDefSonderfertigkeiten.this.getStringForToolTip(n);
            }
        });
    }

    private void \u00d400000(ArrayList<SpaltenDefinition> arrayList) {
        arrayList.add(new SpaltenDefinition("", 40, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "vSf"){

            @Override
            public void click(Object object) {
                P p2 = TabDefSonderfertigkeiten.this.o00000(object);
                if (p2 != null) {
                    TabDefSonderfertigkeiten.this.addVerbilligtesSonderfertigkeit(p2);
                    TabDefSonderfertigkeiten.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                return TabDefSonderfertigkeiten.this.get(n);
            }
        });
    }
}

