Feature: search Funktion


Scenario: Ich als ein User suche ein Begriff in Google. Der Test wird die richtige Antwort ueberpruefen.

Given Google page ist offen
And ich sehe das Feld Search 

When ich Bearing Point angebe
And bestaetige

Then wird Bearing Point gefunden
