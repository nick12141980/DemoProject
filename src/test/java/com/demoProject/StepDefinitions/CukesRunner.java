package com.demoProject.StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = {"src/test/resources/features/demo.feature"},
        //path of step definition file
        glue = {"StepDefinitions"},
        plugin = {"pretty"}
)
public class CukesRunner {
}
