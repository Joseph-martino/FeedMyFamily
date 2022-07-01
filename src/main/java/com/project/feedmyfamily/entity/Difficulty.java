package com.project.feedmyfamily.entity;

public enum Difficulty {
    EASY("1"),NORMAL("2"),HARD("3");
    private String code;

    Difficulty(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
