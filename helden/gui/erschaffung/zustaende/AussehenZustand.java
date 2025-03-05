/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.C.I;
import helden.framework.Wuerfel;
import helden.framework.held.K;
import helden.framework.held.a.oooo_1;
import helden.framework.held.object.oooo_0;
import helden.framework.int.o0oo_0;
import helden.framework.namen.daten.Namengenerator;
import helden.framework.namen.io.NamenLader;
import helden.gui.erschaffung.dialoge.AussehenDialog;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AussehenZustand
extends ErschaffungsZustand
implements ActionListener {
    private AussehenDialog \u00f800000;
    private o0oo_0 \u00d2O0000;
    private NamenLader \u00f600000;
    private Random OO0000 = new Random();
    private Namengenerator \u00d3O0000 = null;
    private boolean do = false;

    public AussehenZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00f600000 = new NamenLader();
        try {
            this.\u00f600000.ladeNamen(null);
        }
        catch (IOException iOException) {
            oooo_0.o00000(iOException);
        }
        catch (SAXException sAXException) {
            oooo_0.o00000(sAXException);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            oooo_0.o00000(parserConfigurationException);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.\u00f800000.getWuerfelnButton())) {
            this.\u00d300000();
        } else if (actionEvent.getSource().equals(this.\u00f800000.getNameButton())) {
            Namengenerator namengenerator = null;
            if (this.\u00d3O0000 != null) {
                namengenerator = this.\u00d3O0000;
            } else {
                ArrayList<String> arrayList = this.super.getKultur().getNamesGeneratorListen(this.super.getBt());
                if (arrayList.size() > 0) {
                    int n = this.OO0000.nextInt(arrayList.size());
                    namengenerator = this.\u00f600000.getNamengeneratoren().get(arrayList.get(n));
                }
            }
            if (namengenerator == null) {
                return;
            }
            this.\u00f800000.setHeldenName(namengenerator.erzeugeName(this.super.getGeschlecht().istMaennlich(), this.do));
        } else if (actionEvent.getSource().equals(this.\u00f800000.getNamenConfig())) {
            JButton jButton = (JButton)actionEvent.getSource();
            int n = jButton.getX() + jButton.getWidth() - (int)this.\u00f800000.getEinstellungMenu().getPreferredSize().getWidth();
            int n2 = jButton.getY() + jButton.getHeight();
            this.\u00f800000.getEinstellungMenu().show(this.\u00f800000, n, n2);
        }
        this.update();
    }

    @Override
    public String getBezeichner() {
        return "Aussehen";
    }

    public ArrayList<Namengenerator> getNameGeneratoren() {
        ArrayList<Namengenerator> arrayList = new ArrayList<Namengenerator>();
        for (Namengenerator namengenerator : this.getNamenLader().getNamengeneratoren()) {
            if (!this.super.getSetting().contains(namengenerator)) continue;
            arrayList.add(namengenerator);
        }
        return arrayList;
    }

    public NamenLader getNamenLader() {
        return this.\u00f600000;
    }

    @Override
    public boolean isActive() {
        return this.super.isProfessionGesetzt() && this.super.getPhase() == HEW2.PHASEN.\u00d200000;
    }

    public void setAdelig(boolean bl) {
        this.do = bl;
    }

    public void setHeldenName() {
        if (!this.\u00f800000.getHeldenName().isEmpty()) {
            this.super.setName(this.\u00f800000.getHeldenName());
        }
    }

    public void setNamensgenerator(Namengenerator namengenerator) {
        this.\u00d3O0000 = namengenerator;
        this.update();
    }

    @Override
    public void update() {
        K k2 = this.super.getHeld();
        o0oo_0 o0oo_02 = this.super.getRasse();
        if (this.\u00f800000 == null || o0oo_02 == null) {
            return;
        }
        if (!o0oo_02.equals(this.\u00d2O0000)) {
            this.\u00d2O0000 = o0oo_02;
            this.\u00d300000();
        }
        this.\u00f800000.getGroesseTextField().setText("" + o0oo_02.getGroesse());
        if (k2.o00000(I.\u00f8\u00d2o000)) {
            this.\u00f800000.getGewichtTextField().setText("" + (int)((double)o0oo_02.getGewicht() * 1.75));
        } else {
            this.\u00f800000.getGewichtTextField().setText("" + o0oo_02.getGewicht());
        }
        if (this.super.getKultur() != null) {
            this.\u00f800000.getNameButton().setEnabled(this.super.getKultur().getNamesGeneratorListen(this.super.getBt()).size() > 0 || this.\u00d3O0000 != null);
        }
        this.super.getAngaben().\u00d300000(o0oo_02.getGroesse());
        this.super.getAngaben().\u00d200000(o0oo_02.getGewicht());
        this.super.getAngaben().super(this.\u00f800000.getHaarfarbeTextField().getText());
        this.super.getAngaben().class(this.\u00f800000.getAugenfarbeTextField().getText());
        this.setHeldenName();
    }

    @Override
    protected JPanel getPanel() {
        this.\u00f800000 = new AussehenDialog(this);
        this.update();
        return this.\u00f800000;
    }

    private void new() {
        if (this.super.getRasse().getAugenfarben().size() > 0) {
            Iterator<oooo_1> iterator = this.super.getRasse().getAugenfarben().iterator();
            oooo_1 oooo_12 = iterator.next();
            for (int i2 = Wuerfel.w20(); i2 > oooo_12.\u00d300000(); i2 -= oooo_12.\u00d300000()) {
                if (!iterator.hasNext()) break;
                oooo_12 = iterator.next();
            }
            this.\u00f800000.getAugenfarbeTextField().setText(oooo_12.String());
        } else {
            this.\u00f800000.getAugenfarbeTextField().setText("keine");
        }
    }

    private void o00000() {
        if (this.super.getRasse().getHaarfarben().size() > 0) {
            Iterator<oooo_1> iterator = this.super.getRasse().getHaarfarben().iterator();
            oooo_1 oooo_12 = iterator.next();
            for (int i2 = Wuerfel.w20(); i2 > oooo_12.\u00d300000(); i2 -= oooo_12.\u00d300000()) {
                if (!iterator.hasNext()) break;
                oooo_12 = iterator.next();
            }
            this.\u00f800000.getHaarfarbeTextField().setText(oooo_12.String());
        } else {
            this.\u00f800000.getHaarfarbeTextField().setText("keine");
        }
    }

    private void \u00d300000() {
        this.super.getRasse().groesseWuerfeln();
        this.o00000();
        this.new();
    }
}

