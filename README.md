<h1>LoggerLib</h1>
LoggerLib est une librairie Java permettant de simplifier l'utilisation du Logger.
l'apparence du Logger est basée sur le Logger Wylog de Wytrem (https://github.com/wytrem/WyLog).
<h2>Utilisation</h2>
<h3>BasicLogger</h3>
Pour utiliser le BasicLogger, vous devez écrire ce code :

```
BasicLogger logger = LoggerRegister.registerBasicLogger("Nom du logger");
```

Aperçu du BasicLogger :

```
[Nom du logger] [INFO] Message
[Nom du logger] [WARN] Message
[Nom du logger] [ERROR] Message
[Nom du logger] [FATAL] Message
```

<h3>Logger</h3>

Le Logger est un peu plus avancé que le 

```BasicLogger```
