# Simple Calculator Using NDK - Android

A simple Android application to perform basic arithmetic operations using C++ and Native Development Kit (NDK).

## Overview

This project showcases how to integrate C++ code into an Android application using the NDK. It features a basic UI where users can input two numbers, select an operation (add, subtract, multiply, divide), and see the result calculated by native C++ functions.

## Screenshot
<img width="300" height="720" alt="image" src="https://github.com/user-attachments/assets/300d8016-683f-475a-95ca-194a452e82fb" />


## Features

*   **Native C++ Integration:** Demonstrates calling C++ functions from Kotlin via JNI (Java Native Interface).
*   **Basic Arithmetic Operations:**
    *   Addition
    *   Subtraction
    *   Multiplication
    *   Division
*   **Simple User Interface:** Allows user input and displays results.

## How it Works

1.  **Kotlin (`MathNdkLib.kt`):**
    *   Declares `external fun` for arithmetic operations (`add`, `subtract`, `multiply`, `divide`).
    *   Loads the native shared library (`System.loadLibrary("sample")`) where these functions are implemented.
2.  **C++ (`math-lib.cpp`):**
    *   Provides the JNI-compatible C++ implementations for the arithmetic functions declared in the Kotlin class.
    *   Function names in C++ follow the JNI naming convention (e.g., `Java_ndk_sample_ndk_1util_MathNdkLib_add`).
3.  **Android UI (`MainActivity.kt` & `activity_main.xml`):**
    *   Collects user input for numbers and the desired operation.
    *   Calls the Kotlin methods in `MathNdkLib`, which in turn invoke the native C++ functions.
    *   Displays the result returned from the native code.

## Tech Stack

*   **Android SDK and NDK**
*   **Kotlin** (for application logic and UI)
*   **XML** (for UI)
*   **C++** (for native arithmetic functions)
*   **View Binding** (for UI interaction)

## Building and Running

1.  Clone the repository.
2.  Ensure you have the Android NDK installed via the SDK Manager in Android Studio.
3.  Open the project in Android Studio.
4.  Let Gradle sync and build the project.
5.  Run the application on an Android device or emulator.
