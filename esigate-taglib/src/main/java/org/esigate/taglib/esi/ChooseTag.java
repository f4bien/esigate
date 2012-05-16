package org.esigate.taglib.esi;

import javax.servlet.jsp.tagext.TagSupport;

public class ChooseTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	private boolean condition;
	private boolean hasCondition;

	@Override
	public int doStartTag() {
		condition = false;
		hasCondition = false;
		return EVAL_BODY_INCLUDE;
	}

	public boolean hasCondition() {
		return hasCondition;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
		hasCondition = true;
	}

	public void setHasCondition(boolean hasCondition) {
		this.hasCondition = hasCondition;
	}
}