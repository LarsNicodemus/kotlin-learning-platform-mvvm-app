# Aufgaben

## Syntax App

Die heutige App ist euer Praxisfreitag und umfasst alle die bisherig gelernten Themen.<br />

Das Syntax-Institut möchte eine eigene App für die interne Nutzung haben! Hier kommst du als 
erfahrener Android-Entwickler ins Spiel.<br />

Die App soll in der MVVM-Architektur geschrieben sein, LiveData, ein SharedViewModel und eine 
RecyclerView verwenden. Darüber hinaus sollen Fragmente genutzt werden, um zwischen den Ansichten 
zu navigieren.<br />
Das sind große Anforderungen! Glücklicherweise hast du dich diese Woche mit etlichen Apps auseinandergesetzt, 
die diese Anforderungen beinhalten. Somit kannst du hier noch einmal reinschauen und schon 
viel Code übernehmen! <br />

Der unternehmensinterne Designer hat dir bereits Entwürfe der Layouts, samt Rahmenbedingungen der 
App, geschickt. Die Bedingungen lauten wie folgt:

Die App soll auf dem ersten Bildschirm eine Liste an Kursen enthalten, welche Syntax unterrichtet. <br />
Das sieht ungefähr so aus:
<p align="center">
<img height="300" src="img/img_1.png"><p />
Wenn der User auf einen der Kurse klickt, soll man eine Detailansicht des Kurses bekommen. Hier soll 
einmal das Logo des Kurses als Hintergrund gesetzt sein, der Titel des Kurses soll angezeigt werden 
und auch eine kleine Beschreibung, was man in dem Kurs lernt. <br />
Das sieht ungefähr so aus:
<p align="center">
<img height="300" src="img/img_2.png"><p />
Über den Knopf "Zurück zu den Kursen" soll man wieder zu der Übersicht an Kursen kommen. Zum Abschluss
soll beim Klicken auf den Knopf abgeschlossen der Hintergrund der Karte grün werden. Dies soll sich der
Kurs auch merken, wenn man ihn von der Liste aus wieder aufruft. Genauso soll der Hintergrund wieder 
weiß werden, wenn der Nutzer erneut auf den Button abgeschlossen klickt. <br />
Das sieht ungefähr so aus:
<p align="center">
<img height="300" src="img/img_3.png"><p />
Viel Erfolg! Du schaffst das! Wenn du nicht weiter weißt, könnten dir die folgenden Tipps weiterhelfen. <br />
<details>
<summary>Hinweise</summary>
1. Erinnere dich an die MVVM-Architektur. Für diese App könnte sie wie folgt aussehen:
<p align="center">
<img height="300" src="img/img_4.png"><p />
2. Starte damit, die dependencies einzufügen. <br/>
3. Erstelle alle Packages, Klassen und Fragmente. <br/>
4. Designe alle Layouts. <br/>
5. Erstelle alle Navigationskomponenten. <br/>
6. Programmiere alles im "Model" Abschnitt der MVVM-Architektur. <br/>
7. Programmiere das SharedViewModel. Wahrscheinlich wirst du beim Programmieren der Fragmente 
hierher zurückkommen, um die Logik zu ergänzen. <br/>
8. Programmiere den "View" Abschnitt der MVVM-Architektur. Starte am besten mit dem Adapter. <br/>
9. Schaue nochmal in die LiveApps, nutze das Internet und stelle gezielte Fragen im Slack oder Zoom.
</details>