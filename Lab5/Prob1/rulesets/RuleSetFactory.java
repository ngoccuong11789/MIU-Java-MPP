package Lab5.Prob1.rulesets;

import Lab5.Prob1.gui.BookWindow;
import Lab5.Prob1.gui.CDWindow;

import java.awt.Component;
import java.util.HashMap;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	 public static RuleSet getRuleSet(Component component) {
		if(component instanceof BookWindow) {
			return new BookRuleSet();
		} else if (component instanceof CDWindow) {
			return new CDRuleSet();
		}
		return null;
	 }
	
}
