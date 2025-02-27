plugins {
    java
    distribution
    maven
    id("org.omegat.gradle") version "1.5.3"
}

repositories {
    mavenCentral()
    mavenLocal()
}

version = "1.1.3"

omegat {
    version = "6.0.0"
    pluginClass = "net.libretraduko.omegat.GoogleTranslateWithoutApiKey"
}



dependencies {
    implementation("commons-io:commons-io:2.7")
    implementation("commons-lang:commons-lang:2.6")
    implementation("org.apache.commons:commons-lang3:3.6")
}



distributions {
    main {
        contents {
            from(tasks["jar"], "README.md", "COPYING")
        }
    }
}
