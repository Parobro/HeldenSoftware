/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO;

import helden.comm.CommUtilities;
import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.OOoO.O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.private;
import helden.framework.OoOO.voidsuper;
import helden.framework.OooO.A.oOOO;
import helden.framework.held.object.oooo_0;
import helden.framework.int.C;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.oo0o_0;
import helden.gui.A;
import helden.gui.O0OO.B.E;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.O0OO.ooOO.super;
import helden.gui.components.MsgDialogWithTextarea;
import helden.gui.components.TextAreaWithHyperlinkSupport;
import helden.gui.erschaffung.dialoge.JTabbedPaneWithVisible;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import helden.model.kultur.EigeneKultur;
import helden.model.profession.EigeneProfession;
import helden.model.rasse.EigeneRasse;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OoOO
extends JDialog
implements TreeSelectionListener {
    private final String \u00f600000 = "Neu, auf dieser Basis";
    private final String o00000 = "\u00c4ndern";
    private final String float = "Neue Profession";
    private final String \u00d600000 = "Neue Kultur";
    private final String void = "Neue Rasse";
    private final String \u00d2O0000 = "Neues Talent";
    private final String \u00d200000 = "Neue Formel";
    private JTabbedPaneWithVisible Object;
    private TextAreaWithHyperlinkSupport oO0000;
    private JTree public;
    private A \u00d500000;
    private JButton \u00f500000;
    private JButton \u00d400000;
    private JButton \u00f400000;
    private JButton OO0000;

    public OoOO(A a2) {
        super((Frame)a2, false);
        this.\u00d500000 = a2;
        super.o00000(this.\u00d500000.int());
        this.Object = new JTabbedPaneWithVisible();
        this.Object.setTabPlacement(2);
        this.setSize(1000, 550);
        this.getContentPane().setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)this.o00000(), "Center");
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new BoxLayout(jPanel2, 1));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new BoxLayout(jPanel3, 2));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new BoxLayout(jPanel4, 2));
        this.\u00f500000 = new JButton("Neu, auf dieser Basis");
        this.\u00f500000.setEnabled(false);
        this.\u00f500000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                OoOO.this.o00000(OoOO.this.\u00f500000.getText());
            }
        });
        jPanel3.add(this.\u00f500000);
        this.\u00f400000 = new JButton("Neu, auf dieser Basis");
        this.\u00f400000.setEnabled(false);
        this.\u00f400000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                OoOO.this.o00000(OoOO.this.\u00f400000.getText());
            }
        });
        jPanel3.add(this.\u00f400000);
        this.\u00d400000 = new JButton("L\u00f6schen");
        this.\u00d400000.setEnabled(false);
        this.\u00d400000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)OoOO.this.public.getLastSelectedPathComponent();
                Object object = defaultMutableTreeNode.getUserObject();
                if (object instanceof helden.framework.int.O) {
                    super.o00000((helden.framework.int.O)object);
                } else {
                    oooo_0.\u00f500000("Fehlende Routien zum L\u00f6schen: " + object.toString());
                }
                OoOO.this.new();
            }
        });
        jPanel4.add(this.\u00d400000);
        this.OO0000 = new JButton("GP");
        this.OO0000.setEnabled(false);
        this.OO0000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)OoOO.this.public.getLastSelectedPathComponent();
                Object object = defaultMutableTreeNode.getUserObject();
                if (object instanceof helden.framework.int.O) {
                    OoOO.this.o00000(object);
                }
            }
        });
        jPanel4.add(this.OO0000);
        JButton jButton = new JButton("Update");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                OoOO.this.new();
            }
        });
        jPanel4.add(jButton);
        JButton jButton2 = new JButton("<html>Hilfe<br>");
        jButton2.setMnemonic('H');
        jButton2.setMinimumSize(new Dimension(200, 70));
        jButton2.setSize(new Dimension(200, 70));
        jButton2.setToolTipText("Der Hilfetext wird im Browser ge\u00f6ffnet");
        jButton2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String string = "http://wiki.helden-software.de/Eigene_Erweiterungen_FAQ";
                CommUtilities.showInBrowser(string);
            }
        });
        jPanel4.add(jButton2);
        jPanel2.add(jPanel3);
        jPanel2.add(jPanel4);
        jPanel.add((Component)jPanel2, "South");
        this.oO0000 = new TextAreaWithHyperlinkSupport("<html><body> Die Funktionalit\u00e4t zur Nutzung von eigenen Professionen, Kulturen und Rassen<br>befindet sich noch in der Entwicklung.<br><br><br><br>Vor der Benutztung bitte unbedingt die FAQ lesen:<br><a href=\"http://wiki.helden-software.de/Eigene_Erweiterungen_FAQ\">http://wiki.helden-software.de/Eigene_Erweiterungen_FAQ</a>");
        this.getContentPane().add(new JSplitPane(1, jPanel, new JScrollPane(this.oO0000)));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JScrollPane o00000() {
        this.public = new JTree();
        this.new();
        JScrollPane jScrollPane = new JScrollPane(this.public);
        this.public.getSelectionModel().setSelectionMode(1);
        this.public.addTreeSelectionListener(this);
        return jScrollPane;
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.public.getLastSelectedPathComponent();
        this.\u00f500000.setEnabled(true);
        this.\u00d400000.setEnabled(false);
        this.OO0000.setEnabled(false);
        this.\u00f500000.setText("");
        this.\u00f500000.setEnabled(false);
        this.\u00f400000.setText("");
        this.\u00f400000.setEnabled(false);
        if (defaultMutableTreeNode == null) {
            return;
        }
        Object object = defaultMutableTreeNode.getUserObject();
        String string = " ";
        String string2 = " ";
        if (object instanceof C) {
            C c = (C)object;
            boolean bl = super.o00000(c.o\u00f60000());
            this.OO0000.setEnabled(true);
            String string3 = "<html>" + c.\u00f6\u00f50000();
            if (bl) {
                string3 = string3 + "<br>Diese Erweitung ist in Gebrauch!";
            }
            this.oO0000.setText(string3);
            this.\u00d400000.setEnabled(!bl);
            if (c.o\u00f80000() == null) {
                if (!bl) {
                    string = "\u00c4ndern";
                }
                string2 = "Neu, auf dieser Basis";
            }
        } else if (object instanceof oo0o_0 && object instanceof private) {
            private private_ = (private)object;
            boolean bl = super.o00000(private_.getID());
            String string4 = "<html>" + private_.\u00d6\u00f40000().replaceAll("\n", "<br>");
            if (bl) {
                string4 = string4 + "<br>Diese Erweitung ist in Gebrauch!";
            }
            this.oO0000.setText(string4);
            this.\u00d400000.setEnabled(!bl);
            string = "Neues Talent";
        } else if (object instanceof String) {
            String string5 = (String)object;
            if (string5.equals("Eigene Professionen")) {
                string = "Neue Profession";
            } else if (string5.equals("Eigene Talente")) {
                string = "Neues Talent";
            } else if (string5.equals("Eigene Kultur")) {
                string = "Neue Kultur";
            } else if (string5.equals("Eigene Rasse")) {
                string = "Neue Rasse";
            } else if (string5.equals("Eigene Formeln")) {
                string = "Neue Formel";
            }
            this.oO0000.setText("");
        } else if (object instanceof private) {
            private private_ = (private)object;
            boolean bl = super.o00000(private_.getID());
            String string6 = "<html>" + private_.\u00d6\u00f40000().replaceAll("\n", "<br>");
            if (bl) {
                string6 = string6 + "<br>Diese Erweitung ist in Gebrauch!";
            }
            this.oO0000.setText(string6);
            this.\u00d400000.setEnabled(!bl);
        } else {
            this.oO0000.setText("");
        }
        this.\u00f500000.setText(string);
        this.\u00f500000.setEnabled(!string.equals(" "));
        this.\u00f400000.setText(string2);
        this.\u00f400000.setEnabled(!string2.equals(" "));
        this.invalidate();
    }

    protected void o00000(String string) {
        if (string.equals("Neue Variante")) {
            DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.public.getLastSelectedPathComponent();
            C c = (C)defaultMutableTreeNode.getUserObject();
            if (c.o\u00f80000() != null) {
                return;
            }
            O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o _o2 = null;
            if (ProfessionenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                _o2 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super;
            }
            if (KulturFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                _o2 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000;
            }
            if (RassenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                _o2 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000;
            }
            helden.gui.O0OO.B.A a2 = new helden.gui.O0OO.B.A(this.\u00d500000, c, true, _o2);
            a2.setModal(true);
            a2.setVisible(true);
        } else if (string.equals("Neu, auf dieser Basis") || string.equals("\u00c4ndern")) {
            DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.public.getLastSelectedPathComponent();
            C c = (C)defaultMutableTreeNode.getUserObject();
            O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o _o3 = null;
            if (ProfessionenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                _o3 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super;
            }
            if (KulturFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                _o3 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000;
            }
            if (RassenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
                _o3 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000;
            }
            helden.gui.O0OO.B.A a3 = new helden.gui.O0OO.B.A(this.\u00d500000, (C)defaultMutableTreeNode.getUserObject(), false, _o3);
            a3.setModal(true);
            a3.setVisible(true);
            if (string.equals("\u00c4ndern") && a3.\u00d400000()) {
                super.o00000(c);
            }
        } else if (string.equals("Neue Profession")) {
            helden.gui.O0OO.B.A a4 = new helden.gui.O0OO.B.A(this.\u00d500000, null, false, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super);
            a4.setModal(true);
            a4.setVisible(true);
        } else if (string.equals("Neue Rasse")) {
            helden.gui.O0OO.B.A a5 = new helden.gui.O0OO.B.A(this.\u00d500000, null, false, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000);
            a5.setModal(true);
            a5.setVisible(true);
        } else if (string.equals("Neue Kultur")) {
            helden.gui.O0OO.B.A a6 = new helden.gui.O0OO.B.A(this.\u00d500000, null, false, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000);
            a6.setModal(true);
            a6.setVisible(true);
        } else if (string.equals("Neues Talent")) {
            E e = new E(this.\u00d500000);
            e.setModal(true);
            e.setVisible(true);
        } else if (string.equals("Neue Formel")) {
            helden.gui.O0OO.B.OoOO ooOO2 = new helden.gui.O0OO.B.OoOO(this.\u00d500000);
            ooOO2.setModal(true);
            ooOO2.setVisible(true);
        }
        this.new();
    }

    private void o00000(Object object) {
        oOOO oOOO2 = new oOOO();
        C c = (C)object;
        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
        if (ProfessionenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new EigeneProfession(c, Geschlecht.\u00d400000, G.\u00d8\u00f8\u00f4000, G.\u00d3\u00d2\u00f5000);
        } else if (KulturFabrik.isErweiterungBekannt(c.o\u00f60000())) {
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new EigeneKultur(Geschlecht.\u00d400000, c);
        } else if (RassenFabrik.isErweiterungBekannt(c.o\u00f60000())) {
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new EigeneRasse(c, Geschlecht.\u00d400000);
        } else {
            return;
        }
        ArrayList<helden.framework.OooO.A.C> arrayList = oOOO2.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString());
        stringBuilder.append("\n");
        double d2 = 0.0;
        for (helden.framework.OooO.A.C c2 : arrayList) {
            stringBuilder.append(c2.toString());
            stringBuilder.append("\n");
            d2 += c2.\u00d300000();
        }
        stringBuilder.append(" ======\n");
        stringBuilder.append(String.format(" % 6.2f", d2));
        new MsgDialogWithTextarea("<html><br>Diese Berechnung liefert die GP Kosten nicht in allen F\u00e4llen korrekt.<br>Sollten dir Abweichungen auffallen, dann melde uns den Fehler.<br><br>", stringBuilder.toString());
    }

    private void new() {
        ProfessionenFabrik.aktualisiereEigeneProfessionen();
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Erweiterungen");
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode("Eigene Professionen");
        defaultMutableTreeNode.add(defaultMutableTreeNode2);
        for (helden.framework.int.super iterator2 : ProfessionenFabrik.getEigeneProfessionen(Geschlecht.\u00d400000, G.\u00d8\u00f8\u00f4000, G.\u00d3\u00d2\u00f5000)) {
            EigeneProfession eigeneProfession = (EigeneProfession)iterator2;
            DefaultMutableTreeNode defaultMutableTreeNode3 = new DefaultMutableTreeNode(eigeneProfession.getHauptVariante());
            defaultMutableTreeNode2.add(defaultMutableTreeNode3);
            for (P p2 : eigeneProfession.getAlleVarianten()) {
                defaultMutableTreeNode3.add(new DefaultMutableTreeNode(p2));
            }
        }
        defaultMutableTreeNode2 = new DefaultMutableTreeNode("Eigene Kultur");
        defaultMutableTreeNode.add(defaultMutableTreeNode2);
        for (OooO oooO2 : KulturFabrik.getEigeneKulturen(Geschlecht.\u00d400000)) {
            EigeneKultur eigeneKultur = (EigeneKultur)oooO2;
            DefaultMutableTreeNode defaultMutableTreeNode4 = new DefaultMutableTreeNode(eigeneKultur.getHauptVariante());
            defaultMutableTreeNode2.add(defaultMutableTreeNode4);
            for (P p2 : eigeneKultur.getAlleVarianten()) {
                defaultMutableTreeNode4.add(new DefaultMutableTreeNode(p2));
            }
        }
        defaultMutableTreeNode2 = new DefaultMutableTreeNode("Eigene Rasse");
        defaultMutableTreeNode.add(defaultMutableTreeNode2);
        for (o0oo_0 o0oo_02 : RassenFabrik.getEigeneRassen(Geschlecht.\u00d400000)) {
            EigeneRasse eigeneRasse = (EigeneRasse)o0oo_02;
            DefaultMutableTreeNode defaultMutableTreeNode5 = new DefaultMutableTreeNode(eigeneRasse.getHauptVariante());
            defaultMutableTreeNode2.add(defaultMutableTreeNode5);
            for (P p2 : eigeneRasse.getAlleVarianten()) {
                defaultMutableTreeNode5.add(new DefaultMutableTreeNode(p2));
            }
        }
        DefaultMutableTreeNode defaultMutableTreeNode3 = new DefaultMutableTreeNode("Eigene Talente");
        if (Einstellungen.getInstance().isTestMode()) {
            defaultMutableTreeNode.add(defaultMutableTreeNode3);
            for (voidsuper voidsuper2 : N.floatsuper().do()) {
                DefaultMutableTreeNode defaultMutableTreeNode6 = new DefaultMutableTreeNode(voidsuper2);
                defaultMutableTreeNode3.add(defaultMutableTreeNode6);
            }
        }
        DefaultMutableTreeNode defaultMutableTreeNode7 = new DefaultMutableTreeNode("Eigene Formeln");
        defaultMutableTreeNode.add(defaultMutableTreeNode7);
        for (O o : O.O\u00f40000()) {
            if (o.istIntern()) continue;
            DefaultMutableTreeNode defaultMutableTreeNode8 = new DefaultMutableTreeNode(o);
            defaultMutableTreeNode7.add(defaultMutableTreeNode8);
        }
        DefaultTreeModel defaultTreeModel = (DefaultTreeModel)this.public.getModel();
        defaultTreeModel.setRoot(defaultMutableTreeNode);
    }
}

