Feature: Register user
  I need register a user
  Scenario: User register succesfull
    Given i opened the page with my credentials and select the option Users
      |id          |pass          |
      | 1058546792   | 1058546792   |
    When  i register the dates of to create a new user
      |nombres         |apellidos   |correo                      |correo_alternativo |contrasena|residencia|
      |Jhon alex    |Castillo Hoyos |JhonACastillo@misena.edu.co |JkonHolmes@gmail.co|2222222222|Popayan   |
    Then the user will be register
