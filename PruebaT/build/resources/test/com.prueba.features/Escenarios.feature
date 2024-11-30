@PruebasUsuarios
Feature: Pruebas Usuarios


  @CP001
  Scenario: ingresar a la pagina de la aerocivil y descargo un informe
    Given navego en la aplicación
    When ingreso a la opcion transparencia
    And selecciono la opcion presupuesto
    And ingreso a la opcion plan de accion
    And selecciono la opcion plan de accion
    And selecciono el boton modo lectura del documento
    Then valido que el pdf generado sea el correcto

