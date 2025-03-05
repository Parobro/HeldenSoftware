/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.components;

import helden.gui.components.JScrollPaneFast;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class MsgDialogWithTextarea
extends JFrame
implements ActionListener,
WindowListener {
    private Throwable o00000;
    private JButton \u00d400000;
    private JTextArea \u00d300000;
    private JLabel new;

    public MsgDialogWithTextarea(String string, String string2) {
        this(string, string2, true);
    }

    public MsgDialogWithTextarea(String string, String string2, boolean bl) {
        this.addWindowListener(this);
        this.setSize(600, 400);
        this.setLocation(200, 200);
        this.setTitle("GP");
        JLabel jLabel = new JLabel(string);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add((Component)jLabel, "North");
        this.getContentPane().add(this.\u00d300000(), "South");
        if (bl) {
            this.getContentPane().add(this.super(), "Center");
            this.\u00d300000.setText(string2);
        } else {
            this.getContentPane().add(this.super(string2), "Center");
        }
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.\u00d400000) {
            this.dispose();
        }
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        if (this.o00000 instanceof OutOfMemoryError) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        if (this.o00000 instanceof OutOfMemoryError) {
            System.exit(0);
        }
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    private Component \u00d300000() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 0));
        jPanel.add(Box.createHorizontalGlue());
        jPanel.add(Box.createRigidArea(new Dimension(5, 0)));
        jPanel.add(this.\u00d200000());
        jPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        return jPanel;
    }

    private Component super(String string) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        this.new = new JLabel(string);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.new);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        jPanel.add((Component)jScrollPaneFast, "Center");
        jPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        return jPanel;
    }

    private Component \u00d200000() {
        this.\u00d400000 = new JButton("Ok");
        this.\u00d400000.addActionListener(this);
        return this.\u00d400000;
    }

    private Component super() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        this.\u00d300000 = new JTextArea();
        this.\u00d300000.setEditable(false);
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.\u00d300000);
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        jPanel.add((Component)jScrollPaneFast, "Center");
        jPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        return jPanel;
    }
}

