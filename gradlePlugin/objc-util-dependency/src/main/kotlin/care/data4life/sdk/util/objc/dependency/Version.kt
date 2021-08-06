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
package care.data4life.sdk.util.objc.dependency

object Version {

    object GradlePlugin {
        const val kotlin = Version.kotlin
        const val android = "4.2.2"
    }

    // Kotlin
    // https://github.com/JetBrains/kotlin
    const val kotlin = "1.4.32"

    // https://github.com/Kotlin/kotlinx.coroutines
    const val kotlinCoroutines = "1.4.3-native-mt"

    // https://github.com/touchlab/Stately
    const val stately = "1.1.6"

    // Network
    // https://ktor.io/
    const val ktor = "1.5.4"
}