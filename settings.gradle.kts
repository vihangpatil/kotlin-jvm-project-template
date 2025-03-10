plugins {
    id("de.fayard.refreshVersions") version "0.60.5"
}

refreshVersions {
    rejectVersionIf {
        candidate.stabilityLevel != de.fayard.refreshVersions.core.StabilityLevel.Stable
    }
    extraArtifactVersionKeyRules(file("refreshVersions-extra-rules.txt"))
}

rootProject.name = "kotlin-jvm-project-template"
include(
    "app",
    "lib",
)
