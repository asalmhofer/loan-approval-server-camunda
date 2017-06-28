package org.camunda.bpm.getstarted.loanapproval;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DenyLoanDelegate implements JavaDelegate{

	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Internally processing the loan denial...");
		/* execution.setVariable("mailSubject", "Loan Request Denied");
		execution.setVariable("mailContent", "Dear Customer, Unfortunately the loan request has been denied!"); */
	}

}
