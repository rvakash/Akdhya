package com.example.rvakash.akdhya;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.telephony.gsm.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MainActivity extends Activity {
    private BroadcastSms alarm;
    Button btStart,btCancel, btOneTime;
    private MediaPlayer player;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarm = new BroadcastSms();
//        btStart = (Button) findViewById(R.id.btStart);
//        btCancel = (Button) findViewById(R.id.btCancel);
//        btOneTime = (Button) findViewById(R.id.btOneTime);

//        btStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Context context = getApplicationContext();
//                if(alarm != null){
//                    alarm.SetAlarm(context);
//                }else{
//                    Toast.makeText(context, "Alarm is null", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btCancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Context context = getApplicationContext();
//                if(alarm != null){
//                    alarm.CancelAlarm(context);
//                }else{
//                    Toast.makeText(context, "Alarm is null", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btOneTime.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Context context = getApplicationContext();
//                if(alarm != null){
//                    alarm.setOnetimeTimer(context);
//                }else{
//                    Toast.makeText(context, "Alarm is null", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//        play(this, getAlarmSound());
    }


    @Override
    protected void onStart() {
        super.onStart();
    }


}
