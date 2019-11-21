package com.example.andassignment.models;

public class Civilization {
    private int id;
    private String name;
    private String expansion;
    private String  army_type;
    private String   unique_unit;
    private String  unique_tech;
    private String  team_bonus;
    private String  civilization_bonus;


    public Civilization(int id, String name,String  expansion
            , String army_type,String unique_unit,String unique_tech,String team_bonus,String civilization_bonus){

        this.id = id;
        this.name = name;
        this.expansion = expansion;
        this.army_type = army_type;
        this.unique_unit  = unique_unit;
        this.unique_tech = unique_tech;
        this.team_bonus = team_bonus;
        this.civilization_bonus = civilization_bonus;


    }
}
