package com.service;

import java.util.Date;

public interface IValidationService {
    //Validate numbers
    int validateNumber();
    double validateDouble();
    //Validate date
    Date validateDate();
    //Validate string
    String validateString();
}
