package ru.kvshe.questionnaire.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kvshe.questionnaire.model.Question;
import ru.kvshe.questionnaire.service.QuestionService;

@Controller
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping
    public String getAllQuestions(Model model) {
        model.addAttribute("questions", questionService.getAllQuestions());
        return "questions/questions";
    }

    @GetMapping("/{id}")
    public String getQuestionById(@PathVariable Long id, Model model) {
        model.addAttribute("question", questionService.getQuestionById(id));
        return "questions/question";
    }

    @GetMapping("/new")
    public String newQuestion(Model model) {
        model.addAttribute("question", new Question());
        return "questions/new";
    }

    @PostMapping("/new")
    public String newQuestion(@ModelAttribute("question") Question question) {
        questionService.createQuestion(question);
        return "redirect:/questions";
    }

    @GetMapping("/{id}/edit")
    public String updateQuestion(@PathVariable Long id, Model model) {
        model.addAttribute("question", questionService.getQuestionById(id));
        return "questions/edit";
    }

    @PutMapping("/{id}/edit")
    public String updateQuestion(@PathVariable Long id, @ModelAttribute("question") Question question) {
        questionService.updateQuestion(id, question);
        return "redirect:/questions";
    }

    @DeleteMapping("/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return "redirect:/questions";
    }
}
