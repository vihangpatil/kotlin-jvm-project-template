package dev.vihang.app

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.spec.style.scopes.StringSpecRootScope.invoke
import io.kotest.matchers.shouldBe

class AppTest : StringSpec({
    "sample test" {
        println("Sample test!")
        2 + 2 shouldBe 4
    }
})