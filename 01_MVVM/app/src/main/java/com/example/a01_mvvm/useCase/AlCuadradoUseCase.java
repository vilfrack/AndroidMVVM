package com.example.a01_mvvm.useCase;

public class AlCuadradoUseCase {
    public static String alCuadrado(String data) {
        if (data.equals("")) {
            return "Is Empty";
        }
        return String.valueOf(Double.valueOf(data) * Double.valueOf(data));
    }
}
