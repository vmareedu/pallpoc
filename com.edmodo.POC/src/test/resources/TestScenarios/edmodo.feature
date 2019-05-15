# Sample Feature Definition Template
@Author:Pallavi.Chirakaa
Feature: Search the product primary search bar & verify the user is able to land to product specification page
  

 @EndtoEnd
  Scenario: Search for Course 
   Given Launch the edmondo website
   And Search for course in primary search bar
   Then User should see the Course Name


 @EndtoEnd
  Scenario: Verify Enroll button is disabled when courses are full
   Given Launch the edmondo website
   And Search for course in primary search bar
   Then User should see the Course Name
   When User click on the course it should navigate product page
   When seats avaliable for the selected course
   Then system should display enroll button enabled
   
@EndtoEnd  
Scenario: Verify the header tabs in product meta container
    Given Launch the edmondo website
   And Search for course in primary search bar
   Then User should see the Course Name
   When User click on the course it should navigate product page
   Then verify the header tabs
 