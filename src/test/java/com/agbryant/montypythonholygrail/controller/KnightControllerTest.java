package com.agbryant.montypythonholygrail.controller;


import com.agbryant.montypythonholygrail.repository.KnightRepository;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.ui.Model;

import java.util.logging.LogManager;


@RunWith(JMockit.class)
public class KnightControllerTest {

    @Tested
    private KnightController subject;

    @Injectable
    private LogManager logManager;

    @Injectable
    private KnightRepository repository;

    @Test
    public void test_GetAll(){

        new Expectations(){{

            repository.getAll(); times = 1;
        }};

        subject.getAll();
    }

    @Test
    public void test_ListKnights(@Mocked Model model){

        subject.listKnights(model);
    }
}
