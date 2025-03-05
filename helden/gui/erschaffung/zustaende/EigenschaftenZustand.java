/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.oooo.b_0;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class EigenschaftenZustand
extends ZweiTabellenZustand {
    private boolean \u00f6\u00d30000 = false;
    private ArrayList<b_0> ObjectObject;
    private ArrayList<b_0> \u00f8\u00d30000;

    public EigenschaftenZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00d3\u00d20000();
        this.createPanel();
        this.\u00f8\u00d30000 = new ArrayList();
        this.\u00f8\u00d30000.add(b_0.\u00d3\u00f4\u00d2000);
        this.\u00f8\u00d30000.add(b_0.thispublicsuper);
        this.\u00f8\u00d30000.add(b_0.\u00d4\u00f5\u00d2000);
        this.\u00f8\u00d30000.add(b_0.\u00f4\u00f5\u00d2000);
        this.\u00f8\u00d30000.add(b_0.\u00f8\u00d8\u00d2000);
        this.\u00f8\u00d30000.add(b_0.ifwhilesuper);
        this.\u00f8\u00d30000.add(b_0.\u00f5\u00f4\u00d2000);
        this.\u00f8\u00d30000.add(b_0.\u00f4\u00d8\u00d2000);
        this.\u00f8\u00d30000.add(b_0.\u00d8\u00f5\u00d2000);
        this.ObjectObject = new ArrayList();
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            this.ObjectObject.add(iterator.next());
        }
        this.ObjectObject.addAll(this.\u00f8\u00d30000);
        this.ObjectObject.remove(b_0.\u00d4\u00f5\u00d2000);
        this.ObjectObject.remove(b_0.\u00f4\u00f5\u00d2000);
    }

    @Override
    public String getBezeichner() {
        return "Eigenschaften";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        ArrayList<Hinweis> arrayList = this.super.getHswEigenschaften().pruefe();
        this.super.getPruefer().addPruefStringFuerKosten(arrayList, KostenArt.int);
        return arrayList;
    }

    @Override
    public String getHelp() {
        if (this.super.getHswEigenschaften().isMuttersprachenklugheitwarnung()) {
            return "<html>Die Klugheit wurde gesenkt.<br>Bitte ber\u00fccksichtige, dass die Muttersprache nicht automatisch mit gesenkt wird,  sobald der Talent-Tab einmal ge\u00f6ffnet wurde.";
        }
        return super.getHelp();
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.super;
    }

    @Override
    public void update() {
        if (this.\u00f6\u00d30000) {
            return;
        }
        this.\u00f6\u00d30000 = true;
        if (this.super.getHeld() != null && this.super.getHeld().\u00d8\u00d20000()) {
            if (!this.ObjectObject.contains(b_0.\u00d4\u00f5\u00d2000)) {
                this.ObjectObject.add(b_0.\u00d4\u00f5\u00d2000);
            }
        } else {
            this.ObjectObject.remove(b_0.\u00d4\u00f5\u00d2000);
        }
        if (this.super.getHeld() != null && this.super.getHeld().oo0000()) {
            if (!this.ObjectObject.contains(b_0.\u00f4\u00f5\u00d2000)) {
                this.ObjectObject.add(b_0.\u00f4\u00f5\u00d2000);
            }
        } else {
            this.ObjectObject.remove(b_0.\u00f4\u00f5\u00d2000);
        }
        this.\u00d8o0000.update(false);
        this.\u00d8o0000.invalidate();
        this.\u00f6\u00d30000 = false;
    }

    private void \u00d3\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return EigenschaftenZustand.this.ObjectObject.size();
            }
        };
        tabellenDefinition.setGlobalname("Eigenschaften:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Eigenschaft", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return EigenschaftenZustand.this.ObjectObject.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Rasse", 50, false, String.class){

            @Override
            public Object getData(int n) {
                return EigenschaftenZustand.this.super.getRasse().getModifikator((b_0)EigenschaftenZustand.this.ObjectObject.get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("Kultur", 50, false, String.class){

            @Override
            public Object getData(int n) {
                return EigenschaftenZustand.this.super.getKultur().getModifikator((b_0)EigenschaftenZustand.this.ObjectObject.get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("Prof", 50, false, String.class){

            @Override
            public Object getData(int n) {
                return EigenschaftenZustand.this.super.getHeld().\u00d800000().getModifikator((b_0)EigenschaftenZustand.this.ObjectObject.get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("Min", 30, false, String.class){

            @Override
            public Object getData(int n) {
                if (EigenschaftenZustand.this.\u00f8\u00d30000.contains(EigenschaftenZustand.this.ObjectObject.get(n))) {
                    return null;
                }
                return EigenschaftenZustand.this.super.getHswEigenschaften().getMinimalEigenschaftswert((b_0)EigenschaftenZustand.this.ObjectObject.get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("Max", 30, false, String.class){

            @Override
            public Object getData(int n) {
                if (EigenschaftenZustand.this.\u00f8\u00d30000.contains(EigenschaftenZustand.this.ObjectObject.get(n))) {
                    return null;
                }
                return EigenschaftenZustand.this.super.getHswEigenschaften().getMaximalEigenschaftswert((b_0)EigenschaftenZustand.this.ObjectObject.get(n));
            }
        });
        arrayList.add(new SpaltenDefinition("Wert", 50, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                if (n != EigenschaftenZustand.this.super.getHeld().o00000((b_0)object) && !EigenschaftenZustand.this.\u00f8\u00d30000.contains(object)) {
                    EigenschaftenZustand.this.super.getHswEigenschaften().setEigenschaftInklModi((b_0)object, n);
                    EigenschaftenZustand.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                return EigenschaftenZustand.this.ObjectObject.get(n);
            }

            @Override
            public int getMax(Object object) {
                if (EigenschaftenZustand.this.\u00f8\u00d30000.contains(object)) {
                    return EigenschaftenZustand.this.super.getHeld().o00000((b_0)object);
                }
                return EigenschaftenZustand.this.super.getHswEigenschaften().getMaximalEigenschaftswert((b_0)object);
            }

            @Override
            public int getMin(Object object) {
                if (EigenschaftenZustand.this.\u00f8\u00d30000.contains(object)) {
                    return EigenschaftenZustand.this.super.getHeld().o00000((b_0)object);
                }
                return EigenschaftenZustand.this.super.getHswEigenschaften().getMinimalEigenschaftswert((b_0)object);
            }

            @Override
            public int getValue(Object object) {
                return EigenschaftenZustand.this.super.getHeld().o00000((b_0)object);
            }

            @Override
            public boolean isEnabled(Object object) {
                String string = "Miserable Eigenschaft: " + object;
                String string2 = "Herausragende Eigenschaft: " + object;
                return !EigenschaftenZustand.this.\u00f8\u00d30000.contains(object) && !EigenschaftenZustand.this.super.getHeld().return(string) && !EigenschaftenZustand.this.super.getHeld().return(string2);
            }
        });
        arrayList.add(new SpaltenDefinition("Bemerkung", 70, false, String.class){

            @Override
            public Object getData(int n) {
                b_0 b_02 = (b_0)EigenschaftenZustand.this.ObjectObject.get(n);
                String string = "Miserable Eigenschaft: " + b_02;
                String string2 = "Herausragende Eigenschaft: " + b_02;
                if (EigenschaftenZustand.this.super.getHeld().return(string)) {
                    return "Miserable Eigenschaft";
                }
                if (EigenschaftenZustand.this.super.getHeld().return(string2)) {
                    return "Herausragende Eigenschaft";
                }
                return null;
            }
        });
        this.setSpaltenOben(tabellenDefinition);
    }
}

