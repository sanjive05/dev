package com.ai.chatbot.Controller;

import com.ai.chatbot.service.QnaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/qna")
public class AiController {
    @Autowired
    private final QnaService qnaService;

    public AiController(QnaService qnaService) {
        this.qnaService = qnaService;
    }
    @GetMapping("/bot")
    public ResponseEntity<String> askQuestion(@RequestBody Map<String,String> payLoad){
        String question = payLoad.get("question");
        String answer = qnaService.getAnswer(question);
        return new ResponseEntity<>(answer, HttpStatus.OK);
    }
}
