package fr.hervedarritchon.utils.kesve

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ExampleShouldSpecTest : ShouldSpec({
    should("return the length of the string") {
        "sammy".length shouldBe 5
        "".length shouldBe 0
    }
})