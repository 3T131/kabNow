package com.accp.entity;
//用户表
public class User {
    private String userCode;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedQuestion() {
        return encryptedQuestion;
    }

    public void setEncryptedQuestion(String encryptedQuestion) {
        this.encryptedQuestion = encryptedQuestion;
    }

    public String getEncryptedAnswer() {
        return encryptedAnswer;
    }

    public void setEncryptedAnswer(String encryptedAnswer) {
        this.encryptedAnswer = encryptedAnswer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String pwd;
    private String email;
    private String encryptedQuestion;
    private String encryptedAnswer;
    private String status;
}
