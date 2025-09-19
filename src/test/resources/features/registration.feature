Feature: Registration

  Scenario Outline: Successful registration with valid details
    Given Ana se registra en la pagina de registro
    When Ana envia informacion requerida
      | <name> | <lastname> | <age> | <email> | <country> |
    And Ana submit the registration form
    Examples:
      | name | lastname | age | email                | country  |
      | Ana  | Perez    | 11  | Colombia@yopmail.com | Colombia |


  Scenario: Missing required fields for registration
    Given Ana se registra en la pagina de registro
    When Ana deja campos requeridos vacios
    Then Ana no envia la informacion requerida

