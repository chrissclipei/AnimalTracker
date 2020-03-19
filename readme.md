# ANIMAL TRACKER
Animal Tracker is a mobile app built in Android studio that's goal is to digitize and consolidate an animal owner's information on their animal(s).
## Layout
### Main page
The main page will have the following features
* A search bar, searching a pet name/ common name/ species/ scientific name will yield a list of results that correspond to the query. Upon searching, the user will be redirected to the __Search Results__ page.
* An 'add animal' button, which will allow users to create a new entry in their database. This will navigate to the __Add Animal__ page.
* A button to view the full list of *current* Animals (implying that the user may archive an animal's entry because they died/ were given away, etc.). This will navigate to the __Animal List__ page.
* A button to view all scheduled reminders. This will navigate to the __Reminders__ page.
![Main page network](/pages/Main_page_network.png)

### Search Results page
The search results page will display a list of animals that correspond to the query given by the user. An element of the list will be composed of the most recent picture of the animal, and its pet name and common name. A user can then navigate to a result's respective __Animal__ page by tapping anywhere on the result.

### Add Animal page
The Add Animal page will allow a user to enter the following information:
* Current Weight 
* Current Picture
* Scientific name
* Common name
* Pet name
* age
* sex

The user must at least enter in the Pet name and common name to continue. After pressing complete, the user will be redirected to the __Animal__ page corresponding to the new entry.

![Add Animal page network](/pages/Add_Animal_page_network.png)

### Animal List page
The Animal List page lists all current animals and has an option to show archived animals as well. Upon clicking any animal, the user will navigate to the __Animal__ page corresponding to the clicked animal.
![Animal List page network](/pages/Animal_List_page_network.png)

### Reminders page
The reminders page lists all reminders across all Animals. Users will be given the option to remove reminders here.
![Reminders page network](/pages/Reminders_page_network.png)

### Animal page

This page will display the information for a given animal. This information will include, but not be limited to:
* Current Weight 
* Current Picture
* Latest logged info
* Scientific name
* Common name
* Pet name
* age
* sex

This page will also allow the user to add new weights, pictures, and logged info for the given animal.

Users will have the ability to archive an Animal's entry on this page.

Users will also have the ability to set reminders (one-time or periodic) for an animal on this page. (e.g. feed this animal every Tu/Th/Su).

Upon adding any of this information, a user will have to option to select whether the it corresponds to the current day or a day in the past.
![Animal page network](/pages/Animal_page_network.jpg)
##### __Users can view an animal's full set of pictures/weights/logged info by tapping on the respective field. These will lead to the 'Picture,' 'Weights,' and 'Datalog' pages, respectively.__
### Create Reminder page
This page will allow a user to enter in information for a reminder for an animal. Upon creating the reminder, the user is redirected to the respective animal's page.
![Create Reminder page network](/pages/Create_Reminder_page_network.png)
### Picture page
This page will have the set of pictures taken of an animal, ordered from most to least recent.
The user will be able to edit the information corresponding to an image or delete it. A user will not be able to reset the animal the image corresponds to. This means that deleting the most recent is also possible.
![Picture page network](/pages/Picture_page_network.png)
### Weights page
This page will have the list of weights of an animal, ordered from least recent to most recent.
The user will be able to edit/delete any weight recorded for an animal. This means that deleting the most recent is also possible.
![Weight page network](/pages/Weight_page_network.png)
### Log page
This page will have the list of logged information for an animal, ordered from least recent to most recent.
The user  will be able to edit/delete any logged information recorded for an animal. This means that deleting the most recent is also possible.
![Log page network](/pages/Log_page_network.png)

