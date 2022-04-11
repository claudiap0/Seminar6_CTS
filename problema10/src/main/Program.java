package main;

import clase.SMS;
import clase.Validator;

//6, 7, 8
public class Program {
    public static void main(String[] args) {
        Validator validator = new Validator(3);
        validator.validareCalatorie();
        validator.setModPlata(new SMS());
        validator.validareCalatorie();
    }
}
