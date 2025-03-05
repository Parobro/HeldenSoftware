/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.OooO.super;

import helden.framework.held.Object.OOoo;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.TransferHandler;

public class D
extends TransferHandler {
    private static final long \u00d400000 = 1L;
    private JList \u00d200000 = null;
    private String o00000 = null;
    private String Object = null;

    public D(JList jList, String string, String string2) {
        this.\u00d200000 = jList;
        this.o00000 = string;
        this.Object = string2;
    }

    @Override
    public boolean canImport(TransferHandler.TransferSupport transferSupport) {
        if (!transferSupport.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return false;
        }
        JList.DropLocation dropLocation = (JList.DropLocation)transferSupport.getDropLocation();
        return dropLocation.getIndex() != -1;
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 1;
    }

    @Override
    public boolean importData(TransferHandler.TransferSupport transferSupport) {
        String string;
        if (!transferSupport.isDrop()) {
            return false;
        }
        if (!transferSupport.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return false;
        }
        JList.DropLocation dropLocation = (JList.DropLocation)transferSupport.getDropLocation();
        DefaultListModel defaultListModel = (DefaultListModel)this.\u00d200000.getModel();
        int n = dropLocation.getIndex();
        boolean bl = dropLocation.isInsert();
        Transferable transferable = transferSupport.getTransferable();
        try {
            string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
        }
        catch (Exception exception) {
            return false;
        }
        int n2 = defaultListModel.indexOf(string);
        defaultListModel.removeElement(string);
        if (n2 != -1 && n >= n2) {
            --n;
        }
        if (bl) {
            defaultListModel.add(n, string);
        } else {
            defaultListModel.set(n, string);
        }
        String[] stringArray = new String[this.\u00d200000.getModel().getSize()];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = (String)this.\u00d200000.getModel().getElementAt(i2);
        }
        if (this.o00000.equals("Alle")) {
            OOoo.o00000().o00000(stringArray, "Alle", "Alle");
        } else {
            OOoo.o00000().o00000(stringArray, this.o00000, this.Object);
        }
        return true;
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        JList jList = (JList)jComponent;
        Object[] objectArray = jList.getSelectedValues();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object = objectArray[i2];
            String string = "";
            if (object != null) {
                string = object.toString();
            }
            stringBuffer.append(string);
            if (i2 == objectArray.length - 1) continue;
            stringBuffer.append("\n");
        }
        return new StringSelection(stringBuffer.toString());
    }
}

