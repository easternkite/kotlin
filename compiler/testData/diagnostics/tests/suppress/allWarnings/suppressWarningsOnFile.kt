// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
@file:Suppress("warnings")

class C {
    companion object {
        val foo: String?? = null as Nothing?
    }
}