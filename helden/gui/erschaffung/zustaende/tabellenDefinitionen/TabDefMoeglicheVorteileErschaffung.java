/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende.tabellenDefinitionen;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.C.void;
import helden.framework.OoOO.voidsuper;
import helden.framework.settings.Settings;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefMoeglicheVorteile;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.VorteilZustand;
import helden.gui.icons.IconFactory;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TabDefMoeglicheVorteileErschaffung
extends TabDefMoeglicheVorteile {
    private HEW2 publicObject;
    private int \u00f4\u00d40000;
    private VorteilZustand \u00f6\u00d40000;

    public TabDefMoeglicheVorteileErschaffung(int n, HEW2 hEW2, VorteilZustand vorteilZustand) {
        super(GuiModus.new, hEW2.getBt());
        this.publicObject = hEW2;
        this.\u00f4\u00d40000 = n;
        this.\u00f6\u00d40000 = vorteilZustand;
        this.createFirstSpalte();
        this.createSpalten();
    }

    @Override
    public void addVorteil(public public_) {
        this.publicObject.getHswVorteile().addVorteil(public_);
        if (this.publicObject.getHswVorteile().needRecalc(public_) || public_ instanceof D || public_ instanceof void) {
            this.publicObject.recalc();
        }
        this.update();
    }

    public void createFirstSpalte() {
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 25, false, voidsuper.class, SpaltenDefinition.ART.null, ""){

            @Override
            public Object getData(int n) {
                return TabDefMoeglicheVorteileErschaffung.this.getVorteilFuerZeile(n);
            }

            @Override
            public JPanel getPanel(Object object) {
                JPanel jPanel = new JPanel();
                public public_ = (public)object;
                int n = 0;
                jPanel.setLayout(new GridBagLayout());
                if (!TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getVorteilsBemerkung(public_).equals("")) {
                    jPanel.add((Component)new JLabel(IconFactory.getIconWarnung()), TabDefMoeglicheVorteileErschaffung.this.getConstraints(n++, 0, 1));
                }
                if (TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getEmpfohlen().contains(public_)) {
                    jPanel.add((Component)new JLabel(IconFactory.getIconEmpfohlen()), TabDefMoeglicheVorteileErschaffung.this.getConstraints(n++, 0, 1));
                }
                if (TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getUngeeignet().contains(public_.\u00f4O0000())) {
                    jPanel.add((Component)new JLabel(IconFactory.getIconUngeeignet()), TabDefMoeglicheVorteileErschaffung.this.getConstraints(n++, 0, 1));
                }
                return jPanel;
            }

            @Override
            public String getToolTip(int n) {
                public public_ = TabDefMoeglicheVorteileErschaffung.this.getVorteilFuerZeile(n);
                String string = TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getVorteilsBemerkung(public_);
                if (!string.equals("")) {
                    string = string + "<br>";
                }
                if (TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getEmpfohlen().contains(public_)) {
                    string = string + "Vorteil/Nachteil ist empfohlen.<br>";
                }
                if (TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getUngeeignet().contains(public_.\u00f4O0000())) {
                    string = string + "Vorteil/Nachteil ist ungeeignet.<br>";
                    ArrayList arrayList = new ArrayList();
                    if (public_ instanceof D) {
                        for (I i2 : TabDefMoeglicheVorteileErschaffung.this.publicObject.getHswVorteile().getUngeeignet()) {
                            if (!public_.\u00f4O0000().equals(i2)) continue;
                            D d2 = (D)public_;
                            arrayList.add(d2.\u00f4o0000());
                        }
                        string = string + arrayList.toString();
                    }
                    string = string + "<br>";
                }
                return string;
            }
        });
    }

    @Override
    public int getAnzahl() {
        if (this.publicObject.getHswVorteile().getMoegliche() == null) {
            return 0;
        }
        return this.publicObject.getHswVorteile().getMoegliche().getListe(this.\u00f4\u00d40000).size();
    }

    @Override
    public int getMinimalWert(J j2) {
        return this.publicObject.getHswVorteile().getMinimalWert(j2);
    }

    @Override
    public Settings getSetting() {
        return this.publicObject.getSetting();
    }

    @Override
    public public getVorteilFuerZeile(int n) {
        return this.publicObject.getHswVorteile().getMoegliche().getListe(this.\u00f4\u00d40000).get(n);
    }

    @Override
    public void update() {
        this.\u00f6\u00d40000.update();
    }

    @Override
    public void updateSoft() {
        this.\u00f6\u00d40000.updateSoft();
    }
}

