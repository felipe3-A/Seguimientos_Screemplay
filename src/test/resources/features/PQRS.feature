Feature: PQRS
  i need send a PQRS
  Scenario: request sent successfully
    Given i opened the page
    When  i go the module PQRS and write my request
    |email                       |affair                      |menssage|
    |lenovo.esucre@gmail.com     |Automatizacion EXitosa      | Si ves este mensaje las pruebas de calidad han isdo un exito :)       |
    Then  the request will be send

  Scenario: request sent incoreect
    Given i opened the page
    When  i go the module PQRS and write my request
      |email                       |affair                      |menssage|
      |lenovo.esucregmail.com     |Automatizacion EXitosa      | Si ves este mensaje las pruebas de calidad han isdo un exito :)       |
    Then  the request will not be send