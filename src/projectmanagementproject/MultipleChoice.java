/* Brandon Lit, Garrett Smith
 * 2017-05-16
 * This is the multiple choice class which will be used for all questions*/
package projectmanagementproject;

public class MultipleChoice {

	String ansA, ansB, ansC, ansD, correct;
	Boolean trueFalseAns, isTrueFalse = false;
	String question;

	/**
	 * Constructor for multiple choice questions that aren't true or false.
	 *
	 * @param q The question text
	 * @param a Option a
	 * @param b Option b
	 * @param c Option c
	 * @param d Option d
	 * @param ans The correct option
	 */
	public MultipleChoice(String q, String a, String b, String c, String d, String ans) {
		correct = ans;
		ansA = a;
		ansB = b;
		ansC = c;
		ansD = d;
		question = q;
	}

	/**
	 * Constructor for a true or false question.
	 *
	 * @param q The question text
	 * @param ans The correct option
	 */
	public MultipleChoice(String q, boolean ans) {
		question = q;
		trueFalseAns = ans;
		isTrueFalse = true;
	}

	/**
	 * accessor for the question
	 *
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * accessor for option a
	 *
	 * @return option a
	 */
	public String getAnswerA() {
		return ansA;
	}

	/**
	 * accessor for option b
	 *
	 * @return option b
	 */
	public String getAnswerB() {
		return ansB;
	}

	/**
	 * accessor for option c
	 *
	 * @return option c
	 */
	public String getAnswerC() {
		return ansC;
	}

	/**
	 * accessor for option d
	 *
	 * @return option d
	 */
	public String getAnswerD() {
		return ansD;
	}

	/**
	 * accessor to get the correct answer to a multiple choice question
	 *
	 * @return a string containing A, B, C, or D
	 */
	public String getMCAnswer() {
		return correct;
	}

	/**
	 * accessor for the answer if the question is true or false;
	 *
	 * @return true or false, depending on the answer
	 */
	public boolean getTFAnswer() {
		return trueFalseAns;
	}

	/**
	 * Displays all of the information contained in a question
	 *
	 * @return a string with the relevant info
	 */
	@Override
	public String toString() {
		String s;
		//check if the question is true or false
		if (!isTrueFalse) {
			//if it isnt display the different options and the answer
			s = "Question: " + question
				+ "\na) " + ansA
				+ "\nb) " + ansB
				+ "\nc) " + ansC
				+ "\nd) " + ansD
				+ "Answer: " + correct;
		} else {
			//if it is, show the question and true or false, along with the answer
			s = "Question: " + question
				+ "a) True\nb) False"
				+ "Answer: " + trueFalseAns;
		}
		return s;
	}

	/**
	 * make a new multiple choice question identical to this one
	 *
	 * @return the new question
	 */
	public MultipleChoice clone() {
		//if it is true or false
		if (isTrueFalse) {
			//use the correct constructor
			return new MultipleChoice(question, trueFalseAns);
		} else {
			//if not use the other constructor
			return new MultipleChoice(question, ansA, ansB, ansC, ansD, correct);
		}
	}

	/**
	 * equals method to check if to questions are the same
	 *
	 * @param q takes another question
	 * @return true or false, depending on whether or not the questions are the
	 * same
	 */
	public boolean equals(MultipleChoice q) {
		//if the questions are the same
		if (q.getQuestion().equals(question)) {
			//see if they also have the same answer
			if (isTrueFalse && q.getTFAnswer() == trueFalseAns) {
				//if they do, return true
				return true;
			} else if (q.getMCAnswer().equals(correct)) {
				return true;
			}
		}
		//if they aren't the same, return false
		return false;
	}
}
