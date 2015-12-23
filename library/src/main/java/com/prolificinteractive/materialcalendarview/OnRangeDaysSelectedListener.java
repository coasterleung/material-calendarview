package com.prolificinteractive.materialcalendarview;

import android.support.annotation.NonNull;

/**
 * Created by coaster on 12/23/15.
 */
public interface OnRangeDaysSelectedListener {
    public void onRangeDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay startDate, @NonNull CalendarDay endDate);
}
