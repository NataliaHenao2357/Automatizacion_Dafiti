Feature: Buscar productos en la Pagina Dafiti
Yo como comprador de dafiti, ingreso a la pagina 
y en el buscador de productos, quiero obtener los productos 
de interes 


  Scenario: Buscar Productos en el buscador Exitosamente
    Given El usuario ingresa a la pagina de Dafiti 
    When Cuando busca el producto  
    Then podra ver la informacion de este 
   

