/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class for
extends G {
    private String newnew = "";

    public for(new new_) {
        super(new_);
        this.\u00f5\u00d30000();
        this.\u00d5\u00d30000();
        this.\u00d600000();
    }

    public String \u00d6\u00d30000() {
        return "Besonderer Besitz:";
    }

    public String superObject() {
        return "Besonderer Besitz:";
    }

    @Override
    public String Object() {
        return "Besonderer Besitz";
    }

    public new \u00f4\u00d30000() {
        return (new)super.\u00d200000();
    }

    public boolean \u00d4\u00d30000() {
        return true;
    }

    private void \u00d5\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 1;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return "Besonderer Besitz: ";
            }
        });
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public Object getData(int n) {
                return 1;
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                return SpaltenDefinition.ART.\u00f500000;
            }

            @Override
            public String getText(int n) {
                return for.this.newnew;
            }

            @Override
            public void setText(Object object, String string) {
                for.this.newnew = string;
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                if (!for.this.\u00f4\u00d30000().\u00d6O0000().contains(for.this.newnew)) {
                    for.this.\u00f4\u00d30000().\u00d6O0000().add(for.this.newnew);
                }
                for.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return 1;
            }
        });
        this.o00000(tabellenDefinition);
    }

    private void \u00f5\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return for.this.\u00f4\u00d30000().\u00d6O0000().size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Besonderer Besitz", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return for.this.\u00f4\u00d30000().\u00d6O0000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                for.this.\u00f4\u00d30000().\u00d6O0000().remove(object);
                for.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return for.this.\u00f4\u00d30000().\u00d6O0000().get(n);
            }
        });
        this.\u00d200000(tabellenDefinition);
    }
}

