plugins {
    id("java")
}

group = "org.luaj"
version = "3.0.3"


repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
    useJUnit()
}

sourceSets {
    main {
        java.setSrcDirs(listOf("src/core", "src/jse"))
    }
    test {
        java.setSrcDirs(listOf("test/junit", "test/java"))
        resources.setSrcDirs(listOf("test/resources"))
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:3.8.2")
    implementation("org.apache.bcel:bcel:6.7.0")
}

// TODO handle examples
