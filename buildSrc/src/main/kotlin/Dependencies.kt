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

object Dependencies {
    val multiplatform = Multiplatform
    object Multiplatform {

        val kotlin = Kotlin
        object Kotlin {
            const val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
            const val stdlibNative = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

            const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
            const val testCommonAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        }

        val coroutines = Coroutines

        object Coroutines {
            // https://github.com/Kotlin/kotlinx.coroutines
            const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
            const val stately = "co.touchlab:stately-common:${Versions.stately}"
        }

        val ktor = Ktor

        object Ktor {
            const val common = "io.ktor:ktor-client-core:${Versions.ktor}"
            const val mock = "io.ktor:ktor-client-mock:${Versions.ktor}"
        }
    }
}
