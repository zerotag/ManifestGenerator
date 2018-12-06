package view;

import engine.CrawlerProducer;
import engine.SharedMemory;
import engine.UnloaderConsumer;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

public class MainUI extends javax.swing.JFrame {
	
	private static javax.swing.border.Border DEFAULT_BORDER;
	private static javax.swing.border.Border SUCCESS_BORDER;
	private static javax.swing.border.Border WARNING_BORDER;
	private static javax.swing.border.Border BADIDEA_BORDER;
	
	public MainUI(boolean debug) {
		initComponents();
		DEFAULT_BORDER = sourceFolder.getBorder();
		SUCCESS_BORDER = new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 2, true);
		WARNING_BORDER = new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true);
		BADIDEA_BORDER = new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true);
		if (!debug) {
			srcOpt1.setVisible(false);
			srcOpt2.setVisible(false);
			srcOpt3.setVisible(false);
			
			tarOpt1.setVisible(false);
			tarOpt2.setVisible(false);
			tarOpt3.setVisible(false);
		}
		sourceFolder.grabFocus();
		
		closeSidebar();
		setLocationRelativeTo(null);
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appFrame = new javax.swing.JPanel();
        appGenerate = new javax.swing.JPanel();
        appSidebarToggler = new javax.swing.JToggleButton();
        appFileCounter = new javax.swing.JLabel();
        appHeader = new javax.swing.JLabel();
        appBody = new javax.swing.JPanel();
        sourceFolder = new javax.swing.JTextField();
        sourceLabel = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        targetLabel = new javax.swing.JLabel();
        targetFolder = new javax.swing.JTextField();
        generateBTN = new javax.swing.JButton();
        sourceChooser = new javax.swing.JButton();
        targetChooser = new javax.swing.JButton();
        srcOpt1 = new javax.swing.JButton();
        srcOpt2 = new javax.swing.JButton();
        srcOpt3 = new javax.swing.JButton();
        tarOpt1 = new javax.swing.JButton();
        tarOpt2 = new javax.swing.JButton();
        tarOpt3 = new javax.swing.JButton();
        separator2 = new javax.swing.JSeparator();
        generatorProgressBar = new javax.swing.JProgressBar();
        appSidebar = new javax.swing.JPanel();
        appLoggerScroll = new javax.swing.JScrollPane();
        appLogger = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manifest Generator");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgs/icon.png")));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appFrame.setLayout(new java.awt.CardLayout());

        appGenerate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appSidebarToggler.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        appSidebarToggler.setText(">");
        appSidebarToggler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appSidebarTogglerActionPerformed(evt);
            }
        });
        appGenerate.add(appSidebarToggler, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 25, -1, 25));

        appFileCounter.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        appFileCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        appFileCounter.setText(" ");
        appFileCounter.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        appGenerate.add(appFileCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 3, 460, -1));

        appHeader.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        appHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appHeader.setText("Manifest Generator");
        appGenerate.add(appHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 480, 50));

        appBody.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sourceFolder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sourceFolder.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        sourceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sourceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sourceLabel.setText("Source Folder");
        sourceLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        targetLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        targetLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        targetLabel.setText("Destination Folder");
        targetLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        targetFolder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        targetFolder.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        generateBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generateBTN.setText("GENERATE");
        generateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBTNActionPerformed(evt);
            }
        });

        sourceChooser.setText("Choose ...");
        sourceChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceChooserActionPerformed(evt);
            }
        });

        targetChooser.setText("Choose ...");
        targetChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetChooserActionPerformed(evt);
            }
        });

        srcOpt1.setText("C:/");
        srcOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcOpt1ActionPerformed(evt);
            }
        });

        srcOpt2.setActionCommand("I:/A Galeria");
        srcOpt2.setLabel("I:/A Galeria");
        srcOpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcOpt2ActionPerformed(evt);
            }
        });

        srcOpt3.setText("C:/Dropbox");
        srcOpt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcOpt3ActionPerformed(evt);
            }
        });

        tarOpt1.setActionCommand("I:/");
        tarOpt1.setLabel("I:/");
        tarOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarOpt1ActionPerformed(evt);
            }
        });

        tarOpt2.setText("C:/A Galeria");
        tarOpt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarOpt2ActionPerformed(evt);
            }
        });

        tarOpt3.setText("C:/Dropbox");
        tarOpt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarOpt3ActionPerformed(evt);
            }
        });

        generatorProgressBar.setStringPainted(true);

        javax.swing.GroupLayout appBodyLayout = new javax.swing.GroupLayout(appBody);
        appBody.setLayout(appBodyLayout);
        appBodyLayout.setHorizontalGroup(
            appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(separator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(appBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(appBodyLayout.createSequentialGroup()
                        .addComponent(targetFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(targetChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addGroup(appBodyLayout.createSequentialGroup()
                        .addComponent(sourceFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sourceChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(appBodyLayout.createSequentialGroup()
                        .addComponent(targetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarOpt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarOpt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarOpt3))
                    .addGroup(appBodyLayout.createSequentialGroup()
                        .addComponent(sourceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcOpt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcOpt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcOpt3))
                    .addComponent(generatorProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        appBodyLayout.setVerticalGroup(
            appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sourceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(srcOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srcOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(srcOpt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sourceFolder)
                    .addComponent(sourceChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tarOpt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tarOpt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(targetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tarOpt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatorProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        appGenerate.add(appBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 500, 290));

        appFrame.add(appGenerate, "card1");

        getContentPane().add(appFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        appSidebar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        appLoggerScroll.setBorder(null);
        appLoggerScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        appLogger.setEditable(false);
        appLogger.setBackground(new java.awt.Color(240, 240, 240));
        appLogger.setBorder(null);
        appLogger.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        appLoggerScroll.setViewportView(appLogger);

        javax.swing.GroupLayout appSidebarLayout = new javax.swing.GroupLayout(appSidebar);
        appSidebar.setLayout(appSidebarLayout);
        appSidebarLayout.setHorizontalGroup(
            appSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appLoggerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        appSidebarLayout.setVerticalGroup(
            appSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appLoggerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        getContentPane().add(appSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 0, 285, 357));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
	
	public final void lockUI(){
		for (Component compt : appBody.getComponents()){
			compt.setEnabled(false);
		}
		setCursor( Cursor.getPredefinedCursor( Cursor.WAIT_CURSOR ) );
	}
	
	public final void unlockUI(){
		resetUI();
		for (Component compt : appBody.getComponents()){
			compt.setEnabled(true);
		}
		setCursor( Cursor.getDefaultCursor() );
	}
	
	private void resetUI(){
		generateBTN.setText("GENERATE");
		generatorProgressBar.setMinimum(0);
		generatorProgressBar.setMaximum(100);
		generatorProgressBar.setValue(0);
		
		sourceFolder.setText( "" );
		targetFolder.setText( "" );

		sourceFolder.setBorder( DEFAULT_BORDER );
		targetFolder.setBorder( DEFAULT_BORDER );
	}
	
	public JTextPane getLogger() {
		return this.appLogger;
	}
	
	public JButton getGenerateBTN() {
		return this.generateBTN;
	}
	
	public JProgressBar getProgressBar() {
		return this.generatorProgressBar;
	}
	
	public JLabel getFileCounter() {
		return this.appFileCounter;
	}
	
	private void openSidebar() {
		this.setSize((int)(this.getSize().getWidth()) + ((int)appSidebar.getSize().getWidth() + 6), (int)(this.getSize().getHeight()));
	}
	
	private void closeSidebar() {
		this.setSize((int)(this.getSize().getWidth()) - ((int)appSidebar.getSize().getWidth() + 6), (int)(this.getSize().getHeight()));
	}
	
    private void generateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateBTNActionPerformed
		if ( sourceFolder.getText().isEmpty() || targetFolder.getText().isEmpty() ) {
			sourceFolder.setBorder( WARNING_BORDER );
			targetFolder.setBorder( WARNING_BORDER );
			JOptionPane.showMessageDialog( null, "[ERROR] Source or Target folder cannot be empty!" );
			unlockUI();
			return;
		}
		
		if ( !sourceFolder.getText().endsWith("\\") ) { sourceFolder.setText( sourceFolder.getText() + "\\" ); }
		if ( !targetFolder.getText().endsWith("\\") ) { targetFolder.setText( targetFolder.getText() + "\\" ); }
		
		if ( ! new File(sourceFolder.getText()).exists() || ! new File( targetFolder.getText() ).exists() ) {
			unlockUI();
			JOptionPane.showMessageDialog( null,  "[ERROR] Invalid Source or Target folder!" );
			return;
		}
		
		sourceFolder.setBorder( SUCCESS_BORDER );
		targetFolder.setBorder( SUCCESS_BORDER );
		
		SharedMemory memory = new SharedMemory();
		Thread crawler = new Thread(new CrawlerProducer(memory, sourceFolder.getText()));
		Thread unloader = new Thread(new UnloaderConsumer(memory, targetFolder.getText() + "\\.manifest"));
		crawler.start();
		unloader.start();
    }//GEN-LAST:event_generateBTNActionPerformed

    private void sourceChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceChooserActionPerformed
        //SOURCE FOLDER
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode( chooser.getFileSelectionMode() + 1 );
		if ( chooser.showOpenDialog( null ) == 0 ) {
			File path = chooser.getSelectedFile();
			String pathName = path.getAbsolutePath();
			sourceFolder.setText( pathName + "\\" );
			sourceFolder.setBorder( SUCCESS_BORDER );
		}
    }//GEN-LAST:event_sourceChooserActionPerformed

    private void targetChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetChooserActionPerformed
        //TARGET FOLDER
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode( chooser.getFileSelectionMode() + 1 );
		if ( chooser.showOpenDialog( null ) == 0 ) {
			File path = chooser.getSelectedFile();
			String pathName = path.getAbsolutePath();
			targetFolder.setText( pathName + "\\" );
			targetFolder.setBorder( SUCCESS_BORDER );
		}
    }//GEN-LAST:event_targetChooserActionPerformed

    private void srcOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcOpt1ActionPerformed
		// Option 1 ( "C:\" )
		sourceFolder.setText( "C:\\" );
		sourceFolder.setBorder( BADIDEA_BORDER );
    }//GEN-LAST:event_srcOpt1ActionPerformed

    private void srcOpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcOpt2ActionPerformed
		// Option 2 ( "C:\A Galeria" )
		sourceFolder.setText( "I:\\A Galeria\\" );
		sourceFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_srcOpt2ActionPerformed

    private void srcOpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcOpt3ActionPerformed
		// Option 3 ( "C:\Dropbox" )
		sourceFolder.setText( "C:\\Dropbox\\" );
		sourceFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_srcOpt3ActionPerformed

    private void tarOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarOpt1ActionPerformed
        // Option 1 ( "C:\" )
		targetFolder.setText( "I:\\" );
		targetFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_tarOpt1ActionPerformed

    private void tarOpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarOpt2ActionPerformed
        // Option 2 ( "C:\A Galeria" )
		targetFolder.setText( "C:\\A Galeria\\" );
		targetFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_tarOpt2ActionPerformed

    private void tarOpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarOpt3ActionPerformed
        // Option 3 ( "C:\Dropbox" )
		targetFolder.setText( "C:\\Dropbox\\" );
		targetFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_tarOpt3ActionPerformed

    private void appSidebarTogglerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appSidebarTogglerActionPerformed
        if (appSidebarToggler.isSelected()) {
			appSidebarToggler.setText("<");
            openSidebar();
        } else {
			appSidebarToggler.setText(">");
            closeSidebar();
        }
    }//GEN-LAST:event_appSidebarTogglerActionPerformed

	public static MainUI run(boolean debug) throws InterruptedException {
        //<editor-fold defaultstate="collapsed" desc=" Look and Feel ">
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		return new MainUI(debug);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appBody;
    private javax.swing.JLabel appFileCounter;
    private javax.swing.JPanel appFrame;
    private javax.swing.JPanel appGenerate;
    private javax.swing.JLabel appHeader;
    private javax.swing.JTextPane appLogger;
    private javax.swing.JScrollPane appLoggerScroll;
    private javax.swing.JPanel appSidebar;
    private javax.swing.JToggleButton appSidebarToggler;
    private javax.swing.JButton generateBTN;
    private javax.swing.JProgressBar generatorProgressBar;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JButton sourceChooser;
    private javax.swing.JTextField sourceFolder;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JButton srcOpt1;
    private javax.swing.JButton srcOpt2;
    private javax.swing.JButton srcOpt3;
    private javax.swing.JButton tarOpt1;
    private javax.swing.JButton tarOpt2;
    private javax.swing.JButton tarOpt3;
    private javax.swing.JButton targetChooser;
    private javax.swing.JTextField targetFolder;
    private javax.swing.JLabel targetLabel;
    // End of variables declaration//GEN-END:variables
}
