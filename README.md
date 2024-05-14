# FunFacts Android App

Welcome to FunFacts, an Android app that provides random facts about animals, specifically cats or dogs based on your selection. This app is built using Kotlin with Jetpack Compose, MVVM architecture, Flows for data handling, and the Navigation component for seamless navigation between screens.

## Screenshots

![funfacts_1](https://github.com/NiharikaInala/FunFacts/assets/113080462/64588495-424b-4368-95ab-c4a6f9a3e067)

*Home Screen*

![funfacts_2](https://github.com/NiharikaInala/FunFacts/assets/113080462/22b8c6e2-0eb2-474e-8742-ca3922053a83)

*Home Screen with Details screen button*

![funfacts_3](https://github.com/NiharikaInala/FunFacts/assets/113080462/ba377f03-794b-4d0f-be88-12a3d7b87548)

*Details screen with facts of your selected choice*

## Getting Started

### Opening the Project in Android Studio

1. **Open Android Studio.**
2. Click on **File** -> **Open**.
3. Navigate to the directory where you cloned the repository.
4. Select the **FunFacts** directory and click **Open**.

### Building and Running the App

1. After opening the project in Android Studio, wait for the project to sync.
2. Connect a physical device via USB or use an emulator.
3. Click on the **Run** button to build and install the app on your device.

### Installing the APK

1. Download the APK from this [link](https://upload.app/download/funfacts/com.niharikainala.funfacts/31771fe88a5ec824386ea04175ddadc5b399397d3f6265fc3e4fdaead7307cb7).
2. Transfer the downloaded APK to your Android device if you downloaded it on a computer.
3. On your Android device, navigate to the location where the APK is saved using a file manager.
4. Tap on the APK file to start the installation process.
5. Follow the on-screen instructions to complete the installation.

## Usage

1. Launch the app on your device.
2. Enter your name 
3. Choose either "Cat" or "Dog" and click on button to see interesting facts about the selected animal.

## Project Structure

The project structure is organized as follows:

- **app**: Contains the main application code.
  - **ui**: Composable UI components and screens.
  - **viewmodel**: Contains ViewModels for UI components.
  - **data**: Data layer for fetching and managing animal facts.
  - **navigation**: Handles navigation between different screens.

## Dependencies

The app uses the following major dependencies:

- Jetpack Compose
- ViewModel and Flows
- Navigation Component

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and create a pull request with your changes.
