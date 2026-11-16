## Testplan en resultaten:
-	**Kijken voor zoek functie leidt tot product**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** Wanneer je een product opzoekt, komt de product tevoorschijn. Ook als je deels iets in typt.
    - **Test 1:** Zoek functie werkt maar lijst alleen specifieke producten die niet past bij het zoekterm
    - **Test 2:** Producten worden weergegeven bij het zoekterm
    - **Oplossing:** Het was gecodeerd dat het terugvalt naar het hetzelfde producten, dus het was veranderd zodat het zoekt naar producten van jouw zoekterm.

-	**Wanneer product open is als je terug drukt gaat naar het vorige scherm**
    - **Manier:** Binnen in de app die open is op emulator/telefoon.
    - **Doel:** Vanaf de pagina van de product als je terug op klipt komt die naar de vorige scherm.
    - **Test 1:** Het gaat altijd naar het zoek scherm wanneer je hebt gedrukt van het startscherm.
    - **Test 2:** Het navigatie is op goeie orde
    - **Oplossing:** Meer details toegevoegd aan de navigate functie.

-	**Wanneer een nieuw product is toegevoegd aan de database wordt het op het scherm ook gezien.**
    - **Manier:** Toevoegen aan de producten lijst bestand en binnen in de app die open is op emulator/telefoon.
    - **Doel:** Bij de database bestand zet alle informatie die de product nodig heeft en die laten uitzien op het scherm
    - **Test 1:** Het wordt displayed op zijn eigen categorie, geen oplossing nodig.

-	**Notificatie komt als melding bij de emulator/telefoon.**
    - **Manier:** Zorgen dat de app is geopend bij de emulator/telefoon.
    - **Doel:** Na een aangepaste tijd (1 minuut) een notificatie melding krijgen uit de app.
    - **Test 1:** Melding komt op jouw scherm, maar er komt geen geluid.
    - **Test 2:** Melding komt met geluid aan
    - **Oplossing:** Moest de app opnieuw installeren op Android Studio
