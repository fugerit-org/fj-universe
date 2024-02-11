# build_maven_compatibility.yml workflow

Java maven workflow to test java version and OS compatibility.

**Version** : 1.0.0

Usually some java builds are tested : 

- temurin
- corretto
- microsoft
- oracle

And available/supported LTS versions : 8,11,17,21

Each for available OS : ubuntu (linux), macos (apple), windows (microsoft)

For an example of this project look at [build_maven_compatibility.yml](https://github.com/fugerit-org/fj-doc/blob/main/.github/workflows/build_maven_compatibility.yml)