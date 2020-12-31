package com.rang.snippets.fixtures;

public enum HockeyPlayerPosition {

    C("Center"),
    RW("Right Wing"),
    LW("Left Wing"),
    D("Defenseman"),
    G("Goaltender");

    private final String desc;

    private HockeyPlayerPosition(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
