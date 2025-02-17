package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class question {
    @Id
    @Column(name="question_id")
        private  int questionid;
        private String question;
        @OneToOne
        private Answer answer;


    public question(int questionid,String question,Answer answer) {
        this.questionid = questionid;
        this.question=question;
        this.answer=answer;
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public question(){
        super();
    }
}

