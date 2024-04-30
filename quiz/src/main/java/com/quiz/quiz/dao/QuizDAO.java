package com.quiz.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.quiz.data.Quiz;

@Repository
public interface QuizDAO extends JpaRepository<Quiz, Integer>{

}
