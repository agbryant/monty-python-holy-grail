package com.agbryant.montypythonholygrail.repository;

import com.agbryant.montypythonholygrail.entity.Knight;
import com.agbryant.montypythonholygrail.entity.Person;
import com.agbryant.montypythonholygrail.exception.KnightNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class KnightRepository {



    public List<Knight> getAll(){

        List<Knight> knights = new ArrayList<>();

        // With constructor definded on Child class (can't use @NoArgsConstructor due to conflicts with parent class)
        Knight robin = new Knight();
        robin.setName("Robin");
        robin.setEpithet("Not-Quite-So-Brave-as-Sir-Lancelot");
        knights.add(robin);

        // With @Data and @Builder on Child class and @AllArgsConstructor on PARENT class
        Knight lancelot = Knight.builder().name("Lancelot").epithet("Brave").build();
        knights.add(lancelot);

        // With constructor defined in Child class
        Knight bedevere = new Knight("Bedevere", "Wise");
        knights.add(bedevere);

        return knights.stream().sorted(Comparator.comparing(Knight::getName)).collect(Collectors.toList());
    }


    public Knight getByName(String name) throws KnightNotFoundException {

        return (Knight) getAll().stream()
                .filter(k -> name.equalsIgnoreCase(k.getName()))
                .findFirst()
                .orElseThrow(() -> new KnightNotFoundException("Knight Not Found"));
    }
}
