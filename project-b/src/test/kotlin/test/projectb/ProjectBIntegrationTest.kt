package test.projectb

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("integration")
class ProjectBIntegrationTest {

    @Test
    fun integrationTestB() {
        println("integration test b")
        assert(ProjectBInternal().data == "servus aus b")
    }

}