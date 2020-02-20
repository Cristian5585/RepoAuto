@Busqueda
Feature: Busqueda de zapatillas

  @tag1
  Scenario: Realizo una busqueda de zapatillas marca nike en google
    Given me encuentro en la web "https://www.google.com/"
    When ingreso la palabra "zapatillas nike"
    Then se visualiza la pantalla de resultados