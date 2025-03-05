/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.oOoO.oOOO;

import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.object.oooo_1;
import helden.framework.held.oooo_0;
import helden.framework.settings.Settings;
import helden.gui.allgemein.Utils;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import helden.gui.super.oOoO.B.String;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
extends ZweiTabellenZustand {
    private ArrayList<Object> \u00f4\u00d20000;
    private ArrayList<Object> \u00d6\u00d20000;
    private oooo_1 \u00d8\u00d20000;
    private ArrayList<P> classnew;

    public A(oooo_1 oooo_12, String string) {
        super(null);
        this.\u00d8\u00d20000 = oooo_12;
        this.classnew = new ArrayList();
        this.\u00d8\u00d20000.o00000(true);
        this.\u00d4o0000();
        this.Oo0000();
        this.createPanel();
        this.update();
        JDialog jDialog = new JDialog(Utils.getFrame(string), "Sonderfertigkeiten", true);
        jDialog.getContentPane().add(this.o00000(jDialog));
        jDialog.setSize(780, 600);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
    }

    public void new(P p2) {
        try {
            if (!this.classnew.contains(p2) && !this.\u00d8\u00d20000.\u00d800000().\u00f5O0000().\u00d200000(p2.toString())) {
                this.\u00d8\u00d20000.o00000(p2);
                P p3 = (P)p2.clone();
                p3.new(p2.o\u00d20000());
                this.classnew.add(p3);
                this.\u00d8\u00d20000.o00000(true);
            }
        }
        catch (oooo_0 oooo_02) {
            JOptionPane.showMessageDialog(this.\u00d4o0000, "Es stehen nicht gen\u00fcgend AP zur Verf\u00fcgung.", "Zuwenig AP", 1);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            JOptionPane.showMessageDialog(this.\u00d4o0000, "Es stehen nicht gen\u00fcgend AP zur Verf\u00fcgung.", "Zuwenig AP", 1);
        }
        this.update();
    }

    public java.lang.String oo0000() {
        return "Verf\u00fcgbare Sonderfertigkeiten:";
    }

    public java.lang.String nullsuper() {
        return "Gew\u00e4hlte Sonderfertigkeiten:";
    }

    @Override
    public java.lang.String getBezeichner() {
        return "Sonderfertigkeiten";
    }

    public JPanel o00000(final JDialog jDialog) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)super.getPanel(), "Center");
        JButton jButton = new JButton("Ok");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jDialog.setVisible(false);
            }
        });
        jPanel.add((Component)jButton, "South");
        return jPanel;
    }

    public void new(P p2, boolean bl) {
        boolean bl2 = this.\u00d8\u00d20000.\u00d300000().o00000(p2);
        if (bl2 != bl) {
            if (bl) {
                this.\u00d8\u00d20000.\u00d300000().\u00d300000(p2);
            } else {
                this.\u00d8\u00d20000.\u00d300000().String(p2);
            }
            this.\u00d8\u00d20000.o00000(true);
            this.update();
        }
    }

    @Override
    public void update() {
        super.update();
    }

    private void Oo0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        final oooo_1 oooo_12 = this.\u00d8\u00d20000;
        for (int i2 = 0; i2 < TabDefSonderfertigkeiten.\u00d2\u00d50000.length; ++i2) {
            arrayList.add(new TabDefSonderfertigkeiten(i2, GuiModus.\u00d800000){

                @Override
                protected void addSonderfertigkeit(P p2) {
                    A.this.\u00d3o0000();
                    A.this.new(p2);
                }

                @Override
                protected void forceUpdateKosten() {
                    oooo_12.o00000(true);
                }

                @Override
                protected floatsuper getBedingungsTester() {
                    return new floatsuper(oooo_12.\u00d800000());
                }

                @Override
                protected List<Object> getErlaubteTSTalente() {
                    if (A.this.\u00f4\u00d20000 == null) {
                        A.this.\u00f4\u00d20000 = oooo_12.\u00d500000();
                    }
                    return A.this.\u00f4\u00d20000;
                }

                @Override
                protected List<Object> getErlaubteZSTalente() {
                    if (A.this.\u00d6\u00d20000 == null) {
                        A.this.\u00d6\u00d20000 = oooo_12.\u00d600000();
                    }
                    return A.this.\u00d6\u00d20000;
                }

                @Override
                protected int getKostenTalentSpezialisierung(K k2) {
                    OOOo oOOo = new OOOo();
                    oOOo.o00000(k2);
                    oooo_12.o00000(oOOo);
                    return k2.o\u00d20000();
                }

                @Override
                protected D getLernMethode(P p2) {
                    return oooo_12.\u00d300000().\u00d600000(p2);
                }

                @Override
                protected List<Object> getMoeglicheLehrmeisterArten(P p2) {
                    return oooo_12.\u00d500000(p2);
                }

                @Override
                protected JPanel getPanelFuePanelSpalte(Object object) {
                    return null;
                }

                @Override
                protected Settings getSetting() {
                    return oooo_12.\u00d800000().oO0000();
                }

                @Override
                protected java.lang.String getToolTipFuerPanelSpalte(Object object) {
                    return null;
                }

                @Override
                protected KategorienArrayList<P> getVListe() {
                    return oooo_12.o00000(false).o00000(TabDefSonderfertigkeiten.\u00d2\u00d50000);
                }

                @Override
                protected boolean isSE(P p2) {
                    return oooo_12.\u00d300000().o00000(p2);
                }

                @Override
                protected void setLernMethode(P p2, D d2) {
                    D d3 = oooo_12.\u00d300000().\u00d600000(p2);
                    if (d2.equals(d3)) {
                        return;
                    }
                    oooo_12.\u00d300000().o00000(p2, d2);
                    this.update();
                }

                @Override
                protected void setSE(P p2, boolean bl) {
                    boolean bl2 = oooo_12.\u00d300000().o00000(p2);
                    if (bl2 != bl) {
                        if (bl) {
                            oooo_12.\u00d300000().\u00d300000(p2);
                        } else {
                            oooo_12.\u00d300000().String(p2);
                        }
                        oooo_12.o00000(true);
                        this.update();
                    }
                }

                @Override
                protected void update() {
                    A.this.update();
                }

                @Override
                protected void updateKosten() {
                    oooo_12.o00000(true);
                    this.update();
                }
            });
            arrayList.get(i2).setTabname(TabDefSonderfertigkeiten.\u00d2\u00d50000[i2]);
            arrayList.get(i2).setGlobalname("M\u00f6gliche Sonderfertigkeiten:");
            arrayList.get(i2).setHideWennLeer(true);
        }
        this.setSpaltenOben(arrayList);
    }

    private void \u00d4o0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return A.this.classnew.size();
            }
        };
        tabellenDefinition.setGlobalname("Gew\u00e4hlte Sonderfertigkeiten:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 180, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return A.this.classnew.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 60, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return "" + ((P)A.this.classnew.get(n)).o\u00d20000();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                if (A.this.\u00d8\u00d20000.\u00d800000().if().o00000().\u00f500000().equals(object.toString())) {
                    A.this.\u00d8\u00d20000.\u00d800000().if().\u00d200000();
                    A.this.classnew.remove(object);
                    A.this.\u00d3o0000();
                    A.this.\u00d8\u00d20000.o00000(true);
                    A.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                if (n + 1 == A.this.classnew.size()) {
                    return A.this.classnew.get(n);
                }
                return null;
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
        tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 0;
            }
        };
        arrayList = tabellenDefinition.getSpaltenDefinition();
        ArrayList<TabellenDefinition> arrayList2 = new ArrayList<TabellenDefinition>();
        arrayList2.add(tabellenDefinition);
        arrayList2.add(tabellenDefinition);
        this.setSpaltenOben(arrayList2);
    }

    private void \u00d3o0000() {
        this.\u00f4\u00d20000 = null;
        this.\u00d6\u00d20000 = null;
    }
}

