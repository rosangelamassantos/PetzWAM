Feature: Search a Product
  Scenario: Search simple Product with Sucess

    Given I access Petz homepage
    When I search "Aqu�rio Boyu Curvo 100 187 Litros Preto Champagne"
    Then I see a list of product "Aqu�rio Boyu Curvo 100 187 Litros Preto Champagne"
    And I click at product
    Then show the title "Aqu�rio Boyu Curvo 100 187 Litros Preto Champagne" and price "R$ 3.199,99"