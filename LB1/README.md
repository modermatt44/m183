# LB 1

## CWE und OWASP

CWE ist eine Liste mit vielen bekannten Software- und Hardware-Schwachstellen, verwaltet von MITRE. Die OWASP Top 10
listet die zehn größten Sicherheitsrisiken für Webanwendungen auf und wird regelmäßig aktualisiert. Beide Listen helfen
dabei, Sicherheitsprobleme zu erkennen und zu beheben. Die OWASP Top 10 bezieht sich auf Schwachstellen aus der
CWE-Liste, um Sicherheitsrisiken besser zu erklären. Zusammen tragen sie dazu bei, die IT-Sicherheit zu verbessern.

## Broken Access Control

### Bedrohung:

Broken Access Control tritt auf, wenn die Zugriffskontrollen fehlerhaft implementiert sind oder vollständig fehlen,
sodass Angreifer unautorisierten Zugriff auf sensible Daten oder Funktionen erlangen können. Dies kann passieren, wenn
ein System nicht überprüft, ob ein Nutzer die richtigen Berechtigungen für eine Aktion hat, oder wenn es möglich ist,
Sicherheitsüberprüfungen zu umgehen. Beispiele für solche Schwachstellen sind die Umgehung von Zugriffskontrollen, das
Erhöhen von Berechtigungen oder das Ausnutzen von Konfigurationsfehlern.

### Mögliche Folgen

Die Folgen von Broken Access Control können schwerwiegend sein und hängen von der Art der ungeschützten Ressourcen und
der Anwendung selbst ab. Mögliche Folgen umfassen:

- **Datendiebstahl:** Angreifer können auf persönliche oder sensible Daten zugreifen, wie z.B. Kundendaten,
  Finanzinformationen oder persönliche Identifizierungsdaten.
- **Datenschutzverletzungen:** Der unautorisierte Zugriff auf Daten kann zu Verletzungen des Datenschutzes und damit zu
  rechtlichen Konsequenzen und Reputationsschäden führen.
- **Unautorisierte Transaktionen:** Wenn Angreifer Zugriff auf Funktionen erhalten, für die sie nicht autorisiert sind,
  können sie unautorisierte Aktionen durchführen, z.B. Geldtransfers oder das Ändern von Nutzerrechten.
- **Systemübernahme:** Im schlimmsten Fall können Angreifer durch das Ausnutzen von Broken Access Control vollständige
  Kontrolle über ein System erlangen.