package ndk.sample.ndk_util

class MathNdkLib {

    /**
     * A native method that is implemented by the 'sample' native library,
     * which is packaged with this application.
     */
    external fun add(a: Int, b: Int): Int
    external fun subtract(a: Int, b: Int): Int
    external fun multiply(a: Int, b: Int): Int
    external fun divide(a: Int, b: Int): Double

    companion object {
        // This is used to load the 'sample' library on application startup.
        init {
            try {
                System.loadLibrary("sample")
            } catch (e: UnsatisfiedLinkError) {
                // Handle library loading failure
                // For example, log an error or display a message to the user
                // This is crucial for debugging NDK integration issues.
                System.err.println("Native code library failed to load.\n$e")
            }
        }
    }
}