/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende.tabellenDefinitionen;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.private;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.dialoge.tabellenDialog.DarstellungAuswahlSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.zustaende.VerbilligteSonderfertigkeitenZustand;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TabDefMoeglicheVerbilligteSf
extends TabellenDefinition {
    private HEW2 publicclass;
    private int \u00d8\u00d80000;
    private VerbilligteSonderfertigkeitenZustand \u00f4\u00d80000;

    public TabDefMoeglicheVerbilligteSf(int n, HEW2 hEW2, VerbilligteSonderfertigkeitenZustand verbilligteSonderfertigkeitenZustand) {
        this.publicclass = hEW2;
        this.\u00d8\u00d80000 = n;
        this.\u00f4\u00d80000 = verbilligteSonderfertigkeitenZustand;
        ArrayList<SpaltenDefinition> arrayList = this.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 140, false, String.class){

            @Override
            public Object getData(int n) {
                P p2 = TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().getMoeglicheVerbilligteSonderfertigkeiten().private().getListe(TabDefMoeglicheVerbilligteSf.this.\u00d8\u00d80000).get(n);
                if (p2 instanceof K) {
                    return "Talentspezialisierung";
                }
                return p2.\u00f500000();
            }
        });
        arrayList.add(new SpaltenDefinition("", 80, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                if (object instanceof K) {
                    K k2 = (K)object;
                    if (object2 != null && object2 != k2.o\u00d30000()) {
                        k2.new((oo0o_0)object2);
                        TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.updateSoft();
                    }
                    return;
                }
                TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.getAuswahl().put((P)object, ((DarstellungAuswahlSonderfertigkeiten)object2).getSf());
                TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.update();
            }

            @Override
            public Object getData(int n) {
                P p2 = TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().getMoeglicheVerbilligteSonderfertigkeiten().private().getListe(TabDefMoeglicheVerbilligteSf.this.\u00d8\u00d80000).get(n);
                if (p2 instanceof void || p2 instanceof K) {
                    return p2;
                }
                if (p2 instanceof Q) {
                    private.\u00d200000("WARNING! Auswahlsonderfertigkeit in SonderfertigkeitenZustand:" + p2.toString(), "alle");
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                return TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().getMoeglicheAuswahlen((P)object);
            }

            @Override
            public Object selectedItem(Object object) {
                if (object instanceof K) {
                    K k2 = (K)object;
                    return k2.o\u00d30000();
                }
                return TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.getAuswahl().get(object);
            }
        });
        arrayList.add(new SpaltenDefinition("", 80, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                K k2 = (K)object;
                if (k2 == null || object2 == null) {
                    return;
                }
                k2.\u00d400000(object2.toString());
            }

            @Override
            public Integer getComboBoxLength(Object object) {
                return 14;
            }

            @Override
            public Object getData(int n) {
                P p2 = TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().getMoeglicheVerbilligteSonderfertigkeiten().private().getListe(TabDefMoeglicheVerbilligteSf.this.\u00d8\u00d80000).get(n);
                if (p2 instanceof K) {
                    return p2;
                }
                return null;
            }

            @Override
            public List<Object> getItems(Object object) {
                if (object instanceof K) {
                    K k2 = (K)object;
                    return k2.o\u00d30000().getSpezialisierungen();
                }
                return null;
            }

            @Override
            public Object selectedItem(Object object) {
                if (object instanceof K) {
                    K k2 = (K)object;
                    return k2.\u00f5\u00d20000();
                }
                return super.selectedItem(object);
            }
        });
        arrayList.add(new SpaltenDefinition("AP", 80, false, String.class){

            @Override
            public Object getData(int n) {
                P p2 = TabDefMoeglicheVerbilligteSf.this.get(n);
                if (p2 instanceof K) {
                    K k2 = (K)p2;
                    int n2 = k2.o\u00d20000();
                    return n2;
                }
                if (p2 instanceof void) {
                    void void_ = (void)p2;
                    Q q = (Q)TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.getAuswahl().get(p2);
                    int n3 = void_.return(q.\u00d8\u00d30000());
                    return n3;
                }
                return p2.newnew();
            }
        });
        arrayList.add(new SpaltenDefinition("", 28, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                KostenArt kostenArt = (KostenArt)TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().getMoeglicheKostenArtenVerbilligt((P)object).get(0);
                if (object instanceof K) {
                    try {
                        Object object2 = ((K)object).clone();
                        TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().add((P)object2, kostenArt);
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {
                        cloneNotSupportedException.printStackTrace();
                    }
                } else {
                    P p2 = TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.getAuswahl().get(object);
                    if (p2 != null) {
                        TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().addVerbilligte(p2, kostenArt);
                    } else {
                        TabDefMoeglicheVerbilligteSf.this.publicclass.getSf().addVerbilligte((P)object, kostenArt);
                    }
                }
                TabDefMoeglicheVerbilligteSf.this.\u00f4\u00d80000.update();
            }

            @Override
            public Object getData(int n) {
                return TabDefMoeglicheVerbilligteSf.this.get(n);
            }
        });
    }

    public P get(int n) {
        P p2 = this.publicclass.getSf().getMoeglicheVerbilligteSonderfertigkeiten().private().getListe(this.\u00d8\u00d80000).get(n);
        if (p2 instanceof void) {
            void void_ = (void)p2;
            Q q = (Q)this.\u00f4\u00d80000.getAuswahl().get(p2);
            int n2 = void_.return(q.\u00d8\u00d30000());
            q.new(n2);
        }
        return p2;
    }

    @Override
    public int getAnzahl() {
        return this.publicclass.getSf().getMoeglicheVerbilligteSonderfertigkeiten().private().getListe(this.\u00d8\u00d80000).size();
    }

    public GridBagConstraints getConstraints(int n, int n2, int n3) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = n3;
        gridBagConstraints.anchor = 11;
        gridBagConstraints.gridx = n;
        return gridBagConstraints;
    }
}

