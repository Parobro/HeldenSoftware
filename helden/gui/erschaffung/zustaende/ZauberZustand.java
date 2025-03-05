/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.C.I;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Stringsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Setting;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.icons.IconFactory;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ZauberZustand
extends ZweiTabellenZustand {
    public ZauberZustand(HEW2 hEW2) {
        super(hEW2);
    }

    public String getBeschreibungOben() {
        return "Nicht aktivierte Talente:";
    }

    public String getBeschreibungUnten() {
        return "Aktivierte Talente:";
    }

    @Override
    public String getBezeichner() {
        return "Zauber";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        ArrayList<Hinweis> arrayList = this.super.getHswZauber().pruefe();
        return arrayList;
    }

    @Override
    public String getHelp() {
        String string = "";
        string = string + "<html>";
        if (this.super.getHswZauber().isHatVerrechnungpunkte()) {
            string = string + "Mit den Verrechnungspunkten d\u00fcrfen " + this.super.getHswZauber().getVrAktivierbareZauber() + " Zauber aktiviert werden, aus denen " + this.super.getHswZauber().getVrHauszauber() + " Hauszauber ausgew\u00e4hlt werden " + "k\u00f6nnen. ";
            if (this.super.getHswZauber().getVrLeitzauber() > 0 && this.super.getHeld().o00000(I.newreturn)) {
                string = string + this.super.getHswZauber().getVrLeitzauber() + " Zauber, die nicht automatisch Leitzauber werden, " + "d\u00fcrfen zu Leitzaubern erkl\u00e4rt werden.";
            }
            string = string + "<p>Zauber, die mit Verrechnungspunkte gesteigert werden sollen, m\u00fcssen in der VR-Spalte markiert werden, Hauszauber in der HZ-Spalte.<bt>";
        }
        if (this.super.getSetting().getHauptSetting().equals((Object)Setting.\u00f8O0000)) {
            string = string + "Namen und Beschreibungen k\u00f6nnen f\u00fcr die Zauber nach der Erschaffung \u00fcber die Kommentarfunktion vergeben werden!";
        }
        return string;
    }

    @Override
    public void init() {
        this.\u00d4\u00d20000();
        this.\u00d5\u00d20000();
        this.returnnew();
        this.createPanel();
    }

    @Override
    public boolean isActive() {
        boolean bl = this.super.getPhase() == HEW2.PHASEN.super && this.super.getHeld().oo0000();
        return bl;
    }

    private KonkreterZauber o00000(int n) {
        return this.super.getHswZauber().getAktivierteTalente().get(n);
    }

    private GridBagConstraints o00000(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }

    private String o00000(Zauber zauber) {
        Object object = zauber.getVarianten() == null ? JOptionPane.showInputDialog(this.getPanel(), "Bitte Variante f\u00fcr den Zauber angeben: ", "Variantenwahl", -1, null, null, null) : JOptionPane.showInputDialog(this.getPanel(), "W\u00e4hle eine Variante", "Variantenwahl", -1, null, zauber.getVarianten().toArray(), null);
        if (object == null || object.equals("")) {
            return null;
        }
        return object.toString();
    }

    private void \u00d5\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){
            private JPanel \u00f4\u00f40000;

            @Override
            public int getAnzahl() {
                if (ZauberZustand.this.super.getHeld().o00000(I.\u00d5\u00d3O000) && !ZauberZustand.this.super.getSetting().getHauptSetting().equals((Object)Setting.\u00f600000)) {
                    return 1;
                }
                return 0;
            }

            @Override
            public JPanel getPanel() {
                if (this.\u00f4\u00f40000 == null) {
                    if (ZauberZustand.this.super.getHeld().o00000(I.\u00d5\u00d3O000) && !ZauberZustand.this.super.getSetting().getHauptSetting().equals((Object)Setting.\u00f600000)) {
                        this.\u00f4\u00f40000 = new JPanel();
                        this.\u00f4\u00f40000.setLayout(new BorderLayout());
                        this.\u00f4\u00f40000.add((Component)new TextAreaWithHyperlinkSupport("<html><body>Zauber beim Viertelzauberer m\u00fcssen \u00fcber den<br> Vorteil \u00dcbernat\u00fcrliche Begabungen aktiviert werden!"), "Center");
                    } else {
                        this.\u00f4\u00f40000 = new JPanel();
                    }
                }
                return this.\u00f4\u00f40000;
            }

            @Override
            public String getTabname() {
                return "Hinweis Viertelzauberer";
            }

            @Override
            public Integer getWeightY() {
                if (ZauberZustand.this.super.getHeld().o00000(I.\u00d5\u00d3O000) && !ZauberZustand.this.super.getSetting().getHauptSetting().equals((Object)Setting.\u00f600000)) {
                    return 10;
                }
                return 0;
            }

            @Override
            public boolean isHideWennLeer() {
                return true;
            }
        };
        this.setTabDef(1, tabellenDefinition);
    }

    private void \u00d4\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().size();
            }

            @Override
            public String getTabname() {
                return "Aktiviere Zauber";
            }

            @Override
            public Integer getWeightY() {
                return 10;
            }

            @Override
            public boolean isHideWennLeer() {
                return false;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Zauber", 120, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().get(n).getZaubername();
            }

            @Override
            public String getToolTip(int n) {
                KonkreterZauber konkreterZauber = ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().get(n);
                String string = konkreterZauber.toStringKomplett() + "<br>" + "Komplexit\u00e4t: " + konkreterZauber.getKategorie(true).toString();
                try {
                    string = string + "<br>Lernkomplexit\u00e4t: " + ZauberZustand.this.super.getHeld().\u00d5o0000().super((oo0o_0)konkreterZauber, ZauberZustand.this.super.getHeld(), true).toString();
                }
                catch (Stringsuper stringsuper) {
                    stringsuper.printStackTrace();
                }
                return string;
            }
        });
        arrayList.add(new SpaltenDefinition("Rep", 20, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().get(n).getRep().super();
            }
        });
        arrayList.add(new SpaltenDefinition("Merkmal", 30, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().get(n).getMerkmaleString();
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 20, false, Integer.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierungskosten(ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("", 22, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                KonkreterZauber konkreterZauber = (KonkreterZauber)object;
                if (konkreterZauber.getZauber().hatVarianten()) {
                    String string = ZauberZustand.this.o00000(konkreterZauber.getZauber());
                    if (string == null) {
                        return;
                    }
                    konkreterZauber = KonkreterZauber.getZauber(konkreterZauber.getZaubername(), konkreterZauber.getRep(), string);
                }
                ZauberZustand.this.super.getHswZauber().aktivierte(konkreterZauber);
                ZauberZustand.this.super.getHswZauber().pruefeAufRecalc(konkreterZauber);
                ZauberZustand.this.super.fireUpdate();
                ZauberZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierbareZauber().get(n);
            }
        });
        this.setSpaltenOben(tabellenDefinition);
    }

    private void returnnew() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return ZauberZustand.this.super.getHswZauber().getAktivierteTalente().size();
            }

            @Override
            public String getTabname() {
                return "Gew\u00e4hlte Zauber";
            }

            @Override
            public Integer getWeightY() {
                return 30;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("V", 30, false, voidsuper.class, SpaltenDefinition.ART.null, "X"){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
            }

            @Override
            public JPanel getPanel(Object object) {
                JPanel jPanel = new JPanel();
                KonkreterZauber konkreterZauber = (KonkreterZauber)object;
                int n = 0;
                jPanel.setLayout(new GridBagLayout());
                if (ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000(konkreterZauber)) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconHauszauber()), ZauberZustand.this.o00000(n++, 0, 1));
                }
                if (ZauberZustand.this.super.getHeld().\u00d5o0000().super((oo0o_0)konkreterZauber, ZauberZustand.this.super.getHeld().\u00d500000())) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconLeittalent()), ZauberZustand.this.o00000(n++, 0, 1));
                }
                return jPanel;
            }
        });
        if (this.super.getHswZauber().isHatVerrechnungpunkte()) {
            arrayList.add(new SpaltenDefinition("HZ", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

                @Override
                public Object getData(int n) {
                    KonkreterZauber konkreterZauber = ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
                    return konkreterZauber;
                }

                @Override
                public boolean getSelected(Object object) {
                    return ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000((KonkreterZauber)object);
                }

                @Override
                public void selected(Object object, boolean bl) {
                    if (bl) {
                        ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d300000((KonkreterZauber)object);
                        if (!ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().contains(object)) {
                            ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().add((KonkreterZauber)object);
                        }
                    } else {
                        ZauberZustand.this.super.getHeld().\u00d5o0000().class((KonkreterZauber)object);
                    }
                    ZauberZustand.this.super.getHswZauber().triggerRecalc();
                    ZauberZustand.this.update();
                }
            });
            if (this.super.getHswZauber().getVrLeitzauber() > 0 && this.super.getHeld().o00000(I.newreturn)) {
                arrayList.add(new SpaltenDefinition("LZ", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

                    @Override
                    public Object getData(int n) {
                        KonkreterZauber konkreterZauber = ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
                        return konkreterZauber;
                    }

                    @Override
                    public boolean getSelected(Object object) {
                        return ZauberZustand.this.super.getHeld().\u00d5o0000().super((oo0o_0)object, ZauberZustand.this.super.getHeld().\u00d500000());
                    }

                    @Override
                    public boolean isEnabled(Object object) {
                        return !ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000((oo0o_0)object, ZauberZustand.this.super.getHeld().\u00d500000());
                    }

                    @Override
                    public void selected(Object object, boolean bl) {
                        if (!ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000((oo0o_0)object, ZauberZustand.this.super.getHeld().\u00d500000())) {
                            if (bl) {
                                ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000((oo0o_0)object);
                                if (!ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().contains(object)) {
                                    ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().add((KonkreterZauber)object);
                                }
                            } else {
                                ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d300000((oo0o_0)((KonkreterZauber)object));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Automatische Leittalente k\u00f6nnen nicht abgew\u00e4hlt werden!", "Automatisches Leittalent", 1);
                        }
                        ZauberZustand.this.super.getHswZauber().triggerRecalc();
                        ZauberZustand.this.update();
                    }
                });
            }
            arrayList.add(new SpaltenDefinition("VR", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

                @Override
                public Object getData(int n) {
                    KonkreterZauber konkreterZauber = ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
                    return konkreterZauber;
                }

                @Override
                public boolean getSelected(Object object) {
                    return ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().contains(object);
                }

                @Override
                public boolean isEnabled(Object object) {
                    return !ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000((KonkreterZauber)object);
                }

                @Override
                public void selected(Object object, boolean bl) {
                    if (bl) {
                        if (!ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().contains(object)) {
                            ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().add((KonkreterZauber)object);
                        }
                    } else {
                        ZauberZustand.this.super.getHswZauber().getVrAktivierteZauber().remove(object);
                        if (!ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d200000((oo0o_0)((KonkreterZauber)object), ZauberZustand.this.super.getHeld().\u00d500000())) {
                            ZauberZustand.this.super.getHeld().\u00d5o0000().\u00d300000((oo0o_0)((KonkreterZauber)object));
                        }
                    }
                    ZauberZustand.this.super.getHswZauber().triggerRecalc();
                    ZauberZustand.this.update();
                }
            });
        }
        arrayList.add(new SpaltenDefinition("Zauber", 120, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.o00000(n).getZaubername();
            }

            @Override
            public String getToolTip(int n) {
                KonkreterZauber konkreterZauber = ZauberZustand.this.o00000(n);
                String string = konkreterZauber.toStringKomplett() + "<br>" + "Komplexit\u00e4t: " + konkreterZauber.getKategorie(true).toString();
                try {
                    string = string + "<br>Lernkomplexit\u00e4t: " + ZauberZustand.this.super.getHeld().\u00d5o0000().super((oo0o_0)konkreterZauber, ZauberZustand.this.super.getHeld(), true).toString();
                }
                catch (Stringsuper stringsuper) {
                    stringsuper.printStackTrace();
                }
                return string;
            }
        });
        arrayList.add(new SpaltenDefinition("Rep", 20, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.o00000(n).getRep().super();
            }
        });
        arrayList.add(new SpaltenDefinition("Variante", 70, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.o00000(n).getVariante();
            }
        });
        arrayList.add(new SpaltenDefinition("Merkmal", 70, false, String.class){

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.o00000(n).getMerkmaleString();
            }
        });
        arrayList.add(new SpaltenDefinition("Wert", 40, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                ZauberZustand.this.super.getHswZauber().veraendereTalentwert((KonkreterZauber)object, n);
                ZauberZustand.this.super.getHswZauber().pruefeAufRecalc((KonkreterZauber)object);
                ZauberZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                return ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
            }

            @Override
            public int getMax(Object object) {
                return ZauberZustand.this.super.getHswZauber().getMaximalWert((oo0o_0)object);
            }

            @Override
            public int getMin(Object object) {
                return ZauberZustand.this.super.getHswZauber().getMinimalwert((oo0o_0)object);
            }

            @Override
            public int getValue(Object object) {
                return ZauberZustand.this.super.getHswZauber().getTalentWert((KonkreterZauber)object);
            }

            @Override
            public boolean isEnabled(Object object) {
                return ZauberZustand.this.super.getHswZauber().darfGesteigertWerden((KonkreterZauber)object);
            }
        });
        String string = "AP";
        if (this.super.getHswZauber().isHatVerrechnungpunkte()) {
            string = string + "/VP";
        }
        arrayList.add(new SpaltenDefinition(string, 20, false, Integer.class){

            @Override
            public Object getData(int n) {
                KonkreterZauber konkreterZauber = ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
                String string = "" + (int)ZauberZustand.this.super.getHeld().o00000((oo0o_0)konkreterZauber, true);
                if (ZauberZustand.this.super.getHswZauber().isHatVerrechnungpunkte()) {
                    string = string + " / " + ZauberZustand.this.super.getHswZauber().getVRkosten(konkreterZauber);
                }
                return string;
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "X"){

            @Override
            public void click(Object object) {
                ZauberZustand.this.super.getHswZauber().deAktivierte((KonkreterZauber)object);
                ZauberZustand.this.super.getHswZauber().triggerRecalc();
                ZauberZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                oo0o_0 oo0o_02 = ZauberZustand.this.super.getHswZauber().getAktivierteTalente().get(n);
                if (ZauberZustand.this.super.getHswZauber().getUserAktivierteTalente().contains(oo0o_02)) {
                    return oo0o_02;
                }
                return null;
            }
        });
        this.setTabDef(2, tabellenDefinition);
    }
}

