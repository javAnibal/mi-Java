package com.example.app.enums;

public enum TipoPrueba {
    FULL_TEST(20), TEST_BASIC(10);

    private double precioTest;

    TipoPrueba(double precioTest) {
        this.precioTest = precioTest;
    }

    public double getPrecioTest() {
        return precioTest;
    }
}
