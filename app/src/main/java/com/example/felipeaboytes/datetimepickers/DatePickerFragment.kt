package com.example.felipeaboytes.datetimepickers

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import android.support.annotation.NonNull
import com.example.felipeaboytes.datetimepickers.MainActivity
import java.util.*



private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


public class DatePickerFragment: DialogFragment(),  DatePickerDialog.OnDateSetListener {

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, day: Int) {
        val activity = activity as MainActivity?
        activity!!.processDatePickerResult(year, month, day)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(activity!!, this, year, month, day)
    }
}