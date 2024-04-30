package com.quiz.quiz.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("QUESTION")
//@Component
@Repository
public interface Quizquestion {
	@GetMapping("question/generate")
	public ResponseEntity<List<Integer>> getQuestionForQuiz();

}
