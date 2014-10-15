package org.academy.quiz.portal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HomePage {

	@RequestMapping("/")
	public static String homePage() {
		return "It's works!";
	}

}
