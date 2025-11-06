Feature: mensaje de registro de usuario

  Scenario: Mensaje Registro exitoso de un nuevo usuario
    Given user ingresar al navegador de registro
    When user input name and password
    Then user realizar click en el boton de registro
    And user show mensaje de unsuccessful registration


  Scenario: Registro mensaje exitoso de un nuevo usuario
    Given user ingresar al navegador de registro
    When user input name and password
    Then user realizar click en el boton de registro
    And user show mensaje de successful registration


  Scenario: Registro mensaje exitoso de un nuevo usuario generar transaccion
    Given user ingresar al navegador de registro
    When user input name and password
    Then user realizar click en el boton de registro
    And user show mensaje de successful registration
    * user add new transaccion
    * user select fecha
    * user add mount
    * user add description
    * click send transaccion
    * user send transaccion
