package Lab5.Prob1.rulesets;

import Lab5.Prob1.gui.CDWindow;

import java.awt.Component;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		CDWindow cdWindow = (CDWindow) ob;

		String price = cdWindow.getPriceValue();

		if (price.isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}

		if (!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}

		if (Double.parseDouble(price) <= 0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}
	
}
