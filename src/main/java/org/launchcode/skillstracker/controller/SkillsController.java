package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String home() {
        return "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "    <li>Javascript</li>\n" +
                "    <li>Python</li>\n" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String form() {
        return "<form>\n" +
                "    <label for=\"name\">Enter your name:</label>\n" +
                "    <input name=\"name\"/>\n" +
                "    <br />\n" +
                "    <label for=\"favorite\">Favorite</label>\n" +
                "    <select name=\"favorite\">\n" +
                "        <option></option>\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">Javascript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "\n" +
                "    <br />\n" +
                "    <label for=\"secondFavorite\">Second Favorite</label>\n" +
                "    <select name=\"secondFavorite\">\n" +
                "        <option></option>\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">Javascript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "\n" +
                "    <br />\n" +
                "    <label for=\"thirdFavorite\">Third Favorite</label>\n" +
                "    <select name=\"thirdFavorite\">\n" +
                "        <option></option>\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">Javascript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select>\n" +
                "    <input type=\"submit\" />\n" +
                "</form>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String formResponse() {
        return "";

    }
}
