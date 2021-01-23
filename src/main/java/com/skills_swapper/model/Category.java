package com.skills_swapper.model;

public enum Category {

    SPORT ("Sport and outdoors"),
    LANGUAGES ("Languages and linguistics"),
    COOKING ("Cooking and cuisine"),
    GARDENING ("Gardening"),
    COMPUTERS ("Programming"),
    ANIMALS ("Animals care"),
    DIY ("Do it yourself and crafts"),
    ART ("Drawing, painting, sculpture, film, theater, photography"),
    MUSIC ("Playing music instruments, singing and dancing"),
    CHILDREN ("Babysitting and homeschooling"),
    TRAVEL ("Travelling"),
    BEAUTY("Beauty, make-up, design"),
    HEALTH ("Health and therapy"),
    EDUCATION ("Maths, physics, chemistry, geography, history");


    private String name;

    Category (String name) {
        this.name = name;
    }
}
