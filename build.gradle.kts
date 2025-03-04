plugins {
  java
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.slf4j:slf4j-api:2.0.17")
  implementation("org.slf4j:slf4j-simple:2.0.17")

  testImplementation(platform("org.junit:junit-bom:5.12.1"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  testImplementation("org.mockito:mockito-core:5.16.1")
}

tasks.test {
  useJUnitPlatform()
}