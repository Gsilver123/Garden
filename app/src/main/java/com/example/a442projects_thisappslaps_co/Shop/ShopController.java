package com.example.a442projects_thisappslaps_co.Shop;

import com.example.a442projects_thisappslaps_co.R;

import java.util.ArrayList;

class ShopController {

    ShopController() { }

    ArrayList<Integer> createDummyList() {
        ArrayList<Integer> dummyList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            if (i % 5 == 0) {
                dummyList.add(R.color.colorPrimaryDark);
            }
            else if (i % 3 == 0) {
                dummyList.add(R.color.colorWhite);
            }
            else if (i % 2 == 0) {
                dummyList.add(R.color.design_default_color_primary);
            }
            else {
                dummyList.add(R.color.colorAccent);
            }
        }

        return dummyList;
    }
}