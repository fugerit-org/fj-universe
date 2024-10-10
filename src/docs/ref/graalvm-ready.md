# GraalVM referend

Currently the target GraalVM version for most project is Oracle GraalVM 21.

[![Oracle GraalVM](https://img.shields.io/badge/GraalVM-oracle%2021-%23771111.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.graalvm.org/downloads/)

Most project in [Fugerit Organization](https://github.com/fugerit-org) are native ready using some tools, especially : 

- [native-helper-graalvm](https://github.com/fugerit-org/native-helper-graalvm)
- [native-helper-maven-plugin](https://github.com/fugerit-org/native-helper-maven-plugin)

Basically is possible to configure metadata to generate for a library at build time : 

```xml
<plugin>
    <groupId>org.fugerit.java</groupId>
    <artifactId>native-helper-maven-plugin</artifactId>
    <version>${native-helper-maven-plugin-version}</version>
    <executions>
        <execution>
            <id>generate-native-configuration</id>
            <phase>prepare-package</phase>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <nativeHelperConfigPath>src/main/config/native-helper-config.yaml</nativeHelperConfigPath>
                <reflectConfigJsonOutputPath>${project.build.directory}/generated-resources/reflect-config-demo.json</reflectConfigJsonOutputPath>
                <warnOnError>false</warnOnError>
            </configuration>
        </execution>
    </executions>
</plugin>
```