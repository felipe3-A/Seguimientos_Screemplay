Feature:Login
  i need login
  Scenario: Login Sucesfullt
    Given i opened the page
    When i enter corrects for login in the form
    |id          |pass          |
    | 1058546792   | 1058546792   |
    Then i will be login sucesfull

  Scenario: Login Incorrect
    Given i opened the page
    When i enter incorrects for login in the form
      |id          |pass          |
      | 105854792   | 105854672   |
    Then i will not be login sucesfull