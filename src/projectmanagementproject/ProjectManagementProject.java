/* A Karapostolakis, B Lit, G Smith
 * 2017-05-16
 * Multiple choice program*/
package projectmanagementproject;

import java.io.*;

public class ProjectManagementProject extends javax.swing.JFrame {

	private QuizFrame QuizWindow;
	private static MultipleChoice[] questions = new MultipleChoice[10];
	private FlashWindow flashWindow;

	/**
	 * Creates new form ProjectManagementProject
	 */
	public ProjectManagementProject() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFlash = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);

        btnFlash.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnFlash.setText("Flash Cards");
        btnFlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlashActionPerformed(evt);
            }
        });

        btnQuiz.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnQuiz.setText("Quiz Me!");
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("The Project Management Review Program");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFlash, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(btnFlash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
		//When the exit button is clicked the program exits
		System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
		//When the Quiz Me button is pressed

		//checks to see if the quiz window has been created
		if (QuizWindow == null) {
			QuizWindow = new QuizFrame(this, questions);
		}
		//sets the quiz window to visible
		QuizWindow.setVisible(true);
		//hides the main window
		this.setVisible(false);
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnFlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlashActionPerformed
		//only create a flash card window if one does not already exist
		if (flashWindow == null) {
			flashWindow = new FlashWindow(this);
		}
		//show flash card window
		flashWindow.setVisible(true);
		//hide main window
		this.setVisible(false);
    }//GEN-LAST:event_btnFlashActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ProjectManagementProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ProjectManagementProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ProjectManagementProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ProjectManagementProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		String type, question, ansA, ansB, ansC, ansD, correctAns;
		boolean tfAns;
		try {
			//gets location of question file
			BufferedReader br = new BufferedReader(new InputStreamReader(ProjectManagementProject.class.getResourceAsStream("Questions.txt")));
			//reads in the question

			for (int i = 0; i < 10; i++) {
				type = br.readLine();
				//checks to see if the question is a true or false question
				if (type.equals("TF")) {
					//get the question
					question = br.readLine();
					//get the answer, and turn it into a boolean to be passed to the question object
					if (br.readLine().equals("T")) {
						tfAns = true;
					} else {
						tfAns = false;
					}
					questions[i] = new MultipleChoice(question, tfAns);
				} else {
					//get the question
					question = br.readLine();
					//Reads in the correct answer
					correctAns = br.readLine();
					//reads in all the answers
					ansA = br.readLine();
					ansB = br.readLine();
					ansC = br.readLine();
					ansD = br.readLine();
					//creates a new question
					questions[i] = new MultipleChoice(question, ansA, ansB, ansC, ansD, correctAns);
				}
			}
		} catch (IOException | NullPointerException e) {
			System.out.println(e);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ProjectManagementProject().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFlash;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
