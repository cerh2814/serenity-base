Feature: Ingresar a prestamype
  Como usuario nuevo
  Quiero registrarme en Prestamype
  Para poder acceder a los servicios de la plataforma

  Scenario: Registro exitoso de un nuevo usuario
    Given user quiere registrarse en localhost
    When user ingresa sus datos validos
    Then user valida los campos y realiza el registro exitoso

  Scenario: Unsuccessful registration fields
    Given user quiere registrarse en localhost
    When user registro incompleto
   # Then user debe permitir realiza el registro exitoso




#  this.nameexpected = nameexpected;
#  this.lastNameexpected = lastNameexpected;
#  this.ageexpected = ageexpected;
#  this.countryexpected = countryexpected;
#  this.generoexpected = generoexpected;
#  this.contraseaexpected = contraseaexpected;
#  this.dayexpected = dayexpected;
