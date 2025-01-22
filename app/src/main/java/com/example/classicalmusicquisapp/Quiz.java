package com.example.classicalmusicquisapp;

// Quiz.java
public class Quiz {
    public String question; // 問題文
    public String[] options; // 選択肢
    public boolean[] correctAnswers; // 正解の選択肢
    public String explanation; // 解説
    public int type; // クイズ形式: 0 = 4択, 1 = 複数選択, 2 = ◯✘

    public Quiz(String question, String[] options, boolean[] correctAnswers, String explanation, int type) {
        this.question = question;
        this.options = options;
        this.correctAnswers = correctAnswers;
        this.explanation = explanation;
        this.type = type;
    }
}
