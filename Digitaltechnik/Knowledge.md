# Codes

## Was sind Codierungen?
Codierungen sind Methoden zur Darstellung von Daten oder Informationen in verschiedenen Formaten oder Symbolen. Sie ermöglichen die Kommunikation und Verarbeitung von Informationen in digitalen Systemen.

## Wie/warum werden sie angewandt?
- **Informationsdarstellung**: Codierungen ermöglichen es, Informationen in Formaten darzustellen, die für Computer und andere digitale Geräte verständlich sind.
- **Fehlererkennung und -korrektur**: Einige Codierungen helfen dabei, Fehler in Daten zu erkennen und zu korrigieren.
- **Effizienz**: Optimierte Codierungen können Speicherplatz sparen und die Verarbeitungsgeschwindigkeit erhöhen.

## Grobe Vorteile bestimmter Codierungen
- **ASCII**: Weit verbreitet und standardisiert für die Darstellung von Text.
- **BCD (Binary-Coded Decimal)**: Einfacher Umgang mit Dezimalzahlen in digitalen Systemen.
- **Hamming-Code**: Fehlererkennung und -korrektur.
- **1-aus-n-Code**: Einfaches Schaltungsdesign, da immer nur ein Bit aktiv ist.
- **Gray-Code**: Minimiert Fehler bei der Übertragung von binären Werten, da sich benachbarte Werte nur in einem Bit unterscheiden.

# Schaltkreistechnik

## Schnittstellen

### Definition Interface
Eine Schnittstelle (Interface) ist ein Punkt der Interaktion zwischen zwei Systemen, Geräten oder Softwareanwendungen.

### Für was braucht man eine Schnittstelle?
- **Kommunikation**: Ermöglicht den Austausch von Daten und Befehlen.
- **Kompatibilität**: Stellt sicher, dass verschiedene Systeme zusammenarbeiten können.
- **Modularität**: Erlaubt es, Systeme in separate, austauschbare Komponenten zu unterteilen.

### Arten von Schnittstellen
- **Common Interface**: Standardschnittstellen, die in vielen Systemen verwendet werden.
- **Software Interface**: Programmierschnittstellen (APIs), die Interaktionen zwischen Softwarekomponenten ermöglichen.
- **Network Interface**: Schnittstellen für die Netzwerkkommunikation.
- **Data Interface**: Schnittstellen zur Datenübertragung zwischen Geräten.
- **User Interface**: Schnittstellen für die Interaktion zwischen Mensch und Maschine (z.B. GUI).

## Serielle Kommunikation

### Synchrone vs asynchrone Datenübertragung
- **Synchron**: Daten werden in einem festen Zeitrahmen übertragen, synchronisiert durch ein Taktsignal.
- **Asynchron**: Daten werden ohne Taktsignal übertragen, mit Start- und Stopbits zur Synchronisation.

### RS232, UART, I2C – grobe Unterschiede
- **RS232**: Serielle Schnittstelle für die Kommunikation über kurze Distanzen. Verwendet Spannungssignale.
- **UART (Universal Asynchronous Receiver/Transmitter)**: Serielle Kommunikationseinheit, die in Mikrocontrollern verwendet wird.
- **I2C (Inter-Integrated Circuit)**: Bus-System für die Kommunikation zwischen integrierten Schaltkreisen, verwendet zwei Leitungen (Daten und Takt).

### Simplex, Vollduplex, Halbduplex
- **Simplex**: Einwegkommunikation (z.B. Radio).
- **Vollduplex**: Gleichzeitige Zweiwegkommunikation (z.B. Telefon).
- **Halbduplex**: Abwechselnde Zweiwegkommunikation (z.B. Walkie-Talkie).

### Serielle vs. parallele Kommunikation
- **Seriell**: Übertragung von Daten nacheinander über eine einzige Leitung. Effizient für längere Distanzen.
- **Parallel**: Übertragung von Daten gleichzeitig über mehrere Leitungen. Schneller, aber für kurze Distanzen geeignet.

### Baudrate
Die Baudrate gibt die Anzahl der Signalzustandsänderungen pro Sekunde an. Sie bestimmt die Geschwindigkeit der Datenübertragung.

# Addierer

## Halbaddierer und Volladdierer
- **Halbaddierer**: Addiert zwei Bits und gibt Summe und Übertrag (Carry) aus.
- **Volladdierer**: Addiert drei Bits (zwei Eingabebits und einen Carry-In) und gibt Summe und Übertrag aus.

## Carry-Ripple-Addierer und Carry-Lookahead-Addierer – Unterschiede
- **Carry-Ripple-Addierer**: Einfaches Design, bei dem der Carry-Ausgang eines Addierers in den nächsten Addierer eingeht. Langsame Verarbeitung wegen Verzögerung des Carry-Signals.
- **Carry-Lookahead-Addierer**: Schneller, da das Carry-Signal parallel berechnet wird, um Verzögerungen zu minimieren.
