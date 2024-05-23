plugins {
    application
    jacoco
    id ("checkstyle")
}

group = "org.example"
version = "1.0-SNAPSHOT"
application {mainClass = "hexlet.code.App" }

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly ("org.projectlombok:lombok:1.18.20")
    annotationProcessor ("org.projectlombok:lombok:1.18.20")
    testCompileOnly ("org.projectlombok:lombok:1.18.20")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.20")
    testImplementation ("org.assertj:assertj-core:3.19.0")
}

tasks.test {
    useJUnitPlatform()
}
tasks.jacocoTestReport {
    reports {

        xml.required.set(true)


    }
}