package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
    @Id
    @Column(name="answer_id")
    private int answerid;
    private String answer;

    public Answer(int answerid,String answer) {
        this.answerid = answerid;
        this.answer=answer;

    }

    public int getAnswerid() {
        return answerid;
    }

    public void setAnswerid(int answerid) {
        this.answerid = answerid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Answer(){
        super();
    }
}
