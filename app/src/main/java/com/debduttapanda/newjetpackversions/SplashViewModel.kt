package com.debduttapanda.newjetpackversions

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.viewModelScope
import com.debduttapanda.j3lib.InterCom
import com.debduttapanda.j3lib.WirelessViewModel
import com.debduttapanda.j3lib.models.EventBusDescription
import com.debduttapanda.j3lib.models.Route
import com.debduttapanda.newjetpackversions.HomeViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : WirelessViewModel() {
    override fun onBack() {

    }

    override fun onNotification(id: Any?, arg: Any?) {

    }

    override fun eventBusDescription(): EventBusDescription? {
        return null
    }

    override fun interCom(message: InterCom) {
        Log.d("fldkfdfdfd", "${message.sender},${message.data}")
        interCom<HomeViewModel>("Hi")
    }

    override fun onStartUp(route: Route?, arguments: Bundle?) {

    }

    init {
        viewModelScope.launch {
            delay(2000)
            /*navigation {
                navigate(Routes.home.full
                )
            }*/
        }

    }
}