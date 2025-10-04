plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building a CLI application
    // You can run your app via task "run": ./gradlew run
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // https://mavenlibs.com/maven/dependency/org.openjfx/javafx-base
    val supportedPlatforms = listOf("linux", "mac", "win") 
    val javaFxVersion = "17.0.1"
    val javaFXModules = listOf(
        "base",
        "controls",
        "fxml",
        "swing",
        "graphics"
    )

    // JavaFX: comment out if you do not need them
    for (platform in supportedPlatforms) {
        for (module in javaFXModules) {
            implementation("org.openjfx:javafx-$module:$javaFxVersion:$platform")
        }
    }
}

application {
    // Define the main class for the application
    mainClass.set("launcher.Launcher")
}
