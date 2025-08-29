package ndk.sample.ndk_util

class MathNdkLib {

    /**
     *     methods of calculation declared here, implementation is available in [math-lib]
     */
    external fun add(a: Int, b: Int): Int
    external fun subtract(a: Int, b: Int): Int
    external fun multiply(a: Int, b: Int): Int
    external fun divide(a: Int, b: Int): Double

    companion object {
        init {
            try {
                System.loadLibrary("sample")
            } catch (e: UnsatisfiedLinkError) {
                // Handle library loading failure
                System.err.println("Native code library failed to load.\n$e")
            }
        }
    }
}