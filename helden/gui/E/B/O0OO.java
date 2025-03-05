/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.B;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.a_0;
import helden.framework.oooo.string_0;
import helden.gui.A;
import helden.gui.E.C;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OO
extends ZweiTabellenZustand {
    private Set<String> superString;
    private A \u00f8\u00d40000;
    private HashMap<String, C> \u00d8\u00d40000;
    private final ArrayList<String> \u00f6\u00d40000 = new ArrayList();
    private final ArrayList<String> publicObject = new ArrayList();
    private JProgressBar O\u00d50000;
    private JPanel \u00f4\u00d40000;
    private JDialog \u00d2\u00d50000;
    private SimpleDateFormat \u00d3\u00d50000 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public O0OO(A a2, JDialog jDialog) {
        super(null);
        this.\u00d2\u00d50000 = jDialog;
        this.superString = new HashSet<String>();
        this.\u00f8\u00d40000 = a2;
        this.StringObject();
        this.createPanel();
        this.o00000(false);
    }

    public void \u00f5\u00d30000() {
        int n = 0;
        for (Map.Entry<String, C> entry : this.\u00d8\u00d40000.entrySet()) {
            if (this.superString.contains(entry.getKey()) || entry.getValue().\u00d300000().equals(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[0])) continue;
            ++n;
        }
        this.O\u00d50000.setStringPainted(true);
        this.O\u00d50000.setMaximum(n);
        int n2 = 0;
        for (Map.Entry entry : this.\u00d8\u00d40000.entrySet()) {
            Object object;
            if (this.superString.contains(entry.getKey())) continue;
            if (((C)entry.getValue()).\u00d300000().equals(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[3])) {
                ++n2;
                try {
                    System.out.println(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00f400000(((C)entry.getValue()).\u00d600000()));
                }
                catch (Exception exception) {
                    System.out.println("Exception " + exception.toString());
                }
            } else if (((C)entry.getValue()).\u00d300000().equals(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[2])) {
                ++n2;
                object = this.\u00f8\u00d40000.super((String)entry.getKey());
                try {
                    System.out.println(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().new((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object));
                }
                catch (Exception exception) {
                    System.out.println("Exception " + exception.toString());
                }
            } else if (((C)entry.getValue()).\u00d300000().equals(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[1])) {
                ++n2;
                try {
                    object = ((C)entry.getValue()).super();
                    String string = ((C)entry.getValue()).\u00d600000();
                    K k2 = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00d800000(string);
                    if (this.\u00f8\u00d40000.\u00d200000((String)object)) {
                        if (JOptionPane.showConfirmDialog(this.\u00f8\u00d40000, "Soll der Held " + k2.toString() + " wirklich ersetzt werden?", "Held ist schon in der Liste", 0) != 0) continue;
                        this.\u00f8\u00d40000.\u00d300000((String)object);
                    }
                    string_0.o00000((String)object);
                    this.\u00f8\u00d40000.super((OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)k2, false);
                    OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().new(string, (String)object, k2.\u00f5o0000());
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            this.O\u00d50000.setValue(n2);
            this.O\u00d50000.setString(n2 + "/" + n);
            this.\u00f4\u00d40000.repaint();
        }
    }

    public String o00000(String string) {
        if (string.isEmpty()) {
            return "<Nicht vorhanden>";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(string));
        return this.\u00d3\u00d50000.format(calendar.getTime());
    }

    @Override
    public String getBezeichner() {
        return "(lokal / online)";
    }

    @Override
    public JPanel getPanel() {
        this.\u00f4\u00d40000 = new JPanel();
        this.\u00f4\u00d40000.setLayout(new BorderLayout());
        this.\u00f4\u00d40000.add((Component)super.getPanel(), "Center");
        final JButton jButton = new JButton("Aktionen ausf\u00fchren");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jButton.setEnabled(false);
                SwingWorker<Void, Void> swingWorker = new SwingWorker<Void, Void>(){

                    public Void o00000() {
                        O0OO.this.\u00f5\u00d30000();
                        O0OO.this.o00000(false);
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
        JButton jButton2 = new JButton("Auf 'Nichts tun' setzen");
        jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                O0OO.this.o00000(true);
            }
        });
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        this.O\u00d50000 = new JProgressBar(0, 100);
        this.O\u00d50000.setPreferredSize(new Dimension(150, 20));
        jPanel.add(jButton);
        jPanel.add(this.O\u00d50000);
        jPanel.add(jButton2);
        this.\u00f4\u00d40000.add((Component)jPanel, "South");
        return this.\u00f4\u00d40000;
    }

    public void o00000(boolean bl) {
        this.\u00d2\u00d50000.setCursor(Cursor.getPredefinedCursor(3));
        this.\u00d4o0000.setVisible(false);
        this.\u00d8\u00d40000 = new HashMap();
        this.\u00f6\u00d40000.clear();
        this.thisObject();
        this.\u00f4\u00d30000();
        for (String object : this.\u00d8\u00d40000.keySet()) {
            this.\u00f6\u00d40000.add(object);
        }
        if (bl) {
            for (Map.Entry entry : this.\u00d8\u00d40000.entrySet()) {
                C c = (C)entry.getValue();
                c.\u00d300000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[0]);
            }
        } else {
            this.\u00d8\u00d30000();
        }
        Collections.sort(this.\u00f6\u00d40000, new Comparator(){

            public int compare(Object object, Object object2) {
                Integer n;
                Integer n2 = O0OO.this.o00000(object.toString(), O0OO.this.\u00d8\u00d40000);
                int n3 = n2.compareTo(n = Integer.valueOf(O0OO.this.o00000(object2.toString(), O0OO.this.\u00d8\u00d40000)));
                if (n3 == 0) {
                    return ((C)O0OO.this.\u00d8\u00d40000.get(object.toString())).class().compareToIgnoreCase(((C)O0OO.this.\u00d8\u00d40000.get(object2.toString())).class());
                }
                return n3;
            }
        });
        this.publicObject.clear();
        for (Iterator<Object> iterator : OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000) {
            this.publicObject.add((String)((Object)iterator));
        }
        this.update();
        this.\u00d4o0000.setVisible(true);
        this.\u00d2\u00d50000.setCursor(Cursor.getPredefinedCursor(0));
    }

    private void \u00d8\u00d30000() {
        block5: for (Map.Entry<String, C> entry : this.\u00d8\u00d40000.entrySet()) {
            C c = entry.getValue();
            switch (this.o00000(c.super(), this.\u00d8\u00d40000)) {
                case 1: {
                    c.\u00d300000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[1]);
                    continue block5;
                }
                case 2: {
                    c.\u00d300000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[2]);
                    continue block5;
                }
                case 3: {
                    long l2 = Long.parseLong(c.\u00d400000());
                    long l3 = Long.parseLong(c.\u00d200000());
                    if (l2 < l3) {
                        c.\u00d300000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[1]);
                        continue block5;
                    }
                    c.\u00d300000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[2]);
                    continue block5;
                }
            }
            c.\u00d300000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000[0]);
        }
    }

    private int o00000(String string, HashMap<String, C> hashMap) {
        String string2 = hashMap.get(string).\u00d400000();
        String string3 = hashMap.get(string).\u00d200000();
        if (string2.isEmpty() && string3.isEmpty()) {
            return 0;
        }
        if (string2.isEmpty()) {
            return 1;
        }
        if (string3.isEmpty()) {
            return 2;
        }
        if (string2.equals(string3)) {
            return 4;
        }
        return 3;
    }

    private void thisObject() {
        for (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : this.\u00f8\u00d40000.\u00d3O0000()) {
            long l2;
            C c;
            if (((K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2).nullObject()) {
                this.superString.add(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
            }
            if ((c = this.\u00d8\u00d40000.get(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000())) == null) {
                c = new C(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000(), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000());
                this.\u00d8\u00d40000.put(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000(), c);
            }
            if ((l2 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.ifnew().new()) == 0L && oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d8O0000().size() > 0) {
                Date date = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d8O0000().get(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d8O0000().size() - 1).\u00d800000();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                l2 = calendar.getTimeInMillis();
            }
            c.\u00d400000("" + l2);
        }
    }

    private void \u00f4\u00d30000() {
        Document document = null;
        try {
            document = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().\u00d500000();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        NodeList nodeList = a_0.new(document, "//helden/held/heldenkey/text()");
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Object object;
            String string = nodeList.item(i2).getNodeValue();
            C c = this.\u00d8\u00d40000.get(string);
            if (c == null) {
                object = "<Unknown>";
                NodeList nodeList2 = a_0.new(document, "//helden/held/heldenkey[text()='" + string + "']/../name/text()");
                if (nodeList2.getLength() > 0) {
                    object = nodeList2.item(0).getNodeValue();
                }
                c = new C(string, (String)object);
                this.\u00d8\u00d40000.put(string, c);
            }
            if ((object = a_0.new(document, "//helden/held/heldenkey[text()='" + string + "']/../heldlastchange/text()")).getLength() > 0) {
                c.super(object.item(0).getNodeValue());
            }
            if ((object = a_0.new(document, "//helden/held/heldenkey[text()='" + string + "']/../heldenid/text()")).getLength() <= 0) continue;
            c.\u00d200000(object.item(0).getNodeValue());
        }
    }

    private void StringObject() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return O0OO.this.\u00f6\u00d40000.size();
            }
        };
        tabellenDefinition.setGlobalname("Helden (lokal / online):");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Name", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return ((C)O0OO.this.\u00d8\u00d40000.get(O0OO.this.\u00f6\u00d40000.get(n))).class();
            }
        });
        arrayList.add(new SpaltenDefinition("Lokal", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return O0OO.this.o00000(((C)O0OO.this.\u00d8\u00d40000.get(O0OO.this.\u00f6\u00d40000.get(n))).\u00d400000());
            }
        });
        arrayList.add(new SpaltenDefinition("Online", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return O0OO.this.o00000(((C)O0OO.this.\u00d8\u00d40000.get(O0OO.this.\u00f6\u00d40000.get(n))).\u00d200000());
            }
        });
        arrayList.add(new SpaltenDefinition("Aktionen", 180, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                ((C)object).\u00d300000(object2.toString());
            }

            @Override
            public Object getData(int n) {
                if (O0OO.this.superString.contains(O0OO.this.\u00f6\u00d40000.get(n))) {
                    return null;
                }
                return O0OO.this.\u00d8\u00d40000.get(O0OO.this.\u00f6\u00d40000.get(n));
            }

            @Override
            public List<Object> getItems(Object object) {
                return O0OO.this.publicObject;
            }

            @Override
            public Object selectedItem(Object object) {
                return ((C)object).\u00d300000();
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
    }
}

