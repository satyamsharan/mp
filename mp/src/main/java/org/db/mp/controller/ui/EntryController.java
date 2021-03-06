/**
 * 
 */
package org.db.mp.controller.ui;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@Controller
public class EntryController {
	static Logger logger = Logger.getLogger("mp");

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap map) {
		logger.info("Reached in the controller");
		map.put("msg", "Hello Spring 4 Web MVC!");
		return "index";
	}
}
