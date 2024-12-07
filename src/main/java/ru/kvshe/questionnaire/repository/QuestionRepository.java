package ru.kvshe.questionnaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kvshe.questionnaire.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
