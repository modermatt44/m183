# LB 1

## CWE und OWASP

CWE ist eine Liste mit vielen bekannten Software- und Hardware-Schwachstellen, verwaltet von MITRE. Die OWASP Top 10
listet die zehn größten Sicherheitsrisiken für Webanwendungen auf und wird regelmäßig aktualisiert. Beide Listen helfen
dabei, Sicherheitsprobleme zu erkennen und zu beheben. Die OWASP Top 10 bezieht sich auf Schwachstellen aus der
CWE-Liste, um Sicherheitsrisiken besser zu erklären. Zusammen tragen sie dazu bei, die IT-Sicherheit zu verbessern.

## OWASP Top 10 Risk vs OWASP Proactive Controls

### OWASP Top 10: 
Dies ist eine Liste der zehn häufigsten und kritischsten Sicherheitsrisiken in Webanwendungen, die auf Daten aus verschiedenen Sicherheitsorganisationen und -unternehmen basiert. Die Liste wird regelmäßig aktualisiert und enthält Beschreibungen der Risiken, Beispiele, wie sie ausgenutzt werden können, und Empfehlungen, wie sie vermieden oder gemindert werden können. Einige Beispiele für Risiken, die in der OWASP Top 10 aufgeführt sind, sind Injection, Broken Authentication und Sensitive Data Exposure.

### OWASP Proactive Controls: 
Dies ist eine Liste von Sicherheitskonzepten, die Entwickler beim Entwerfen und Bauen von sicheren Anwendungen berücksichtigen sollten. Im Gegensatz zur OWASP Top 10, die sich auf die Identifizierung und Behebung von Sicherheitsrisiken konzentriert, konzentriert sich die Liste der Proactive Controls auf präventive Maßnahmen, die während des gesamten Softwareentwicklungslebenszyklus angewendet werden sollten. Einige Beispiele für Proactive Controls sind Parameterize Queries, Encode Data und Validate All Inputs.

Zusammenfassend lässt sich sagen, dass die OWASP Top 10 dazu dient, Entwickler über die häufigsten Sicherheitsrisiken zu informieren, während die OWASP Proactive Controls dazu dienen, Entwickler dabei zu unterstützen, diese Risiken von Anfang an zu vermeiden.

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

## Referenzen

- [CWE und OWASP](https://dev.to/caffiendkitten/cwes-vs-owasp-top-10-4imm)
- [Broken Access Control](https://owasp.org/Top10/A01_2021-Broken_Access_Control/)
- [OWASP Proactive Controls](https://owasp.org/www-project-proactive-controls/)
- [OWASP Top 10](https://owasp.org/www-project-top-ten/)