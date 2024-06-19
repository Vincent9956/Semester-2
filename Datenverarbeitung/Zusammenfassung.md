# OSI Model

1. Übertragung
2. Sicherung
3. Vermittlung
4. Transport
5. Kommunikationssteuerung
6. Datendarstellung
7. Anwendung

## TCP und UDP

- **TCP**: Verbindungsorientiert | Versendet und wartet auf Antwort
- **UDP**: Verbindungslos | Versendet und wartet nicht auf Antwort

## TCP/IP Addressierung (IPv4)

- 32 Bits in 4 * 8 Bit getrennt

  - **Klasse A**: 1 * 8 Bit Netzwerkkennung, 3 * 8 Bit Hostkennung
  - **Klasse B**: 2 * 8 Bit Netzwerkkennung, 2 * 8 Bit Hostkennung
  - **Klasse C**: 3 * 8 Bit Netzwerkkennung, 1 * 8 Bit Hostkennung

- IP-Adressen werden über zentrale Stellen (Internet-Provider) vergeben.
- Es darf keine doppelten Adressen geben.
- Für die Verwendung innerhalb einer Firma sind private Adressbereiche vorgesehen.

127.0.0.1 ("localhost") wird von jedem Rechner für sich selbst verwendet.

## DNS - Domain Name System

- Arbeitet nach dem Prinzip der Delegation.
- Es gibt Network Information Center (NIC), die länderspezifische Top-Level-Domains verwalten (.de).

## Linux Aufbau

- **User**
- **Shell**: Kommandointerpreter
- **Kernel**: Systemkern
- **Hardware**

Linux besteht aus dem Systemkern (Kernel), der mit der Hardware kommuniziert. Die Shell kommuniziert mit dem Kern. Um die Shell können weitere Komponenten angesiedelt werden, die mit dem Benutzer interagieren.

## Gängige Linux Varianten

- Debian
  - Knoppix
  - Ubuntu
    - Kubuntu
    - Xubuntu
    - Lubuntu
- RedHat
  - SuSE
  - CentOS
  - Fedora
  - openSUSE

Linux-Systeme sind sowohl Server- als auch Desktop-Systeme und können gleichzeitig als beides fungieren. Sie benötigen keine grafische Oberfläche.

## Benutzerrechte

- `drwxr-xr-x 2 | heidi | hntms | 4096 | März 17 07:07:16 | Arbeitsfläche`

  - **Attributes**: d | rwxr-xr-x | 2
  - **Owner**: heidi
  - **Group**: hntms
  - **Size**: 4096
  - **Last modified date**: März 17 07:07:16
  - **Name of file**: Arbeitsfläche

Drei mögliche Rechte:
- Lesen `r = 4`
- Schreiben `w = 2`
- Ausführen `x = 1`

Erstes Triplet: Eigentümerrechte
Zweites Triplet: Rechte der Eigentümergruppe
Drittes Triplet: Rechte für alle anderen

- **Rechtebeispiele**:

  - `r-- 400`
  - `rw- 600`
  - `rwx 700`
  - `rwxr-- 740`
  - `rwxr-x 750`
  - `rwxrwx 770`
  - `rwxrwxr 774`
  - `rwxrwxr-x 775`

`rwx -- datei.txt` bedeutet dann: Hugo darf lesen, schreiben und ausführen. Dateirecht wurde auf `chmod 700 datei.txt` gesetzt.

## Linux Laufwerke

- Linux kennt keine Laufwerksbuchstaben.
- Freigaben anderer Rechner können an beliebiger Stelle eingehängt werden.

## Linux Systemverwaltung

- Systemverwalter-Account wird bei der Installation automatisch angelegt.
- Besitzt alle Rechte im System.
- Kann weitere Benutzer einrichten und verwalten.
- Arbeitet immer mit Privilegien.
- Es gibt nur einen Admin ("root").

## Befehle

- `pwd` | Zeigt aktuelles Verzeichnis
- `mkdir` | Ein Verzeichnis anlegen
- `cd` | In ein Verzeichnis wechseln
- `ls` | Inhalt eines Verzeichnisses anzeigen
- `rmdir` | Verzeichnis löschen
- `touch` | Leere Datei anlegen
- `cat` | Inhalt einer Datei am Stück anzeigen
- `more` | Inhalt einer Datei scheibchenweise anzeigen
- `less` | Inhalt einer Datei seitenweise anzeigen
- `cp` | Quelle -> Ziel. Eine Datei kopieren
- `ln` | Quelle -> Ziel. Eine Verknüpfung erstellen
- `grep` | Eine Quelle nach Mustern durchsuchen (mit `-i` wird Groß- und Kleinschreibung ignoriert)

## Platten partitionieren

- Festplatten werden unter Linux als `sd...` bezeichnet.
- Dateisysteme sind FAT (File Allocation Table).

## RAID

- **RAID 0**: mind. 2 HDDs, Stripe
- **RAID 1**: mind. 2 HDDs, Mirror
- **RAID 5**: mind. 3 HDDs, Ausfall 1
- **RAID 6**: mind. 4 HDDs, Ausfall 2
- **RAID 10**: mind. 4

