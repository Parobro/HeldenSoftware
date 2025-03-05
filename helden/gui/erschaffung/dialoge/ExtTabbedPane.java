/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ExtTabbedPane
extends JPanel
implements ComponentListener {
    private JTabbedPane o00000;
    private JPanel \u00d200000;

    public ExtTabbedPane(JTabbedPane jTabbedPane) {
        this.o00000 = jTabbedPane;
        jTabbedPane.setOpaque(false);
        jTabbedPane.setBounds(0, 0, 400, 400);
        this.setLayout(null);
        this.\u00d200000 = new JPanel();
        this.\u00d200000.setBounds(0, 300, 140, 300);
        this.add(this.\u00d200000);
        this.add(jTabbedPane);
        this.addComponentListener(this);
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {
    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {
        this.o00000.setBounds(0, 0, this.getSize().width, this.getSize().height);
        int n = 20 * this.o00000.getTabCount();
        int n2 = this.o00000.getComponentAt((int)0).getLocation().x - 20;
        this.\u00d200000.setBounds(5, n, n2 + 5, this.getSize().height - n - 10);
    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
    }

    public JPanel getZusatzPanel() {
        return this.\u00d200000;
    }

    @Override
    public void setName(String string) {
        this.o00000.setName(string);
    }
}

