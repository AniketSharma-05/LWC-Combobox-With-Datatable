public class ComoboboxWithDatatableClass {
    
    //This Method will return Accounts To LWC 
    @AuraEnabled
    public static List<Account> getAccountsForCombobox(){
        List<Account> accountList = [Select Id,Name from Account];
        return accountList;
    }
}