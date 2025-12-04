Feature: Registro de contacto en Demoblaze
  Como usuario
  Quiero enviar un mensaje de contacto
  Para recibir respuesta del soporte

  Background:
    Given el usuario abre la página de Demoblaze

#  @demoblaze
#  Scenario Outline: Registro exitoso del contacto
#    Given el usuario ingresa el correo "<correo>", el name "<name>" y el mensaje "<mensaje>"
#    #When el usuario  da clic en el botón
##    Then debe visualizarse el mensaje de confirmación "Thanks for the message!!"
#
#    Examples:
#      | correo           | name | mensaje                       |
#      | juan@example.com | luis | Consulta sobre disponibilidad |
#      | ana@example.com  | ana  | Problema con mi pedido        |

    @demoblaze
    Scenario Outline: listar cantidad de productos en la tienda por page
      Given el usuario abre la página de Demoblaze
      When  el usuario ingresa al modulo laptops
#      Then el usuario cuenta la cantidad de productos disponibles "<page>"

      Examples:
        | page       |
        | first page |
        | second page|