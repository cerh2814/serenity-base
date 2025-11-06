Feature: Ingresar a prestamype
  Como usuario nuevo
  Quiero registrarme en Prestamype
  Para poder acceder a los servicios de la plataforma

  Scenario Outline: Registro exitoso user outline
    Given user quiere registrarse en localhost
    When user ingresa sus datos validos datatable
      | <name> | <lastname> | <age> | <country> | <genero> | <correo> | <day> |
    Then user valida los campos y realiza el registro exitoso
    Examples:
      | name  | lastname | age | country  | genero | correo          | day |
      | July  | Perez    | 11  | Colombia | F      | uno@yopmail.com | 11  |
      | Julio | Perez    | 11  | Colombia | M      | uno@yopmail.com | 11  |
