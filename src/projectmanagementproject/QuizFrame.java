/* Brandon Lit
 * 2017-05-15
 * This is the frame for the quiz*/
package projectmanagementproject;

import java.awt.Color;
import java.util.Set;

/**
 *
 * @author Brandon
 */
public class QuizFrame extends javax.swing.JFrame {

    int count = 0;
    double correctAns = 0;
    ProjectManagementProject MainWindow;
    MultipleChoice[] questions;
    int[] indexes;
    boolean answer, started = false;
    int currentIndex = 0;

    /**
     * Creates new form QuizFrame
     */
    public QuizFrame(ProjectManagementProject m, MultipleChoice[] q) {
        initComponents();
        MainWindow = m;
        questions = q;
        indexes = new int[questions.length];
        for (int j = 0; j < indexes.length; j++) {
            indexes[j] = j;
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

        rBtnGrpAns = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        rBtnA = new javax.swing.JRadioButton();
        rBtnB = new javax.swing.JRadioButton();
        rBtnC = new javax.swing.JRadioButton();
        rBtnD = new javax.swing.JRadioButton();
        btnAns = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblQNum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practice Quiz");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        rBtnGrpAns.add(rBtnA);
        rBtnA.setText("Option A");

        rBtnGrpAns.add(rBtnB);
        rBtnB.setText("Option B");

        rBtnGrpAns.add(rBtnC);
        rBtnC.setText("Option C");

        rBtnGrpAns.add(rBtnD);
        rBtnD.setText("Option D");
        rBtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnDActionPerformed(evt);
            }
        });

        btnAns.setText("Select Answer");
        btnAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnsActionPerformed(evt);
            }
        });

        btnNext.setText("Start Quiz!");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblQNum.setText("You have answered 0 of 10 questions");

        jScrollPane1.setEnabled(false);

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rBtnC)
                                    .addComponent(rBtnA))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rBtnD)
                                    .addComponent(rBtnB))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnA)
                    .addComponent(rBtnB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnC)
                    .addComponent(rBtnD)
                    .addComponent(btnNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblQNum))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //When the Back button is pressed
        this.setVisible(false);
        MainWindow.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnsActionPerformed
        //When the Select answer button is pressed
        if (questions[currentIndex].isTrueFalse) {
            if (rBtnA.isSelected() && questions[currentIndex].getTFAnswer()) {//if true was selected and the answer is true
                answer = true;//sets the answer boolean to true
            } else if (rBtnB.isSelected() && !questions[currentIndex].getTFAnswer()) {//if false was selected and the answer is false
                answer = true;//sets the answer boolean to true
            } else {//if the correct answer was NOT selected
                answer = false;//sets the answer boolean to false
            }
        } else {//if it is a regular multiple choice question
            //checks to see if the correct answer was selected
            if (rBtnA.isSelected() && questions[currentIndex].getMCAnswer().equals("A")) {//if the answer is A and A is selected
                answer = true;//sets the answer boolean to true
            } else if (rBtnB.isSelected() && questions[currentIndex].getMCAnswer().equals("B")) {//if the answer is B and B is selected
                answer = true;//sets the answer boolean to true
            } else if (rBtnC.isSelected() && questions[currentIndex].getMCAnswer().equals("C")) {//if the answer is C and C is selected
                answer = true;//sets the answer boolean to true
            } else if (rBtnD.isSelected() && questions[currentIndex].getMCAnswer().equals("D")) {//if the answer is D and D is selected
                answer = true;//sets the answer boolean to true
            } else {//if the correct answer was NOT selected
                answer = false;//sets the answer boolean to false
            }
        }
        //checks to see if the correct answer was chosen (answer is true)
        if (answer) {//if the question was answered correctly
            //sets the background colour of the question to green
            txtQuestion.setBackground(Color.green);
            //increments the number of correct answers 
            correctAns += 1;
        } else {//if the question was answered incorrectly
            //sets the background colour to red
            txtQuestion.setBackground(Color.red);
        }

        btnAns.setEnabled(false);

    }//GEN-LAST:event_btnAnsActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        btnNext.setText("Next Question");
        btnAns.setEnabled(true);
        txtQuestion.setBackground(Color.white);
        displayQuestions(count);
        if (count < indexes.length && started == true) {
            count++;
        }
        started = true;
        lblQNum.setText("You have answered " + count + " out of 10 questions and gotten " + ((correctAns / count) * 100) + "% correct");
    }//GEN-LAST:event_btnNextActionPerformed

    private void rBtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnDActionPerformed

    /**
     *
     */
    private void randomQuestion() {
        //creates a boolean and integer to keep track of whether or not the question has been picked
        boolean isNew = false;
        int index = 0, baseCase = 0;
        //generates a random number between zero and the number of questions
        currentIndex = (int) (Math.random() * indexes.length);
        //for the number of questions
        for (int i = 0; i < indexes.length; i++) {
            //checks to see if the indexes match
            if (currentIndex == indexes[i]) {
                //if they match set the boolean to true
                isNew = true;
                //set the indec to the value of i
                index = i;
            }
            if (indexes[i] == -1) {
                baseCase += 1;
            }
        }

        if (baseCase == indexes.length) {
            btnAns.setEnabled(false);
            btnNext.setEnabled(false);
        } else {
            //if the number was new
            if (isNew) {
                //"removes" the number at that index
                indexes[index] = -1;
            } else {
                //if it wasn't generate a new random number
                randomQuestion();
            }
        }
    }

    /**
     * display the question
     */
    private void displayQuestions(int count) {
        //runs the random question method
        randomQuestion();
        //display the question in the appropriate place
        txtQuestion.setText(questions[currentIndex].getQuestion());
        //if it is a true or false question
        if (questions[currentIndex].isTrueFalse) {
            //disable 2 of the radio buttons so that the user cant select them
            rBtnC.setEnabled(false);
            rBtnD.setEnabled(false);
            //set the other 2 buttons to say true or false
            rBtnA.setText("TRUE");
            rBtnB.setText("FALSE");
            //if its not true or false
        } else {
            //enable the other 2 buttons just incase the last question was true or false
            rBtnC.setEnabled(true);
            rBtnD.setEnabled(true);
            //display all of the answers
            rBtnA.setText(questions[currentIndex].getAnswerA());
            rBtnB.setText(questions[currentIndex].getAnswerB());
            rBtnC.setText(questions[currentIndex].getAnswerC());
            rBtnD.setText(questions[currentIndex].getAnswerD());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQNum;
    private javax.swing.JRadioButton rBtnA;
    private javax.swing.JRadioButton rBtnB;
    private javax.swing.JRadioButton rBtnC;
    private javax.swing.JRadioButton rBtnD;
    private javax.swing.ButtonGroup rBtnGrpAns;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
