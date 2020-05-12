package com.example.ownstoryapp.model;

import com.example.ownstoryapp.R;

public class Story {
    private Page[] pages;
    public Story(){
        //Create an array of page objects, designates 7 spaces.
        pages = new Page[7];

        pages[0] =  new Page(R.drawable.page0, R.string.page0, new Choice(R.string.page0_choice1, 1), new Choice(R.string.page0_choice2, 2));
    }
}
