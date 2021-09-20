/*
 * Copyright (c) 2021 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */
plugins {
    id("care.data4life.gradle.util.objc.dependency")

    id("care.data4life.gradle.util.objc.script.dependency-updates")
    id("care.data4life.gradle.util.objc.script.download-scripts")
    id("care.data4life.gradle.util.objc.script.publishing")
    id("care.data4life.gradle.util.objc.script.quality-spotless")
    id("care.data4life.gradle.util.objc.script.versioning")
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "7.2"
    distributionType = Wrapper.DistributionType.ALL
}
