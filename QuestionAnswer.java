package com.example.myquiz;

public class QuestionAnswer {
    public static String question[] = {
            "Which company owns the android?",
            "Which one is not the programing language?",
            "who is the father of programing?",
            "Which company owns the Apple?",
            "What does HTML stand for?"
    };
    public  static String choices[][] = {
            {"Google","Apple","Nokia","Samsung"},
            {"Java","Kotlin","Notebook","Python"},
            {"Alan_Turing","Elon_Musk","Utkarsh","Amisha"},
            {"Google","Apple","Nokia","Samsung"},
            {"Hyper Trainer Marking Language","Hyper Text Marketing Language","\n" +
                    "Hyper Text Markup Language","Hyper Text Markup Leveler"}
    };
    public static String correctAnswer[] = {
            "Google",
            "Notebook",
            "Alan_Turing",
            "Apple",
            "Hyper Text Markup Language"
    };
}
