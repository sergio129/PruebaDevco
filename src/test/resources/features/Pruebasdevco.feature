Feature: Pruebas devco
  Background:
    Given pruebas devco compras

    @test
    Scenario: Vaciar el carrito de compras dado que se tienen 3 intem en el
      When Ingresar datos de login Usuario "standard_user", Contrasena: "secret_sauce"
      And Agregar los productos al carrito
      Then Vaciar Carrito
