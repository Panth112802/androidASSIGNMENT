package com.example.andassignment.respositoies;

import com.example.andassignment.models.Civilization;

public class CivilizationsResponse {


    private int id;
    private String name;
    private String expansion;
    private String  army_type;
    private String   unique_unit;
    private String  unique_tech;
    private String  team_bonus;
    private String  civilization_bonus;

    public Civilization getCivilization (){

        return new Civilization(id, name, expansion,army_type,unique_unit,unique_tech,team_bonus,civilization_bonus);

    }

}
