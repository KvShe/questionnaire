package ru.kvshe.questionnaire.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NotFoundQuestionException.class)
    public String handleNotFoundQuestionException(NotFoundQuestionException e, Model model) {
        model.addAttribute("message", e.getMessage());
        return "exceptions/not-found-question";
    }
}
