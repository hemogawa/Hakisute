/**
 *
 */
package hakisute.form;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

/**
 * @author Mariko
 *
 */
public class EntryForm {

	@Required
	@Maxlength(maxlength=255)
	public String entry_body;

	@Maxlength(maxlength=255)
	public String tag_names;

}
