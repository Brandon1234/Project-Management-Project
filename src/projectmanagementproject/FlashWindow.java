/*A Karapostolakis
  2017-05-15
  Window for the flash card viewer*/
package projectmanagementproject;

import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Reads in flash cards and presents them to the user.
 *
 * @author andrew
 */
public class FlashWindow extends javax.swing.JFrame {

	private ProjectManagementProject mainWindow;
	private int currentIndex;
	private String[] cards;

	/**
	 * Creates new form FlashWindow.
	 * <p>
	 * The FlashWindow window allows the user to browse the contents of the
	 * flash cards located in {@code FlashData.txt}.
	 *
	 * @param m The main window of the application
	 */
	public FlashWindow(ProjectManagementProject m) {
		initComponents();
		mainWindow = m;
		currentIndex = 0;
		//read flash card info from data file
		try {
			BufferedReader file = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("FlashData.txt")));
			//read each line as a single flash card, add to arraylist
			List<String> cardsIn = new ArrayList<>();
			boolean eof = false;
			//loop through each line of data file
			while (!eof) {
				String str = file.readLine();
				if (str == null) {
					eof = true;
				} else {
					cardsIn.add(str);
				}
			}
			//store final list of cards in array
			cards = cardsIn.toArray(new String[0]);
			//check if data exists in array
			if (cards.length <= 0) {
				//no data
				throw new IOException();
			}
			//otherwise data has been successfully stored
			//display first flash card
			update();
		} catch (IOException e) {
			System.err.println(e);
			//display error, disable nav buttons
			btnFirst.setEnabled(false);
			btnLast.setEnabled(false);
			btnPrev.setEnabled(false);
			btnNext.setEnabled(false);
			btnRand.setEnabled(false);
			txtDisplay.setText("Flash card data missing or empty");
		}
	}

	/**
	 * Refreshes the flash card display area.
	 */
	private void update() {
		//check if any students exist
		if (cards.length > 0) {
			//display current flash card
			txtDisplay.setText("Study hint " + (currentIndex + 1) + ":\n" + cards[currentIndex]);
			//check if at beginning of array
			if (currentIndex == 0) {
				//gray out 'previous' buttons
				btnFirst.setEnabled(false);
				btnPrev.setEnabled(false);
			} else {
				btnFirst.setEnabled(true);
				btnPrev.setEnabled(true);
			}

			//check if at end of array
			if (currentIndex == cards.length - 1) {
				//gray out 'next' buttons
				btnLast.setEnabled(false);
				btnNext.setEnabled(false);
			} else {
				btnLast.setEnabled(true);
				btnNext.setEnabled(true);
			}

		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnRand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flash Card Viewer");

        btnMenu.setText("Main menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtDisplay.setEditable(false);
        txtDisplay.setColumns(20);
        txtDisplay.setLineWrap(true);
        txtDisplay.setRows(5);
        txtDisplay.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDisplay);

        btnFirst.setText("<<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setText("<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnRand.setText("Random");
        btnRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenu))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu)
                    .addComponent(btnFirst)
                    .addComponent(btnPrev)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnRand))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
		//show main window
		mainWindow.setVisible(true);
		//hide main window
		this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
		//move to beginning of array
		currentIndex = 0;
		update();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
		//decrement array index
		currentIndex--;
		update();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
		//increment array index
		currentIndex++;
		update();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
		//move to end of array
		currentIndex = cards.length - 1;
		update();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandActionPerformed
		//set array index to random number
		currentIndex = ThreadLocalRandom.current().nextInt(cards.length);
		update();
    }//GEN-LAST:event_btnRandActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnRand;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplay;
    // End of variables declaration//GEN-END:variables
}
