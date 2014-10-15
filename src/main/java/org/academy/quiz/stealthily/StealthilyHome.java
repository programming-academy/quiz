package org.academy.quiz.stealthily;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stealthily")
public final class StealthilyHome {

	@RequestMapping("")
	public static String home() {
		return "running...";
	}

}
