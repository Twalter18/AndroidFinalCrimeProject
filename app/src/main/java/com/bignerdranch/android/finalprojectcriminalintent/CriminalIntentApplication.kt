package com.bignerdranch.android.finalprojectcriminalintent

import android.app.Application

class CriminalIntentApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
