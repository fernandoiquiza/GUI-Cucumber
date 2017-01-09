package org.fundacion.cucumber.login.login;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Fernando on 1/9/2017.
 */

@CucumberOptions(features = "src\\resource\\features\\login\\loginPivotal.feature")
public class loginRunner extends AbstractTestNGCucumberTests{
}
