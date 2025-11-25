package com.example.mylogger;

import android.content.Context;
import java.io.FileOutputStream;

public class FileWriterHelper {
    public static void writeLog(Context context, String text) {
        try {
            FileOutputStream fos = context.openFileOutput("actions.log", Context.MODE_APPEND);
            fos.write((text + "\n").getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}