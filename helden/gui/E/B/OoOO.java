/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.B;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.object.oooo_0;
import helden.framework.oooo.a_0;
import helden.gui.A;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OoOO
extends ZweiTabellenZustand {
    private JPanel floatObject;
    private JDialog \u00d3\u00d40000;
    private int \u00d6\u00d40000 = 0;
    private Document \u00d4\u00d40000;

    public OoOO(A a2, JDialog jDialog) {
        super(null);
        this.\u00d3\u00d40000 = jDialog;
        this.\u00d3\u00d30000();
        this.\u00d4\u00d30000();
        this.createPanel();
        this.whilenew();
    }

    @Override
    public String getBezeichner() {
        return "Helden (lokal + Cloud)\t";
    }

    @Override
    public JPanel getPanel() {
        this.floatObject = new JPanel();
        this.floatObject.setLayout(new BorderLayout());
        this.floatObject.add((Component)super.getPanel(), "Center");
        final JButton jButton = new JButton("Neue Zugangsberechtigung erstellen");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton.setEnabled(false);
                SwingWorker<Void, Void> swingWorker = new SwingWorker<Void, Void>(){

                    public Void o00000() {
                        String string = (String)JOptionPane.showInputDialog(null, "Bitte geben sie an, wof\u00fcr der Zugang genutzt werden soll", "Verwendungszweck", -1, null, null, null);
                        if (string == null || string.length() < 3) {
                            JOptionPane.showMessageDialog(null, "Die Beschreibung war zu kurz", "", 1);
                            return null;
                        }
                        try {
                            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().return(string);
                        }
                        catch (Exception exception) {
                            oooo_0.o00000(exception);
                            JOptionPane.showMessageDialog(null, "Konnte die Zugangsberechtigung nicht anlegen", "", 0);
                        }
                        OoOO.this.whilenew();
                        jButton.setEnabled(true);
                        return null;
                    }

                    @Override
                    protected void done() {
                    }
                };
                swingWorker.execute();
            }
        });
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jPanel.add(jButton);
        this.floatObject.add((Component)jPanel, "South");
        return this.floatObject;
    }

    public void whilenew() {
        this.\u00d3\u00d40000.setCursor(Cursor.getPredefinedCursor(3));
        this.\u00d4o0000.setVisible(false);
        this.\u00d5\u00d30000();
        this.update();
        this.\u00d4o0000.setVisible(true);
        this.\u00d3\u00d40000.setCursor(Cursor.getPredefinedCursor(0));
    }

    private void \u00d5\u00d30000() {
        this.\u00d6\u00d40000 = 0;
        try {
            this.\u00d4\u00d40000 = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00d800000();
            NodeList nodeList = a_0.new(this.\u00d4\u00d40000, "//tokens/auth");
            this.\u00d6\u00d40000 = nodeList.getLength();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void \u00d3\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 1;
            }

            @Override
            public JPanel getPanel() {
                if (OoOO.this.floatObject == null) {
                    OoOO.this.floatObject = new JPanel();
                    OoOO.this.floatObject.setLayout(new BorderLayout());
                    OoOO.this.floatObject.add((Component)new TextAreaWithHyperlinkSupport("<html><body>Mit Hilfe der Zugangsberichtigungen k\u00f6nnen andere<br>Webseiten oder Apps auf die online gespeicherten<br>Helden zugreifen, ohne dass du dein Passwort weiter<br>geben brauchst.<br>Die Webseite oder App braucht nur diese kryptische<br>Zeichenfolge zu kennen."), "Center");
                }
                return OoOO.this.floatObject;
            }

            @Override
            public String getTabname() {
                return "";
            }

            @Override
            public Integer getWeightY() {
                return 10;
            }

            @Override
            public boolean isHideWennLeer() {
                return true;
            }
        };
        this.setTabDef(1, tabellenDefinition);
    }

    private void \u00d4\u00d30000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return OoOO.this.\u00d6\u00d40000;
            }
        };
        tabellenDefinition.setGlobalname("Zugangsberechtigungen:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Name", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return a_0.o00000(OoOO.this.\u00d4\u00d40000, "//tokens/auth[position()=" + (n + 1) + "]/token");
            }
        });
        arrayList.add(new SpaltenDefinition("Bemerkung", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return a_0.o00000(OoOO.this.\u00d4\u00d40000, "//tokens/auth[position()=" + (n + 1) + "]/beschreibung");
            }
        });
        arrayList.add(new SpaltenDefinition("Rechte", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return a_0.o00000(OoOO.this.\u00d4\u00d40000, "//tokens/auth[position()=" + (n + 1) + "]/rechte");
            }
        });
        arrayList.add(new SpaltenDefinition("", 26, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                try {
                    OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00d300000(object.toString());
                    OoOO.this.whilenew();
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Konnte die Zugangsberechtigung nicht l\u00f6schen", "", 0);
                }
            }

            @Override
            public Object getData(int n) {
                return a_0.o00000(OoOO.this.\u00d4\u00d40000, "//tokens/auth[position()=" + (n + 1) + "]/token");
            }
        });
        arrayList.add(new SpaltenDefinition("", 26, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "Zwischenablage"){

            @Override
            public void click(Object object) {
                StringSelection stringSelection = new StringSelection(object.toString());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
                JOptionPane.showMessageDialog(null, "Der Token wurde in der Zwischenablage kopiert", "", 1);
            }

            @Override
            public Object getData(int n) {
                return a_0.o00000(OoOO.this.\u00d4\u00d40000, "//tokens/auth[position()=" + (n + 1) + "]/token");
            }
        });
        this.setTabDef(2, tabellenDefinition);
    }
}

