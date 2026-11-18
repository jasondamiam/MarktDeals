## Testplan en resultaten:
-	**1: Kijken voor zoek functie leidt tot bekend product**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** Wanneer je een product opzoekt, komt de product tevoorschijn. Ook als je deels iets in typt.
    - **Test 1:** Zoek functie werkt maar lijst alleen specifieke producten die niet past bij het zoekterm
    - **Test 2:** Producten worden weergegeven bij het zoekterm
    - **Oplossing:** Het was gecodeerd dat het terugvalt naar het hetzelfde producten, dus het was veranderd zodat het zoekt naar producten van jouw zoekterm.

-	**2: Kijken voor zoek functie leidt tot onbekend product**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** De zoekscherm verschijnt op tekst dat er geen resultaten zijn.
    - **Test 1:** Je ziet nog producten die niet bij zoekterm past verschijnen
    - **Test 2:** De tekst waar er geen producten gevonden verschijnt
    - **Oplossing:** Ook bij het oplossing bij de bekend product.

-	**3: Wanneer product open is als je terug drukt gaat naar het vorige scherm**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** De gebruiker komt op het juiste vorige scherm terecht..
    - **Test 1:** Het gaat altijd naar het zoek scherm wanneer je hebt gedrukt van het startscherm.
    - **Test 2:** Het navigatie is op goeie orde
    - **Oplossing:** Meer details toegevoegd aan de navigate functie.

-	**4: Naam, prijs, beschrijving en gewicht worden correct weergegeven.**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** Wanneer je een product opent geeft het juiste informatie door.
    - **Test 1:** Het informatie staat in het foute volgorde
    - **Test 2:** Alles is op goeie orde
    - **Oplossing:** Posities van de informatie veranderd

-	**5: De producten uit de geselecteerde categorie worden weergegeven.**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** Wanneer je 'Zie Alles' drukt op een categorie bij het homepagine zie je alle producten bij het categorie.
    - **Test 1:** De producten worden weergegeven bij de geopende categorie
    - **Oplossing:** Geen oplossing nodig

-	**6: Wanneer een nieuw product is toegevoegd aan de database wordt het op het scherm ook gezien.**
    - **Manier:** Toevoegen aan de producten lijst bestand en binnen in de app die open is op emulator/telefoon.
    - **Doel:** Bij de database bestand zet alle informatie die de product nodig heeft en die laten uitzien op het scherm
    - **Test 1:** Het wordt displayed op zijn eigen categorie, geen oplossing nodig.

-	**7: Notificatie komt als melding bij de emulator/telefoon.**
    - **Manier:** Zorgen dat de app is geopend bij de emulator/telefoon.
    - **Doel:** Na een aangepaste tijd (1 minuut) een notificatie melding krijgen uit de app.
    - **Test 1:** Melding komt op jouw scherm, maar er komt geen geluid.
    - **Test 2:** Melding komt met geluid aan
    - **Oplossing:** Moest de app opnieuw installeren op Android Studio
