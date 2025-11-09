@global
Feature: Ingresar a Prestamype y registrar un nuevo usuario

  @press
  Scenario: Ingresar a prestamype y registrar un nuevo usuario
    Given user ingresar al navegador y abrir la pagina de prestamype

  @presslimit
  Scenario: valores limite de input dni
    Given user ingresar valores maximo de input dni

  @telefono
  Scenario: Mensaje de error telefono invalido
    Given user ingresar valores minimos de input telefono

  @telefono
  Scenario: Mensaje de error telefono valido
    Given user ingresar valores maximos de input telefono

  @correoinvalido
  Scenario: Mensaje de error correo invalido
    Given user ingresar error correo inalido



