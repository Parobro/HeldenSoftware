/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.E.oOOO;

import helden.gui.A;
import helden.gui.E.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.E.oOOO.D;
import helden.gui.allgemein.new.I;
import helden.gui.allgemein.new.OoOO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class new
extends OoOO {
    public new(A a2, final D d2) {
        super(a2.int(), false);
        MouseAdapter mouseAdapter = new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if (mouseEvent.isPopupTrigger()) {
                    this.o00000(mouseEvent);
                }
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                if (mouseEvent.isPopupTrigger()) {
                    this.o00000(mouseEvent);
                }
            }

            private void o00000(MouseEvent mouseEvent) {
                int n = mouseEvent.getX();
                int n2 = mouseEvent.getY();
                JTree jTree = (JTree)mouseEvent.getSource();
                TreePath treePath = jTree.getPathForLocation(n, n2);
                if (treePath == null) {
                    return;
                }
                jTree.setSelectionPath(treePath);
                if (!(treePath.getLastPathComponent() instanceof I)) {
                    return;
                }
                final I i2 = (I)treePath.getLastPathComponent();
                JPopupMenu jPopupMenu = new JPopupMenu("Aktionen f\u00fcr " + i2);
                jPopupMenu.add(new JLabel("Test"));
                for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o _o2 : OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.values()) {
                    JMenuItem jMenuItem = new JMenuItem(_o2.toString());
                    jMenuItem.setName(_o2.toString());
                    jMenuItem.addActionListener(new ActionListener(){

                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o _o2 = OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.o00000(((JMenuItem)actionEvent.getSource()).getName());
                            if (this.o00000(i2, _o2)) {
                                d2.o00000();
                            }
                        }

                        private boolean o00000(I i22, OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o _o2) {
                            if (i22.isLeaf()) {
                                OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000().o00000(i22.\u00d200000(), _o2);
                                return true;
                            }
                            boolean bl = false;
                            for (int i3 = 0; i3 < i22.getChildCount(); ++i3) {
                                TreeNode treeNode = i22.getChildAt(i3);
                                if (!(treeNode instanceof I) || !this.o00000((I)treeNode, _o2)) continue;
                                bl = true;
                            }
                            return bl;
                        }
                    });
                    jPopupMenu.add(jMenuItem);
                }
                jPopupMenu.show(jTree, n, n2);
            }
        };
        this.\u00d200000().addMouseListener(mouseAdapter);
        this.o00000();
        ((DefaultTreeModel)this.\u00d200000().getModel()).setRoot((I)a2.\u00f6O0000().\u00d200000().getModel().getRoot());
        ((DefaultTreeModel)this.\u00d200000().getModel()).reload();
    }
}

