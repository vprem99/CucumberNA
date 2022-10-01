Feature: Search

Scenario: Search Product
Given I am search Page of Amazon
When I search for product with name "Iron" with price 2000
Then product with name "Iron" should display