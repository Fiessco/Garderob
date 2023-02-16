package com.example.garderob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * ๏Материнская плата с процессором - 100 серебряных монет ( + скидка 45%)
     * <p>
     * ๏Оперативная память - 41 серебряная монета ( + скидка 55%)
     * <p>
     * ๏SSD - 39 серебряных монет ( + скидка 30%)
     * <p>
     * ๏Башенный кулер - 12 серебряных монет ( + скидка 25%)
     * <p>
     * ๏Корпус и блок питания - 21 серебряная монета ( + скидка 32%)
     * <p>
     * На счету имеется 160 серебряных монет
     */

    private int cash = 312;

    private int coat = 70;
    private int coatDiscount = 77;

    private int hat = 25;

    private int hatDiscount = 37;

    private int businessSuit = 53;

    private int businessSuitDiscount = 44;

    private int shirt = 19;
    private int shirtDiscount = 0;

    private int shoos = 41;
    private int powerStationDiscount = 32;

    public boolean canBuyComputer() {
        float result;

        result = (coat * coatDiscount + hat *
                hatDiscount + businessSuit * businessSuitDiscount + shirt *
                shirtDiscount + shoos * powerStationDiscount) / 100;

        result = cash - result;

        if (result < 0) return false;
        else return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);

        boolean flag = canBuyComputer();
        if (flag) {
            txt.setText("Мы можем пополнить гардероб!");
        } else {
            txt.setText("Иди работай!");
        }
    }
}
