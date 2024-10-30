# LWC Combobox with Datatable

This Lightning Web Component (LWC) allows users to view Accounts and their related Contacts in both a combobox and a data table. The component retrieves data through an Apex class.

## Features
- **Combobox**: Displays a list of Accounts.
- **Datatable**: Shows related Contacts for the selected Account.

## Business Logic
The component uses an Apex class to fetch Accounts and their associated Contacts. When an Account is selected from the combobox, its related Contacts appear in the data table.

## Component Structure
### Files:
- **hero.js-meta.xml**: Metadata configuration for the component.
- **hero.html**: Template for displaying the combobox and data table.
- **hero.js**: JavaScript controller for handling events and data processing.
- **hero.css**: (Optional) Styling for the component.

### Apex Class
The component interacts with an Apex class, `AccountContactController`, to retrieve Accounts and Contacts.

## Installation
1. **Deploy LWC Files**: Deploy the `hero` component files to your Salesforce org.
2. **Deploy Apex Class**: Deploy `AccountContactController` to your org.

## Usage
1. Add the `hero` component to a Lightning Page.
2. Select an Account from the combobox. The related Contacts will populate in the data table below.

## Example
- The combobox allows users to select an Account.
- When an Account is selected, its Contacts are displayed in a data table.

## Notes
- **Cacheable Apex**: The Apex method is cacheable, improving performance by reducing server calls.
- **Customization**: You can customize the columns displayed in the data table by modifying the component's configuration.

## Troubleshooting
- **Error Fetching Data**: Ensure that `AccountContactController` has the necessary permissions.
- **No Contacts Shown**: Verify that the selected Account has related Contacts.

## License
This project is licensed under the MIT License.
