Feature: Busqueda en google
  como usaurio, quiero buscar en google para poder responder mis dudas

  @Test_01
  Scenario: Busqueda simple en google
    Given un navegador web en la pagina de google
    When Se introduce la palabra de busqueda "pinguino"
    Then se muestraa el resultado "pinguino"

  @Test_02
  Scenario: Busqueda simple google
    Given un navegador web en la pagina de google
    When Se introduce la palabra de busqueda
      |pinguino|Pinguino Emperador|
      |Elefantes|Elefante Africano|
    Then se muestraa el resultado
      |pinguino|Pinguino Emperador|
      |Elefantes|Elefante Africano|



