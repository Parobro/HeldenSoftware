/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.held.object.oooo_1;
import helden.gui.super.C.G;
import helden.gui.super.F;
import helden.gui.super.float;
import helden.gui.super.super;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;

public class return
extends F
implements float {
    private G[] \u00d2\u00f50000;

    public return(super super_) {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        this.\u00d2\u00f50000 = new G[3];
        this.\u00d2\u00f50000[0] = new G(0, super_);
        this.\u00d2\u00f50000[1] = new G(1, super_);
        this.\u00d2\u00f50000[2] = new G(2, super_);
        this.\u00d2\u00f50000[0].setBorder(BorderFactory.createRaisedBevelBorder());
        this.\u00d2\u00f50000[1].setBorder(BorderFactory.createRaisedBevelBorder());
        this.\u00d2\u00f50000[2].setBorder(BorderFactory.createRaisedBevelBorder());
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.anchor = 17;
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);
        gridBagConstraints2.gridx = 1;
        gridBagConstraints2.gridy = 0;
        gridBagConstraints2.gridwidth = 1;
        gridBagConstraints2.gridheight = 1;
        gridBagConstraints2.fill = 1;
        gridBagConstraints2.weightx = 1.0;
        gridBagConstraints2.weighty = 1.0;
        gridBagConstraints2.anchor = 17;
        gridBagConstraints2.insets = new Insets(0, 0, 0, 0);
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.gridy = 0;
        gridBagConstraints3.gridwidth = 1;
        gridBagConstraints3.gridheight = 1;
        gridBagConstraints3.fill = 1;
        gridBagConstraints3.weightx = 1.0;
        gridBagConstraints3.weighty = 1.0;
        gridBagConstraints3.anchor = 17;
        gridBagConstraints3.insets = new Insets(0, 0, 0, 0);
        this.o00000(this.\u00d2\u00f50000[0], gridBagConstraints);
        this.o00000(this.\u00d2\u00f50000[1], gridBagConstraints2);
        this.o00000(this.\u00d2\u00f50000[2], gridBagConstraints3);
    }

    public void doObject() {
        this.\u00d2\u00f50000[0].\u00d6O0000();
        this.\u00d2\u00f50000[1].\u00d6O0000();
        this.\u00d2\u00f50000[2].\u00d6O0000();
    }

    @Override
    public void o00000(oooo_1 oooo_12) {
        this.\u00d2\u00f50000[0].o00000(oooo_12);
        this.\u00d2\u00f50000[1].o00000(oooo_12);
        this.\u00d2\u00f50000[2].o00000(oooo_12);
    }
}

