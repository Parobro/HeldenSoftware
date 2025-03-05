/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.Geschlecht;
import helden.framework.Wuerfelwurf;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class O00O
extends G {
    public O00O(new new_) {
        super(new_);
        this.intObject();
        this.\u00d4\u00d40000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Gewicht/Gr\u00f6\u00dfe/Alter";
    }

    public new \u00d5\u00d40000() {
        return (new)super.\u00d200000();
    }

    public Wuerfelwurf \u00d400000(int n) {
        switch (n) {
            case 0: {
                return this.\u00d5\u00d40000().ifsuper();
            }
            case 1: {
                return this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d400000);
            }
            case 3: {
                return this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d300000);
            }
        }
        return null;
    }

    private void intObject() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 80, false, String.class){

            @Override
            public Object getData(int n) {
                switch (n) {
                    case 0: {
                        return "Alter";
                    }
                    case 1: {
                        return "Gr\u00f6\u00dfe (m\u00e4nnlich)";
                    }
                    case 2: {
                        return "Gewicht (m\u00e4nnlich)";
                    }
                    case 3: {
                        return "Gr\u00f6\u00dfe (weiblich)";
                    }
                    case 4: {
                        return "Gewicht (weiblich)";
                    }
                }
                return "";
            }
        });
        arrayList.add(new SpaltenDefinition("W20", 80, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public void changed(Object object, int n) {
                O00O.this.\u00d400000((Integer)object).setW20(n);
                O00O.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                if (n == 2 || n == 4) {
                    return null;
                }
                return new Integer(n);
            }

            @Override
            public int getMax(Object object) {
                return 20;
            }

            @Override
            public int getMin(Object object) {
                return -20;
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                if (n == 2 || n == 4) {
                    return SpaltenDefinition.ART.\u00d800000;
                }
                return SpaltenDefinition.ART.\u00f800000;
            }

            @Override
            public int getValue(Object object) {
                return O00O.this.\u00d400000((Integer)object).getW20();
            }
        });
        arrayList.add(new SpaltenDefinition("W20 ", 30, false, String.class){

            @Override
            public Object getData(int n) {
                if (n == 2 || n == 4) {
                    return "";
                }
                return "W20 +";
            }
        });
        arrayList.add(new SpaltenDefinition("W6", 80, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public void changed(Object object, int n) {
                O00O.this.\u00d400000((Integer)object).setW6(n);
                O00O.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                if (n == 2 || n == 4) {
                    return null;
                }
                return new Integer(n);
            }

            @Override
            public int getMax(Object object) {
                return 20;
            }

            @Override
            public int getMin(Object object) {
                return -20;
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                if (n == 2 || n == 4) {
                    return SpaltenDefinition.ART.\u00d800000;
                }
                return SpaltenDefinition.ART.\u00f800000;
            }

            @Override
            public int getValue(Object object) {
                return O00O.this.\u00d400000((Integer)object).getW6();
            }
        });
        arrayList.add(new SpaltenDefinition("W6", 30, false, String.class){

            @Override
            public Object getData(int n) {
                if (n == 2 || n == 4) {
                    return "Gr\u00f6\u00dfe - ";
                }
                return "W6 + ";
            }
        });
        arrayList.add(new SpaltenDefinition("Konstante", 120, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public void changed(Object object, int n) {
                if (object.equals(2)) {
                    O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d400000, n);
                } else if (object.equals(4)) {
                    O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d300000, n);
                } else {
                    O00O.this.\u00d400000((Integer)object).setKonstant(n);
                }
                O00O.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return new Integer(n);
            }

            @Override
            public int getMax(Object object) {
                return 300;
            }

            @Override
            public int getMin(Object object) {
                return -20;
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                return SpaltenDefinition.ART.\u00f800000;
            }

            @Override
            public int getValue(Object object) {
                if (object.equals(2)) {
                    return O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d400000);
                }
                if (object.equals(4)) {
                    return O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d300000);
                }
                return O00O.this.\u00d400000((Integer)object).getKonstant();
            }
        });
        arrayList.add(new SpaltenDefinition("Min", 60, false, String.class){

            @Override
            public Object getData(int n) {
                switch (n) {
                    case 0: {
                        return O00O.this.\u00d5\u00d40000().ifsuper().getMin();
                    }
                    case 1: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d400000).getMin();
                    }
                    case 2: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d400000).getMin() - O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d400000);
                    }
                    case 3: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d300000).getMin();
                    }
                    case 4: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d300000).getMin() - O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d300000);
                    }
                }
                return "";
            }
        });
        arrayList.add(new SpaltenDefinition("Max", 60, false, String.class){

            @Override
            public Object getData(int n) {
                switch (n) {
                    case 0: {
                        return O00O.this.\u00d5\u00d40000().ifsuper().getMax();
                    }
                    case 1: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d400000).getMax();
                    }
                    case 2: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d400000).getMax() - O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d400000);
                    }
                    case 3: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d300000).getMax();
                    }
                    case 4: {
                        return O00O.this.\u00d5\u00d40000().\u00d200000(Geschlecht.\u00d300000).getMax() - O00O.this.\u00d5\u00d40000().o00000(Geschlecht.\u00d300000);
                    }
                }
                return "";
            }
        });
        this.o00000(tabellenDefinition);
    }

    private void \u00d4\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 7;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                if (n < 6) {
                    return "Altersstufe " + (n + 1);
                }
                return "weitere Altersstufen";
            }
        });
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public void changed(Object object, int n) {
                O00O.this.\u00d5\u00d40000().o00000((Integer)object, (Integer)n);
            }

            @Override
            public Object getData(int n) {
                return new Integer(n);
            }

            @Override
            public int getMax(Object object) {
                return 1000;
            }

            @Override
            public int getMin(Object object) {
                return 5;
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                return SpaltenDefinition.ART.\u00f800000;
            }

            @Override
            public int getValue(Object object) {
                return O00O.this.\u00d5\u00d40000().\u00d500000((Integer)object);
            }
        });
        this.\u00d200000(tabellenDefinition);
    }
}

