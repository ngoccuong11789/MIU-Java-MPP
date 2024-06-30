package Lab5.Prob1.rulesets;

import Lab5.Prob1.gui.BookWindow;

import java.awt.Component;



/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	//private BookWindow bookWindow;
	@Override
	public void applyRules(Component ob) throws RuleException {

		BookWindow bookWindow = (BookWindow) ob;

		String isbn = bookWindow.getIsbnValue();
		String price = bookWindow.getPriceValue();

		if (isbn.isEmpty() || price.isEmpty()) {
			throw new RuleException("All fields must be nonempty");
		}

		if (!isbn.matches("\\d+")) {
			throw new RuleException("Isbn must be numeric");
		}

		if (isbn.length() != 10 && isbn.length() != 13) {
			throw new RuleException("Isbn must be either 10 or 13 characters long");
		}

		if (isbn.length() == 10 && !(isbn.startsWith("0") || isbn.startsWith("1"))) {
			throw new RuleException("Isbn of length 10 must start with 0 or 1");
		}

		if (isbn.length() == 13 && !(isbn.startsWith("978") || isbn.startsWith("979"))) {
			throw new RuleException("Isbn of length 13 must start with 978 or 979");
		}

		if (!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places");
		}

		if (Double.parseDouble(price) <= 0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
		
	}


}
