package com.inetpsa.pct00.pct00demo2.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class EmailNotFoundException extends AbstractThrowableProblem {

    public EmailNotFoundException() {
        super(ErrorConstants.EMAIL_NOT_FOUND_TYPE, "Email address not registered", Status.BAD_REQUEST);
    }
}
