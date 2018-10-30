package com.agbryant.montypythonholygrail.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Knight extends Person {

    private String epithet;

    @Builder
    public Knight(String name, String epithet){
        super(name);
        this.epithet = epithet;
    }

    public Knight(){

    }

}
