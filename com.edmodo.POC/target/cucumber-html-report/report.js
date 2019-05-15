$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/TestScenarios/edmodo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "Search the product primary search bar \u0026 verify the user is able to land to product specification page",
  "description": "",
  "id": "search-the-product-primary-search-bar-\u0026-verify-the-user-is-able-to-land-to-product-specification-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Author:Pallavi.Chirakaa"
    }
  ]
});
formatter.before({
  "duration": 7964855825,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search for Course",
  "description": "",
  "id": "search-the-product-primary-search-bar-\u0026-verify-the-user-is-able-to-land-to-product-specification-page;search-for-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@EndtoEnd"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Launch the edmondo website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Search for course in primary search bar",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see the Course Name",
  "keyword": "Then "
});
formatter.match({
  "location": "EdmodoStepDefinitions.Launch_the_edmondo_website()"
});
formatter.result({
  "duration": 8582983060,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.Search_for_course_in_primary_search_bar()"
});
formatter.result({
  "duration": 426027957,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.User_should_see_the_Course_Name()"
});
formatter.result({
  "duration": 1045718548,
  "status": "passed"
});
formatter.after({
  "duration": 2647515767,
  "status": "passed"
});
formatter.before({
  "duration": 4323527137,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Enroll button is disabled when courses are full",
  "description": "",
  "id": "search-the-product-primary-search-bar-\u0026-verify-the-user-is-able-to-land-to-product-specification-page;verify-enroll-button-is-disabled-when-courses-are-full",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@EndtoEnd"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Launch the edmondo website",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Search for course in primary search bar",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should see the Course Name",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User click on the course it should navigate product page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "seats avaliable for the selected course",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "system should display enroll button enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "EdmodoStepDefinitions.Launch_the_edmondo_website()"
});
formatter.result({
  "duration": 11539353874,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.Search_for_course_in_primary_search_bar()"
});
formatter.result({
  "duration": 451636209,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.User_should_see_the_Course_Name()"
});
formatter.result({
  "duration": 1145498798,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.User_click_on_the_course_it_should_navigate_product_page()"
});
formatter.result({
  "duration": 4306405728,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.no_seats_avaliable_for_the_selected_course()"
});
formatter.result({
  "duration": 42482969,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.system_should_display_enroll_button_disabled()"
});
formatter.result({
  "duration": 467055704,
  "status": "passed"
});
formatter.after({
  "duration": 806615214,
  "status": "passed"
});
formatter.before({
  "duration": 3109065450,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify the header tabs in product meta container",
  "description": "",
  "id": "search-the-product-primary-search-bar-\u0026-verify-the-user-is-able-to-land-to-product-specification-page;verify-the-header-tabs-in-product-meta-container",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@EndtoEnd"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Launch the edmondo website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "Search for course in primary search bar",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User should see the Course Name",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User click on the course it should navigate product page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "verify the header tabs",
  "keyword": "Then "
});
formatter.match({
  "location": "EdmodoStepDefinitions.Launch_the_edmondo_website()"
});
formatter.result({
  "duration": 13755864235,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.Search_for_course_in_primary_search_bar()"
});
formatter.result({
  "duration": 398530482,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.User_should_see_the_Course_Name()"
});
formatter.result({
  "duration": 1173278521,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.User_click_on_the_course_it_should_navigate_product_page()"
});
formatter.result({
  "duration": 1771284463,
  "status": "passed"
});
formatter.match({
  "location": "EdmodoStepDefinitions.verify_the_header_tabs()"
});
formatter.result({
  "duration": 553970980,
  "status": "passed"
});
formatter.after({
  "duration": 790903943,
  "status": "passed"
});
});