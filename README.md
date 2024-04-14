# Martyrs Data Structure Project

# Overview
This project involves implementing a martyrs data structure using sorted singly and doubly linked lists. The data will be loaded from a CSV file provided by B'Tselem. The application will have a graphical user interface (GUI) developed using JavaFX without using Scene Builder. The user will be able to perform various operations related to managing martyrs' information, locations, and statistics.

# Functionality
## Initial Setup
- The user loads the martyrs file using a file chooser.

## Location Screen (Tab 1)
1. Insert New Location Record:
   - Allows the user to insert a new location record to the doubly linked list.

2. Update/Delete Location Record:
   - Provides options to update or delete a location record.

3. Search Location Record:
   - Enables the user to search for a location record and load the martyrs' records in that location.

## Martyrs Screen (Tab 2)
After selecting a location, the user can perform the following actions:
1. Insert New Martyr Record:
   - Allows insertion of a new martyr record to the single linked list.
2. Update/Delete Martyr Record:
   - Enables updating or deleting a martyr record.
3. Search Martyr Record:
   - Allows searching for a martyr record by part of their name.
  

## Statistics Screen (Tab 3)
Displays statistics for the selected location:
1. Generate Summary Report:
 Provides:
   - Number of martyrs by age
   - Number of martyrs by gender
   - Average age of martyrs
   - Date with the maximum number of martyrs
     
2. Navigation Buttons:
  - Next button generates a summary report for the next location.
  - Previous button generates a summary report for the previous location.

## Save Screen (Tab 4)
- Allows saving the updated linked lists back to a file in the same format as the input file.
- Uses a file chooser to select the folder to save the file in.

# Requirements
- Implementation of sorted singly and doubly linked lists for martyrs' data structure.
- Loading data from a CSV file.
- Graphical User Interface (GUI) using JavaFX without Scene Builder.
- Saving updated data back to a file.
- No usage of arrays or ArrayList.

# ScreenShot

Initial Page
![Screenshot 2023-05-19 153116](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/34ad6d33-9717-46ec-8ad5-527bdab1a2b6)

DashBoard 
![Screenshot 2023-05-19 153155](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/937ac618-9bc3-48fb-b783-b68ebf6b2370)

Statistic
![Screenshot 2023-05-19 153219](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/b4bf50db-b47d-4988-9b9d-a6543a67914c)

![Screenshot 2023-05-19 153249](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/716f5c98-ad06-4543-bd2a-e72386a9e427)

![Screenshot 2023-05-19 153313](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/62058b9b-ae53-44bd-bd8c-45558040680f)

Loaded data spesific location
![Screenshot 2023-05-19 153403](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/1fad1f17-75cc-4f1d-8877-6893541ccbc9)

![Screenshot 2023-05-19 153411](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/763eeea0-6451-4897-8c90-fc10dc72f199)

Update Location
![Screenshot 2023-05-19 153436](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/89f7c72a-306c-4d05-bfcc-59186deecee8)

![Screenshot 2023-05-19 153459](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/bce84679-bf74-4bd9-9fd2-696053ed0141)

Add new Martyrs
![Screenshot 2023-05-19 153537](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/0386999b-c50e-488b-83b9-67773fd612d3)

![Screenshot 2023-05-19 153607](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/f4436206-07e2-4f04-b35f-e07e5b1687d2)

Save to file
![Screenshot 2023-05-19 153627](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/137729b7-b84c-4d00-9b7f-f6ac4ec1a011)

![Screenshot 2023-05-19 153651](https://github.com/Anan-Elayan/Martyr-information/assets/99610614/51ae36a2-cc07-4964-85fa-59f18917f8c8)

