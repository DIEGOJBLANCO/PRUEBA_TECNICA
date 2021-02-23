#Autor:Diego Jimenez Blanco
@stories
Feature: Utest.com
  As a user, I want to complete the registration of a user on the uTest.com
  @scenario1
  Scenario: Registration successful
    Given than Diego enters the uTest page
    When Complete the following information in the form
      |firstName |lastName      |email            |birthMonth|birthDay|year|language|city    |Postal_Code|Country |password|
      |Diego     |Jimenez Blanco|diegojb@gmail.com|October   |27      |1995|English |Mosquera|250047     |Colombia|D%360jb$|
    Then The user must be successfully registered on the page