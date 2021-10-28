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


    @Test_02
    Scenario: Compra de Producto
      When se busca tipo producto
      |CPU|
      |Placa Madre|
      |Memoria RAM|
      |Gabinete   |
      And se selecciona producto "42781"
      And anadir producto al carro de compras
      And realizar compra ahora
      And seguir como invitado


    @Test_03
    Scenario Outline: Compra producto
      When se busca tipo producto "<TipoProducto>"
      And se selecciona producto "<idProducto>"
      And anadir producto al carro de compras
      And realizar compra ahora
      And seguir como invitado
      Examples:
        | TipoProducto | idProducto |
        |CPU         | 42781      |
        #|Placa madre | 43070      |