/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.icons.IconFactory;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class TalenteZustand
extends ZweiTabellenZustand {
    public TalenteZustand(HEW2 hEW2) {
        super(hEW2);
        this.o\u00d20000();
        this.newnew();
        this.createPanel();
    }

    @Override
    public String getBezeichner() {
        return "Talente";
    }

    public GridBagConstraints getConstraints(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        if (!this.isActive()) {
            return null;
        }
        ArrayList<Hinweis> arrayList = this.super.getTalente().pruefe();
        return arrayList;
    }

    @Override
    public String getHelp() {
        return super.getHelp();
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.super;
    }

    @Override
    public void wirdJetztDargstellt() {
        this.super.setTalentTabErreicht();
        this.\u00d8o0000.update(false);
    }

    private String o00000(oo0o_0 oo0o_02) {
        String string = "Rasse: <br>&nbsp;&nbsp; Fest: " + this.super.getRasse().getTalente().Object(oo0o_02) + "<br>&nbsp;&nbsp; Wahl: " + this.super.getRasse().getWahlWert0(oo0o_02) + "<br>Kultur: " + "<br>&nbsp;&nbsp; Fest: " + this.super.getKultur().getTalente().Object(oo0o_02) + "<br>&nbsp;&nbsp; Wahl: " + this.super.getKultur().getWahlWert0(oo0o_02) + "<br>Profession: " + "<br>&nbsp;&nbsp; Fest: " + this.super.getHauptProfession().getTalente().Object(oo0o_02) + "<br>&nbsp;&nbsp; Wahl: " + this.super.getHauptProfession().getWahlWert0(oo0o_02) + "<br><br>Gesamt-Wahl: " + this.super.getHswAuswahlen().getWahlWert(oo0o_02);
        if (this.super.isBGB()) {
            string = string + "<br>BGB: " + this.super.getBGBProfession().getTalente().Object(oo0o_02);
        }
        string = string + "<br><br>Komplexit\u00e4t: " + oo0o_02.getKategorie(true).toString() + "<br>Lernkomplexit\u00e4t: " + this.super.getHeld().new(oo0o_02, true) + "<br><br>Talentwert: " + this.super.getHeld().\u00f8O0000().\u00d800000((voidsuper)oo0o_02);
        return string;
    }

    private void o\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return TalenteZustand.this.super.getTalente().getNichtAktivierteTalente().size();
            }
        };
        tabellenDefinition.setGlobalname("Nicht aktivierte Talente:");
        tabellenDefinition.setTabname("Nicht aktivierte Talente:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 12, false, voidsuper.class, SpaltenDefinition.ART.null, ""){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getNichtAktivierteTalente().get(n);
            }

            @Override
            public JPanel getPanel(Object object) {
                JPanel jPanel = new JPanel();
                voidsuper voidsuper2 = (voidsuper)object;
                int n = 0;
                jPanel.setLayout(new GridBagLayout());
                if (voidsuper2.\u00f5\u00d60000()) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconBasis()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                if (TalenteZustand.this.super.isBGB() && TalenteZustand.this.super.getTalente().getMaximaleBGBTalentPunkte(voidsuper2) > 0) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconBGB()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                if (TalenteZustand.this.super.isVeteran() && TalenteZustand.this.super.getTalente().isVeteranTalent(voidsuper2)) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconVeteran()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                if (TalenteZustand.this.super.getHeld().\u00f8O0000().super((oo0o_0)voidsuper2, TalenteZustand.this.super.getHeld().\u00d500000())) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconLeittalent()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                jPanel.setToolTipText("");
                return jPanel;
            }

            @Override
            public String getToolTip(int n) {
                String string = "<html><body>";
                voidsuper voidsuper2 = (voidsuper)this.getData(n);
                if (voidsuper2.\u00f5\u00d60000()) {
                    string = string + "Basistalent<br>";
                }
                if (TalenteZustand.this.super.isBGB() && TalenteZustand.this.super.getTalente().getMaximaleBGBTalentPunkte(voidsuper2) > 0) {
                    string = string + "teilweise mit BGB-Punkten steigerbar<br>";
                }
                if (TalenteZustand.this.super.isVeteran() && TalenteZustand.this.super.getTalente().isVeteranTalent(voidsuper2)) {
                    string = string + "teilweise mit Veteran-Punkten steigerbar<br>";
                }
                if (TalenteZustand.this.super.getHeld().\u00f8O0000().super((oo0o_0)voidsuper2, TalenteZustand.this.super.getHeld().\u00d500000())) {
                    string = string + "Leittalent";
                }
                return string;
            }
        });
        arrayList.add(new SpaltenDefinition("Talentname", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getNichtAktivierteTalente().get(n).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Kategorie", 80, false, String.class){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getNichtAktivierteTalente().get(n).getArt().toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 20, false, Integer.class){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getAktivierungskosten(TalenteZustand.this.super.getTalente().getNichtAktivierteTalente().get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("", 22, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                TalenteZustand.this.super.getTalente().aktivierte((voidsuper)object);
                TalenteZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getNichtAktivierteTalente().get(n);
            }
        });
        this.setSpaltenOben(tabellenDefinition);
    }

    private void newnew() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return TalenteZustand.this.super.getTalente().getAktivierteTalente().size();
            }
        };
        tabellenDefinition.setTabname("Automatische und aktivierte Talente:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 30, false, voidsuper.class, SpaltenDefinition.ART.null, ""){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n);
            }

            @Override
            public JPanel getPanel(Object object) {
                JPanel jPanel = new JPanel();
                voidsuper voidsuper2 = (voidsuper)object;
                int n = 0;
                jPanel.setLayout(new GridBagLayout());
                if (voidsuper2.\u00f5\u00d60000() || voidsuper2.equals(TalenteZustand.this.super.getKultur().getSchrift())) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconBasis()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                if (TalenteZustand.this.super.isBGB() && TalenteZustand.this.super.getTalente().getMaximaleBGBTalentPunkte(voidsuper2) > 0) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconBGB()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                if (TalenteZustand.this.super.isVeteran() && TalenteZustand.this.super.getTalente().isVeteranTalent(voidsuper2)) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconVeteran()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                if (TalenteZustand.this.super.getHeld().\u00f8O0000().super((oo0o_0)voidsuper2, TalenteZustand.this.super.getHeld().\u00d500000())) {
                    jPanel.add((Component)IconFactory.getLabel(IconFactory.getIconLeittalent()), TalenteZustand.this.getConstraints(n++, 0, 1));
                }
                return jPanel;
            }
        });
        arrayList.add(new SpaltenDefinition("Talentname", 140, false, String.class){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n).toString();
            }

            @Override
            public String getToolTip(int n) {
                oo0o_0 oo0o_02 = TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n);
                return TalenteZustand.this.o00000(oo0o_02);
            }
        });
        arrayList.add(new SpaltenDefinition("Kategorie", 70, false, String.class){

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n).getArt().toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Wert", 20, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                TalenteZustand.this.super.getTalente().veraendereTalentwert((voidsuper)object, n);
                TalenteZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                return TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n);
            }

            @Override
            public int getMax(Object object) {
                return TalenteZustand.this.super.getTalente().getMaximalWert((oo0o_0)object);
            }

            @Override
            public int getMin(Object object) {
                return TalenteZustand.this.super.getTalente().getMinimalwert((oo0o_0)object);
            }

            @Override
            public String getToolTip(int n) {
                oo0o_0 oo0o_02 = TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n);
                return TalenteZustand.this.o00000(oo0o_02);
            }

            @Override
            public int getValue(Object object) {
                return TalenteZustand.this.super.getTalente().getTalentWert((oo0o_0)object);
            }

            @Override
            public boolean isEnabled(Object object) {
                return TalenteZustand.this.super.getTalente().darfGesteigertWerden((oo0o_0)object);
            }
        });
        arrayList.add(new SpaltenDefinition("AP", 20, false, Integer.class){

            @Override
            public Object getData(int n) {
                return (int)TalenteZustand.this.super.getHeld().o00000(TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n), true);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "X"){

            @Override
            public void click(Object object) {
                TalenteZustand.this.super.getTalente().deAktivierte((oo0o_0)object);
                TalenteZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                oo0o_0 oo0o_02 = TalenteZustand.this.super.getTalente().getAktivierteTalente().get(n);
                if (!TalenteZustand.this.super.getTalente().isAutoTalent(oo0o_02)) {
                    return oo0o_02;
                }
                return null;
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
    }
}

