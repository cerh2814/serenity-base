Feature: Add transaccion
  Scenario: add new transaccion
    Given Ana se encuentra en la pagina de transacciones
      | user | pass |
    When Ana agrega una nueva transaccion
      | 12-12-2023 | 500 | transacciones testing descripcion |
    Then Ana envia la informacion requerida

