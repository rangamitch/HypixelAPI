# rangamitch's HypixelAPI Wrapper

This is a wrapper for the [Hypixel API](https://api.hypixel.net) which allows you to pull guild and player information easily.

## Installing Dependency

### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.mitchtheranga</groupId>
    <artifactId>HypixelAPI</artifactId>
    <version>(version here)</version>
</dependency>
```

### Gradle
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.mitchtheranga:HypixelAPI:(version here)'
}
```

## Usage

To use this, just create a new instance of the api by doing
```java
new HypixelAPI(API KEY)
```

Then, you can get a player or guild and then further information on the wanted target .

e.g. If you wanted to get the UUIDs of all the players in a guild, you would do;
```java
HypixelAPI api = new HypixelAPI(API KEY);

com.github.mitchtheranga.hypixelapi.Guild guild = api.getGuildByName(GUILD NAME);
for(Member member : guild.getMembers()){
  System.out.println(member.getUUID());
}
```

or, if you wanted to check a player's wins in bedwars, you would do;
```java
HypixelAPI api = new HypixelAPI(API KEY);
api.getPlayerByIGN(IGN).getStats().getBedwars().getAllCoreModes().getWins();
```

## Contributions

### Committers

- [rangamitch](https://github.com/rangamitch)

### Testers
- [AddmanMinecraft](https://github.com/AddmanMinecraft)

## 
### <div align="center">[![](https://jitpack.io/v/mitchtheranga/HypixelAPI.svg)](https://jitpack.io/#mitchtheranga/HypixelAPI)</div>
