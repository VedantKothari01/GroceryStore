
# Grocery Store App

## Description

The **Grocery Store App** is an Android application designed to showcase a list of grocery items with images and names. The app utilizes `ListView` for displaying the items and integrates the Glide library for efficient image loading and caching.

## Features

- **ListView Display**: Shows a list of grocery items with their names and images.
- **Glide Integration**: Handles image loading, caching, and error management.
- **Date Picker**: Allows users to select a date and view grocery items available on that date.

## Screenshots
![image](https://github.com/user-attachments/assets/1294ed08-bea6-4794-8039-a9ea3219f443)
![image](https://github.com/user-attachments/assets/97c6ccf0-07d3-4d00-9ee9-b7b2f60d70bb)
![image](https://github.com/user-attachments/assets/4bc1f8d1-bf2a-4fe3-be37-2e44d3ddadc1)




![Grocery Store App Screenshot](URL_TO_SCREENSHOT)

## Technologies Used

- **Android Studio**: IDE for Android app development.
- **Java**: Programming language used for this application.
- **Glide**: Image loading and caching library.
- **ListView**: UI component for displaying a list of items.

## Getting Started

### Prerequisites

- Android Studio installed.
- Basic understanding of Android development and Java.

### Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/VedantKothari01/GroceryStore.git
   ```

2. **Open the project in Android Studio:**

   - Launch Android Studio.
   - Select "Open an existing project" and navigate to the cloned repository folder.
   - Open the project and let Android Studio build it.

3. **Run the app:**

   - Connect an Android device or start an emulator.
   - Click the "Run" button in Android Studio to deploy the app.

## Usage

- **Main Screen**: Displays a list of grocery items with images and names.
- **Date Picker**: Tap on the date text to select a specific date. The list updates based on the selected date.

## Code Overview

- **`MainActivity.java`**: Contains the main logic for displaying the grocery list and handling interactions.
- **`GroceryAdapter.java`**: Custom adapter for binding data to the `ListView`.
- **`grocery_item.xml`**: Layout file defining the appearance of each item in the list.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests. Please follow the project's coding standards and include relevant tests.
