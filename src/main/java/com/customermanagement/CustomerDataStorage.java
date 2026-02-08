package com.customermanagement;
class CustomerDataStorage {
    public void saveToDatabase(Customer customer) {
        // Code to save customer data to the database
    }
}

class EmailSender {
    public void sendEmailNotification(Customer customer) {
        // Code to send email notification to the customer
    }
}

class Customer {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
