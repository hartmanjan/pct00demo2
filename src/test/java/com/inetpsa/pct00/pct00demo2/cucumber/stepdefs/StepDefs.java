package com.inetpsa.pct00.pct00demo2.cucumber.stepdefs;

import com.inetpsa.pct00.pct00demo2.Pct00Demo2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Pct00Demo2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
