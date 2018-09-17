package com.example.felipeaboytes.datetimepickers

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import android.text.format.DateFormat.is24HourFormat
import android.support.annotation.NonNull
//import java.text.DateFormat
import android.text.format.DateFormat
import com.example.felipeaboytes.datetimepickers.MainActivity
import java.util.*


private const val ARG_PARAM2 = "param2"


class TimerPickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        val actividad = activity as MainActivity
        actividad.processTimePickerResult(hourOfDay, minute)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker.
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        // Create a new instance of TimePickerDialog and return it.
        return TimePickerDialog(activity, this, hour, minute,
                DateFormat.is24HourFormat(activity))
    }


}
