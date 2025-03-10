package dev.vihang.lib

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LibTest : StringSpec({
    "sample test" {
        hello() shouldBe "Hello World"
    }
})