/* Brandon Lit
 * 2017-05-12
 * This is the multiple choice class which will be used for all questions*/
package projectmanagementproject;

public class MultipleChoice {
    String ansA, ansB, ansC, ansD, correct;
    Boolean trueFalseAns, isTrueFalse = false;
    String question;
    /**
     * Constructor for multiple choice questions that aren't true or false
     * @param q the question
     * @param a option a
     * @param b option b
     * @param c option c
     * @param d option d
     * @param ans the correct option
     */
    public MultipleChoice(String q, String a, String b, String c, String d, String ans){
        correct = ans;
        ansA = a;
        ansB = b;
        ansC = c;
        ansD = d;
        question = q;
    }
    
    /**
     * Constructor for a true or false questions
     * @param q
     * @param ans 
     */
    public MultipleChoice(String q, boolean ans){
        question = q;
        trueFalseAns = ans;
        isTrueFalse = true;
    }
}
