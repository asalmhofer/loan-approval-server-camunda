package org.camunda.bpm.getstarted.loanapproval;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ApproveLoanDelegate implements JavaDelegate{

	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Internally processing the loan approval...");
		LOGGER.info(execution.getVariable("customerName").toString());
		LOGGER.info(execution.getVariable("customerAmount").toString());
		LOGGER.info(execution.getVariable("customerAge").toString());
		
		/*execution.setVariable("mailSubject", "Loan Request Approved");
		execution.setVariable("mailContent", "Dear Customer,\n \n We are happy to announce that your loan request has been approved! \n \n"
				+ "Summary:\n--------\n"
				+ execution.getVariable("customerName").toString() + "\n"
				+ execution.getVariable("customerAmount").toString() + "\n"
				+ execution.getVariable("customerAge").toString()
				);
				*/
	}

}
