package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class certificate {
    private  String course;
    private String duration;
    public certificate(){
        super();
    }

    public certificate(String course,String duration) {
        this.course = course;
        this.duration=duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration(String s) {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
