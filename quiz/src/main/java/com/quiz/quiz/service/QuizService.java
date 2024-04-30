package com.quiz.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quiz.quiz.dao.QuizDAO;
import com.quiz.quiz.dao.Quizquestion;

@Service
public class QuizService {
	
	@Autowired
	Quizquestion quizquestion;
	
	@Autowired
	QuizDAO quizDAO;
	
	
	
	public ResponseEntity<List<Integer>> createQuiz(String category, int numQuestions){
		return quizquestion.getQuestionForQuiz();
	}

}
