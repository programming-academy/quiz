package org.academy.quiz.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public final class HomePage {

	@RequestMapping("/")
	@ResponseBody
	public static String homePage() {
		return "It's works!";
	}

}
