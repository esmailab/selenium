# Bitte diese reservierte Cucumber Key words wie unten verwenden:
# Feature:, Scenario:, Given, And, When, Then
# Bitte kein Umlaut verwenden!
# Bitte vor Feature Zeile keine Zeile leer lassen!
# Bitte sample.feature nicht ändern!
# Du kannst eine Kopie von sample.feature erstellen und hier umbenennen und für eur Zweck verwenden.
# Link für weitere Information:  http://docs.behat.org/en/v2.5/guides/1.gherkin.html
Feature: Urlalaubsplan

  Scenario: Ob sie einen Plan hat
    Given Sie hat ein Ticket
    And Sie hat Urlaub 
    When Sie zum Flughafen kommt
    Then Sie kann fliegen