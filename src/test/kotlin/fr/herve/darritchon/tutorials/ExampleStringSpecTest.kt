package fr.hervedarritchon.utils.kesve

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe

class ExampleStringSpecTest : StringSpec() {

    init {
        "strings.length should return size of string" {
            "hello".length shouldBe 5
        }
    }

}