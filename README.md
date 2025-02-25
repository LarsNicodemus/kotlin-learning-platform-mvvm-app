# Kotlin Learning Platform MVVM App

This project is a Kotlin-based learning platform app that implements the **MVVM** (Model-View-ViewModel) architecture pattern. It was developed as part of the learning process for understanding **MVVM** in Android development, including concepts like **RecyclerView**, **Shared ViewModel**, **LiveData**, and the implementation of **MVVM with ViewModel**.

## About the App

The **Kotlin Learning Platform MVVM App** is an educational app that demonstrates the application of the MVVM architecture. The app includes features like a list of courses, displaying details of each course, and utilizing modern Android development techniques to manage and display data efficiently.

Key features include:
- **MVVM Architecture**: Separation of concerns for better scalability and maintainability.
- **RecyclerView**: Displaying lists of courses efficiently.
- **Shared ViewModel**: Sharing data between different fragments.
- **LiveData**: Observing data changes and updating the UI automatically.
- **ViewModel**: Managing UI-related data lifecycle-consciously.

## Features

- **Course List**: Displays a list of courses using a `RecyclerView` with ViewModel and LiveData.
- **Course Details**: Shows detailed information about a selected course, implemented using a shared `ViewModel`.
- **LiveData**: Automatically updates the UI when the data changes.
- **Shared ViewModel**: Allows sharing data between multiple fragments within the app.

## Technologies and Concepts

- **Kotlin**: The programming language for Android development.
- **MVVM (Model-View-ViewModel)**: Software architecture pattern for better separation of concerns.
- **RecyclerView**: A flexible view for displaying large data sets in a scrollable list.
- **LiveData**: Lifecycle-aware data holder for observing changes in the data.
- **ViewModel**: Stores and manages UI-related data in a lifecycle-conscious way.
- **Shared ViewModel**: Sharing data between fragments using a single ViewModel instance.
- **Android Studio**: The official IDE for Android development.

## Project Workflow

- **Day 1**: Set up the project and implemented the basic structure of MVVM with ViewModel.
- **Day 2**: Integrated `RecyclerView` for displaying course lists.
- **Day 3**: Implemented LiveData for observing data changes and updating the UI.
- **Day 4**: Introduced Shared ViewModel for sharing data between fragments.
- **Day 5**: Finalized the UI and refined the app with the MVVM architecture.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/LarsNicodemus/kotlin-learning-platform-mvvm-app.git
Open the project in Android Studio.

Build the app and run it on an emulator or physical device.

### Usage
The app displays a list of courses, which is managed by the ViewModel.
Select a course to view its details, which is handled by a Shared ViewModel.
The app automatically updates the UI using LiveData when data changes.

### Contributing
Contributions are welcome! Please create a pull request or open an issue to suggest improvements or report bugs.

### License
This project is licensed under the MIT License. See the LICENSE file for more information.

Note: This app demonstrates the MVVM architecture pattern and its application in Android development. It was created as part of the learning process to understand software architecture in mobile app development.
