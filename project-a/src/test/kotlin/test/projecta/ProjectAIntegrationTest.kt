package test.projecta

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("integration")
class ProjectAIntegrationTest {

    @Test
    fun integrationTestA() {
        println("integration test a")
        assert(ProjectAInternal().data == "hello from a")
    }

}