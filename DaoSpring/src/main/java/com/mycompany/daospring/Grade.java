/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daospring;

import org.springframework.stereotype.Component;

/**
 *
 * @author karthik
 */
@Component
public class Grade {

    private String grade;
    private String subject;

    public String getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setGrade(String grade) {
        this.grade = grade;

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Grade[grade=" + grade + ", subject=" + subject + "]";
    }

}
