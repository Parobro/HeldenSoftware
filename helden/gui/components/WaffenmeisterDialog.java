/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.framework.D.Q;
import helden.framework.D.oOOO.B;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo.oooo_4;
import helden.framework.oooo.s_0;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class WaffenmeisterDialog
extends ZweiTabellenZustand {
    private static JDialog \u00d3\u00d30000;
    private JPanel intnew;
    private Q<R> \u00d4\u00d30000;
    private Q<R> \u00f8\u00d20000 = null;
    private ArrayList<R> \u00f6\u00d20000 = new ArrayList();
    private ArrayList<oooo_4> donew;
    private HashMap<oooo_4, Object> interfacenew = new HashMap();
    private HashMap<oooo_4, String> \u00d6\u00d30000 = new HashMap();
    private JLabel \u00d2\u00d30000;
    private JButton O\u00d30000;

    public static Q<R> show(Q<R> q) {
        WaffenmeisterDialog waffenmeisterDialog = new WaffenmeisterDialog(null, q);
        \u00d3\u00d30000 = new JDialog();
        \u00d3\u00d30000.setTitle(q.\u00d8\u00d30000().toString());
        \u00d3\u00d30000.setName("Steigern");
        \u00d3\u00d30000.getContentPane().add(waffenmeisterDialog.getPanel());
        \u00d3\u00d30000.setSize(770, 600);
        Utils.zentriere(\u00d3\u00d30000);
        \u00d3\u00d30000.setModal(true);
        \u00d3\u00d30000.setVisible(true);
        return waffenmeisterDialog.\u00f8\u00d20000;
    }

    public WaffenmeisterDialog(A a2, Q<R> q) {
        super(null);
        this.\u00d4\u00d30000 = q;
        R r = (R)this.\u00d4\u00d30000.\u00d8\u00d30000().o00000(0);
        E e = (E)r.o00000(1);
        s_0 s_02 = e.getKategorie(false);
        R r2 = new R(new Object[]{oooo_4.\u00f800000, oooo_4.\u00f800000.\u00d200000(s_02), s_02, "", oooo_4.\u00f800000.o00000(s_02)});
        r2.o00000(new B());
        this.\u00f6\u00d20000.add(r2);
        if (!e.o\u00d80000()) {
            r2 = new R(new Object[]{oooo_4.do, null, null, "", oooo_4.do.o00000((Object)null)});
            r2.o00000(new B());
            this.\u00f6\u00d20000.add(r2);
        }
        this.donew = oooo_4.o00000(e);
        this.forsuper();
        this.\u00d8o0000();
        this.\u00d5o0000();
        this.createPanel();
    }

    public oooo_4 get(int n) {
        return this.donew.get(n);
    }

    @Override
    public JPanel getPanel() {
        this.intnew = new JPanel();
        this.intnew.setLayout(new BorderLayout());
        this.intnew.add((Component)super.getPanel(), "Center");
        this.O\u00d30000 = new JButton("OK");
        this.O\u00d30000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WaffenmeisterDialog.this.O\u00d30000.setEnabled(false);
                R r = new R(WaffenmeisterDialog.this.\u00f6\u00d20000.size() + 2);
                for (int i2 = 0; i2 < WaffenmeisterDialog.this.\u00f6\u00d20000.size(); ++i2) {
                    r.\u00d200000(i2 + 2, WaffenmeisterDialog.this.\u00f6\u00d20000.get(i2));
                }
                R r2 = (R)((R)WaffenmeisterDialog.this.\u00d4\u00d30000.\u00d8\u00d30000()).o00000(0);
                r.\u00d200000(0, r2.o00000(0));
                r.\u00d200000(1, r2.o00000(1));
                WaffenmeisterDialog.this.\u00f8\u00d20000 = WaffenmeisterDialog.this.\u00d4\u00d30000.\u00d4\u00d30000().\u00d300000(r);
                \u00d3\u00d30000.setVisible(false);
            }
        });
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        this.\u00d2\u00d30000 = new JLabel("Verf\u00fcgbare Punkte: ");
        jPanel.add(this.\u00d2\u00d30000);
        jPanel.add(this.O\u00d30000);
        this.intnew.add((Component)jPanel, "South");
        this.updateKosten();
        return this.intnew;
    }

    public Object getUnten(int n) {
        return this.\u00f6\u00d20000.get(n);
    }

    public void updateKosten() {
        int n = 0;
        for (R r : this.\u00f6\u00d20000) {
            n += ((Integer)r.o00000(4)).intValue();
        }
        this.\u00d2\u00d30000.setText("Verf\u00fcgbare Punkte: " + (15 - n));
        this.O\u00d30000.setEnabled(n <= 15);
    }

    private void forsuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return WaffenmeisterDialog.this.\u00f6\u00d20000.size();
            }
        };
        tabellenDefinition.setGlobalname("");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Name", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return WaffenmeisterDialog.this.\u00f6\u00d20000.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return ((R)WaffenmeisterDialog.this.\u00f6\u00d20000.get(n)).o00000(4);
            }
        });
        arrayList.add(new SpaltenDefinition("", 26, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                WaffenmeisterDialog.this.\u00f6\u00d20000.remove(object);
                WaffenmeisterDialog.this.updateKosten();
                WaffenmeisterDialog.this.update();
            }

            @Override
            public Object getData(int n) {
                R r = (R)WaffenmeisterDialog.this.getUnten(n);
                if (WaffenmeisterDialog.this.donew.contains(r.o00000(0))) {
                    return r;
                }
                return null;
            }
        });
        this.setTabDef(2, tabellenDefinition);
    }

    private void \u00d5o0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){
            JPanel floatclass;

            @Override
            public int getAnzahl() {
                return 1;
            }

            @Override
            public JPanel getPanel() {
                if (this.floatclass == null) {
                    this.floatclass = new JPanel();
                    this.floatclass.setLayout(new BorderLayout());
                    this.floatclass.add((Component)new TextAreaWithHyperlinkSupport("<html><body>Die Eigenschaftsvoraussetzungen sind selber zu pr\u00fcfen!<br>Bei der Auswahl sind die Bedingungen der Waffenmeisterschaft zu beachten.<br>Die Einhaltung dieser Bedingungen wird nicht erzwungen."), "Center");
                }
                return this.floatclass;
            }

            @Override
            public String getTabname() {
                return "Hinweis Viertelzauberer";
            }

            @Override
            public boolean isHideWennLeer() {
                return true;
            }
        };
        this.setTabDef(3, tabellenDefinition);
    }

    private void \u00d8o0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return WaffenmeisterDialog.this.donew.size();
            }
        };
        tabellenDefinition.setGlobalname("");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Name", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return WaffenmeisterDialog.this.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Auswahl", 180, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                Object v = WaffenmeisterDialog.this.interfacenew.get(object);
                if (v == null || !v.equals(object2)) {
                    WaffenmeisterDialog.this.interfacenew.put((oooo_4)((Object)object), object2);
                    WaffenmeisterDialog.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                oooo_4 oooo_42 = WaffenmeisterDialog.this.get(n);
                if (oooo_42.o00000().size() == 0) {
                    return null;
                }
                return WaffenmeisterDialog.this.get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                return ((oooo_4)((Object)object)).o00000();
            }

            @Override
            public Object selectedItem(Object object) {
                return WaffenmeisterDialog.this.interfacenew.get(object);
            }
        });
        arrayList.add(new SpaltenDefinition("Beschreibung", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public Object getData(int n) {
                return WaffenmeisterDialog.this.get(n);
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                oooo_4 oooo_42 = WaffenmeisterDialog.this.get(n);
                if (oooo_42.\u00d300000()) {
                    return SpaltenDefinition.ART.\u00f500000;
                }
                return SpaltenDefinition.ART.\u00d800000;
            }

            @Override
            public String getText(int n) {
                return "";
            }

            @Override
            public void setText(Object object, String string) {
                WaffenmeisterDialog.this.\u00d6\u00d30000.put((oooo_4)((Object)object), string);
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 180, false, String.class){

            @Override
            public Object getData(int n) {
                oooo_4 oooo_42 = WaffenmeisterDialog.this.get(n);
                Object v = WaffenmeisterDialog.this.interfacenew.get((Object)oooo_42);
                return oooo_42.o00000(v);
            }
        });
        arrayList.add(new SpaltenDefinition("", 26, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                oooo_4 oooo_42 = (oooo_4)((Object)object);
                Object v = WaffenmeisterDialog.this.interfacenew.get(object);
                R r = new R(new Object[]{oooo_42, oooo_42.\u00d200000(v), this.o00000(WaffenmeisterDialog.this.interfacenew.get(object), ""), this.o00000(WaffenmeisterDialog.this.\u00d6\u00d30000.get(object), ""), oooo_42.o00000(v)});
                r.o00000(new B());
                WaffenmeisterDialog.this.\u00f6\u00d20000.add(r);
                WaffenmeisterDialog.this.updateKosten();
                WaffenmeisterDialog.this.update();
            }

            @Override
            public Object getData(int n) {
                return WaffenmeisterDialog.this.get(n);
            }

            private Object o00000(Object object, Object object2) {
                if (object != null) {
                    return object;
                }
                return object2;
            }
        });
        this.setTabDef(1, tabellenDefinition);
    }
}

