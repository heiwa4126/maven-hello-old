# Maven-hello

- maven で 他jarに依存するプログラムを書く。
- executable な fatJARを作る。

もとは
```bash
mvn -B archetype:generate \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DinteractiveMode=false \
-DarchetypeVersion=1.4 \
-DgroupId=com.sample \
-DartifactId=hello
```

で作って、POMを一生懸命修正したもの。


JAVAとmavenのバージョンは以下の通り。
```
$ java -version
openjdk version "11.0.16" 2022-07-19
OpenJDK Runtime Environment (build 11.0.16+8-post-Ubuntu-0ubuntu122.04)
OpenJDK 64-Bit Server VM (build 11.0.16+8-post-Ubuntu-0ubuntu122.04, mixed mode, sharing)

$ javac -version
javac 11.0.16

$ mvn -version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 11.0.16, vendor: Ubuntu, runtime: /usr/lib/jvm/java-11-openjdk-amd64
Default locale: ja_JP, platform encoding: UTF-8
OS name: "linux", version: "5.15.0-1020-aws", arch: "amd64", family: "unix"
```


# compile & run

```bash
mvn compile
mvn exec:java
```

# pakcage & run

```bash
mvn package
# maven-shade-plugin で executable な fatJAR ができる
java -jar target/hello-1.0-SNAPSHOT.jar
```


# tips

maven-shade-plugin を pluginManagement の子として書かないこと。
書くと `mvn package` で処理してくれない。
