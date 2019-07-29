package com.shetibazar.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;
import com.shetibazar.R;

import java.util.ArrayList;
import java.util.List;

public class WalkthroughActivity extends AhoyOnboarderActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = WalkthroughActivity.this;

        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("रजिस्ट्रेशन करा", "तुम्हाला काही साहित्य विकत घेणे किंवा विकणे असेल तर रजिस्ट्रेशन करणे अनिवार्य आहे.", R.drawable.barcode);
        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard("लागणारे साहित्य / माल विकत घ्या.", "तुम्हाला लागणाऱ्या वस्तू किंवा माल तुम्ही येथून विकत घेऊ शकतात.", R.drawable.truck);
        AhoyOnboarderCard ahoyOnboarderCard3 = new AhoyOnboarderCard("तुमच्याकडे असणारे साहित्य / माल विका.", "तुम्हाला काही साहित्य, वस्तू , धान्य किंवा माल तुम्ही येथे विकू शकता.", R.drawable.wallet);

        ahoyOnboarderCard1.setBackgroundColor(R.color.white);
        ahoyOnboarderCard2.setBackgroundColor(R.color.white);
        ahoyOnboarderCard3.setBackgroundColor(R.color.white);

        List<AhoyOnboarderCard> pages = new ArrayList<>();

        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);
        pages.add(ahoyOnboarderCard3);

        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.black);
            page.setDescriptionColor(R.color.grey_600);
        }

        setFinishButtonTitle("Finish");
        showNavigationControls(false);

        List<Integer> colorList = new ArrayList<>();
        colorList.add(R.color.solid_one);
        colorList.add(R.color.solid_two);
        colorList.add(R.color.solid_three);

        setColorBackground(colorList);

//        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
//        setFont(face);

        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        Intent splashIntent = new Intent(mContext, LoginActivity.class);
        startActivity(splashIntent);
        finish();
    }
}