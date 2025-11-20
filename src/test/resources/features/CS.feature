Feature: ingresar a la plataforma CS
    Como usuario de la plataforma CS
    Quiero ingresar a la plataforma
    Para poder utilizar sus funcionalidades
@cs
    Scenario: Ingreso exitoso a la plataforma CS
        Given que el usuario está en la página de inicio de sesión de la plataforma CS
        When usuario ingresa sus credenciales validas
        And usuario clic en el boton Iniciar sesion
#        Then el usuario debería ser redirigido a la página principal de la plataforma CS
#        And debería ver un mensaje de bienvenida con su nombre de usuario

  @csregister
  Scenario: Ingreso exitoso a la plataforma CS
    Given que el usuario está en la página de inicio de sesión de la plataforma CS
    When usuario clic en el boton de inicio de session
    And usuario clic en el boton de registrarse
#    And usuario ingresa sus datos validos de registro

  @csregisterempresa
  Scenario: Ingreso exitoso a la plataforma CS
    Given que el usuario está en la página de inicio de sesión de la plataforma CS
    When user ingresa el modulo empresa
#    When usuario clic en el boton de inicio de session
#    And usuario clic en el boton de registrarse
#    And usuario ingresa sus datos validos de registro