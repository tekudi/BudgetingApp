/**
 * Copyright (c) 2023 and later Salceanu Elena Teodora P.F.A.
 * Developed by Salceanu Elena Teodora which holds all intellectual
 * property rights. Use of this software is subject toa specific
 * license granted by Salceanu Elena Teodora P.F.A.
 */
package ro.tekudi.budgetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}