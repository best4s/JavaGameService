package org.tont.core.global.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class HardwarePanel extends JPanel {

	private static final long serialVersionUID = 2329271184658064412L;
	private JPanel info;
	private JPanel logger;

	public HardwarePanel() {
		
		//设置布局
		GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 0 };
        gridBagLayout.rowHeights = new int[] { 0, 0 };
        gridBagLayout.columnWeights = new double[] { 1.0E-4 };
        gridBagLayout.rowWeights = new double[] { 0.0, 1.0E-4 };
        this.setLayout(gridBagLayout);
        
        //添加控件
        {
        	info = new HardwareInfoChildPanel("硬件信息");
        	info.setPreferredSize(new Dimension(410, 220));
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(10, 10, 10, 10);
            constraints.gridx = 0;
            constraints.gridy = 0;
            add(info, constraints);
        }
        {
        	logger = new LogChildPanel("硬件日志");
        	logger.setPreferredSize(new Dimension(410, 220));
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.fill = GridBagConstraints.BOTH;
            constraints.insets = new Insets(10, 10, 10, 10);
            constraints.gridx = 0;
            constraints.gridy = 1;
            add(logger, constraints);
        }
	}
}
