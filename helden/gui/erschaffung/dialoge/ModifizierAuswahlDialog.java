/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import helden.framework.Filter;
import helden.framework.held.Object.public;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.gui.components.JTextFieldWithMenu;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlDialogZusatzVariante;
import helden.gui.erschaffung.dialoge.ModifizierAuswahlZustand;
import helden.gui.erschaffung.dialoge.tabellenDialog.DarstellungModifizierer;
import helden.gui.erschaffung.dialoge.tabellenDialog.DarstellungVarianten;
import helden.gui.erschaffung.dialoge.tabellenDialog.InvisibleDefaultMutableTreeNode;
import helden.gui.erschaffung.dialoge.tabellenDialog.InvisibleTreeModel;
import helden.model.kultur.EigeneKultur;
import helden.model.profession.EigeneProfession;
import helden.model.rasse.EigeneRasse;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ModifizierAuswahlDialog<T>
extends JPanel
implements TreeSelectionListener,
MouseListener {
    private static final long serialVersionUID = 5145242365026010100L;
    private ModifizierAuswahlZustand<T> return;
    private ModifizierAuswahlDialogZusatzVariante \u00d300000;
    private ArrayList<String> \u00f800000 = new ArrayList();
    private JTree OO0000;
    private DefaultMutableTreeNode \u00f400000;
    private JTextField \u00d500000;
    private JComboBox new;
    private JScrollPane o00000;
    private boolean \u00d800000 = false;
    private JScrollPane \u00d400000;
    private JLabel \u00f500000;
    private JTextFieldWithMenu if;

    protected ModifizierAuswahlDialog(ModifizierAuswahlZustand modifizierAuswahlZustand) {
        this.return = modifizierAuswahlZustand;
    }

    public void expandAll() {
        for (int i2 = 0; i2 < this.OO0000.getRowCount(); ++i2) {
            this.OO0000.expandRow(i2);
        }
    }

    public JComboBox getFilterBox() {
        if (this.new == null) {
            this.new = new JComboBox();
            this.new.setName("filterbox");
            this.new.addItem(Filter.o00000);
            this.new.addItem(Filter.\u00d600000);
            this.new.setSelectedItem((Object)Filter.\u00d600000);
            if (this.return.hatUeblicheFiler()) {
                this.new.addItem(Filter.void);
                this.new.setSelectedItem((Object)Filter.void);
            }
        }
        return this.new;
    }

    public JTextField getGewaehltTextfeld() {
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new JTextField();
            this.\u00d500000.setEditable(false);
            this.\u00d500000.setHorizontalAlignment(2);
        }
        return this.\u00d500000;
    }

    public ArrayList<P> getModifizierVarianten(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (this.getFilterBox().getSelectedItem().equals((Object)Filter.o00000)) {
            return ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getAlleVarianten();
        }
        return ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getMoeglicheVarianten();
    }

    public JTextField getNameFilterTextFeld() {
        if (this.if == null) {
            this.if = new JTextFieldWithMenu();
            this.if.addKeyListener(new KeyListener(){

                @Override
                public void keyPressed(KeyEvent keyEvent) {
                }

                @Override
                public void keyReleased(KeyEvent keyEvent) {
                    ModifizierAuswahlDialog.this.o00000(ModifizierAuswahlDialog.this.if.getText());
                }

                @Override
                public void keyTyped(KeyEvent keyEvent) {
                }
            });
        }
        return this.if;
    }

    public JPanel getOben() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.gridy = 0;
        gridBagConstraints2.gridwidth = 1;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.weighty = 0.0;
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.gridy = 1;
        gridBagConstraints3.gridwidth = 1;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.weighty = 0.0;
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridy = 2;
        gridBagConstraints4.gridwidth = 1;
        gridBagConstraints4.weightx = 0.0;
        gridBagConstraints4.weighty = 0.0;
        gridBagConstraints4.gridx = 0;
        gridBagConstraints4.anchor = 17;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.fill = 1;
        gridBagConstraints5.gridy = 2;
        gridBagConstraints5.gridwidth = 1;
        gridBagConstraints5.weightx = 1.0;
        gridBagConstraints5.weighty = 0.0;
        gridBagConstraints5.gridx = 1;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.fill = 1;
        gridBagConstraints6.gridy = 3;
        gridBagConstraints6.weightx = 1.0;
        gridBagConstraints6.weighty = 1.0;
        gridBagConstraints6.gridx = 0;
        gridBagConstraints6.gridwidth = 2;
        this.fillTree(this.return.getAlleRPK());
        this.OO0000 = new JTree();
        InvisibleTreeModel invisibleTreeModel = new InvisibleTreeModel(this.\u00f400000);
        invisibleTreeModel.activateFilter(true);
        this.OO0000.setModel(invisibleTreeModel);
        this.OO0000.addTreeSelectionListener(this);
        this.OO0000.addMouseListener(this);
        if (this.return.hatFilterBox()) {
            jPanel.add((Component)new JLabel("Filter"), gridBagConstraints);
            jPanel.add((Component)this.getFilterBox(), gridBagConstraints2);
        }
        if (this.return.hatNameFilter()) {
            jPanel.add((Component)this.getNameFilterTextFeld(), gridBagConstraints3);
        }
        this.\u00f500000 = new JLabel("Gew\u00e4hlt");
        this.\u00f500000.setVisible(false);
        jPanel.add((Component)this.\u00f500000, gridBagConstraints4);
        this.\u00d400000 = new JScrollPane(this.getGewaehltTextfeld());
        this.\u00d400000.setMinimumSize(new Dimension(100, 40));
        this.\u00d400000.setVisible(false);
        jPanel.add((Component)this.\u00d400000, gridBagConstraints5);
        this.o00000 = new JScrollPane(this.OO0000);
        jPanel.add((Component)this.o00000, gridBagConstraints6);
        return jPanel;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() instanceof JTree && mouseEvent.getClickCount() > 1) {
            this.return.getVor().doClick();
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
        if (this.\u00d800000) {
            return;
        }
        InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode = (InvisibleDefaultMutableTreeNode)this.OO0000.getLastSelectedPathComponent();
        if (invisibleDefaultMutableTreeNode == null) {
            return;
        }
        if (invisibleDefaultMutableTreeNode.getUserObject() instanceof DarstellungVarianten) {
            if (invisibleDefaultMutableTreeNode.getParent() == null) {
                return;
            }
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = ((DarstellungModifizierer)((InvisibleDefaultMutableTreeNode)invisibleDefaultMutableTreeNode.getParent()).getUserObject()).getModifizierer();
            this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ((DarstellungVarianten)invisibleDefaultMutableTreeNode.getUserObject()).getVariante());
            this.o00000();
        } else if (invisibleDefaultMutableTreeNode.getUserObject() instanceof DarstellungModifizierer) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO3 = ((DarstellungModifizierer)invisibleDefaultMutableTreeNode.getUserObject()).getModifizierer();
            if (invisibleDefaultMutableTreeNode.getChildCount() == 0) {
                this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO3, (P)null);
                this.o00000();
            } else {
                for (int i2 = 0; i2 < invisibleDefaultMutableTreeNode.getChildCount(); ++i2) {
                    InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode2 = (InvisibleDefaultMutableTreeNode)invisibleDefaultMutableTreeNode.getChildAt(i2, true);
                    if (invisibleDefaultMutableTreeNode2 == null) continue;
                    this.OO0000.setSelectionPath(new TreePath(invisibleDefaultMutableTreeNode2.getPath()));
                    this.OO0000.scrollPathToVisible(new TreePath(invisibleDefaultMutableTreeNode2.getPath()));
                    break;
                }
            }
        } else if (invisibleDefaultMutableTreeNode.getChildCount() > 0) {
            InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode3 = (InvisibleDefaultMutableTreeNode)invisibleDefaultMutableTreeNode.getChildAt(0);
            this.OO0000.setSelectionPath(new TreePath(invisibleDefaultMutableTreeNode3.getPath()));
        }
    }

    protected void aktuallisiereTree(ArrayList<T> arrayList, T t) {
        DefaultMutableTreeNode defaultMutableTreeNode = null;
        this.\u00f400000.removeAllChildren();
        InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode = new InvisibleDefaultMutableTreeNode("Eigene " + this.return.getBezeichner());
        Collections.sort(arrayList, public.o00000());
        for (T t2 : arrayList) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)t2;
            if (!this.return.anzeigen(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, null)) continue;
            InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode2 = new InvisibleDefaultMutableTreeNode(new DarstellungModifizierer(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2));
            ArrayList<P> arrayList2 = new ArrayList<P>(this.getModifizierVarianten(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2));
            Collections.sort(arrayList2, public.o00000());
            boolean bl = false;
            boolean bl2 = false;
            for (P p2 : arrayList2) {
                if (p2.istOptional()) continue;
                bl = true;
                if (!this.return.anzeigen(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, p2)) continue;
                bl2 = true;
                InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode3 = new InvisibleDefaultMutableTreeNode(new DarstellungVarianten(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, p2));
                invisibleDefaultMutableTreeNode2.add(invisibleDefaultMutableTreeNode3);
                if (defaultMutableTreeNode != null || !this.o00000(t, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) || !this.\u00f800000.contains(p2.toString())) continue;
                defaultMutableTreeNode = invisibleDefaultMutableTreeNode3;
            }
            if (bl && (!bl || !bl2)) continue;
            if (t2 instanceof EigeneProfession || t2 instanceof EigeneKultur || t2 instanceof EigeneRasse) {
                invisibleDefaultMutableTreeNode.add(invisibleDefaultMutableTreeNode2);
            } else {
                this.\u00f400000.add(invisibleDefaultMutableTreeNode2);
            }
            if (defaultMutableTreeNode != null || !this.o00000(t, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)) continue;
            defaultMutableTreeNode = invisibleDefaultMutableTreeNode2;
        }
        if (invisibleDefaultMutableTreeNode.getChildCount() > 0) {
            this.\u00f400000.insert(invisibleDefaultMutableTreeNode, 0);
        }
        if (this.OO0000 != null) {
            ((DefaultTreeModel)this.OO0000.getModel()).nodeStructureChanged(this.\u00f400000);
            this.o00000(false);
            if (defaultMutableTreeNode != null) {
                TreePath treePath = new TreePath(defaultMutableTreeNode.getPath());
                this.OO0000.setSelectionPath(treePath);
                this.OO0000.scrollPathToVisible(treePath);
            } else if (t != null) {
                this.o00000(true);
            }
            this.OO0000.revalidate();
        }
    }

    protected void fillTree(ArrayList<T> arrayList) {
        this.\u00d800000 = true;
        this.\u00f400000 = new InvisibleDefaultMutableTreeNode(this.return.getBezeichner());
        this.aktuallisiereTree(arrayList, null);
        this.\u00d800000 = false;
    }

    protected void initialize() {
        this.\u00d300000 = new ModifizierAuswahlDialogZusatzVariante(this);
        this.\u00d300000.setVisible(false);
        this.setLayout(new BorderLayout());
        this.add((Component)this.getOben(), "Center");
        this.add((Component)this.\u00d300000, "East");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        for (JComponent jComponent : this.return.getZusatzGuiElemente()) {
            jPanel.add(jComponent);
        }
        this.add((Component)jPanel, "South");
    }

    protected void zusatzVariantenWurdenGeaendert() {
        this.o00000();
    }

    private boolean o00000(T t, OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (t == null || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 == null) {
            return false;
        }
        String string = "1";
        String string2 = "2";
        if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof o0oo_0) {
            string = ((o0oo_0)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2).getID();
        } else if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof OooO) {
            string = ((OooO)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2).getID();
        } else if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof super) {
            string = ((super)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2).getID();
        }
        if (t instanceof o0oo_0) {
            string2 = ((o0oo_0)t).getID();
        } else if (t instanceof OooO) {
            string2 = ((OooO)t).getID();
        } else if (t instanceof super) {
            string2 = ((super)t).getID();
        }
        return string.equals(string2);
    }

    private void o00000() {
        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = null;
        ArrayList<P> arrayList = new ArrayList<P>();
        InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode = (InvisibleDefaultMutableTreeNode)this.OO0000.getLastSelectedPathComponent();
        if (invisibleDefaultMutableTreeNode != null && invisibleDefaultMutableTreeNode.getUserObject() instanceof DarstellungVarianten) {
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = ((DarstellungModifizierer)((InvisibleDefaultMutableTreeNode)invisibleDefaultMutableTreeNode.getParent()).getUserObject()).getModifizierer();
            arrayList.add(((DarstellungVarianten)invisibleDefaultMutableTreeNode.getUserObject()).getVariante());
        } else if (invisibleDefaultMutableTreeNode != null && invisibleDefaultMutableTreeNode.getUserObject() instanceof DarstellungModifizierer) {
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = ((DarstellungModifizierer)invisibleDefaultMutableTreeNode.getUserObject()).getModifizierer();
        }
        arrayList.addAll(this.\u00d300000.getSelektierteVarianten());
        this.\u00f800000.clear();
        for (P p2 : arrayList) {
            this.\u00f800000.add(p2.toString());
        }
        this.return.setRPK(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, arrayList);
    }

    private boolean o00000(InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode, String string) {
        if (string.equals("")) {
            invisibleDefaultMutableTreeNode.setVisible(true);
        }
        boolean bl = invisibleDefaultMutableTreeNode.getUserObject().toString().toLowerCase().contains(string.toLowerCase());
        invisibleDefaultMutableTreeNode.setVisible(bl);
        Enumeration enumeration = invisibleDefaultMutableTreeNode.children();
        if (bl && !invisibleDefaultMutableTreeNode.isRoot()) {
            while (enumeration.hasMoreElements()) {
                InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode2 = (InvisibleDefaultMutableTreeNode)enumeration.nextElement();
                invisibleDefaultMutableTreeNode2.setVisible(true);
            }
        } else {
            while (enumeration.hasMoreElements()) {
                InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode3 = (InvisibleDefaultMutableTreeNode)enumeration.nextElement();
                if (!this.o00000(invisibleDefaultMutableTreeNode3, string)) continue;
                bl = true;
            }
            invisibleDefaultMutableTreeNode.setVisible(bl);
        }
        return bl;
    }

    private void o00000(String string) {
        if (this.return.hatNameFilter()) {
            InvisibleTreeModel invisibleTreeModel = (InvisibleTreeModel)this.OO0000.getModel();
            InvisibleDefaultMutableTreeNode invisibleDefaultMutableTreeNode = (InvisibleDefaultMutableTreeNode)this.\u00f400000;
            this.o00000(invisibleDefaultMutableTreeNode, string);
            invisibleTreeModel.reload();
            this.OO0000.repaint();
        }
    }

    private void o00000(boolean bl) {
        this.\u00f500000.setVisible(bl);
        this.\u00d400000.setVisible(bl);
    }

    private void o00000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, P p2) {
        boolean bl = false;
        int n = 0;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(this.\u00f800000);
        this.\u00d300000.clearVarianten();
        for (P object : this.getModifizierVarianten(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)) {
            if (!object.istOptional()) continue;
            boolean arrayList3 = arrayList.contains(object.toString());
            this.\u00d300000.addVariante(object, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getGeschlecht(), n, arrayList3);
            bl = true;
        }
        ++n;
        ArrayList<ArrayList<P>> arrayList2 = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getZusatzVarianten(p2, this.\u00f800000);
        if (arrayList2 != null) {
            for (ArrayList arrayList3 : arrayList2) {
                for (P p3 : arrayList3) {
                    if (!this.return.anzeigenZusatzVariante(p3)) continue;
                    this.\u00d300000.addVariante(p3, n, arrayList.contains(p3.toString()));
                    bl = true;
                }
                ++n;
            }
        }
        this.\u00d300000.setVisible(bl);
        this.revalidate();
    }
}

