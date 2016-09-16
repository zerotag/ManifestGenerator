package view;

import com.zerotag.utils.BackgroundWorker;
import engine.GeneratorWorker;
import engine.MonitorWorker;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {
	
	private static boolean MONITOR_FLAG = false;
	private static MonitorWorker MONITOR;
	
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
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appFrame = new javax.swing.JPanel();
        appGenerate = new javax.swing.JPanel();
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
        appWorker = new javax.swing.JPanel();
        appWorkerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manifest Generator");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imgs/icon.png")));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);

        appFrame.setLayout(new java.awt.CardLayout());

        appHeader.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        appHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appHeader.setText("Manifest Generator");

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

        srcOpt2.setText("C:/A Galeria");
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

        tarOpt1.setText("C:/");
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
                        .addComponent(targetChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout appGenerateLayout = new javax.swing.GroupLayout(appGenerate);
        appGenerate.setLayout(appGenerateLayout);
        appGenerateLayout.setHorizontalGroup(
            appGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(appGenerateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appGenerateLayout.setVerticalGroup(
            appGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appGenerateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        appFrame.add(appGenerate, "card1");

        appWorkerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appWorkerLabel.setText("GENERATING");

        javax.swing.GroupLayout appWorkerLayout = new javax.swing.GroupLayout(appWorker);
        appWorker.setLayout(appWorkerLayout);
        appWorkerLayout.setHorizontalGroup(
            appWorkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appWorkerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        appWorkerLayout.setVerticalGroup(
            appWorkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appWorkerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        appFrame.add(appWorker, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
	
	public static final void addMonitor(MonitorWorker monitor) {
		if (!MONITOR_FLAG) {
			MONITOR = monitor;
			MONITOR_FLAG = true;
		}
	}
	
	public static final MonitorWorker getMonitor() {
		return MONITOR;
	}
	
	public final void lockUI(){
		MONITOR.addMessage(Start.getTime(), " GUI Locked");
		for (Component compt : appBody.getComponents()){
			compt.setEnabled(false);
		}
		setCursor( Cursor.getPredefinedCursor( Cursor.WAIT_CURSOR ) );
	}
	
	public final void unlockUI(){
		MONITOR.addMessage(Start.getTime(), " GUI Unlocked and Reset");
		resetUI();
		for (Component compt : appBody.getComponents()){
			compt.setEnabled(true);
		}
		setCursor( Cursor.getDefaultCursor() );
	}
	
	private void resetUI(){
		generateBTN.setText("GENERATE");
		generatorProgressBar.setValue(0);
		
		sourceFolder.setText( "" );
		targetFolder.setText( "" );

		sourceFolder.setBorder( DEFAULT_BORDER );
		targetFolder.setBorder( DEFAULT_BORDER );
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
		
		try {
			new GeneratorWorker(this, generateBTN, generatorProgressBar, sourceFolder.getText(), targetFolder.getText()).execute();
		} catch ( Exception e ) {
			MainUI.getMonitor().addMessage(Start.getTime(), "[FATAL-ERROR] " + BackgroundWorker.getStackTrace(e));
		}
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
		// Option 3 ( "C:\A Galeria" )
		sourceFolder.setText( "C:\\A Galeria\\" );
		sourceFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_srcOpt2ActionPerformed

    private void srcOpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcOpt3ActionPerformed
		// Option 3 ( "C:\Dropbox" )
		sourceFolder.setText( "C:\\Dropbox\\" );
		sourceFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_srcOpt3ActionPerformed

    private void tarOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarOpt1ActionPerformed
        // Option 1 ( "C:\" )
		targetFolder.setText( "C:\\" );
		targetFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_tarOpt1ActionPerformed

    private void tarOpt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarOpt2ActionPerformed
        // Option 3 ( "C:\A Galeria" )
		targetFolder.setText( "C:\\A Galeria\\" );
		targetFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_tarOpt2ActionPerformed

    private void tarOpt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarOpt3ActionPerformed
        // Option 3 ( "C:\Dropbox" )
		targetFolder.setText( "C:\\Dropbox\\" );
		targetFolder.setBorder( SUCCESS_BORDER );
    }//GEN-LAST:event_tarOpt3ActionPerformed

	public static MainUI run(boolean debug) throws InterruptedException, InvocationTargetException {
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
    private javax.swing.JPanel appFrame;
    private javax.swing.JPanel appGenerate;
    private javax.swing.JLabel appHeader;
    private javax.swing.JPanel appWorker;
    private javax.swing.JLabel appWorkerLabel;
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
