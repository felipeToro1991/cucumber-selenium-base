Feature: Compra de producto en PCFactory

  Background:
    Given Se inicializa navegador

  @Test_01
  Scenario: Compra de producto
    When se busca tipo producto "CPU"
    And se selecciona producto "42781"
    And anadir producto al carro de compras
    And realizar compra ahora
    And seguir como invitado