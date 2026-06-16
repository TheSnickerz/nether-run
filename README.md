# Nether Run

A PvE extraction mod for Minecraft inspired by hardcore extraction shooters. Gear up, dive into dangerous zones, fight your way through enemies, and extract with your loot — or lose it all.

## Concept

Each run you load into a dangerous zone filled with PvE enemies and valuable loot. Your goal is to collect gear and extract before you die. Death means losing everything you brought in. Progression comes through the gear you successfully extract — better gear lets you tackle harder zones with better rewards.

## Features (Planned)

- Extraction zones with PvE enemies and tiered loot
- Gear-based progression system
- Risk/reward mechanics — harder zones, better loot
- Custom items, armor, and weapons
- Persistent stash between runs

## Requirements

- Minecraft 1.21.1
- [Fabric Loader](https://fabricmc.net/use/installer/) 0.16.0+
- [Fabric API](https://modrinth.com/mod/fabric-api) 0.103.0+1.21.1

## Development Setup

**Prerequisites:** Java 21

```bash
# Clone the repo
git clone https://github.com/TheSnickerz/nether-run.git
cd nether-run

# Generate Minecraft sources for IDE navigation
./gradlew genSources

# Build the mod
./gradlew build
```

The built `.jar` will be in `build/libs/`.

## Project Structure

```
src/
├── main/java/          # Server-side mod code
├── client/java/        # Client-side mod code
└── main/resources/     # Assets, data, mod metadata
```

## License

MIT
