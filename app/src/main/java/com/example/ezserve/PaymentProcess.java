package com.example.ezserve;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.simplify.android.sdk.Card;
import com.simplify.android.sdk.CardToken;
import com.simplify.android.sdk.Simplify;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PaymentProcess {
    private Card myCard;
    private Simplify simplify;
    private String publicAPIkey = "sbpb_ZWQ0M2Q4ZWMtMmJhOC00N2ZjLThjMGMtYjljYTJkMWM2NzFm";
    private DatabaseReference mRef;
    public String paymentStatus = "Not Processed!";

    public PaymentProcess(final int cardIndex) {
        simplify = new Simplify();
        simplify.setApiKey(publicAPIkey);
        mRef = FirebaseDatabase.getInstance().getReference("Users").child(CustomerMainActivity.userId).child("payment");
        getCard(cardIndex);
    }

    public void getCard(final int cardIndex) {

    }

    public void sendPayment(final double total) {

    }
}
