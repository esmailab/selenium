Feature: Login in HKR mit Validem Namen und Passwort


Scenario: Mit diesem Test möchte ich mich als ein valider User anmelden

Given Der User ist in System angelegt
And Ich bin in Maske login

When ich meinen Usernamen angebe
And das Passwort angebe
And Bestätige


Then muss ich eingelogt sein