Feature: NIC-14 Flujos para visualizar variables de piscina
#  Como un bodeguero
#  Quiero visualizar las variables de cada piscina visto por fecha
#  Para validar la data registrada

  @wip
  #@testcasekey=NICXXX
  Scenario: ESC02 - Ver variables de cada piscina por fecha
    Given soy un usuario de perfil bodeguero de la finca "finca1"
    When accedo a la URL raiz de la aplicacion y agregando el usuario "nicosoft" password "password" e id "VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE"