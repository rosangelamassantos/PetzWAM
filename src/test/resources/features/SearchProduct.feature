#encoding: utf8

Feature: Search a Product
  Scenario: Search simple Product with Sucess

    Given I access Petz homepage
    When I search "Aquário"
    Then I see a list of product "Aquário"
    And I click at product "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    Then show the title "Aquário Boyu Curvo 100 187 Litros Preto Champagne" and price "R$ 3.199,99"