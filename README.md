<img src="https://github.com/CommandMaker/LoggerLib/blob/master/repository-open-graph-template.png" width="800px" height="400px">
<h1>LoggerLib</h1>
LoggerLib est une librairie Java permettant de simplifier l'utilisation du Logger.
L'apparence du Logger est basée sur le Logger Wylog de Wytrem (https://github.com/wytrem/WyLog).
<h2>Téléchargement</h2>
Les verions de LoggerLib sont toutes disponibles <a href="https://github.com/CommandMaker/LoggerLib/releases">ici</a> !
Ou alors vous pouvez utiliser le repo :
Gradle :
```gradle
repositories {
    // [...]
    maven {
        url "http://commandmaker.github.io/maven/"
    }
}


dependencies {
    // [...]
    compile 'fr.command_maker:loggerlib:1.1'
}
```
<h2>Utilisation</h2>
<h3>BasicLogger</h3>
Pour utiliser le BasicLogger, vous devez écrire ce code :

```java
BasicLogger logger = LoggerRegister.registerBasicLogger("Nom du logger");

logger.info("Message");
logger.warn("Message");
logger.error("Message");
logger.fatal("Message");

```

Aperçu du BasicLogger :

```
[Nom du logger] [INFO] Message
[Nom du logger] [WARN] Message
[Nom du logger] [ERROR] Message
[Nom du logger] [FATAL] Message
```

<h3>Logger</h3>

Le Logger est un peu plus avancé que le   ```BasicLogger```.
Pour l'utiliser, vous devez écrire :

```java
Logger logger = LoggerRegister.registerLogger("Nom du logger");

logger.info("Message");
logger.warn("Message");
logger.error("Message");
logger.fatal("Message");
```

Importez bien le logger de ```fr.command_maker.logger```.

Aperçu du Logger :

```
[2020-04-08 16:30:21] [INFO] [Nom du logger] message
[2020-04-08 16:30:21] [WARN] [Nom du logger] message
[2020-04-08 16:30:21] [ERROR] [Nom du logger] message
[2020-04-08 16:30:21] [FATAL] [Nom du logger] message
```
