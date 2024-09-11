plugins {
    id("org.springframework.boot") version "3.3.3" // Ensure you're using Spring Boot
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.spring") version "1.9.0"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Database driver - Choose your DB (PostgreSQL, MySQL, etc.)
    runtimeOnly("com.h2database:h2") // For in-memory DB, for local testing
    runtimeOnly("mysql:mysql-connector-java") // Or your preferred database connector

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
