
# Meldingssysteem MartkDeals

Voor de hardware specifieke functionaliteit heb ik een meldingssysteem gekozen voor mijn app. Ik heb ervoor gekozen om gebruik te maken van het ingebouwde notificatiesysteem van Android. Hierdoor kan de applicatie meldingen weergeven buiten de app zelf. Gebruikers kunnen dus ook een melding ontvangen wanneer ze de app niet actief gebruiken.

## Hoe werkt het?

Het systeem bestaat uit meerdere stappen.

1. **Aanmaken van het notificatiekanaal**
- Wanneer de app wordt gestart, wordt eerst een notificatiekanaal gemaakt. Dit gebeurt in het bestand NotificationHelper.kt. Het heeft de naam 'MartkDeals meldingen'. Hierin worden instellingen opgeslagen, zoals de belangrijkheid en het geluid van de notificaties. Ik heb gekozen voor een standaard belangrijkheidsniveau (IMPORTANCE_DEFAULT), zodat meldingen normaal worden weergegeven en een standaard notificatiegeluid kunnen gebruiken.

2. **Plannen van een melding**
-  De meldingen wordt gepland, waarin ik gebruik AlarmManager voor. In het bestand AlarmScheduler.kt wordt een alarm ingesteld dat ongeveer één minuut na het plannen wordt geactiveerd. Ik heb gekozen voor AlarmManager omdat Android hiermee een actie op een later moment kan uitvoeren, ook wanneer de applicatie niet actief op de voorgrond staat.
Ik gebruik daarnaast PendingIntent om Android te laten weten welke actie uitgevoerd moet worden wanneer het alarm afgaat.

3. **Ontvangen van het alarm**
-  Wanneer het ingestelde alarm afgaat, wordt NotificationReceiver aangeroepen. Dit bestand bevat een BroadcastReceiver. Deze ontvangt het signaal van AlarmManager en roept vervolgens de functie showNotification() aan uit NotificationHelper. Hierdoor worden het plannen en het daadwerkelijk weergeven van een melding gescheiden gehouden.

4. **Weergeven van de melding**
- De functie showNotification() maakt de daadwerkelijke notificatie aan.
De melding bevat:

  - Titel: MarktDeals
  - Bericht: Er zijn nieuwe deals beschikbaar!
  - Een klein meldingsicoon.
  - Een standaard Android-notificatiegeluid, wanneer dit door het notificatiekanaal en de telefooninstellingen is toegestaan.

- Wanneer de gebruiker op de melding tikt, verdwijnt deze automatisch uit het meldingenscherm.

## Waarom heb ik voor deze oplossing gekozen?

Ik heb gekozen voor het ingebouwde Android-notificatiesysteem omdat dit goed aansluit bij mijn applicatie. Ik hoef geen apart notificatiedienst te gebruiken door dat. Daarnaast heb ik ervoor gekozen om AlarmManager te gebruiken. Hiermee kan ik meldingen op een gepland tijdstip laten uitvoeren. Ook is de code verdeeld over meerdere bestanden. Hierdoor heeft ieder bestand een eigen verantwoordelijkheid. NotificationHelper verzorgt de notificaties, AlarmScheduler plant het alarm en NotificationReceiver ontvangt het alarm. Deze verdeling maakt de code overzichtelijker en gemakkelijker aan te passen wanneer ik het meldingssysteem later wil uitbreiden.
