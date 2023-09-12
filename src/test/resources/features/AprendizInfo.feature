Feature: AprendizInfo
  i need edit an view info of the aprendice
  Scenario: Register Succesfult
    Given i enter corrects for login in the page
      |id          |pass          |
      | 1058546792   | 1058546792   |
    When i enter dates for to aggregate a new aprencice
    Then i will see the aprendice created