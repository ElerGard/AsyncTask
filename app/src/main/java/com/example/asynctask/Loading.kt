package com.example.asynctask

import android.os.AsyncTask
import android.widget.TextView
import java.util.concurrent.TimeUnit

class Loading(text: TextView): AsyncTask<Void, Void, String>() {
    var field = text

    override fun onPreExecute() {
        super.onPreExecute()
        field.text = "Loading"
    }

    override fun doInBackground(vararg p0: Void?): String {
        TimeUnit.SECONDS.sleep(5);
        return "Error. Please, check your internet connection"
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        field.text = result
    }
}