Bei RAID 5 und 6 kann 1 bzw. 2 Festplatten ausfallen, ohne dass Daten verloren gehen.

## NFS Server (Network File System)

- Methode, um Daten/Verzeichnisse für andere freizugeben.
- Berechtigung erfolgt ausschließlich auf Netzwerkebene.

## vi Editor

- vi ist ein Editor

  - **3 Modi**:
    - Kommando-Modus
    - Editier-Modus
    - Kommandozeile

Normalerweise bearbeiten Sie mit vi Konfigurationsdateien, Skripte, kleine HTML/PHP-Dateien und einfache Texte. Mit vi könnten Sie dennoch grundsätzlich alle Arten von Dateien bearbeiten. Ob es jedoch sinnvoll ist, Musikdateien, Bilder oder Binärdaten damit zu bearbeiten, überlasse ich Ihnen.

## WEBserver

- Programm, das Internetseiten bereitstellt, auf die sie per Browser zugreifen können.
- Auf einem Server können mehrere Instanzen eines Webservers mit unterschiedlichen Konfigurationen parallel laufen.
- Server horchen auf unterschiedliche Ports (vergleichbar mit Adresse (Straße + Hausnummer)).
- **HTTP Standardport**: Port 80

## Apache Funktionsweise

- Standardport für HTTPS ist 443.
- Je nachdem, wie der Server angesprochen wird, lädt man aus dem jeweiligen Apache-Dienst.
- Unter Linux heißen diese "Daemon".

Gängige Ports:
- SMTP = 25 (Mail)
- FTP = 21 (File Transfer)
- SSH = 22 (Secure Shell)
- HTTP = 80
- IMAP = 443 (Postfach)

Apache-Webserver können mehrere Sites bereitstellen. Virtuelle Hosts haben dieselbe IP.

## Sicherer SSL Server

- Server erhält Zertifikat von Certificate Authority.
- Browser prüft Zertifikat gegen die CA. Bestätigt die CA, dass das Zertifikat echt ist, baut der Browser eine verschlüsselte Verbindung auf.
- Website "erfindet" Schlüssel, mit dem Verbindungen verschlüsselt werden sollen. Website stellt Antrag an CA. CA signiert mit IHREM Key den Antrag und bestätigt, dass die Website einen nur ihr zugehörigen Schlüssel hat.

## WebDAV

- Web-based Distributed Authoring and Versioning
- Mit DAV-Modul kann Webserver auch als File-Server verwendet werden.

## SSH

- Secure Shell: Meist genutztes Werkzeug zum Administrieren in einer Unix/Linux Umgebung.
- Telnet (unverschlüsselt) wird deshalb nur noch für Zugriff auf Switches verwendet, die keine Verschlüsselung nutzen.
- SSH-Daemon läuft auf Port 22.
- Beim ersten Zugriff wird Host Key mit einer Prüfsumme überprüft und in eine Datei eingeschrieben.

## Public-Private Key Verschlüsselung

- Daten an den Empfänger mit dessen öffentlichen Schlüssel verschlüsseln. Empfänger kann mit seinem privaten Schlüssel die Daten entschlüsseln.

## Email

- Emails werden mit einem Editor verfasst, aber mit Protokoll "SMTP" verschlüsselt versendet.
- MTA übermittelt.
- MDA legt Email in dein Postfach.
- Empfänger greift auf das Postfach (IMAP) zu oder lädt Email runter.

## Security und Firewall

- Firewall soll Rechner oder Netzwerk vor ungewollten Zugriffen schützen.
- Nach außen hin darf ich alle Dienste in Anspruch nehmen, aber von außen darf niemand auf meinen Rechner zugreifen.
- Bei Linux mit `gufw` konfigurieren.
- Ein ganzes Netzwerk zu schützen ist aufwändiger.

### DMZ

- Zwischen Freund und Freund wird DMZ eingerichtet, über welche kommuniziert wird. Kein direkter Zugriff aufs oder ins Internet.
- Client darf nur mit Proxy surfen. Der Proxy darf per HTTP und HTTPS auf Firewall zugreifen.

### fail2ban

- Schützt Server oder Netzwerke.
- Erkennt beispielsweise Fehllogins per SSH.
- Kann eingestellt werden, dass IPs aktiv geblockt werden.

### Port Scanner

- Findet heraus, auf welchem Port ein Server/Rechner ansprechbar ist.
- Ein Portscanner kann in einem Netzwerk die aktiven IP-Adressen prüfen und bei einem einzelnen Rechner die IP-Adresse sowie alle weiteren TCP/UDP-Ports.
- Ein Portscanner kann auch in einem Netzwerk alle TCP/UDP-Ports prüfen.

## Cluster

- **HA Cluster (High Availability)**: Einsatz, um Downtime gering zu halten.
  - Sorgt dafür, dass Shop auf zwei Servern laufen kann. Sollte ein Server ausfallen, wird auf den anderen umgezogen.
- **HPC (High Performance Cluster)**: Leistung so hoch wie möglich halten. Last wird auf mehrere Maschinen verteilt.
