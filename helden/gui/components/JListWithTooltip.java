/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class JListWithTooltip
extends JList
implements ActionListener {
    private static final long serialVersionUID = -5033772990894830020L;
    private final JPopupMenu \u00d200000 = new JPopupMenu();
    private JMenuItem super = new JMenuItem("Paste");

    public JListWithTooltip() {
    }

    public JListWithTooltip(DefaultListModel defaultListModel) {
        super(defaultListModel);
        this.super();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();
        if (object == this.super) {
            JList jList = (JList)this.\u00d200000.getInvoker();
            try {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                Transferable transferable = clipboard.getContents(null);
                for (DataFlavor dataFlavor : transferable.getTransferDataFlavors()) {
                    Object object2 = transferable.getTransferData(dataFlavor);
                    if (!(object2 instanceof String)) continue;
                    ((DefaultListModel)jList.getModel()).addElement(object2);
                    break;
                }
            }
            catch (UnsupportedFlavorException unsupportedFlavorException) {
                unsupportedFlavorException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    @Override
    public String getToolTipText(MouseEvent mouseEvent) {
        int n = this.locationToIndex(mouseEvent.getPoint());
        if (this.getModel().getSize() == 0) {
            return "";
        }
        Object e = this.getModel().getElementAt(n);
        return e.toString();
    }

    private void super() {
        this.super.addActionListener(this);
        this.\u00d200000.add(this.super);
        this.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                switch (mouseEvent.getModifiers()) {
                    case 4: {
                        JListWithTooltip.this.\u00d200000.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
                        break;
                    }
                }
            }
        });
    }
}

