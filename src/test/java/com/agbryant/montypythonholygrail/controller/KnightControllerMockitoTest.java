package com.agbryant.montypythonholygrail.controller;


import com.agbryant.montypythonholygrail.repository.KnightRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class KnightControllerMockitoTest {

    private KnightController subject;

    @Mock
    private Logger logger;

    @Mock
    private KnightRepository repository;

    @Mock
    private Model model;

    @Before
    public void setup(){

        subject = new KnightController(repository);
    }

    @Test
    public void test_GetAll(){

        when(repository.getAll()).thenReturn(null);

        subject.getAll();

        verify(repository, times(1)).getAll();
    }

    @Test
    public void test_ListKnights(){

        subject.listKnights(model);
    }
}
