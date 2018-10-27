package com.agbryant.montypythonholygrail.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Knight extends Person {

    private String epithet;
    private String quest;

    @Builder
    public Knight(String name, String epithet){
        super(name);
        this.epithet = epithet;
    }

    public Knight(){

    }

}
