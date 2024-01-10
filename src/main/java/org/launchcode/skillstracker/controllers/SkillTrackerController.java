package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillTrackerController {
    @GetMapping
    @ResponseBody
    public String index() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>Get to learning these skills!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" ;
               // "<p><a href = '/personal'>Show completed form</a></p>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html = "<form method = 'get' action = '/personal'>" +
                "<p>Name:</p>" +
                "<input name = 'name' type = 'text'>" +
                "<p>My favorite language:</p>" +
                "<select name = 'first'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<p>My second favorite language:</p>" +
                "<select name = 'second'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<p>My favorite language:</p>" +
                "<select name = 'third'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br><br>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>";
        return html;
    }

    @RequestMapping(value = "personal", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String personal(@RequestParam String name, @RequestParam String first, @RequestParam String second,@RequestParam String third) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+ first + "</li>" +
                "<li>"+ second + "</li>" +
                "<li>"+ third + "</li>" +
                "</ol>";
        return html;
    }

}
