Feature: NIC-119 Login Web Nicosoft
  Como bodeguero
  Quiero acceder a la url de la web con un identificador predeterminado
  Para obtener información del usuario

    @wipx
    @testcasekey=NICXXX
  Scenario Outline: Login Flujo principal - El ID del usuario es escriptado
    Given soy un usuario de perfil bodeguero de la finca "<finca>"
    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado>"
    Then deberia visualizar la cantidad correcta de piscinas de esta finca

    Examples:
      | finca  | id_encriptado                               |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Eo |
      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHE |
      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArE |

  Scenario Outline: El ID del usuario es escriptado pero incorrecto
    Given soy un usuario de perfil bodeguero de la finca "<finca>"
    When accedo a la URL raiz de la aplicacion y agregando el id "<id_encriptado_con_error>"
    Then deberia visualizar un mensaje de error

    Examples:
      | finca  | id_encriptado_con_error                     |
      | finca1 | 97JOWzEtdjPXQnLJ0XagiYMkTExnlQdnUGBMD7FP1Ex |
      | finca2 | VNkZzXwuDNKPjNcdFXdu2QyUd6x94i7XchjyoHoePHx |
      | finca3 | hN1duOXFAcZkvtAG2mVqDyvBn9WS0uvpUYLtBFvjArx |
