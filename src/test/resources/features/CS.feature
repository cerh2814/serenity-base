Feature: ingresar a la plataforma CS
  Como usuario de la plataforma CS
  Quiero ingresar a la plataforma
  Para poder utilizar sus funcionalidades

  Background:
    Given que el usuario está en la página de inicio de sesión de la plataforma CS

  @cs
  Scenario: Ingreso exitoso a la plataforma CS
    When usuario clic en el boton Iniciar sesion
    And usuario ingresa sus credenciales invalidas
    Then usuario realiza click en el boton de iniciar sesion
    Then usuario recibe el mssje de error


  @csregister
  Scenario: Registro - abrir formulario de registro
    When usuario clic en el boton de inicio de session
    And usuario clic en el boton de registrarse
#    And usuario ingresa sus datos validos de registro

  @csregisterempresa
  Scenario: Registro de empresa - acceso al módulo empresa
    When user ingresa el modulo empresa
#    When usuario clic en el boton de inicio de session
#    And usuario clic en el boton de registrarse
#    And usuario ingresa sus datos validos de registro