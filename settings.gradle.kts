pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("VERSION_CATALOGS")
includeBuild("build-logic") {
    dependencySubstitution {
        substitute(module("com.mu.jan.primerandroid:build-logic"))
            .using(project(":"))
    }
}

rootProject.name = "PrimerAndroid"
include(":app")

include(":base-ui")
include(":base-network")
include(":base-database")
include(":base-preferences")

include(":common-local")
include(":common-network")
include(":common")

include(":domain-ai")
include(":domain-conversation")
include(":domain-login")
include(":domain-message")
include(":domain-status")

include(":data-ai")
include(":data-ai:api")
include(":data-ai:impl")
include(":data-ai:test")

include(":data-conversation")
include(":data-conversation:api")
include(":data-conversation:impl")
include(":data-conversation:test")

include(":data-login")
include(":data-login:api")
include(":data-login:impl")
include(":data-login:test")

include(":data-message")
include(":data-message:api")
include(":data-message:impl")
include(":data-message:test")

include(":data-status")
include(":data-status:api")
include(":data-status:impl")
include(":data-status:test")

include(":flavor-full")
include(":feature-full")

include(":feature-onboarding")
include(":flavor-onboarding")

include(":flavor-login")
include(":feature-login")

