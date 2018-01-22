# Bitte diese reservierte Cucumber Key words wie unten verwenden:
# Feature:, Scenario:, Given, And, When, Then
# Bitte kein Umlaut verwenden!
# Bitte vor Feature Zeile keine Zeile leer lassen!
# Bitte sample.feature nicht ändern!
# Du kannst eine Kopie von sample.feature erstellen und hier umbenennen und für eur Zweck verwenden.
# Link für weitere Information:  http://docs.behat.org/en/v2.5/guides/1.gherkin.html
Feature: Refund item

  Scenario: Jeff returns a faulty microwave
    Given Jeff has bought a microwave for $100
    And he has a receipt
    When he returns the microwave
    Then Jeff should be refunded $100