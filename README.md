# SpringCrudApplication

A simple CRUD application made with spring framework and Thymleaf templating engine.

## Functionalities
> Below is the summary of page-wise functionalities that you can expect from this Spring Boot MVC CRUD Application.

### Home Page

1. When the user hits the application URL into the browser, he/she will see the home page that is the entry point of the application. From Here, users will be able to visit the ‘Invoice registration page’ and the ‘list of All invoices’ Page by clicking on the given links.



### Invoice Registration Page

2) If user clicks on the ‘Add Invoice’ link available on the home page, he/she will redirect to the invoice registration page.

3) In the Invoice registration page, the user can fill the form and save it after clicking on the ‘Save Invoice’ button. After the successful addition of the record, a message “Invoice with id: ‘XXX’ is added successfully !” will be displayed at the bottom. From this page user can also visit to list of Invoice Pages after clicking on the ‘List Of Invoices’ link.

4) If user clicks on the ‘Show All Invoices’ link available on the home page, he/she will enter to the list of invoice Pages and can see all pre-existing invoices.

### List Of Invoices Page

5) In the List Of Invoice page, user can perform ‘edit’ or ‘delete’ operation on the invoices. Additionally, user can also enter into the Invoice registration page after clicking on the ‘Add Invoice’ link.

6) If user clicks on the ‘Edit’ link available at List Of Invoices page, a new form will open. User can modify the value and update it into the DB after clicking on the ‘Update’ button. After a successful update, a message “Invoice with id: ‘XXX’ is updated successfully !” will be displayed at the bottom.

7) If user clicks on the ‘Delete’ link available at List Of Invoices page, the record will be deleted. After successful removal of the record, a message “Invoice with id: ‘XXX’ is deleted successfully !” will be displayed at the bottom.

8) From the list of Invoices page, user can go back to the home page after clicking on the ‘Go to Home’ link.
