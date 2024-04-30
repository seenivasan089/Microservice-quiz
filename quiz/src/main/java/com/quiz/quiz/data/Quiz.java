package com.quiz.quiz.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Quiz {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_generator")
	//@SequenceGenerator(name = "question_generator", sequenceName = "question_seq", allocationSize = 1)
	private Integer quizId;
	private Integer questionId;

}
