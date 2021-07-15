#Autor: Jean Sousa
  @stories
  Feature: Policies treatment and protection of personal data of suppliers
    As a user, i see Policies treatment and protection of personal data of suppliers
  @scenario
  Scenario: Validate that the document is the one indicated
    Given Enter the Bancolombia site
    When I am looking for Policies treatment and protection of personal data of suppliers
    Then I can validate that the document is
    |title|
    |Políticas de tratamiento y de protección de datos personales de proveedores|
  @scenario2
  Scenario: See the document is the one indicated
    Given Enter the Bancolombia
    When I am looking for Policies treatment and protection of personal data
    Then I can see that the document


