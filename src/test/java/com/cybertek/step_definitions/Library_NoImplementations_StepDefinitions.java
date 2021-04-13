package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
UNDERSTANDING HOW FEATURE FILES AND STEP DEFINITIONS WORK TOGETHER
TC #50:
Create a new feature file and new scenarios
1.Create a new feature file named Login.feature
2.Create 3 new scenarios from the below provided user story.
3.User Story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
Accounts are: librarian, student, admin
4.Create a new step definition class under step_definitions
    package named: LoginStepDefs
5.Run the code. Get the step definitions from the console
6.No Java-selenium code implementation needed. Just add printing line in the implementation regarding what should be
  happening when the code is ran.

  Ex: “User is on the login page”
 */
public class Library_NoImplementations_StepDefinitions {



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }


    @When("User enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters Librarian username");

        //intentionally failing this step
        //Assert.fail("INTENTIONAL FAIL!!");
    }
    @When("User enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User enters Librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User sees the dashboard");
    }


    @When("User enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters student username");
    }

    @And("User enter student password")
    public void userEnterStudentPassword() {
        System.out.println("User enter student password");
    }

    @When("User enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username");

    }

    @And("User enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("User enter admin password");
    }
}
